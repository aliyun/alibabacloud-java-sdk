// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetUmodelDataResponseBody extends TeaModel {
    @NameInMap("errors")
    public java.util.List<GetUmodelDataResponseBodyErrors> errors;

    @NameInMap("links")
    public java.util.List<?> links;

    @NameInMap("nodes")
    public java.util.List<?> nodes;

    /**
     * <strong>example:</strong>
     * <p>123-123-234-345-123</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("totalLinksCount")
    public Integer totalLinksCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("totalNodesCount")
    public Integer totalNodesCount;

    public static GetUmodelDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUmodelDataResponseBody self = new GetUmodelDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUmodelDataResponseBody setErrors(java.util.List<GetUmodelDataResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<GetUmodelDataResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public GetUmodelDataResponseBody setLinks(java.util.List<?> links) {
        this.links = links;
        return this;
    }
    public java.util.List<?> getLinks() {
        return this.links;
    }

    public GetUmodelDataResponseBody setNodes(java.util.List<?> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<?> getNodes() {
        return this.nodes;
    }

    public GetUmodelDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUmodelDataResponseBody setTotalLinksCount(Integer totalLinksCount) {
        this.totalLinksCount = totalLinksCount;
        return this;
    }
    public Integer getTotalLinksCount() {
        return this.totalLinksCount;
    }

    public GetUmodelDataResponseBody setTotalNodesCount(Integer totalNodesCount) {
        this.totalNodesCount = totalNodesCount;
        return this;
    }
    public Integer getTotalNodesCount() {
        return this.totalNodesCount;
    }

    public static class GetUmodelDataResponseBodyErrors extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>external</p>
         */
        @NameInMap("type")
        public String type;

        public static GetUmodelDataResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            GetUmodelDataResponseBodyErrors self = new GetUmodelDataResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public GetUmodelDataResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetUmodelDataResponseBodyErrors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
