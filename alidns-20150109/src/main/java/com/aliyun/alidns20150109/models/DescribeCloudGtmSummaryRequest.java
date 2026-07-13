// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmSummaryRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese.</p>
     * </li>
     * <li><p>en-US: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static DescribeCloudGtmSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmSummaryRequest self = new DescribeCloudGtmSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmSummaryRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
