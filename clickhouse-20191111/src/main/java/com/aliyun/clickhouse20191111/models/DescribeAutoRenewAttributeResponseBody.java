// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeAutoRenewAttributeResponseBodyItems items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E*******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>51</p>
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
        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        /**
         * <strong>example:</strong>
         * <p>cc-2ze57pg09*****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
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
