// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListEiamRegionsResponseBody extends TeaModel {
    /**
     * <p>The region list.</p>
     */
    @NameInMap("Regions")
    public java.util.List<ListEiamRegionsResponseBodyRegions> regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEiamRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEiamRegionsResponseBody self = new ListEiamRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEiamRegionsResponseBody setRegions(java.util.List<ListEiamRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListEiamRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListEiamRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEiamRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListEiamRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListEiamRegionsResponseBodyRegions self = new ListEiamRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListEiamRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListEiamRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
