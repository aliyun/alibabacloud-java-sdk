// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class StartBackupPlanResponseBody extends TeaModel {
    /**
     * <p>The ID of the backup schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>dbsqdss5tm****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The ID of the full backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>1h7toien3****</p>
     */
    @NameInMap("CreatedFullBackupsetId")
    public String createdFullBackupsetId;

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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D13761C3-9971-5C02-B789-3F3CD159****</p>
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

    public static StartBackupPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartBackupPlanResponseBody self = new StartBackupPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public StartBackupPlanResponseBody setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public StartBackupPlanResponseBody setCreatedFullBackupsetId(String createdFullBackupsetId) {
        this.createdFullBackupsetId = createdFullBackupsetId;
        return this;
    }
    public String getCreatedFullBackupsetId() {
        return this.createdFullBackupsetId;
    }

    public StartBackupPlanResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public StartBackupPlanResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public StartBackupPlanResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartBackupPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartBackupPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
