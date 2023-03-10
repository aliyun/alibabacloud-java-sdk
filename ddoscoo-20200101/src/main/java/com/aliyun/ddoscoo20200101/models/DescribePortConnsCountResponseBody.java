// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortConnsCountResponseBody extends TeaModel {
    /**
     * <p>The number of active connections.</p>
     */
    @NameInMap("ActConns")
    public Long actConns;

    /**
     * <p>The number of concurrent connections.</p>
     */
    @NameInMap("Conns")
    public Long conns;

    /**
     * <p>The number of new connections.</p>
     */
    @NameInMap("Cps")
    public Long cps;

    /**
     * <p>The number of inactive connections.</p>
     */
    @NameInMap("InActConns")
    public Long inActConns;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortConnsCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortConnsCountResponseBody self = new DescribePortConnsCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortConnsCountResponseBody setActConns(Long actConns) {
        this.actConns = actConns;
        return this;
    }
    public Long getActConns() {
        return this.actConns;
    }

    public DescribePortConnsCountResponseBody setConns(Long conns) {
        this.conns = conns;
        return this;
    }
    public Long getConns() {
        return this.conns;
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

    public DescribePortConnsCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
