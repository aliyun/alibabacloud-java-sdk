// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanBillingResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>This backupPlan can\&quot;t support this action</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The billing information of the backup plan.</p>
     */
    @NameInMap("Item")
    public DescribeBackupPlanBillingResponseBodyItem item;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD7BC7F5-4E3A-5DF3-BFF9-831503C4D9E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeBackupPlanBillingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanBillingResponseBody self = new DescribeBackupPlanBillingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanBillingResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeBackupPlanBillingResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBackupPlanBillingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBackupPlanBillingResponseBody setItem(DescribeBackupPlanBillingResponseBodyItem item) {
        this.item = item;
        return this;
    }
    public DescribeBackupPlanBillingResponseBodyItem getItem() {
        return this.item;
    }

    public DescribeBackupPlanBillingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPlanBillingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBackupPlanBillingResponseBodyItem extends TeaModel {
        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>PREPAY</strong>: subscription</p>
         * </li>
         * <li><p><strong>POSTPAY</strong>: pay-as-you-go</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("BuyChargeType")
        public String buyChargeType;

        /**
         * <p>The timestamp that indicates when the instance was purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>1658372830000</p>
         */
        @NameInMap("BuyCreateTimestamp")
        public Long buyCreateTimestamp;

        /**
         * <p>The timestamp that indicates when the instance expires.</p>
         * <blockquote>
         * <p>This parameter is returned only when BuyChargeType is set to PREPAY.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1661097600000</p>
         */
        @NameInMap("BuyExpiredTimestamp")
        public Long buyExpiredTimestamp;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>micro</p>
         */
        @NameInMap("BuySpec")
        public String buySpec;

        /**
         * <p>The storage space used by incremental backup data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10437039</p>
         */
        @NameInMap("ContStorageSize")
        public Long contStorageSize;

        /**
         * <p>The storage space used by full backup data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>151</p>
         */
        @NameInMap("FullStorageSize")
        public Long fullStorageSize;

        /**
         * <p>Indicates whether the instance has expired.</p>
         * <blockquote>
         * <p>This parameter is returned only when BuyChargeType is set to PREPAY.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsExpired")
        public Boolean isExpired;

        /**
         * <p>Indicates whether the instance provides unlimited free backup traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFreeBytesUnlimited")
        public Boolean isFreeBytesUnlimited;

        /**
         * <p>The total paid backup traffic in the current month. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaiedBytes")
        public Long paiedBytes;

        /**
         * <p>The timestamp that indicates the end of the billing cycle for the free backup traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>1659283200000</p>
         */
        @NameInMap("QuotaEndTimestamp")
        public Long quotaEndTimestamp;

        /**
         * <p>The timestamp that indicates the start of the billing cycle for the free backup traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>1656604800000</p>
         */
        @NameInMap("QuotaStartTimestamp")
        public Long quotaStartTimestamp;

        /**
         * <p>The total free backup traffic in the current month. Unit: bytes.</p>
         * <blockquote>
         * <p>This parameter is returned only when BuyChargeType is set to PREPAY and IsFreeBytesUnlimited is false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>858993459200</p>
         */
        @NameInMap("TotalFreeBytes")
        public Long totalFreeBytes;

        /**
         * <p>The paid traffic for full backups in the current month. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UsedFullBytes")
        public Long usedFullBytes;

        /**
         * <p>The paid traffic for incremental backups in the current month. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9406734</p>
         */
        @NameInMap("UsedIncrementBytes")
        public Long usedIncrementBytes;

        public static DescribeBackupPlanBillingResponseBodyItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlanBillingResponseBodyItem self = new DescribeBackupPlanBillingResponseBodyItem();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlanBillingResponseBodyItem setBuyChargeType(String buyChargeType) {
            this.buyChargeType = buyChargeType;
            return this;
        }
        public String getBuyChargeType() {
            return this.buyChargeType;
        }

        public DescribeBackupPlanBillingResponseBodyItem setBuyCreateTimestamp(Long buyCreateTimestamp) {
            this.buyCreateTimestamp = buyCreateTimestamp;
            return this;
        }
        public Long getBuyCreateTimestamp() {
            return this.buyCreateTimestamp;
        }

        public DescribeBackupPlanBillingResponseBodyItem setBuyExpiredTimestamp(Long buyExpiredTimestamp) {
            this.buyExpiredTimestamp = buyExpiredTimestamp;
            return this;
        }
        public Long getBuyExpiredTimestamp() {
            return this.buyExpiredTimestamp;
        }

        public DescribeBackupPlanBillingResponseBodyItem setBuySpec(String buySpec) {
            this.buySpec = buySpec;
            return this;
        }
        public String getBuySpec() {
            return this.buySpec;
        }

        public DescribeBackupPlanBillingResponseBodyItem setContStorageSize(Long contStorageSize) {
            this.contStorageSize = contStorageSize;
            return this;
        }
        public Long getContStorageSize() {
            return this.contStorageSize;
        }

        public DescribeBackupPlanBillingResponseBodyItem setFullStorageSize(Long fullStorageSize) {
            this.fullStorageSize = fullStorageSize;
            return this;
        }
        public Long getFullStorageSize() {
            return this.fullStorageSize;
        }

        public DescribeBackupPlanBillingResponseBodyItem setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public DescribeBackupPlanBillingResponseBodyItem setIsFreeBytesUnlimited(Boolean isFreeBytesUnlimited) {
            this.isFreeBytesUnlimited = isFreeBytesUnlimited;
            return this;
        }
        public Boolean getIsFreeBytesUnlimited() {
            return this.isFreeBytesUnlimited;
        }

        public DescribeBackupPlanBillingResponseBodyItem setPaiedBytes(Long paiedBytes) {
            this.paiedBytes = paiedBytes;
            return this;
        }
        public Long getPaiedBytes() {
            return this.paiedBytes;
        }

        public DescribeBackupPlanBillingResponseBodyItem setQuotaEndTimestamp(Long quotaEndTimestamp) {
            this.quotaEndTimestamp = quotaEndTimestamp;
            return this;
        }
        public Long getQuotaEndTimestamp() {
            return this.quotaEndTimestamp;
        }

        public DescribeBackupPlanBillingResponseBodyItem setQuotaStartTimestamp(Long quotaStartTimestamp) {
            this.quotaStartTimestamp = quotaStartTimestamp;
            return this;
        }
        public Long getQuotaStartTimestamp() {
            return this.quotaStartTimestamp;
        }

        public DescribeBackupPlanBillingResponseBodyItem setTotalFreeBytes(Long totalFreeBytes) {
            this.totalFreeBytes = totalFreeBytes;
            return this;
        }
        public Long getTotalFreeBytes() {
            return this.totalFreeBytes;
        }

        public DescribeBackupPlanBillingResponseBodyItem setUsedFullBytes(Long usedFullBytes) {
            this.usedFullBytes = usedFullBytes;
            return this;
        }
        public Long getUsedFullBytes() {
            return this.usedFullBytes;
        }

        public DescribeBackupPlanBillingResponseBodyItem setUsedIncrementBytes(Long usedIncrementBytes) {
            this.usedIncrementBytes = usedIncrementBytes;
            return this;
        }
        public Long getUsedIncrementBytes() {
            return this.usedIncrementBytes;
        }

    }

}
