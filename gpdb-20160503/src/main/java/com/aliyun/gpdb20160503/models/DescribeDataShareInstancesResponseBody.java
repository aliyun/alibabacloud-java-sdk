// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataShareInstancesResponseBody extends TeaModel {
    /**
     * <p>Details of the instances.</p>
     */
    @NameInMap("Items")
    public DescribeDataShareInstancesResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The resource type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Serverless**: Serverless mode</p>
         * <p>*   **StorageElasic**: elastic storage mode</p>
         * <p>*   **Classic**: reserved storage mode</p>
         */
        @NameInMap("DBInstanceMode")
        public String DBInstanceMode;

        /**
         * <p>The state of data sharing. Valid values:</p>
         * <br>
         * <p>*   **opening**: Data sharing is being enabled.</p>
         * <p>*   **opened**: Data sharing is enabled.</p>
         * <p>*   **closing**: Data sharing is being disabled.</p>
         * <p>*   **closed**: Data sharing is disabled.</p>
         */
        @NameInMap("DataShareStatus")
        public String dataShareStatus;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The zone ID of the instance.</p>
         */
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
