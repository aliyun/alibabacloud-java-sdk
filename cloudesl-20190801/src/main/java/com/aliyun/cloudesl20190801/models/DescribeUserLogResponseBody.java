// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

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
    public DescribeUserLogResponseBodyUserLogs userLogs;

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

    public DescribeUserLogResponseBody setUserLogs(DescribeUserLogResponseBodyUserLogs userLogs) {
        this.userLogs = userLogs;
        return this;
    }
    public DescribeUserLogResponseBodyUserLogs getUserLogs() {
        return this.userLogs;
    }

    public static class DescribeUserLogResponseBodyUserLogsUserLogInfo extends TeaModel {
        @NameInMap("EslBarCode")
        public String eslBarCode;

        @NameInMap("ItemActionPrice")
        public Integer itemActionPrice;

        @NameInMap("ItemBarCode")
        public String itemBarCode;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("OperateStatus")
        public String operateStatus;

        @NameInMap("OperateTime")
        public String operateTime;

        @NameInMap("OperateType")
        public String operateType;

        @NameInMap("OperateUserId")
        public Long operateUserId;

        @NameInMap("ShelfCode")
        public String shelfCode;

        @NameInMap("StoreId")
        public String storeId;

        public static DescribeUserLogResponseBodyUserLogsUserLogInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserLogResponseBodyUserLogsUserLogInfo self = new DescribeUserLogResponseBodyUserLogsUserLogInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setEslBarCode(String eslBarCode) {
            this.eslBarCode = eslBarCode;
            return this;
        }
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setItemActionPrice(Integer itemActionPrice) {
            this.itemActionPrice = itemActionPrice;
            return this;
        }
        public Integer getItemActionPrice() {
            return this.itemActionPrice;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setItemBarCode(String itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public String getItemBarCode() {
            return this.itemBarCode;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setOperateStatus(String operateStatus) {
            this.operateStatus = operateStatus;
            return this;
        }
        public String getOperateStatus() {
            return this.operateStatus;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setOperateUserId(Long operateUserId) {
            this.operateUserId = operateUserId;
            return this;
        }
        public Long getOperateUserId() {
            return this.operateUserId;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setShelfCode(String shelfCode) {
            this.shelfCode = shelfCode;
            return this;
        }
        public String getShelfCode() {
            return this.shelfCode;
        }

        public DescribeUserLogResponseBodyUserLogsUserLogInfo setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

    }

    public static class DescribeUserLogResponseBodyUserLogs extends TeaModel {
        @NameInMap("UserLogInfo")
        public java.util.List<DescribeUserLogResponseBodyUserLogsUserLogInfo> userLogInfo;

        public static DescribeUserLogResponseBodyUserLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserLogResponseBodyUserLogs self = new DescribeUserLogResponseBodyUserLogs();
            return TeaModel.build(map, self);
        }

        public DescribeUserLogResponseBodyUserLogs setUserLogInfo(java.util.List<DescribeUserLogResponseBodyUserLogsUserLogInfo> userLogInfo) {
            this.userLogInfo = userLogInfo;
            return this;
        }
        public java.util.List<DescribeUserLogResponseBodyUserLogsUserLogInfo> getUserLogInfo() {
            return this.userLogInfo;
        }

    }

}
