// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class MigrateSessionPackageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NO_DATA</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E25FC620-6B6F-12D2-A992-AD8727DC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MigrateSessionPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateSessionPackageResponseBody self = new MigrateSessionPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateSessionPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MigrateSessionPackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MigrateSessionPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MigrateSessionPackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
