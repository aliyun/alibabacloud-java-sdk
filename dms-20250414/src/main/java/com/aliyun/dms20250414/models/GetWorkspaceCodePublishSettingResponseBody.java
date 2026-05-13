// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetWorkspaceCodePublishSettingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetWorkspaceCodePublishSettingResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>This record is being collected, please wait for a moment.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetWorkspaceCodePublishSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceCodePublishSettingResponseBody self = new GetWorkspaceCodePublishSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceCodePublishSettingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkspaceCodePublishSettingResponseBody setData(GetWorkspaceCodePublishSettingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkspaceCodePublishSettingResponseBodyData getData() {
        return this.data;
    }

    public GetWorkspaceCodePublishSettingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkspaceCodePublishSettingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkspaceCodePublishSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkspaceCodePublishSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWorkspaceCodePublishSettingResponseBodyDataRepos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("Branch")
        public String branch;

        /**
         * <strong>example:</strong>
         * <p>/luna-public/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>analyticscomputing/dide</p>
         */
        @NameInMap("Repo")
        public String repo;

        public static GetWorkspaceCodePublishSettingResponseBodyDataRepos build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceCodePublishSettingResponseBodyDataRepos self = new GetWorkspaceCodePublishSettingResponseBodyDataRepos();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceCodePublishSettingResponseBodyDataRepos setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetWorkspaceCodePublishSettingResponseBodyDataRepos setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetWorkspaceCodePublishSettingResponseBodyDataRepos setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

    }

    public static class GetWorkspaceCodePublishSettingResponseBodyData extends TeaModel {
        @NameInMap("Exclude")
        public java.util.List<String> exclude;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LockRepoBranch")
        public Boolean lockRepoBranch;

        @NameInMap("Repos")
        public java.util.List<GetWorkspaceCodePublishSettingResponseBodyDataRepos> repos;

        public static GetWorkspaceCodePublishSettingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceCodePublishSettingResponseBodyData self = new GetWorkspaceCodePublishSettingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceCodePublishSettingResponseBodyData setExclude(java.util.List<String> exclude) {
            this.exclude = exclude;
            return this;
        }
        public java.util.List<String> getExclude() {
            return this.exclude;
        }

        public GetWorkspaceCodePublishSettingResponseBodyData setLockRepoBranch(Boolean lockRepoBranch) {
            this.lockRepoBranch = lockRepoBranch;
            return this;
        }
        public Boolean getLockRepoBranch() {
            return this.lockRepoBranch;
        }

        public GetWorkspaceCodePublishSettingResponseBodyData setRepos(java.util.List<GetWorkspaceCodePublishSettingResponseBodyDataRepos> repos) {
            this.repos = repos;
            return this;
        }
        public java.util.List<GetWorkspaceCodePublishSettingResponseBodyDataRepos> getRepos() {
            return this.repos;
        }

    }

}
