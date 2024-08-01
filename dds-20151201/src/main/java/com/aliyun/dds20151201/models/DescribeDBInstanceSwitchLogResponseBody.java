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
     * <p>The primary/secondary switchover logs.</p>
     */
    @NameInMap("LogItems")
    public java.util.List<DescribeDBInstanceSwitchLogResponseBodyLogItems> logItems;

    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ECBCA991-XXXX-XXXX-834C-B3E8007F33AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of primary/secondary switching entries.</p>
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
         * <p>The ID of the replica set instance or the ID of the node on which a primary/secondary switchover is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-uf68f1b5a57exxxx</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The code that indicates the reason of a primary/secondary switchover. Valid values:</p>
         * <ul>
         * <li>USER_CONSOLE_OPERATION: The switchover is manually performed.</li>
         * <li>OPERATION_AND_MAINTENANCE: Potential risks exist.</li>
         * <li>MACHINE_DOWNTIME: The host is offline.</li>
         * <li>PRIMARY_UNHEALTHY: An exception occurs on the primary node of the instance.</li>
         * <li>SECONDARY_UNHEALTHY: An exception occurs on the secondary node of the instance.</li>
         * <li>MULTIPLE_NODE_FAILURES: An exception occurs on multiple nodes of the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_CONSOLE_OPERATION</p>
         */
        @NameInMap("SwitchCode")
        public String switchCode;

        /**
         * <p>The switchover status. Valid values: <strong>1</strong> and <strong>0</strong>. The value 1 indicates a successful primary/secondary switchover and the value 0 indicates a failed primary/secondary switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SwitchStatus")
        public String switchStatus;

        /**
         * <p>The point in time when a primary/secondary switchover was performed. The time follows the ISO 8601 standard in the <em>yyyy-mm-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
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
