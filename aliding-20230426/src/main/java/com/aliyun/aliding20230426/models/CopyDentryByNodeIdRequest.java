// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CopyDentryByNodeIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P7QG4Yx2Jpx4OolYC1QPg5BaJ9dEq3XD</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("TenantContext")
    public CopyDentryByNodeIdRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>P7QG4Yx2Jpx4OolYC1QPg5BaJ9dEq3XD</p>
     */
    @NameInMap("ToNextNodeId")
    public String toNextNodeId;

    /**
     * <strong>example:</strong>
     * <p>P7QG4Yx2Jpx4OolYC1QPg5BaJ9dEq3XD</p>
     */
    @NameInMap("ToParentNodeId")
    public String toParentNodeId;

    /**
     * <strong>example:</strong>
     * <p>P7QG4Yx2Jpx4OolYC1QPg5BaJ9dEq3XD</p>
     */
    @NameInMap("ToPrevNodeId")
    public String toPrevNodeId;

    public static CopyDentryByNodeIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyDentryByNodeIdRequest self = new CopyDentryByNodeIdRequest();
        return TeaModel.build(map, self);
    }

    public CopyDentryByNodeIdRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public CopyDentryByNodeIdRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopyDentryByNodeIdRequest setTenantContext(CopyDentryByNodeIdRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CopyDentryByNodeIdRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CopyDentryByNodeIdRequest setToNextNodeId(String toNextNodeId) {
        this.toNextNodeId = toNextNodeId;
        return this;
    }
    public String getToNextNodeId() {
        return this.toNextNodeId;
    }

    public CopyDentryByNodeIdRequest setToParentNodeId(String toParentNodeId) {
        this.toParentNodeId = toParentNodeId;
        return this;
    }
    public String getToParentNodeId() {
        return this.toParentNodeId;
    }

    public CopyDentryByNodeIdRequest setToPrevNodeId(String toPrevNodeId) {
        this.toPrevNodeId = toPrevNodeId;
        return this;
    }
    public String getToPrevNodeId() {
        return this.toPrevNodeId;
    }

    public static class CopyDentryByNodeIdRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CopyDentryByNodeIdRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryByNodeIdRequestTenantContext self = new CopyDentryByNodeIdRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CopyDentryByNodeIdRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
