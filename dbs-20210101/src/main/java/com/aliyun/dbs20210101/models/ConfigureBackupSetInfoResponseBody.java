// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class ConfigureBackupSetInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ConfigureBackupSetInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Request.Forbidden</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>54A63B3B-AA10-1CC3-A6BB-6CCE98D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ConfigureBackupSetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigureBackupSetInfoResponseBody self = new ConfigureBackupSetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigureBackupSetInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfigureBackupSetInfoResponseBody setData(ConfigureBackupSetInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfigureBackupSetInfoResponseBodyData getData() {
        return this.data;
    }

    public ConfigureBackupSetInfoResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ConfigureBackupSetInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ConfigureBackupSetInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfigureBackupSetInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigureBackupSetInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ConfigureBackupSetInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ee-d84wwm3ca****</p>
         */
        @NameInMap("BackupSetId")
        public String backupSetId;

        public static ConfigureBackupSetInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfigureBackupSetInfoResponseBodyData self = new ConfigureBackupSetInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfigureBackupSetInfoResponseBodyData setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

    }

}
