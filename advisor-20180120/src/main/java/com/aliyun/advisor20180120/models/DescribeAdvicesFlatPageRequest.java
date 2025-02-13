// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesFlatPageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("AdviceId")
    public Long adviceId;

    /**
     * <strong>example:</strong>
     * <p>EcsHighCpuUtilization</p>
     */
    @NameInMap("CheckId")
    public String checkId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

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
     * <p>i-2zecnwitr2s7aca6****</p>
     */
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
