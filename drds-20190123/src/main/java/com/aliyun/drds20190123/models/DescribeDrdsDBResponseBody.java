// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBResponseBody extends TeaModel {
    /**
     * <p>Indicates the details about the database.</p>
     */
    @NameInMap("Data")
    public DescribeDrdsDBResponseBodyData data;

    /**
     * <p>Indicates the ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>58FB0EC7-CF71-4E48-92FB-CF070D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBResponseBody self = new DescribeDrdsDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBResponseBody setData(DescribeDrdsDBResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsDBResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsDBResponseBodyData extends TeaModel {
        /**
         * <p>Indicates the time when the database was created. The value is in the UNIX timestamp format. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1602050276000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates the storage type of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("DbInstType")
        public String dbInstType;

        /**
         * <p>Indicates the name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>db_test</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>Indicates the type of the instance in which the database is deployed. Valid values:</p>
         * <ul>
         * <li><strong>MASTER</strong>: The instance is a primary instance.</li>
         * <li><strong>SLAVE</strong>: The instance is a read-only instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MASTER</p>
         */
        @NameInMap("InstRole")
        public String instRole;

        /**
         * <p>Indicates the database sharding method.</p>
         * <ul>
         * <li><strong>HORIZONTAL</strong>: The database is horizontally sharded.</li>
         * <li><strong>VERTICAL</strong>: The database is vertically sharded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HORIZONTAL</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>Indicates the schema name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>db_test*******************</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>Indicates the state of the database. Valid values:</p>
         * <ul>
         * <li><strong>TO_BE_INIT</strong>: The database is being created.</li>
         * <li><strong>NORMAL</strong>: The database is running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDrdsDBResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBResponseBodyData self = new DescribeDrdsDBResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsDBResponseBodyData setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDBResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeDrdsDBResponseBodyData setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

        public DescribeDrdsDBResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDrdsDBResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DescribeDrdsDBResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
