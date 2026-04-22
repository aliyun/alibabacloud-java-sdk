// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsHistoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dns-example.top</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>1741526400000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Rcode")
    public String rcode;

    /**
     * <strong>example:</strong>
     * <p>ap-southeast-3</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    /**
     * <strong>example:</strong>
     * <p>1474335170000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("StatisticalType")
    public String statisticalType;

    /**
     * <strong>example:</strong>
     * <p>lisheng999.com</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static DescribeInterAuthStatisticsHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsHistoryRequest self = new DescribeInterAuthStatisticsHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsHistoryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeInterAuthStatisticsHistoryRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeInterAuthStatisticsHistoryRequest setRcode(String rcode) {
        this.rcode = rcode;
        return this;
    }
    public String getRcode() {
        return this.rcode;
    }

    public DescribeInterAuthStatisticsHistoryRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

    public DescribeInterAuthStatisticsHistoryRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeInterAuthStatisticsHistoryRequest setStatisticalType(String statisticalType) {
        this.statisticalType = statisticalType;
        return this;
    }
    public String getStatisticalType() {
        return this.statisticalType;
    }

    public DescribeInterAuthStatisticsHistoryRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
