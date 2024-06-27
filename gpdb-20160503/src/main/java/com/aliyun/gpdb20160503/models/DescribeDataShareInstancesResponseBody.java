// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataShareInstancesResponseBody extends TeaModel {
    /**
     * <p>The state of data sharing. Valid values:</p>
     * <ul>
     * <li><strong>opening</strong></li>
     * <li><strong>opened</strong></li>
     * <li><strong>closing</strong></li>
     * <li><strong>closed</strong></li>
     * </ul>
     */
    @NameInMap("Items")
    public DescribeDataShareInstancesResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D5**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>gp-bp***************</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The resource type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Serverless</strong>: Serverless mode</li>
         * <li><strong>StorageElasic</strong>: elastic storage mode</li>
         * <li><strong>Classic</strong>: reserved storage mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Serverless</p>
         */
        @NameInMap("DBInstanceMode")
        public String DBInstanceMode;

        /**
         * <p>The state of data sharing. Valid values:</p>
         * <ul>
         * <li><strong>opening</strong>: Data sharing is being enabled.</li>
         * <li><strong>opened</strong>: Data sharing is enabled.</li>
         * <li><strong>closing</strong>: Data sharing is being disabled.</li>
         * <li><strong>closed</strong>: Data sharing is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opened</p>
         */
        @NameInMap("DataShareStatus")
        public String dataShareStatus;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp***************</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
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
