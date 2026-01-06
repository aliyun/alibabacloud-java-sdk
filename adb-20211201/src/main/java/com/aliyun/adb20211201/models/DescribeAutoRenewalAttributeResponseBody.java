// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAutoRenewalAttributeResponseBody extends TeaModel {
    /**
     * <p>The list of auto-renewal details.</p>
     */
    @NameInMap("Items")
    public DescribeAutoRenewalAttributeResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BA0F6761-7A8C-59F8-9624-FB56788C0EDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeAutoRenewalAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoRenewalAttributeResponseBody self = new DescribeAutoRenewalAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoRenewalAttributeResponseBody setItems(DescribeAutoRenewalAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAutoRenewalAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeAutoRenewalAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoRenewalAttributeResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAutoRenewalAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoRenewalAttributeResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enables.</li>
         * <li><strong>false</strong>: Disables.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenewalEnabled")
        public Boolean autoRenewalEnabled;

        /**
         * <p>The auto-renewal duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoRenewalPeriod")
        public Long autoRenewalPeriod;

        /**
         * <p>The unit of auto-renewal duration. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong></li>
         * <li><strong>Month</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("AutoRenewalPeriodUnit")
        public String autoRenewalPeriodUnit;

        /**
         * <p>The renewal method. Valid values:</p>
         * <ul>
         * <li><strong>AutoRenewal</strong>: The cluster is automatically renewed.</li>
         * <li><strong>Normal</strong>: The cluster is manually renewed. Before the cluster expires, the system sends you a reminder by SMS message.</li>
         * <li><strong>NotRenewal</strong>: The cluster is not renewed. Reminders are only sent three days before cluster expiration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoRenewal</p>
         */
        @NameInMap("AutoRenewalStatus")
        public String autoRenewalStatus;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-uf6485635fz8****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute self = new DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute setAutoRenewalEnabled(Boolean autoRenewalEnabled) {
            this.autoRenewalEnabled = autoRenewalEnabled;
            return this;
        }
        public Boolean getAutoRenewalEnabled() {
            return this.autoRenewalEnabled;
        }

        public DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute setAutoRenewalPeriod(Long autoRenewalPeriod) {
            this.autoRenewalPeriod = autoRenewalPeriod;
            return this;
        }
        public Long getAutoRenewalPeriod() {
            return this.autoRenewalPeriod;
        }

        public DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute setAutoRenewalPeriodUnit(String autoRenewalPeriodUnit) {
            this.autoRenewalPeriodUnit = autoRenewalPeriodUnit;
            return this;
        }
        public String getAutoRenewalPeriodUnit() {
            return this.autoRenewalPeriodUnit;
        }

        public DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute setAutoRenewalStatus(String autoRenewalStatus) {
            this.autoRenewalStatus = autoRenewalStatus;
            return this;
        }
        public String getAutoRenewalStatus() {
            return this.autoRenewalStatus;
        }

        public DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeAutoRenewalAttributeResponseBodyItems extends TeaModel {
        @NameInMap("AutoRenewalAttribute")
        public java.util.List<DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute> autoRenewalAttribute;

        public static DescribeAutoRenewalAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRenewalAttributeResponseBodyItems self = new DescribeAutoRenewalAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRenewalAttributeResponseBodyItems setAutoRenewalAttribute(java.util.List<DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute> autoRenewalAttribute) {
            this.autoRenewalAttribute = autoRenewalAttribute;
            return this;
        }
        public java.util.List<DescribeAutoRenewalAttributeResponseBodyItemsAutoRenewalAttribute> getAutoRenewalAttribute() {
            return this.autoRenewalAttribute;
        }

    }

}
