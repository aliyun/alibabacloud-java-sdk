// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class CreateMigrationJobResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static CreateMigrationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationJobResponseBody self = new CreateMigrationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMigrationJobResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateMigrationJobResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateMigrationJobResponseBody setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public CreateMigrationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMigrationJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
