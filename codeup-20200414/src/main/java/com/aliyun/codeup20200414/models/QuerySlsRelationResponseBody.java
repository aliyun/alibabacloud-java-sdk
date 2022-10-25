// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class QuerySlsRelationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QuerySlsRelationResponseBodyResult> result;

    @NameInMap("Success")
    public String success;

    public static QuerySlsRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsRelationResponseBody self = new QuerySlsRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySlsRelationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QuerySlsRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySlsRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySlsRelationResponseBody setResult(java.util.List<QuerySlsRelationResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QuerySlsRelationResponseBodyResult> getResult() {
        return this.result;
    }

    public QuerySlsRelationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QuerySlsRelationResponseBodyResult extends TeaModel {
        @NameInMap("aliyunUserId")
        public String aliyunUserId;

        @NameInMap("codeupProjectId")
        public Long codeupProjectId;

        @NameInMap("defaultViewer")
        public Boolean defaultViewer;

        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("slsLogStore")
        public String slsLogStore;

        @NameInMap("slsProject")
        public String slsProject;

        public static QuerySlsRelationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySlsRelationResponseBodyResult self = new QuerySlsRelationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QuerySlsRelationResponseBodyResult setAliyunUserId(String aliyunUserId) {
            this.aliyunUserId = aliyunUserId;
            return this;
        }
        public String getAliyunUserId() {
            return this.aliyunUserId;
        }

        public QuerySlsRelationResponseBodyResult setCodeupProjectId(Long codeupProjectId) {
            this.codeupProjectId = codeupProjectId;
            return this;
        }
        public Long getCodeupProjectId() {
            return this.codeupProjectId;
        }

        public QuerySlsRelationResponseBodyResult setDefaultViewer(Boolean defaultViewer) {
            this.defaultViewer = defaultViewer;
            return this;
        }
        public Boolean getDefaultViewer() {
            return this.defaultViewer;
        }

        public QuerySlsRelationResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public QuerySlsRelationResponseBodyResult setSlsLogStore(String slsLogStore) {
            this.slsLogStore = slsLogStore;
            return this;
        }
        public String getSlsLogStore() {
            return this.slsLogStore;
        }

        public QuerySlsRelationResponseBodyResult setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

    }

}
