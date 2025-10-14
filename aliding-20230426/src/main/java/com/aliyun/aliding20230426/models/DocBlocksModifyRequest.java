// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksModifyRequest extends TeaModel {
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
    public java.util.Map<String, ?> element;

    @NameInMap("TenantContext")
    public DocBlocksModifyRequestTenantContext tenantContext;

    public static DocBlocksModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksModifyRequest self = new DocBlocksModifyRequest();
        return TeaModel.build(map, self);
    }

    public DocBlocksModifyRequest setBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }
    public String getBlockId() {
        return this.blockId;
    }

    public DocBlocksModifyRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public DocBlocksModifyRequest setElement(java.util.Map<String, ?> element) {
        this.element = element;
        return this;
    }
    public java.util.Map<String, ?> getElement() {
        return this.element;
    }

    public DocBlocksModifyRequest setTenantContext(DocBlocksModifyRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DocBlocksModifyRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DocBlocksModifyRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DocBlocksModifyRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DocBlocksModifyRequestTenantContext self = new DocBlocksModifyRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DocBlocksModifyRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
