// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeUserLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("UserLogs")
    public java.util.List<DescribeUserLogResponseBodyUserLogs> userLogs;

    public static DescribeUserLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogResponseBody self = new DescribeUserLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeUserLogResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeUserLogResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeUserLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeUserLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeUserLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeUserLogResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserLogResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUserLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeUserLogResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUserLogResponseBody setUserLogs(java.util.List<DescribeUserLogResponseBodyUserLogs> userLogs) {
        this.userLogs = userLogs;
        return this;
    }
    public java.util.List<DescribeUserLogResponseBodyUserLogs> getUserLogs() {
        return this.userLogs;
    }

    public static class DescribeUserLogResponseBodyUserLogs extends TeaModel {
        @NameInMap("ActionPrice")
        public String actionPrice;

        @NameInMap("BePromotion")
        public Boolean bePromotion;

        @NameInMap("EslBarCode")
        public String eslBarCode;

        @NameInMap("EslSignal")
        public Integer eslSignal;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("I18nResultKey")
        public String i18nResultKey;

        @NameInMap("ItemBarCode")
        public String itemBarCode;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemShortTitle")
        public String itemShortTitle;

        @NameInMap("LogId")
        public String logId;

        @NameInMap("OperationResponseTime")
        public String operationResponseTime;

        @NameInMap("OperationSendTime")
        public String operationSendTime;

        @NameInMap("OperationStatus")
        public String operationStatus;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("SpendTime")
        public String spendTime;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("UserId")
        public String userId;

        public static DescribeUserLogResponseBodyUserLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserLogResponseBodyUserLogs self = new DescribeUserLogResponseBodyUserLogs();
            return TeaModel.build(map, self);
        }

        public DescribeUserLogResponseBodyUserLogs setActionPrice(String actionPrice) {
            this.actionPrice = actionPrice;
            return this;
        }
        public String getActionPrice() {
            return this.actionPrice;
        }

        public DescribeUserLogResponseBodyUserLogs setBePromotion(Boolean bePromotion) {
            this.bePromotion = bePromotion;
            return this;
        }
        public Boolean getBePromotion() {
            return this.bePromotion;
        }

        public DescribeUserLogResponseBodyUserLogs setEslBarCode(String eslBarCode) {
            this.eslBarCode = eslBarCode;
            return this;
        }
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        public DescribeUserLogResponseBodyUserLogs setEslSignal(Integer eslSignal) {
            this.eslSignal = eslSignal;
            return this;
        }
        public Integer getEslSignal() {
            return this.eslSignal;
        }

        public DescribeUserLogResponseBodyUserLogs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeUserLogResponseBodyUserLogs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeUserLogResponseBodyUserLogs setI18nResultKey(String i18nResultKey) {
            this.i18nResultKey = i18nResultKey;
            return this;
        }
        public String getI18nResultKey() {
            return this.i18nResultKey;
        }

        public DescribeUserLogResponseBodyUserLogs setItemBarCode(String itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        public DescribeUserLogResponseBodyUserLogs setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public DescribeUserLogResponseBodyUserLogs setItemShortTitle(String itemShortTitle) {
            this.itemShortTitle = itemShortTitle;
            return this;
        }
        public String getItemShortTitle() {
            return this.itemShortTitle;
        }

        public DescribeUserLogResponseBodyUserLogs setLogId(String logId) {
            this.logId = logId;
            return this;
        }
        public String getLogId() {
            return this.logId;
        }

        public DescribeUserLogResponseBodyUserLogs setOperationResponseTime(String operationResponseTime) {
            this.operationResponseTime = operationResponseTime;
            return this;
        }
        public String getOperationResponseTime() {
            return this.operationResponseTime;
        }

        public DescribeUserLogResponseBodyUserLogs setOperationSendTime(String operationSendTime) {
            this.operationSendTime = operationSendTime;
            return this;
        }
        public String getOperationSendTime() {
            return this.operationSendTime;
        }

        public DescribeUserLogResponseBodyUserLogs setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public DescribeUserLogResponseBodyUserLogs setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeUserLogResponseBodyUserLogs setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public DescribeUserLogResponseBodyUserLogs setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeUserLogResponseBodyUserLogs setSpendTime(String spendTime) {
            this.spendTime = spendTime;
            return this;
        }
        public String getSpendTime() {
            return this.spendTime;
        }

        public DescribeUserLogResponseBodyUserLogs setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeUserLogResponseBodyUserLogs setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
