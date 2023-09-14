// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   **zh-CN**: Chinese</p>
     * <p>*   **en-US**: English</p>
     * <p>*   **ja**: Japanese</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZonesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
