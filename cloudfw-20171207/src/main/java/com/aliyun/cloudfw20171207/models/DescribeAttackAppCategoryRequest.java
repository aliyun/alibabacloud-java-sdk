// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAttackAppCategoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeAttackAppCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAppCategoryRequest self = new DescribeAttackAppCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAppCategoryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
