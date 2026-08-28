// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListPluginWorkspaceResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B690F39C-1BDA-55E0-9E94-5358E758C772</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPluginWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPluginWorkspaceResponseBody self = new ListPluginWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPluginWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPluginWorkspaceResponseBody setData(java.util.List<ListPluginWorkspaceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPluginWorkspaceResponseBodyData> getData() {
        return this.data;
    }

    public ListPluginWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPluginWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPluginWorkspaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>664f1e2xxxx</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("repoId")
        public String repoId;

        /**
         * <strong>example:</strong>
         * <p>my-custom-plugin</p>
         */
        @NameInMap("repoName")
        public String repoName;

        /**
         * <strong>example:</strong>
         * <p>plw-xxxxxxxx</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListPluginWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPluginWorkspaceResponseBodyData self = new ListPluginWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPluginWorkspaceResponseBodyData setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListPluginWorkspaceResponseBodyData setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListPluginWorkspaceResponseBodyData setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListPluginWorkspaceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
