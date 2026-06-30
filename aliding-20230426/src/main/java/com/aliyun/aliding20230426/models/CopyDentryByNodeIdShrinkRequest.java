// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CopyDentryByNodeIdShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("ToNextNodeId")
    public String toNextNodeId;

    @NameInMap("ToParentNodeId")
    public String toParentNodeId;

    @NameInMap("ToPrevNodeId")
    public String toPrevNodeId;

    public static CopyDentryByNodeIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyDentryByNodeIdShrinkRequest self = new CopyDentryByNodeIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CopyDentryByNodeIdShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public CopyDentryByNodeIdShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopyDentryByNodeIdShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CopyDentryByNodeIdShrinkRequest setToNextNodeId(String toNextNodeId) {
        this.toNextNodeId = toNextNodeId;
        return this;
    }
    public String getToNextNodeId() {
        return this.toNextNodeId;
    }

    public CopyDentryByNodeIdShrinkRequest setToParentNodeId(String toParentNodeId) {
        this.toParentNodeId = toParentNodeId;
        return this;
    }
    public String getToParentNodeId() {
        return this.toParentNodeId;
    }

    public CopyDentryByNodeIdShrinkRequest setToPrevNodeId(String toPrevNodeId) {
        this.toPrevNodeId = toPrevNodeId;
        return this;
    }
    public String getToPrevNodeId() {
        return this.toPrevNodeId;
    }

}
