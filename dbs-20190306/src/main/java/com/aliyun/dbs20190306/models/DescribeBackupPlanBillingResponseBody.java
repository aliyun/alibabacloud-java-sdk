// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanBillingResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Item")
    public DescribeBackupPlanBillingResponseBodyItem item;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BuyChargeType")
        public String buyChargeType;

        @NameInMap("BuyCreateTimestamp")
        public Long buyCreateTimestamp;

        @NameInMap("BuyExpiredTimestamp")
        public Long buyExpiredTimestamp;

        @NameInMap("BuySpec")
        public String buySpec;

        @NameInMap("ContStorageSize")
        public Long contStorageSize;

        @NameInMap("FullStorageSize")
        public Long fullStorageSize;

        @NameInMap("IsExpired")
        public Boolean isExpired;

        @NameInMap("IsFreeBytesUnlimited")
        public Boolean isFreeBytesUnlimited;

        @NameInMap("PaiedBytes")
        public Long paiedBytes;

        @NameInMap("QuotaEndTimestamp")
        public Long quotaEndTimestamp;

        @NameInMap("QuotaStartTimestamp")
        public Long quotaStartTimestamp;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("TotalFreeBytes")
        public Long totalFreeBytes;

        @NameInMap("UsedFullBytes")
        public Long usedFullBytes;

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

        public DescribeBackupPlanBillingResponseBodyItem setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
