// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSwitchLogResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("LogItems")
    public java.util.List<DescribeDBInstanceSwitchLogResponseBodyLogItems> logItems;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("SwitchCode")
        public String switchCode;

        @NameInMap("SwitchStatus")
        public String switchStatus;

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
