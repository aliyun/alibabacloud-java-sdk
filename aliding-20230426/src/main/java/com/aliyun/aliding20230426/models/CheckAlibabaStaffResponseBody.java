// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CheckAlibabaStaffResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isAlibabaStaff")
    public Boolean isAlibabaStaff;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static CheckAlibabaStaffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAlibabaStaffResponseBody self = new CheckAlibabaStaffResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAlibabaStaffResponseBody setIsAlibabaStaff(Boolean isAlibabaStaff) {
        this.isAlibabaStaff = isAlibabaStaff;
        return this;
    }
    public Boolean getIsAlibabaStaff() {
        return this.isAlibabaStaff;
    }

    public CheckAlibabaStaffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAlibabaStaffResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public CheckAlibabaStaffResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
