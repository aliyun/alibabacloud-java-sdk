// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayTrafficTotalRequest extends TeaModel {
    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribePostpayTrafficTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayTrafficTotalRequest self = new DescribePostpayTrafficTotalRequest();
        return TeaModel.build(map, self);
    }

    public DescribePostpayTrafficTotalRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
