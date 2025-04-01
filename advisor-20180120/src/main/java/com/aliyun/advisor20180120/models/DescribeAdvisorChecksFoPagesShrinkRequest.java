// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvisorChecksFoPagesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11*********35</p>
     */
    @NameInMap("AssumeAliyunId")
    public Long assumeAliyunId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BizCategory")
    public String bizCategory;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Category")
    public String category;

    @NameInMap("CheckTypes")
    public String checkTypesShrink;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    public static DescribeAdvisorChecksFoPagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorChecksFoPagesShrinkRequest self = new DescribeAdvisorChecksFoPagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setAssumeAliyunId(Long assumeAliyunId) {
        this.assumeAliyunId = assumeAliyunId;
        return this;
    }
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setBizCategory(String bizCategory) {
        this.bizCategory = bizCategory;
        return this;
    }
    public String getBizCategory() {
        return this.bizCategory;
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setCheckTypesShrink(String checkTypesShrink) {
        this.checkTypesShrink = checkTypesShrink;
        return this;
    }
    public String getCheckTypesShrink() {
        return this.checkTypesShrink;
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAdvisorChecksFoPagesShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
