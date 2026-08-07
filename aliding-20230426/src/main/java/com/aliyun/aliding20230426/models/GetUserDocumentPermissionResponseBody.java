// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserDocumentPermissionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>-3</p>
     */
    @NameInMap("authLevel")
    public Long authLevel;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasPermission")
    public Boolean hasPermission;

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

    public static GetUserDocumentPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserDocumentPermissionResponseBody self = new GetUserDocumentPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserDocumentPermissionResponseBody setAuthLevel(Long authLevel) {
        this.authLevel = authLevel;
        return this;
    }
    public Long getAuthLevel() {
        return this.authLevel;
    }

    public GetUserDocumentPermissionResponseBody setHasPermission(Boolean hasPermission) {
        this.hasPermission = hasPermission;
        return this;
    }
    public Boolean getHasPermission() {
        return this.hasPermission;
    }

    public GetUserDocumentPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserDocumentPermissionResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetUserDocumentPermissionResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
