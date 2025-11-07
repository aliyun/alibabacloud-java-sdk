// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetApiSchemaUsageResponseBody extends TeaModel {
    /**
     * <p>The plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-agknce3n****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of files uploaded for schema verification in the plan instance of the website.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceUsage")
    public Integer instanceUsage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>952ea16b-1f05-4a76-bb32-420282d8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Usage details for websites.</p>
     */
    @NameInMap("Usages")
    public java.util.List<GetApiSchemaUsageResponseBodyUsages> usages;

    public static GetApiSchemaUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiSchemaUsageResponseBody self = new GetApiSchemaUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiSchemaUsageResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetApiSchemaUsageResponseBody setInstanceUsage(Integer instanceUsage) {
        this.instanceUsage = instanceUsage;
        return this;
    }
    public Integer getInstanceUsage() {
        return this.instanceUsage;
    }

    public GetApiSchemaUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApiSchemaUsageResponseBody setUsages(java.util.List<GetApiSchemaUsageResponseBodyUsages> usages) {
        this.usages = usages;
        return this;
    }
    public java.util.List<GetApiSchemaUsageResponseBodyUsages> getUsages() {
        return this.usages;
    }

    public static class GetApiSchemaUsageResponseBodyUsages extends TeaModel {
        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40000449</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The website name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of files uploaded for the website.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        public static GetApiSchemaUsageResponseBodyUsages build(java.util.Map<String, ?> map) throws Exception {
            GetApiSchemaUsageResponseBodyUsages self = new GetApiSchemaUsageResponseBodyUsages();
            return TeaModel.build(map, self);
        }

        public GetApiSchemaUsageResponseBodyUsages setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetApiSchemaUsageResponseBodyUsages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApiSchemaUsageResponseBodyUsages setUsage(Integer usage) {
            this.usage = usage;
            return this;
        }
        public Integer getUsage() {
            return this.usage;
        }

    }

}
