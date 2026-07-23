// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataCenterDatabaseResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDataCenterDatabaseResponseBodyData> data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.                                 </li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataCenterDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCenterDatabaseResponseBody self = new ListDataCenterDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCenterDatabaseResponseBody setData(java.util.List<ListDataCenterDatabaseResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataCenterDatabaseResponseBodyData> getData() {
        return this.data;
    }

    public ListDataCenterDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataCenterDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataCenterDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCenterDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataCenterDatabaseResponseBodyData extends TeaModel {
        /**
         * <p>The database description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a sample database.</p>
         */
        @NameInMap("DatabaseDesc")
        public String databaseDesc;

        /**
         * <p>The database name.</p>
         * <ul>
         * <li>When ImportType is FILE, this parameter indicates the file name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>diamonds.csv</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6kv159u9vtpvl**********b8</p>
         */
        @NameInMap("DbId")
        public String dbId;

        /**
         * <ul>
         * <li>When ImportType is FILE:<ul>
         * <li>File type: dbType indicates the file format, such as csv, xlsx, or xls.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>csv</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The time when the database description was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("DescUpdateTime")
        public String descUpdateTime;

        /**
         * <p>The ID of the Data Management database that hosts the instance.</p>
         * <ul>
         * <li>This parameter is not returned when ImportType is FILE.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>73088962</p>
         */
        @NameInMap("DmsDbId")
        public Long dmsDbId;

        /**
         * <p>The ID of the Data Management instance that hosts the instance.</p>
         * <ul>
         * <li>This parameter is not returned when ImportType is FILE.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2740966</p>
         */
        @NameInMap("DmsInstanceId")
        public Long dmsInstanceId;

        @NameInMap("DownloadLink")
        public String downloadLink;

        /**
         * <p>The time when the file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The import type.</p>
         * <ul>
         * <li>FILE</li>
         * <li>RDS</li>
         * <li>ADB</li>
         * <li>PolarDB</li>
         * <li>Hologres</li>
         * <li>DMS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("ImportType")
        public String importType;

        /**
         * <p>The instance name.</p>
         * <ul>
         * <li>When ImportType is FILE, this parameter indicates the file ID in the data center.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>f-ean8u5881qk4*********xh5y</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        /**
         * <p>Indicates whether the dataset is built-in. Valid values:</p>
         * <ul>
         * <li>Y: The dataset is built-in.</li>
         * <li>N: The dataset is not built-in.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("IsInternal")
        public String isInternal;

        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <p>The file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>999</p>
         */
        @NameInMap("Size")
        public Long size;

        @NameInMap("UseUserOssBucket")
        public Boolean useUserOssBucket;

        public static ListDataCenterDatabaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataCenterDatabaseResponseBodyData self = new ListDataCenterDatabaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataCenterDatabaseResponseBodyData setDatabaseDesc(String databaseDesc) {
            this.databaseDesc = databaseDesc;
            return this;
        }
        public String getDatabaseDesc() {
            return this.databaseDesc;
        }

        public ListDataCenterDatabaseResponseBodyData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListDataCenterDatabaseResponseBodyData setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public ListDataCenterDatabaseResponseBodyData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListDataCenterDatabaseResponseBodyData setDescUpdateTime(String descUpdateTime) {
            this.descUpdateTime = descUpdateTime;
            return this;
        }
        public String getDescUpdateTime() {
            return this.descUpdateTime;
        }

        public ListDataCenterDatabaseResponseBodyData setDmsDbId(Long dmsDbId) {
            this.dmsDbId = dmsDbId;
            return this;
        }
        public Long getDmsDbId() {
            return this.dmsDbId;
        }

        public ListDataCenterDatabaseResponseBodyData setDmsInstanceId(Long dmsInstanceId) {
            this.dmsInstanceId = dmsInstanceId;
            return this;
        }
        public Long getDmsInstanceId() {
            return this.dmsInstanceId;
        }

        public ListDataCenterDatabaseResponseBodyData setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public ListDataCenterDatabaseResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListDataCenterDatabaseResponseBodyData setImportType(String importType) {
            this.importType = importType;
            return this;
        }
        public String getImportType() {
            return this.importType;
        }

        public ListDataCenterDatabaseResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListDataCenterDatabaseResponseBodyData setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public ListDataCenterDatabaseResponseBodyData setIsInternal(String isInternal) {
            this.isInternal = isInternal;
            return this;
        }
        public String getIsInternal() {
            return this.isInternal;
        }

        public ListDataCenterDatabaseResponseBodyData setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public ListDataCenterDatabaseResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListDataCenterDatabaseResponseBodyData setUseUserOssBucket(Boolean useUserOssBucket) {
            this.useUserOssBucket = useUserOssBucket;
            return this;
        }
        public Boolean getUseUserOssBucket() {
            return this.useUserOssBucket;
        }

    }

}
