// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaBackupSettingResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The backup settings.</p>
     */
    @NameInMap("HanaBackupSetting")
    public DescribeHanaBackupSettingResponseBodyHanaBackupSetting hanaBackupSetting;

    /**
     * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9D0DB5BC-5071-5ADF-BCD1-14EBB0C17C54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
         */
        @NameInMap("CatalogBackupParameterFile")
        public String catalogBackupParameterFile;

        /**
         * <p>Indicates whether Backint is used to back up catalogs. Valid values:</p>
         * <ul>
         * <li>true: Backint is used to back up catalogs.</li>
         * <li>false: Backint is not used to back up catalogs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CatalogBackupUsingBackint")
        public Boolean catalogBackupUsingBackint;

        /**
         * <p>The configuration file for data backup.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
         */
        @NameInMap("DataBackupParameterFile")
        public String dataBackupParameterFile;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEMDB</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>Indicates whether automatic log backup is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Automatic log backup is enabled.</li>
         * <li><strong>false</strong>: Automatic log backup is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAutoLogBackup")
        public Boolean enableAutoLogBackup;

        /**
         * <p>The configuration file for log backup.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
         */
        @NameInMap("LogBackupParameterFile")
        public String logBackupParameterFile;

        /**
         * <p>The interval at which logs are backed up. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("LogBackupTimeout")
        public Long logBackupTimeout;

        /**
         * <p>Indicates whether Backint is used to back up logs. Valid values:</p>
         * <ul>
         * <li>true: Backint is used to back up logs.</li>
         * <li>false: Backint is not used to back up logs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
