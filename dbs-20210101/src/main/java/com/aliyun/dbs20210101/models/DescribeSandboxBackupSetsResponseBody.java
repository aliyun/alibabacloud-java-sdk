// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxBackupSetsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data. The following parameters are contained:</p>
     * <ul>
     * <li><strong>backupSetTime</strong>: the point in time when the snapshot was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</li>
     * <li><strong>backupSetId</strong>: the ID of the backup set.</li>
     * <li><strong>backupSetType</strong>: the type of the snapshot. A value of <strong>Full</strong> indicates that the snapshot is a full backup snapshot. A value of <strong>Inc</strong> indicates that the snapshot is an incremental backup snapshot.</li>
     * <li><strong>backupPlanId</strong>: the ID of the backup schedule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;Data&quot;: {     &quot;number&quot;: 2,     &quot;size&quot;: 2,     &quot;content&quot;: [       {         &quot;backupSetTime&quot;: &quot;2021-08-28T23:12:31Z&quot;,         &quot;backupSetId&quot;: &quot;Inc_1hxxxx8xxxxxa_20210801064200_mysql-bin.000134&quot;,         &quot;backupSetType&quot;: &quot;Inc&quot;,         &quot;backupPlanId&quot;: &quot;1hxxxx8xxxxxa&quot;       },       {         &quot;backupSetTime&quot;: &quot;2021-08-28T22:42:28Z&quot;,         &quot;backupSetId&quot;: &quot;1hxxxx8xxxxxa_20210829064228&quot;,         &quot;backupSetType&quot;: &quot;FULL&quot;,         &quot;backupPlanId&quot;: &quot;1hxxxx8xxxxxa&quot;       }     ],     &quot;totalElements&quot;: 2   },</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4F1888AC-1138-4995-B9FE-D2734F61C058</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSandboxBackupSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxBackupSetsResponseBody self = new DescribeSandboxBackupSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxBackupSetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSandboxBackupSetsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeSandboxBackupSetsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSandboxBackupSetsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSandboxBackupSetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSandboxBackupSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSandboxBackupSetsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
