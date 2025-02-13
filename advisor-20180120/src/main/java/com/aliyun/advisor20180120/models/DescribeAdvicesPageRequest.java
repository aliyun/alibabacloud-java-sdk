// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesPageRequest extends TeaModel {
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

    @NameInMap("CheckPlanId")
    public Long checkPlanId;

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
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static DescribeAdvicesPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvicesPageRequest self = new DescribeAdvicesPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvicesPageRequest setAdviceId(Long adviceId) {
        this.adviceId = adviceId;
        return this;
    }
    public Long getAdviceId() {
        return this.adviceId;
    }

    public DescribeAdvicesPageRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public DescribeAdvicesPageRequest setCheckPlanId(Long checkPlanId) {
        this.checkPlanId = checkPlanId;
        return this;
    }
    public Long getCheckPlanId() {
        return this.checkPlanId;
    }

    public DescribeAdvicesPageRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeAdvicesPageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAdvicesPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAdvicesPageRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeAdvicesPageRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
