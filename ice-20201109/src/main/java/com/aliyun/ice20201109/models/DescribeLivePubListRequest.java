// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLivePubListRequest extends TeaModel {
    @NameInMap("BeginTs")
    public String beginTs;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTs")
    public String endTs;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Os")
    public String os;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PubProtocol")
    public String pubProtocol;

    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribeLivePubListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePubListRequest self = new DescribeLivePubListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLivePubListRequest setBeginTs(String beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public String getBeginTs() {
        return this.beginTs;
    }

    public DescribeLivePubListRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeLivePubListRequest setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
    }

    public DescribeLivePubListRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeLivePubListRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeLivePubListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLivePubListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLivePubListRequest setPubProtocol(String pubProtocol) {
        this.pubProtocol = pubProtocol;
        return this;
    }
    public String getPubProtocol() {
        return this.pubProtocol;
    }

    public DescribeLivePubListRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
