// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListDocsGroupByYearRequest extends TeaModel {
    @NameInMap("applyCodes")
    public java.util.List<String> applyCodes;

    @NameInMap("fileNameKeyword")
    public String fileNameKeyword;

    @NameInMap("orderIds")
    public java.util.List<Long> orderIds;

    @NameInMap("productCode")
    public String productCode;

    @NameInMap("scene")
    public String scene;

    public static ListDocsGroupByYearRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDocsGroupByYearRequest self = new ListDocsGroupByYearRequest();
        return TeaModel.build(map, self);
    }

    public ListDocsGroupByYearRequest setApplyCodes(java.util.List<String> applyCodes) {
        this.applyCodes = applyCodes;
        return this;
    }
    public java.util.List<String> getApplyCodes() {
        return this.applyCodes;
    }

    public ListDocsGroupByYearRequest setFileNameKeyword(String fileNameKeyword) {
        this.fileNameKeyword = fileNameKeyword;
        return this;
    }
    public String getFileNameKeyword() {
        return this.fileNameKeyword;
    }

    public ListDocsGroupByYearRequest setOrderIds(java.util.List<Long> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<Long> getOrderIds() {
        return this.orderIds;
    }

    public ListDocsGroupByYearRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListDocsGroupByYearRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
