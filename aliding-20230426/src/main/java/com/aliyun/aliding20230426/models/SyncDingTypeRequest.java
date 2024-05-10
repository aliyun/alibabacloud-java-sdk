// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SyncDingTypeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DingType")
    public String dingType;

    @NameInMap("IsDimission")
    public String isDimission;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Source")
    public String source;

    @NameInMap("TenantContext")
    public SyncDingTypeRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkNo")
    public String workNo;

    public static SyncDingTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDingTypeRequest self = new SyncDingTypeRequest();
        return TeaModel.build(map, self);
    }

    public SyncDingTypeRequest setDingType(String dingType) {
        this.dingType = dingType;
        return this;
    }
    public String getDingType() {
        return this.dingType;
    }

    public SyncDingTypeRequest setIsDimission(String isDimission) {
        this.isDimission = isDimission;
        return this;
    }
    public String getIsDimission() {
        return this.isDimission;
    }

    public SyncDingTypeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SyncDingTypeRequest setTenantContext(SyncDingTypeRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SyncDingTypeRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public SyncDingTypeRequest setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public static class SyncDingTypeRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static SyncDingTypeRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SyncDingTypeRequestTenantContext self = new SyncDingTypeRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SyncDingTypeRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
