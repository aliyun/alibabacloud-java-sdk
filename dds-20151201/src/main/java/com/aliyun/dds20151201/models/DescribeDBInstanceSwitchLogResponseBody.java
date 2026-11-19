// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSwitchLogResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-uf68f1b5a57exxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The list of primary/secondary switchover logs.</p>
     */
    @NameInMap("LogItems")
    public java.util.List<DescribeDBInstanceSwitchLogResponseBodyLogItems> logItems;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ECBCA991-XXXX-XXXX-834C-B3E8007F33AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of primary/secondary switchover records returned in the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDBInstanceSwitchLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSwitchLogResponseBody self = new DescribeDBInstanceSwitchLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSwitchLogResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceSwitchLogResponseBody setLogItems(java.util.List<DescribeDBInstanceSwitchLogResponseBodyLogItems> logItems) {
        this.logItems = logItems;
        return this;
    }
    public java.util.List<DescribeDBInstanceSwitchLogResponseBodyLogItems> getLogItems() {
        return this.logItems;
    }

    public DescribeDBInstanceSwitchLogResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceSwitchLogResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstanceSwitchLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceSwitchLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDBInstanceSwitchLogResponseBodyLogItems extends TeaModel {
        /**
         * <p>Instance ID of the instance if the instance is a replica set instance, or instance ID of the switched node if the instance is a sharded cluster instance.</p>
         * 
         * <strong>example:</strong>
         * <p>If the instance is a replica set instance: dds-uf68f1b5a57exxxx.
         * If the instance is a sharded cluster instance: d-uf652b73f554xxxx</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The cause code of the switchover. Valid values:</p>
         * <ul>
         * <li>USER_CONSOLE_OPERATION: manual operation</li>
         * <li>OPERATION_AND_MAINTENANCE: potential risk</li>
         * <li>MACHINE_DOWNTIME: host offline</li>
         * <li>PRIMARY_UNHEALTHY: instance failures</li>
         * <li>SECONDARY_UNHEALTHY: instance failures</li>
         * <li>MULTIPLE_NODE_FAILURES: instance failures</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_CONSOLE_OPERATION</p>
         */
        @NameInMap("SwitchCode")
        public String switchCode;

        /**
         * <p>The switchover status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The switchover is successful.</li>
         * <li><strong>0</strong>: The switchover failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SwitchStatus")
        public String switchStatus;

        /**
         * <p>The switchover time. The time is in the <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-07T18:00:00Z</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        public static DescribeDBInstanceSwitchLogResponseBodyLogItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceSwitchLogResponseBodyLogItems self = new DescribeDBInstanceSwitchLogResponseBodyLogItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceSwitchLogResponseBodyLogItems setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstanceSwitchLogResponseBodyLogItems setSwitchCode(String switchCode) {
            this.switchCode = switchCode;
            return this;
        }
        public String getSwitchCode() {
            return this.switchCode;
        }

        public DescribeDBInstanceSwitchLogResponseBodyLogItems setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public DescribeDBInstanceSwitchLogResponseBodyLogItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

    }

}
