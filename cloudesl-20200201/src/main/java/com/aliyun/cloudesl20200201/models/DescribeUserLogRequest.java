// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeUserLogRequest extends TeaModel {
    @NameInMap("EslBarCode")
    public String eslBarCode;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("FromDate")
    public String fromDate;

    @NameInMap("ItemBarCode")
    public String itemBarCode;

    @NameInMap("ItemShortTitle")
    public String itemShortTitle;

    @NameInMap("LogId")
    public String logId;

    @NameInMap("OperationStatus")
    public String operationStatus;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("ToDate")
    public String toDate;

    @NameInMap("UserId")
    public String userId;

    public static DescribeUserLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogRequest self = new DescribeUserLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogRequest setEslBarCode(String eslBarCode) {
        this.eslBarCode = eslBarCode;
        return this;
    }
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    public DescribeUserLogRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public DescribeUserLogRequest setFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }
    public String getFromDate() {
        return this.fromDate;
    }

    public DescribeUserLogRequest setItemBarCode(String itemBarCode) {
        this.itemBarCode = itemBarCode;
        return this;
    }
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    public DescribeUserLogRequest setItemShortTitle(String itemShortTitle) {
        this.itemShortTitle = itemShortTitle;
        return this;
    }
    public String getItemShortTitle() {
        return this.itemShortTitle;
    }

    public DescribeUserLogRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public DescribeUserLogRequest setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }
    public String getOperationStatus() {
        return this.operationStatus;
    }

    public DescribeUserLogRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DescribeUserLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUserLogRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public DescribeUserLogRequest setToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }
    public String getToDate() {
        return this.toDate;
    }

    public DescribeUserLogRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
