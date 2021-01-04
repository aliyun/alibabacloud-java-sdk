// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcTunnelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("CcTunnel")
    public DescribeCcTunnelResponseBodyCcTunnel ccTunnel;

    public static DescribeCcTunnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcTunnelResponseBody self = new DescribeCcTunnelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcTunnelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcTunnelResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeCcTunnelResponseBody setCcTunnel(DescribeCcTunnelResponseBodyCcTunnel ccTunnel) {
        this.ccTunnel = ccTunnel;
        return this;
    }
    public DescribeCcTunnelResponseBodyCcTunnel getCcTunnel() {
        return this.ccTunnel;
    }

    public static class DescribeCcTunnelResponseBodyCcTunnel extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("OnlyAllow")
        public Boolean onlyAllow;

        @NameInMap("Gray")
        public Integer gray;

        public static DescribeCcTunnelResponseBodyCcTunnel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcTunnelResponseBodyCcTunnel self = new DescribeCcTunnelResponseBodyCcTunnel();
            return TeaModel.build(map, self);
        }

        public DescribeCcTunnelResponseBodyCcTunnel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCcTunnelResponseBodyCcTunnel setOnlyAllow(Boolean onlyAllow) {
            this.onlyAllow = onlyAllow;
            return this;
        }
        public Boolean getOnlyAllow() {
            return this.onlyAllow;
        }

        public DescribeCcTunnelResponseBodyCcTunnel setGray(Integer gray) {
            this.gray = gray;
            return this;
        }
        public Integer getGray() {
            return this.gray;
        }

    }

}
