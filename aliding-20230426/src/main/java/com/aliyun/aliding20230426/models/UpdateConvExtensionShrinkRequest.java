// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateConvExtensionShrinkRequest extends TeaModel {
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
    public String staffIdListShrink;

    /**
     * <strong>example:</strong>
     * <p>546374856</p>
     */
    @NameInMap("SystemUid")
    public String systemUid;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static UpdateConvExtensionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConvExtensionShrinkRequest self = new UpdateConvExtensionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConvExtensionShrinkRequest setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
        return this;
    }
    public String getMobileUrl() {
        return this.mobileUrl;
    }

    public UpdateConvExtensionShrinkRequest setPcUrl(String pcUrl) {
        this.pcUrl = pcUrl;
        return this;
    }
    public String getPcUrl() {
        return this.pcUrl;
    }

    public UpdateConvExtensionShrinkRequest setStaffIdListShrink(String staffIdListShrink) {
        this.staffIdListShrink = staffIdListShrink;
        return this;
    }
    public String getStaffIdListShrink() {
        return this.staffIdListShrink;
    }

    public UpdateConvExtensionShrinkRequest setSystemUid(String systemUid) {
        this.systemUid = systemUid;
        return this;
    }
    public String getSystemUid() {
        return this.systemUid;
    }

    public UpdateConvExtensionShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
