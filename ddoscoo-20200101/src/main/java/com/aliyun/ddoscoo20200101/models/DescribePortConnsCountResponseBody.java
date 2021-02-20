// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortConnsCountResponseBody extends TeaModel {
    @NameInMap("Conns")
    public Long conns;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Cps")
    public Long cps;

    @NameInMap("InActConns")
    public Long inActConns;

    @NameInMap("ActConns")
    public Long actConns;

    public static DescribePortConnsCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortConnsCountResponseBody self = new DescribePortConnsCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortConnsCountResponseBody setConns(Long conns) {
        this.conns = conns;
        return this;
    }
    public Long getConns() {
        return this.conns;
    }

    public DescribePortConnsCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortConnsCountResponseBody setCps(Long cps) {
        this.cps = cps;
        return this;
    }
    public Long getCps() {
        return this.cps;
    }

    public DescribePortConnsCountResponseBody setInActConns(Long inActConns) {
        this.inActConns = inActConns;
        return this;
    }
    public Long getInActConns() {
        return this.inActConns;
    }

    public DescribePortConnsCountResponseBody setActConns(Long actConns) {
        this.actConns = actConns;
        return this;
    }
    public Long getActConns() {
        return this.actConns;
    }

}
