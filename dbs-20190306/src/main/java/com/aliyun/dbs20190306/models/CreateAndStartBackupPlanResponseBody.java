// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateAndStartBackupPlanResponseBody extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("CreateBackupSet")
    public Boolean createBackupSet;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAndStartBackupPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAndStartBackupPlanResponseBody self = new CreateAndStartBackupPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAndStartBackupPlanResponseBody setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public CreateAndStartBackupPlanResponseBody setCreateBackupSet(Boolean createBackupSet) {
        this.createBackupSet = createBackupSet;
        return this;
    }
    public Boolean getCreateBackupSet() {
        return this.createBackupSet;
    }

    public CreateAndStartBackupPlanResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateAndStartBackupPlanResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateAndStartBackupPlanResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAndStartBackupPlanResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateAndStartBackupPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAndStartBackupPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
