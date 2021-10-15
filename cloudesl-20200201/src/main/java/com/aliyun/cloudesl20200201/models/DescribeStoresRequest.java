// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoresRequest extends TeaModel {
    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("FromDate")
    public String fromDate;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("ToDate")
    public String toDate;

    @NameInMap("UserStoreCode")
    public String userStoreCode;

    public static DescribeStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoresRequest self = new DescribeStoresRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStoresRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public DescribeStoresRequest setFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }
    public String getFromDate() {
        return this.fromDate;
    }

    public DescribeStoresRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStoresRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStoresRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public DescribeStoresRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public DescribeStoresRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public DescribeStoresRequest setToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }
    public String getToDate() {
        return this.toDate;
    }

    public DescribeStoresRequest setUserStoreCode(String userStoreCode) {
        this.userStoreCode = userStoreCode;
        return this;
    }
    public String getUserStoreCode() {
        return this.userStoreCode;
    }

}
