// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupSourceEndpointResponseBody extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("NeedPrecheck")
    public Boolean needPrecheck;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyBackupSourceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupSourceEndpointResponseBody self = new ModifyBackupSourceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupSourceEndpointResponseBody setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyBackupSourceEndpointResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModifyBackupSourceEndpointResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModifyBackupSourceEndpointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyBackupSourceEndpointResponseBody setNeedPrecheck(Boolean needPrecheck) {
        this.needPrecheck = needPrecheck;
        return this;
    }
    public Boolean getNeedPrecheck() {
        return this.needPrecheck;
    }

    public ModifyBackupSourceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyBackupSourceEndpointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
