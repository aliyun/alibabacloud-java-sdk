// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateUserAvatarResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errcode")
    public String errcode;

    @NameInMap("errmsg")
    public String errmsg;

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

    public static UpdateUserAvatarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAvatarResponseBody self = new UpdateUserAvatarResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserAvatarResponseBody setErrcode(String errcode) {
        this.errcode = errcode;
        return this;
    }
    public String getErrcode() {
        return this.errcode;
    }

    public UpdateUserAvatarResponseBody setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }
    public String getErrmsg() {
        return this.errmsg;
    }

    public UpdateUserAvatarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserAvatarResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public UpdateUserAvatarResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
