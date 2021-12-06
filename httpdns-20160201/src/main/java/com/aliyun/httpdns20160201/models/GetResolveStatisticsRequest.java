// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetResolveStatisticsRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Granularity")
    public String granularity;

    @NameInMap("ProtocolName")
    public String protocolName;

    @NameInMap("TimeSpan")
    public Integer timeSpan;

    public static GetResolveStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResolveStatisticsRequest self = new GetResolveStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetResolveStatisticsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetResolveStatisticsRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetResolveStatisticsRequest setProtocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }
    public String getProtocolName() {
        return this.protocolName;
    }

    public GetResolveStatisticsRequest setTimeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }
    public Integer getTimeSpan() {
        return this.timeSpan;
    }

}
