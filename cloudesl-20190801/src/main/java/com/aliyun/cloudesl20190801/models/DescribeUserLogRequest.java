// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeUserLogRequest extends TeaModel {
    @NameInMap("EslBarCode")
    public String eslBarCode;

    @NameInMap("FromDate")
    public String fromDate;

    @NameInMap("ItemBarCode")
    public String itemBarCode;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("ItemTitle")
    public String itemTitle;

    @NameInMap("OperateStatus")
    public String operateStatus;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("OperateUserId")
    public Long operateUserId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("ToDate")
    public String toDate;

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

    public DescribeUserLogRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public DescribeUserLogRequest setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
        return this;
    }
    public String getItemTitle() {
        return this.itemTitle;
    }

    public DescribeUserLogRequest setOperateStatus(String operateStatus) {
        this.operateStatus = operateStatus;
        return this;
    }
    public String getOperateStatus() {
        return this.operateStatus;
    }

    public DescribeUserLogRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public DescribeUserLogRequest setOperateUserId(Long operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public Long getOperateUserId() {
        return this.operateUserId;
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

    public DescribeUserLogRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
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

}
