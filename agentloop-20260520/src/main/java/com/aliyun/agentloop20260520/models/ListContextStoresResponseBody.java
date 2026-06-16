// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListContextStoresResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("results")
    public java.util.List<ListContextStoresResponseBodyResults> results;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListContextStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextStoresResponseBody self = new ListContextStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextStoresResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContextStoresResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListContextStoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextStoresResponseBody setResults(java.util.List<ListContextStoresResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ListContextStoresResponseBodyResults> getResults() {
        return this.results;
    }

    public ListContextStoresResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListContextStoresResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        @NameInMap("contextStoreName")
        public String contextStoreName;

        /**
         * <strong>example:</strong>
         * <p>experience</p>
         */
        @NameInMap("contextType")
        public String contextType;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>我的上下文库</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>[&quot;order-service&quot;,&quot;payment-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        /**
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-02T00:00:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListContextStoresResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListContextStoresResponseBodyResults self = new ListContextStoresResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ListContextStoresResponseBodyResults setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public ListContextStoresResponseBodyResults setContextStoreName(String contextStoreName) {
            this.contextStoreName = contextStoreName;
            return this;
        }
        public String getContextStoreName() {
            return this.contextStoreName;
        }

        public ListContextStoresResponseBodyResults setContextType(String contextType) {
            this.contextType = contextType;
            return this;
        }
        public String getContextType() {
            return this.contextType;
        }

        public ListContextStoresResponseBodyResults setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListContextStoresResponseBodyResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListContextStoresResponseBodyResults setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListContextStoresResponseBodyResults setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        public ListContextStoresResponseBodyResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListContextStoresResponseBodyResults setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
