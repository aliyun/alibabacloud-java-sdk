// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupObjectsResponseBody extends TeaModel {
    /**
     * <p>The ID of the backup schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1h****usfa</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The error code returned if the request failed.</p>
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
     * <p>The specified parameter %s value is not valid.</p>
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
     * <p>Indicates whether a precheck is triggered. If true is returned, you must call the <a href="https://help.aliyun.com/document_detail/2869816.html">StartBackupPlan</a> operation to start the backup schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedPrecheck")
    public Boolean needPrecheck;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D6E068C3-25BC-455A-85FE-45F0B22ECB1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyBackupObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupObjectsResponseBody self = new ModifyBackupObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupObjectsResponseBody setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyBackupObjectsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModifyBackupObjectsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModifyBackupObjectsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyBackupObjectsResponseBody setNeedPrecheck(Boolean needPrecheck) {
        this.needPrecheck = needPrecheck;
        return this;
    }
    public Boolean getNeedPrecheck() {
        return this.needPrecheck;
    }

    public ModifyBackupObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyBackupObjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
