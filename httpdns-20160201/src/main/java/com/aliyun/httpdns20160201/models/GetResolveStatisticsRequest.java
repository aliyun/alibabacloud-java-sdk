// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetResolveStatisticsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <strong>example:</strong>
     * <p>https</p>
     */
    @NameInMap("ProtocolName")
    public String protocolName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
