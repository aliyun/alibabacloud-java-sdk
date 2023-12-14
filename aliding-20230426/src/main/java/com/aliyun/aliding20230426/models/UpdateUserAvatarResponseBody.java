// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateUserAvatarResponseBody extends TeaModel {
    @NameInMap("errcode")
    public String errcode;

    @NameInMap("errmsg")
    public String errmsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

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
