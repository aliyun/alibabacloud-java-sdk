// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewalAttributeResponseBody extends TeaModel {
    // Details about returned entries.
    @NameInMap("Items")
    public DescribeInstanceAutoRenewalAttributeResponseBodyItems items;

    // The total number of entries returned.
    @NameInMap("ItemsNumbers")
    public Integer itemsNumbers;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries that were returned on the current page.
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceAutoRenewalAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewalAttributeResponseBody self = new DescribeInstanceAutoRenewalAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setItems(DescribeInstanceAutoRenewalAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeInstanceAutoRenewalAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setItemsNumbers(Integer itemsNumbers) {
        this.itemsNumbers = itemsNumbers;
        return this;
    }
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem extends TeaModel {
        // Indicates whether auto-renewal is enabled for the instance. Valid values:
        // 
        // *   **true**: Auto-renewal is enabled for the instance.
        // *   **false**: Auto-renewal is disabled for the instance.
        @NameInMap("AutoRenew")
        public String autoRenew;

        // The category of the instance. Valid values:
        // 
        // *   **replicate**: the standalone or replica set instance
        // *   **sharding**: the sharded cluster instance
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        // The ID of the instance.
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        // The auto-renewal period. Unit: months.
        // 
        // > * This parameter is ruturned only when the returned value of the **AutoRenew** parameter is **true**.
        // > * You can call the [ModifyInstanceAutoRenewalAttribute](~~145979~~) operation to modify the auto-renewal period.
        @NameInMap("Duration")
        public String duration;

        // The region ID of the instance.
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem self = new DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public String getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeInstanceAutoRenewalAttributeResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem> item;

        public static DescribeInstanceAutoRenewalAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewalAttributeResponseBodyItems self = new DescribeInstanceAutoRenewalAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItems setItem(java.util.List<DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
