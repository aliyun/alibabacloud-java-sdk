// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RenewSessionPackageResponseBody extends TeaModel {
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

    public static RenewSessionPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewSessionPackageResponseBody self = new RenewSessionPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewSessionPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenewSessionPackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenewSessionPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewSessionPackageResponseBody setSessionPackageId(Long sessionPackageId) {
        this.sessionPackageId = sessionPackageId;
        return this;
    }
    public Long getSessionPackageId() {
        return this.sessionPackageId;
    }

    public RenewSessionPackageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
