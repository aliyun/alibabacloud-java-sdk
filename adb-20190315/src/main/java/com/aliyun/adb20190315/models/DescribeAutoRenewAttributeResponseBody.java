// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The renewal information of the cluster.</p>
     */
    @NameInMap("Items")
    public DescribeAutoRenewAttributeResponseBodyItems items;

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
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
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

    public static DescribeAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoRenewAttributeResponseBody self = new DescribeAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoRenewAttributeResponseBody setItems(DescribeAutoRenewAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAutoRenewAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeAutoRenewAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoRenewAttributeResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoRenewAttributeResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp11q28kvl688****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The renewal duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The unit of the renewal duration. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong></li>
         * <li><strong>Month</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The region ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The renewal status of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>AutoRenewal</strong>: The cluster is automatically renewed.</li>
         * <li><strong>Normal</strong>: The cluster is manually renewed. Before the cluster expires, the system sends you a reminder by SMS message.</li>
         * <li><strong>NotRenewal</strong>: The cluster is not renewed. Three days before the cluster expires, the system sends you a reminder by SMS message to remind you that the cluster is not renewed. However, the system does not send you a reminder when the cluster expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoRenewal</p>
         */
        @NameInMap("RenewalStatus")
        public String renewalStatus;

        public static DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute self = new DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setAutoRenewEnabled(Boolean autoRenewEnabled) {
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

    }

    public static class DescribeAutoRenewAttributeResponseBodyItems extends TeaModel {
        @NameInMap("AutoRenewAttribute")
        public java.util.List<DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute> autoRenewAttribute;

        public static DescribeAutoRenewAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRenewAttributeResponseBodyItems self = new DescribeAutoRenewAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAutoRenewAttributeResponseBodyItems setAutoRenewAttribute(java.util.List<DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute> autoRenewAttribute) {
            this.autoRenewAttribute = autoRenewAttribute;
            return this;
        }
        public java.util.List<DescribeAutoRenewAttributeResponseBodyItemsAutoRenewAttribute> getAutoRenewAttribute() {
            return this.autoRenewAttribute;
        }

    }

}
