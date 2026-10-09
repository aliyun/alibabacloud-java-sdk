// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseProjectSpecResponseBody extends TeaModel {
    /**
     * <p>The list of Supabase project specifications.</p>
     */
    @NameInMap("Items")
    public java.util.List<GetSupabaseProjectSpecResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of zone IDs that support creating Supabase projects.</p>
     */
    @NameInMap("ZoneIds")
    public java.util.List<String> zoneIds;

    public static GetSupabaseProjectSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseProjectSpecResponseBody self = new GetSupabaseProjectSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupabaseProjectSpecResponseBody setItems(java.util.List<GetSupabaseProjectSpecResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetSupabaseProjectSpecResponseBodyItems> getItems() {
        return this.items;
    }

    public GetSupabaseProjectSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupabaseProjectSpecResponseBody setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static class GetSupabaseProjectSpecResponseBodyItems extends TeaModel {
        /**
         * <p>Indicates whether the specification is free.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Free")
        public Boolean free;

        /**
         * <p>The specification code.</p>
         * 
         * <strong>example:</strong>
         * <p>2C4G</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>Indicates whether the specification is visible.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Visible")
        public Boolean visible;

        public static GetSupabaseProjectSpecResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetSupabaseProjectSpecResponseBodyItems self = new GetSupabaseProjectSpecResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetSupabaseProjectSpecResponseBodyItems setFree(Boolean free) {
            this.free = free;
            return this;
        }
        public Boolean getFree() {
            return this.free;
        }

        public GetSupabaseProjectSpecResponseBodyItems setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetSupabaseProjectSpecResponseBodyItems setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

}
