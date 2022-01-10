// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResourceResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // 资源集合
    @NameInMap("Resources")
    public java.util.List<CreateWorkspaceResourceResponseBodyResources> resources;

    // 总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static CreateWorkspaceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResourceResponseBody self = new CreateWorkspaceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkspaceResourceResponseBody setResources(java.util.List<CreateWorkspaceResourceResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<CreateWorkspaceResourceResponseBodyResources> getResources() {
        return this.resources;
    }

    public CreateWorkspaceResourceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class CreateWorkspaceResourceResponseBodyResources extends TeaModel {
        // 资源Id
        @NameInMap("Id")
        public String id;

        public static CreateWorkspaceResourceResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResourceResponseBodyResources self = new CreateWorkspaceResourceResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResourceResponseBodyResources setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
