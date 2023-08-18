// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesRequest extends TeaModel {
    @NameInMap("AdviceId")
    public Long adviceId;

    @NameInMap("CheckId")
    public String checkId;

    @NameInMap("ExcludeAdviceId")
    public Long excludeAdviceId;

    @NameInMap("Language")
    public String language;

    @NameInMap("Product")
    public String product;

    @NameInMap("ResourceId")
    public String resourceId;

    public static DescribeAdvicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvicesRequest self = new DescribeAdvicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvicesRequest setAdviceId(Long adviceId) {
        this.adviceId = adviceId;
        return this;
    }
    public Long getAdviceId() {
        return this.adviceId;
    }

    public DescribeAdvicesRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public DescribeAdvicesRequest setExcludeAdviceId(Long excludeAdviceId) {
        this.excludeAdviceId = excludeAdviceId;
        return this;
    }
    public Long getExcludeAdviceId() {
        return this.excludeAdviceId;
    }

    public DescribeAdvicesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeAdvicesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeAdvicesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
