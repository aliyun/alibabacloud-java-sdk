// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortConnsCountResponseBody extends TeaModel {
    /**
     * <p>The number of active connections.</p>
     * 
     * <strong>example:</strong>
     * <p>159</p>
     */
    @NameInMap("ActConns")
    public Long actConns;

    /**
     * <p>The number of concurrent connections.</p>
     * 
     * <strong>example:</strong>
     * <p>46340</p>
     */
    @NameInMap("Conns")
    public Long conns;

    /**
     * <p>The number of new connections.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Cps")
    public Long cps;

    /**
     * <p>The number of inactive connections.</p>
     * 
     * <strong>example:</strong>
     * <p>121</p>
     */
    @NameInMap("InActConns")
    public Long inActConns;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>48859E14-A9FB-4100-99FF-AAB75CA46776</p>
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
