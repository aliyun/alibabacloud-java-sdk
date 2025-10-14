// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksDeleteRequest extends TeaModel {
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
    public DocBlocksDeleteRequestTenantContext tenantContext;

    public static DocBlocksDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksDeleteRequest self = new DocBlocksDeleteRequest();
        return TeaModel.build(map, self);
    }

    public DocBlocksDeleteRequest setBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }
    public String getBlockId() {
        return this.blockId;
    }

    public DocBlocksDeleteRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public DocBlocksDeleteRequest setTenantContext(DocBlocksDeleteRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DocBlocksDeleteRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DocBlocksDeleteRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DocBlocksDeleteRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DocBlocksDeleteRequestTenantContext self = new DocBlocksDeleteRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DocBlocksDeleteRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
