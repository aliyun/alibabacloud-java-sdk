// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("maxResults")
    public Integer maxResults;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("nextToken")
    public String nextToken;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("totalCount")
    public Integer totalCount;

    // 工作空间列表
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
        // 代码来源URL
        @NameInMap("codeUrl")
        public String codeUrl;

        // 代码版本，支持 commitSHA、分支、标签
        @NameInMap("codeVersion")
        public String codeVersion;

        // 创建时间戳
        @NameInMap("createTime")
        public String createTime;

        // 工作空间唯一标识，字符串形式，可在云效DevStudio访问空间链接中获取
        @NameInMap("id")
        public String id;

        // 工作空间名称
        @NameInMap("name")
        public String name;

        // 机器规格
        @NameInMap("spec")
        public String spec;

        // 空间状态，枚举：CREATING-创建中, SUCCESS-运行中, FROZEN-冻结中, RECOVERING-恢复中
        @NameInMap("status")
        public String status;

        // 工作空间模板
        @NameInMap("template")
        public String template;

        // 用户阿里云PK
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
