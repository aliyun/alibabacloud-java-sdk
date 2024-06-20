// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1e195c5116124202371861018d5bde</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<CreateWorkspaceResourceResponseBodyResources> resources;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
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
