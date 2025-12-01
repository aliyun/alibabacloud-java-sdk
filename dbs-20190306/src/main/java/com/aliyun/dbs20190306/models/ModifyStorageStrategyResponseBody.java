// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyStorageStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the backup schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>dbsqdss5tmh****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>findValidDBSJob error</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Indicates whether a precheck is triggered. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A precheck is triggered. You must manually call the <a href="https://help.aliyun.com/document_detail/2869818.html">StartBackupPlan</a> operation to start the backup schedule.</li>
     * <li><strong>false</strong>: No precheck is triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedPrecheck")
    public Boolean needPrecheck;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E995F91F-6F89-503B-9F7D-502F58FD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyStorageStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageStrategyResponseBody self = new ModifyStorageStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStorageStrategyResponseBody setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyStorageStrategyResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModifyStorageStrategyResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModifyStorageStrategyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyStorageStrategyResponseBody setNeedPrecheck(Boolean needPrecheck) {
        this.needPrecheck = needPrecheck;
        return this;
    }
    public Boolean getNeedPrecheck() {
        return this.needPrecheck;
    }

    public ModifyStorageStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyStorageStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
