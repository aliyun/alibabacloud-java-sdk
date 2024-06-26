// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntRegionsRequest extends TeaModel {
    @NameInMap("Locale")
    public String locale;

    public static DescribeAntRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntRegionsRequest self = new DescribeAntRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntRegionsRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

}
