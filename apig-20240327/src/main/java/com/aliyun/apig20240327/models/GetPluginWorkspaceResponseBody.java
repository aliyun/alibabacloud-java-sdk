// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPluginWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetPluginWorkspaceResponseBodyData data;

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
     * <p>4AFA893B-A75B-5002-AACF-84CABE06197A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPluginWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPluginWorkspaceResponseBody self = new GetPluginWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPluginWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPluginWorkspaceResponseBody setData(GetPluginWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPluginWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public GetPluginWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPluginWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPluginWorkspaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>664f1e2xxxx</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>987654</p>
         */
        @NameInMap("pipelineRunId")
        public String pipelineRunId;

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
         * <p><a href="https://apigw-console-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/%7Buid%7D/plugin/plugin_1756262400.wasm">https://apigw-console-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/{uid}/plugin/plugin_1756262400.wasm</a></p>
         */
        @NameInMap("wasmUrl")
        public String wasmUrl;

        /**
         * <strong>example:</strong>
         * <p>plw-xxxxxxxx</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetPluginWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPluginWorkspaceResponseBodyData self = new GetPluginWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPluginWorkspaceResponseBodyData setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public GetPluginWorkspaceResponseBodyData setPipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

        public GetPluginWorkspaceResponseBodyData setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public GetPluginWorkspaceResponseBodyData setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetPluginWorkspaceResponseBodyData setWasmUrl(String wasmUrl) {
            this.wasmUrl = wasmUrl;
            return this;
        }
        public String getWasmUrl() {
            return this.wasmUrl;
        }

        public GetPluginWorkspaceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
