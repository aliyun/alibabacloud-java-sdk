// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateConvExtensionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx">https://xxx</a></p>
     */
    @NameInMap("MobileUrl")
    public String mobileUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx">https://xxx</a></p>
     */
    @NameInMap("PcUrl")
    public String pcUrl;

    @NameInMap("StaffIdList")
    public java.util.List<String> staffIdList;

    /**
     * <strong>example:</strong>
     * <p>546374856</p>
     */
    @NameInMap("SystemUid")
    public String systemUid;

    @NameInMap("TenantContext")
    public UpdateConvExtensionRequestTenantContext tenantContext;

    public static UpdateConvExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConvExtensionRequest self = new UpdateConvExtensionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConvExtensionRequest setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
        return this;
    }
    public String getMobileUrl() {
        return this.mobileUrl;
    }

    public UpdateConvExtensionRequest setPcUrl(String pcUrl) {
        this.pcUrl = pcUrl;
        return this;
    }
    public String getPcUrl() {
        return this.pcUrl;
    }

    public UpdateConvExtensionRequest setStaffIdList(java.util.List<String> staffIdList) {
        this.staffIdList = staffIdList;
        return this;
    }
    public java.util.List<String> getStaffIdList() {
        return this.staffIdList;
    }

    public UpdateConvExtensionRequest setSystemUid(String systemUid) {
        this.systemUid = systemUid;
        return this;
    }
    public String getSystemUid() {
        return this.systemUid;
    }

    public UpdateConvExtensionRequest setTenantContext(UpdateConvExtensionRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateConvExtensionRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class UpdateConvExtensionRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateConvExtensionRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateConvExtensionRequestTenantContext self = new UpdateConvExtensionRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateConvExtensionRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
