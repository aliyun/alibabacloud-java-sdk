// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAllLocalIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LocalIps")
    public DescribeAllLocalIpsResponseBodyLocalIps localIps;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeAllLocalIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllLocalIpsResponseBody self = new DescribeAllLocalIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllLocalIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllLocalIpsResponseBody setLocalIps(DescribeAllLocalIpsResponseBodyLocalIps localIps) {
        this.localIps = localIps;
        return this;
    }
    public DescribeAllLocalIpsResponseBodyLocalIps getLocalIps() {
        return this.localIps;
    }

    public DescribeAllLocalIpsResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeAllLocalIpsResponseBodyLocalIps extends TeaModel {
        @NameInMap("Bgp")
        public java.util.List<String> bgp;

        @NameInMap("Gf")
        public java.util.List<String> gf;

        public static DescribeAllLocalIpsResponseBodyLocalIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllLocalIpsResponseBodyLocalIps self = new DescribeAllLocalIpsResponseBodyLocalIps();
            return TeaModel.build(map, self);
        }

        public DescribeAllLocalIpsResponseBodyLocalIps setBgp(java.util.List<String> bgp) {
            this.bgp = bgp;
            return this;
        }
        public java.util.List<String> getBgp() {
            return this.bgp;
        }

        public DescribeAllLocalIpsResponseBodyLocalIps setGf(java.util.List<String> gf) {
            this.gf = gf;
            return this;
        }
        public java.util.List<String> getGf() {
            return this.gf;
        }

    }

}
