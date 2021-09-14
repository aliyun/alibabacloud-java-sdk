// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Workspace")
    public CreateWorkspaceResponseBodyWorkspace workspace;

    public static CreateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResponseBody self = new CreateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkspaceResponseBody setWorkspace(CreateWorkspaceResponseBodyWorkspace workspace) {
        this.workspace = workspace;
        return this;
    }
    public CreateWorkspaceResponseBodyWorkspace getWorkspace() {
        return this.workspace;
    }

    public static class CreateWorkspaceResponseBodyWorkspace extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("WorkspaceId")
        public Integer workspaceId;

        public static CreateWorkspaceResponseBodyWorkspace build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyWorkspace self = new CreateWorkspaceResponseBodyWorkspace();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyWorkspace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkspaceResponseBodyWorkspace setWorkspaceId(Integer workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Integer getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
