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
         * <br>
         * <p>*   **true**: Auto-renewal is enabled.</p>
         * <p>*   **false**: Auto-renewal is disabled.</p>
         */
        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The renewal period.</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The unit of the renewal period. Valid values:</p>
         * <br>
         * <p>*   **Year**</p>
         * <p>*   **Month**</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The region ID of the cluster.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The renewal status of the cluster. Valid values:</p>
         * <br>
         * <p>*   **AutoRenewal**: The cluster is automatically renewed.</p>
         * <p>*   **Normal**: The cluster is manually renewed. Before the cluster expires, the system sends you a reminder by SMS message.</p>
         * <p>*   **NotRenewal**: The cluster is not renewed. Three days before the cluster expires, the system sends you a reminder by SMS message to remind you that the cluster is not renewed. However, the system does not send you a reminder when the cluster expires.</p>
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
