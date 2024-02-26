// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesFlatPageRequest extends TeaModel {
    @NameInMap("AdviceId")
    public Long adviceId;

    @NameInMap("CheckId")
    public String checkId;

    @NameInMap("Language")
    public String language;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Product")
    public String product;

    @NameInMap("ResourceId")
    public String resourceId;

    public static DescribeAdvicesFlatPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvicesFlatPageRequest self = new DescribeAdvicesFlatPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvicesFlatPageRequest setAdviceId(Long adviceId) {
        this.adviceId = adviceId;
        return this;
    }
    public Long getAdviceId() {
        return this.adviceId;
    }

    public DescribeAdvicesFlatPageRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public DescribeAdvicesFlatPageRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeAdvicesFlatPageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAdvicesFlatPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAdvicesFlatPageRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeAdvicesFlatPageRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
