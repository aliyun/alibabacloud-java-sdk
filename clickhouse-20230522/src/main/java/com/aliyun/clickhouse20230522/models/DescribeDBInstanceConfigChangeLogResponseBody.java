// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConfigChangeLogResponseBody extends TeaModel {
    /**
     * <p>The result set.</p>
     */
    @NameInMap("Data")
    public DescribeDBInstanceConfigChangeLogResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>780DE414-*********-88BE-A2E21B862B57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceConfigChangeLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceConfigChangeLogResponseBody self = new DescribeDBInstanceConfigChangeLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceConfigChangeLogResponseBody setData(DescribeDBInstanceConfigChangeLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceConfigChangeLogResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceConfigChangeLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs extends TeaModel {
        /**
         * <p>Indicates whether the configuration takes effect:</p>
         * <ul>
         * <li>true: The execution plan takes effect.</li>
         * <li>false: The execution plan does not take effect.</li>
         * </ul>
         */
        @NameInMap("Applied")
        public Boolean applied;

        /**
         * <p>The time when the change was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-25 13:46:06</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the change was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-25 13:46:06</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ID")
        public Long ID;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>max_concurrent_queries</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The new parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NewValue")
        public String newValue;

        /**
         * <p>The old parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("OldValue")
        public String oldValue;

        public static DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs self = new DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs setApplied(Boolean applied) {
            this.applied = applied;
            return this;
        }
        public Boolean getApplied() {
            return this.applied;
        }

        public DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs setID(Long ID) {
            this.ID = ID;
            return this;
        }
        public Long getID() {
            return this.ID;
        }

        public DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

    }

    public static class DescribeDBInstanceConfigChangeLogResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The parameter change records.</p>
         */
        @NameInMap("ParamChangeLogs")
        public java.util.List<DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs> paramChangeLogs;

        public static DescribeDBInstanceConfigChangeLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceConfigChangeLogResponseBodyData self = new DescribeDBInstanceConfigChangeLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceConfigChangeLogResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceConfigChangeLogResponseBodyData setParamChangeLogs(java.util.List<DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs> paramChangeLogs) {
            this.paramChangeLogs = paramChangeLogs;
            return this;
        }
        public java.util.List<DescribeDBInstanceConfigChangeLogResponseBodyDataParamChangeLogs> getParamChangeLogs() {
            return this.paramChangeLogs;
        }

    }

}
