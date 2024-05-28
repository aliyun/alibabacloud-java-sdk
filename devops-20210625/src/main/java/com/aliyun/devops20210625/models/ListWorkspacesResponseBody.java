// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("totalCount")
    public Integer totalCount;

    @NameInMap("workspaces")
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkspacesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListWorkspacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWorkspacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListWorkspacesResponseBody setWorkspaces(java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static class ListWorkspacesResponseBodyWorkspaces extends TeaModel {
        @NameInMap("codeUrl")
        public String codeUrl;

        @NameInMap("codeVersion")
        public String codeVersion;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("spec")
        public String spec;

        @NameInMap("status")
        public String status;

        @NameInMap("template")
        public String template;

        @NameInMap("userId")
        public String userId;

        public static ListWorkspacesResponseBodyWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyWorkspaces self = new ListWorkspacesResponseBodyWorkspaces();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyWorkspaces setCodeUrl(String codeUrl) {
            this.codeUrl = codeUrl;
            return this;
        }
        public String getCodeUrl() {
            return this.codeUrl;
        }

        public ListWorkspacesResponseBodyWorkspaces setCodeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }
        public String getCodeVersion() {
            return this.codeVersion;
        }

        public ListWorkspacesResponseBodyWorkspaces setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListWorkspacesResponseBodyWorkspaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkspacesResponseBodyWorkspaces setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListWorkspacesResponseBodyWorkspaces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkspacesResponseBodyWorkspaces setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListWorkspacesResponseBodyWorkspaces setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
