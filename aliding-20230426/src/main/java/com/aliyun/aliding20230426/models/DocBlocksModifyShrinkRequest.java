// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksModifyShrinkRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;blockType&quot;:&quot;paragraph&quot;,&quot;paragraph&quot;:{&quot;text&quot;:&quot;ok&quot;}}</p>
     */
    @NameInMap("Element")
    public String elementShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static DocBlocksModifyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksModifyShrinkRequest self = new DocBlocksModifyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DocBlocksModifyShrinkRequest setBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }
    public String getBlockId() {
        return this.blockId;
    }

    public DocBlocksModifyShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public DocBlocksModifyShrinkRequest setElementShrink(String elementShrink) {
        this.elementShrink = elementShrink;
        return this;
    }
    public String getElementShrink() {
        return this.elementShrink;
    }

    public DocBlocksModifyShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
