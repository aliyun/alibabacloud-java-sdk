// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BuySessionPackageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SessionPackageId")
    public Long sessionPackageId;

    @NameInMap("Success")
    public String success;

    public static BuySessionPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BuySessionPackageResponseBody self = new BuySessionPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public BuySessionPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BuySessionPackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BuySessionPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuySessionPackageResponseBody setSessionPackageId(Long sessionPackageId) {
        this.sessionPackageId = sessionPackageId;
        return this;
    }
    public Long getSessionPackageId() {
        return this.sessionPackageId;
    }

    public BuySessionPackageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
