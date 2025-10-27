// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListFlowVersionsResponseBody extends TeaModel {
    @NameInMap("FlowVersions")
    public java.util.List<ListFlowVersionsResponseBodyFlowVersions> flowVersions;

    /**
     * <p>list token</p>
     * 
     * <strong>example:</strong>
     * <p>token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>294D68C1-5108-5971-853A-1A9CC87B4816</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFlowVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowVersionsResponseBody self = new ListFlowVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowVersionsResponseBody setFlowVersions(java.util.List<ListFlowVersionsResponseBodyFlowVersions> flowVersions) {
        this.flowVersions = flowVersions;
        return this;
    }
    public java.util.List<ListFlowVersionsResponseBodyFlowVersions> getFlowVersions() {
        return this.flowVersions;
    }

    public ListFlowVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFlowVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFlowVersionsResponseBodyFlowVersions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-10-24T14:11:26+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>version description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListFlowVersionsResponseBodyFlowVersions build(java.util.Map<String, ?> map) throws Exception {
            ListFlowVersionsResponseBodyFlowVersions self = new ListFlowVersionsResponseBodyFlowVersions();
            return TeaModel.build(map, self);
        }

        public ListFlowVersionsResponseBodyFlowVersions setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListFlowVersionsResponseBodyFlowVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowVersionsResponseBodyFlowVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
