// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeResourceTypeAutoEnableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeResourceTypeAutoEnableRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTypeAutoEnableRequest self = new DescribeResourceTypeAutoEnableRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTypeAutoEnableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
