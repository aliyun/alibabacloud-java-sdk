// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvisorChecksFoPagesRequest extends TeaModel {
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
    public java.util.List<Long> checkTypes;

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

    public static DescribeAdvisorChecksFoPagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorChecksFoPagesRequest self = new DescribeAdvisorChecksFoPagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorChecksFoPagesRequest setAssumeAliyunId(Long assumeAliyunId) {
        this.assumeAliyunId = assumeAliyunId;
        return this;
    }
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    public DescribeAdvisorChecksFoPagesRequest setBizCategory(String bizCategory) {
        this.bizCategory = bizCategory;
        return this;
    }
    public String getBizCategory() {
        return this.bizCategory;
    }

    public DescribeAdvisorChecksFoPagesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeAdvisorChecksFoPagesRequest setCheckTypes(java.util.List<Long> checkTypes) {
        this.checkTypes = checkTypes;
        return this;
    }
    public java.util.List<Long> getCheckTypes() {
        return this.checkTypes;
    }

    public DescribeAdvisorChecksFoPagesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAdvisorChecksFoPagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAdvisorChecksFoPagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAdvisorChecksFoPagesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeAdvisorChecksFoPagesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeAdvisorChecksFoPagesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAdvisorChecksFoPagesRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
