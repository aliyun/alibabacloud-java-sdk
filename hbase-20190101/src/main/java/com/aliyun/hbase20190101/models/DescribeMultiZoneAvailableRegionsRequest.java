// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneAvailableRegionsRequest extends TeaModel {
    /**
     * <p>The supported language. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese (default)</li>
     * <li>en-US: English</li>
     * <li>ja: Japanese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static DescribeMultiZoneAvailableRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneAvailableRegionsRequest self = new DescribeMultiZoneAvailableRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneAvailableRegionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
