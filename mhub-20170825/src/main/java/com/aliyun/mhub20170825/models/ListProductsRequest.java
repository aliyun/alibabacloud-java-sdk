// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ListProductsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("ProductName")
    public String productName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Simple")
    public Boolean simple;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static ListProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsRequest self = new ListProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListProductsRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ListProductsRequest setSimple(Boolean simple) {
        this.simple = simple;
        return this;
    }
    public Boolean getSimple() {
        return this.simple;
    }

    public ListProductsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
