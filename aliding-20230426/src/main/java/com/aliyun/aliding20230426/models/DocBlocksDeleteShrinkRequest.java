// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksDeleteShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mgokkwiovcq5eu02le8</p>
     */
    @NameInMap("BlockId")
    public String blockId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Obva6QBXJwxNZoMOC9bE11Zb8n4qY5Pr</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static DocBlocksDeleteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksDeleteShrinkRequest self = new DocBlocksDeleteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DocBlocksDeleteShrinkRequest setBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }
    public String getBlockId() {
        return this.blockId;
    }

    public DocBlocksDeleteShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public DocBlocksDeleteShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
