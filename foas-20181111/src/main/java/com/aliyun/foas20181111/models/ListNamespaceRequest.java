// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListNamespaceRequest extends TeaModel {
    @NameInMap("targetUserId")
    public String targetUserId;

    @NameInMap("transferType")
    public Integer transferType;

    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceRequest self = new ListNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public ListNamespaceRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public ListNamespaceRequest setTransferType(Integer transferType) {
        this.transferType = transferType;
        return this;
    }
    public Integer getTransferType() {
        return this.transferType;
    }

    public ListNamespaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
