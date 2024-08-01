// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewalAttributeResponseBody extends TeaModel {
    /**
     * <p>Details about returned entries.</p>
     */
    @NameInMap("Items")
    public DescribeInstanceAutoRenewalAttributeResponseBodyItems items;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ItemsNumbers")
    public Integer itemsNumbers;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries that were returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FAB5CB3B-DB9D-473A-9DF1-F57B6B9CB949</p>
     */
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
        /**
         * <p>Indicates whether auto-renewal is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Auto-renewal is enabled for the instance.</li>
         * <li><strong>false</strong>: Auto-renewal is disabled for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenew")
        public String autoRenew;

        /**
         * <p>The category of the instance. Valid values:</p>
         * <ul>
         * <li><strong>replicate</strong>: the standalone or replica set instance</li>
         * <li><strong>sharding</strong>: the sharded cluster instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>replicate</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp2568*****</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <p>The auto-renewal period. Unit: months.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is ruturned only when the returned value of the <strong>AutoRenew</strong> parameter is <strong>true</strong>.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/145979.html">ModifyInstanceAutoRenewalAttribute</a> operation to modify the auto-renewal period.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
