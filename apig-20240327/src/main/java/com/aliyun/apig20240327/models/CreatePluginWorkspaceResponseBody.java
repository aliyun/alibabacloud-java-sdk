// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreatePluginWorkspaceResponseBodyData data;

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
     * <p>01A02219-8028-57D8-9D60-2D167FF9118E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePluginWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginWorkspaceResponseBody self = new CreatePluginWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePluginWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePluginWorkspaceResponseBody setData(CreatePluginWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePluginWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public CreatePluginWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePluginWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePluginWorkspaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("repoId")
        public String repoId;

        /**
         * <strong>example:</strong>
         * <p>plw-xxxxxxxx</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreatePluginWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePluginWorkspaceResponseBodyData self = new CreatePluginWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePluginWorkspaceResponseBodyData setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public CreatePluginWorkspaceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
