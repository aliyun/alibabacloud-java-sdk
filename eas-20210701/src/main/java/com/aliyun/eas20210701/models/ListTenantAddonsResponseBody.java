// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListTenantAddonsResponseBody extends TeaModel {
    /**
     * <p>The information about the plug-in.</p>
     */
    @NameInMap("Addons")
    public java.util.List<ListTenantAddonsResponseBodyAddons> addons;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTenantAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTenantAddonsResponseBody self = new ListTenantAddonsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTenantAddonsResponseBody setAddons(java.util.List<ListTenantAddonsResponseBodyAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<ListTenantAddonsResponseBodyAddons> getAddons() {
        return this.addons;
    }

    public ListTenantAddonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTenantAddonsResponseBodyAddons extends TeaModel {
        /**
         * <p>The attributes of the plug-in.</p>
         */
        @NameInMap("Attributes")
        public java.util.Map<String, String> attributes;

        /**
         * <p>The name of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>prometheus_discovery</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListTenantAddonsResponseBodyAddons build(java.util.Map<String, ?> map) throws Exception {
            ListTenantAddonsResponseBodyAddons self = new ListTenantAddonsResponseBodyAddons();
            return TeaModel.build(map, self);
        }

        public ListTenantAddonsResponseBodyAddons setAttributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        public ListTenantAddonsResponseBodyAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
