// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainRegionNamesRequest extends TeaModel {
    @NameInMap("Locale")
    public String locale;

    public static DescribeAntChainRegionNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainRegionNamesRequest self = new DescribeAntChainRegionNamesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainRegionNamesRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

}
