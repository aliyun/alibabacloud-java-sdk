// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryProjectMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>D3DBF9F5-7C4D-4A67-B869-097C069C481D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public QueryProjectMetaResponseBodyResources resources;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryProjectMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectMetaResponseBody self = new QueryProjectMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectMetaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryProjectMetaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProjectMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectMetaResponseBody setResources(QueryProjectMetaResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public QueryProjectMetaResponseBodyResources getResources() {
        return this.resources;
    }

    public QueryProjectMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryProjectMetaResponseBodyResourcesResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ApsaraDB for MongoDB</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;product\&quot;,\&quot;value\&quot;:\&quot;MongoDB\&quot;]</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <strong>example:</strong>
         * <p>acs_mongodb</p>
         */
        @NameInMap("Project")
        public String project;

        public static QueryProjectMetaResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectMetaResponseBodyResourcesResource self = new QueryProjectMetaResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public QueryProjectMetaResponseBodyResourcesResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryProjectMetaResponseBodyResourcesResource setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public QueryProjectMetaResponseBodyResourcesResource setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class QueryProjectMetaResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<QueryProjectMetaResponseBodyResourcesResource> resource;

        public static QueryProjectMetaResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectMetaResponseBodyResources self = new QueryProjectMetaResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public QueryProjectMetaResponseBodyResources setResource(java.util.List<QueryProjectMetaResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<QueryProjectMetaResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
