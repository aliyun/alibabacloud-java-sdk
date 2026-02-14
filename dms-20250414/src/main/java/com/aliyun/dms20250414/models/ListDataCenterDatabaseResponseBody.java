// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataCenterDatabaseResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListDataCenterDatabaseResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
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
        @NameInMap("DatabaseDesc")
        public String databaseDesc;

        /**
         * <strong>example:</strong>
         * <p>diamonds.csv</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <strong>example:</strong>
         * <p>6kv159u9vtpvl**********b8</p>
         */
        @NameInMap("DbId")
        public String dbId;

        /**
         * <strong>example:</strong>
         * <p>csv</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("DescUpdateTime")
        public String descUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>73088962</p>
         */
        @NameInMap("DmsDbId")
        public Long dmsDbId;

        /**
         * <strong>example:</strong>
         * <p>2740966</p>
         */
        @NameInMap("DmsInstanceId")
        public Long dmsInstanceId;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("ImportType")
        public String importType;

        /**
         * <strong>example:</strong>
         * <p>f-ean8u5881qk4*********xh5y</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("IsInternal")
        public String isInternal;

        /**
         * <strong>example:</strong>
         * <p>999</p>
         */
        @NameInMap("Size")
        public Long size;

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

        public ListDataCenterDatabaseResponseBodyData setIsInternal(String isInternal) {
            this.isInternal = isInternal;
            return this;
        }
        public String getIsInternal() {
            return this.isInternal;
        }

        public ListDataCenterDatabaseResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
