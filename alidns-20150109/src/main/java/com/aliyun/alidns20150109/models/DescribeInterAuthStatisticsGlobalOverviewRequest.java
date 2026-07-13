// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsGlobalOverviewRequest extends TeaModel {
    /**
     * <p>The language of the returned availability zone names. Valid values:</p>
     * <ul>
     * <li><p><strong>zh-CN</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en-US</strong> (default): English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>A unique, client-generated token to ensure the idempotence of the request. The token must be a string of ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>23445411234395894586....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The statistical period.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("OverviewPeriod")
    public String overviewPeriod;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    public static DescribeInterAuthStatisticsGlobalOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsGlobalOverviewRequest self = new DescribeInterAuthStatisticsGlobalOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsGlobalOverviewRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeInterAuthStatisticsGlobalOverviewRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeInterAuthStatisticsGlobalOverviewRequest setOverviewPeriod(String overviewPeriod) {
        this.overviewPeriod = overviewPeriod;
        return this;
    }
    public String getOverviewPeriod() {
        return this.overviewPeriod;
    }

    public DescribeInterAuthStatisticsGlobalOverviewRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

}
