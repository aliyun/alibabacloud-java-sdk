// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaBackupSettingResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The backup settings.</p>
     */
    @NameInMap("HanaBackupSetting")
    public DescribeHanaBackupSettingResponseBodyHanaBackupSetting hanaBackupSetting;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeHanaBackupSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaBackupSettingResponseBody self = new DescribeHanaBackupSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHanaBackupSettingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHanaBackupSettingResponseBody setHanaBackupSetting(DescribeHanaBackupSettingResponseBodyHanaBackupSetting hanaBackupSetting) {
        this.hanaBackupSetting = hanaBackupSetting;
        return this;
    }
    public DescribeHanaBackupSettingResponseBodyHanaBackupSetting getHanaBackupSetting() {
        return this.hanaBackupSetting;
    }

    public DescribeHanaBackupSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHanaBackupSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHanaBackupSettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeHanaBackupSettingResponseBodyHanaBackupSetting extends TeaModel {
        /**
         * <p>The configuration file for catalog backup.</p>
         */
        @NameInMap("CatalogBackupParameterFile")
        public String catalogBackupParameterFile;

        /**
         * <p>Indicates whether Backint is used to back up catalogs. Valid values:</p>
         * <br>
         * <p>*   true: Backint is used to back up catalogs.</p>
         * <p>*   false: Backint is not used to back up catalogs.</p>
         */
        @NameInMap("CatalogBackupUsingBackint")
        public Boolean catalogBackupUsingBackint;

        /**
         * <p>The configuration file for data backup.</p>
         */
        @NameInMap("DataBackupParameterFile")
        public String dataBackupParameterFile;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>Indicates whether automatic log backup is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: Automatic log backup is enabled.</p>
         * <p>*   **false**: Automatic log backup is disabled.</p>
         */
        @NameInMap("EnableAutoLogBackup")
        public Boolean enableAutoLogBackup;

        /**
         * <p>The configuration file for log backup.</p>
         */
        @NameInMap("LogBackupParameterFile")
        public String logBackupParameterFile;

        /**
         * <p>The interval at which logs are backed up. Unit: seconds.</p>
         */
        @NameInMap("LogBackupTimeout")
        public Long logBackupTimeout;

        /**
         * <p>Indicates whether Backint is used to back up logs. Valid values:</p>
         * <br>
         * <p>*   true: Backint is used to back up logs.</p>
         * <p>*   false: Backint is not used to back up logs.</p>
         */
        @NameInMap("LogBackupUsingBackint")
        public Boolean logBackupUsingBackint;

        public static DescribeHanaBackupSettingResponseBodyHanaBackupSetting build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaBackupSettingResponseBodyHanaBackupSetting self = new DescribeHanaBackupSettingResponseBodyHanaBackupSetting();
            return TeaModel.build(map, self);
        }

        public DescribeHanaBackupSettingResponseBodyHanaBackupSetting setCatalogBackupParameterFile(String catalogBackupParameterFile) {
            this.catalogBackupParameterFile = catalogBackupParameterFile;
            return this;
        }
        public String getCatalogBackupParameterFile() {
            return this.catalogBackupParameterFile;
        }

        public DescribeHanaBackupSettingResponseBodyHanaBackupSetting setCatalogBackupUsingBackint(Boolean catalogBackupUsingBackint) {
            this.catalogBackupUsingBackint = catalogBackupUsingBackint;
            return this;
        }
        public Boolean getCatalogBackupUsingBackint() {
            return this.catalogBackupUsingBackint;
        }

        public DescribeHanaBackupSettingResponseBodyHanaBackupSetting setDataBackupParameterFile(String dataBackupParameterFile) {
            this.dataBackupParameterFile = dataBackupParameterFile;
            return this;
        }
        public String getDataBackupParameterFile() {
            return this.dataBackupParameterFile;
        }

        public DescribeHanaBackupSettingResponseBodyHanaBackupSetting setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeHanaBackupSettingResponseBodyHanaBackupSetting setEnableAutoLogBackup(Boolean enableAutoLogBackup) {
            this.enableAutoLogBackup = enableAutoLogBackup;
            return this;
        }
        public Boolean getEnableAutoLogBackup() {
            return this.enableAutoLogBackup;
        }

        public DescribeHanaBackupSettingResponseBodyHanaBackupSetting setLogBackupParameterFile(String logBackupParameterFile) {
            this.logBackupParameterFile = logBackupParameterFile;
            return this;
        }
        public String getLogBackupParameterFile() {
            return this.logBackupParameterFile;
        }

        public DescribeHanaBackupSettingResponseBodyHanaBackupSetting setLogBackupTimeout(Long logBackupTimeout) {
            this.logBackupTimeout = logBackupTimeout;
            return this;
        }
        public Long getLogBackupTimeout() {
            return this.logBackupTimeout;
        }

        public DescribeHanaBackupSettingResponseBodyHanaBackupSetting setLogBackupUsingBackint(Boolean logBackupUsingBackint) {
            this.logBackupUsingBackint = logBackupUsingBackint;
            return this;
        }
        public Boolean getLogBackupUsingBackint() {
            return this.logBackupUsingBackint;
        }

    }

}
