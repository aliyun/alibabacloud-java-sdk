// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeBindersRequest extends TeaModel {
    @NameInMap("EslBarCode")
    public String eslBarCode;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("ItemBarCode")
    public String itemBarCode;

    @NameInMap("ItemTitle")
    public String itemTitle;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StoreId")
    public String storeId;

    public static DescribeBindersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBindersRequest self = new DescribeBindersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBindersRequest setEslBarCode(String eslBarCode) {
        this.eslBarCode = eslBarCode;
        return this;
    }
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    public DescribeBindersRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public DescribeBindersRequest setItemBarCode(String itemBarCode) {
        this.itemBarCode = itemBarCode;
        return this;
    }
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    public DescribeBindersRequest setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
        return this;
    }
    public String getItemTitle() {
        return this.itemTitle;
    }

    public DescribeBindersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBindersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBindersRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
