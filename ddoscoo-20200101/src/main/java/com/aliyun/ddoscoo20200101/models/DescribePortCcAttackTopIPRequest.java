// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortCcAttackTopIPRequest extends TeaModel {
    @NameInMap("Ip")
    public String ip;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("Port")
    public String port;

    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static DescribePortCcAttackTopIPRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePortCcAttackTopIPRequest self = new DescribePortCcAttackTopIPRequest();
        return TeaModel.build(map, self);
    }

    public DescribePortCcAttackTopIPRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribePortCcAttackTopIPRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribePortCcAttackTopIPRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribePortCcAttackTopIPRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
