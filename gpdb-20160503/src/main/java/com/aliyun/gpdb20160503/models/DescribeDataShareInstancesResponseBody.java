// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataShareInstancesResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeDataShareInstancesResponseBodyItems items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDataShareInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataShareInstancesResponseBody self = new DescribeDataShareInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataShareInstancesResponseBody setItems(DescribeDataShareInstancesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDataShareInstancesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDataShareInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataShareInstancesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDataShareInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataShareInstancesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDataShareInstancesResponseBodyItemsDBInstance extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceMode")
        public String DBInstanceMode;

        @NameInMap("DataShareStatus")
        public String dataShareStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDataShareInstancesResponseBodyItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataShareInstancesResponseBodyItemsDBInstance self = new DescribeDataShareInstancesResponseBodyItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDataShareInstancesResponseBodyItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDataShareInstancesResponseBodyItemsDBInstance setDBInstanceMode(String DBInstanceMode) {
            this.DBInstanceMode = DBInstanceMode;
            return this;
        }
        public String getDBInstanceMode() {
            return this.DBInstanceMode;
        }

        public DescribeDataShareInstancesResponseBodyItemsDBInstance setDataShareStatus(String dataShareStatus) {
            this.dataShareStatus = dataShareStatus;
            return this;
        }
        public String getDataShareStatus() {
            return this.dataShareStatus;
        }

        public DescribeDataShareInstancesResponseBodyItemsDBInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDataShareInstancesResponseBodyItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataShareInstancesResponseBodyItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDataShareInstancesResponseBodyItems extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeDataShareInstancesResponseBodyItemsDBInstance> DBInstance;

        public static DescribeDataShareInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataShareInstancesResponseBodyItems self = new DescribeDataShareInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataShareInstancesResponseBodyItems setDBInstance(java.util.List<DescribeDataShareInstancesResponseBodyItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDataShareInstancesResponseBodyItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
