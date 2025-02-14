// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectFlowOutputResponseBody extends TeaModel {
    /**
     * <p>Response body</p>
     */
    @NameInMap("Content")
    public GetMediaConnectFlowOutputResponseBodyContent content;

    /**
     * <p>API call description</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>0DB23DCE-0D69-598B-AA7C-7268D55E2F89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned error code, 0 indicates success</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    public static GetMediaConnectFlowOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConnectFlowOutputResponseBody self = new GetMediaConnectFlowOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaConnectFlowOutputResponseBody setContent(GetMediaConnectFlowOutputResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetMediaConnectFlowOutputResponseBodyContent getContent() {
        return this.content;
    }

    public GetMediaConnectFlowOutputResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetMediaConnectFlowOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaConnectFlowOutputResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public static class GetMediaConnectFlowOutputResponseBodyContent extends TeaModel {
        /**
         * <p>IP whitelist in CIDR format, multiple IP segments separated by commas</p>
         * 
         * <strong>example:</strong>
         * <p>10.211.0.0/17</p>
         */
        @NameInMap("Cidrs")
        public String cidrs;

        /**
         * <p>Flow creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-18T01:29:24Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Output name</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestInput</p>
         */
        @NameInMap("OutputName")
        public String outputName;

        /**
         * <p>Output protocol</p>
         * 
         * <strong>example:</strong>
         * <p>SRT-PULL</p>
         */
        @NameInMap("OutputProtocol")
        public String outputProtocol;

        /**
         * <p>Output URL</p>
         * 
         * <strong>example:</strong>
         * <p>srt://1.2.3.4:1025</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>Peer Flow instance ID, required when the output type is Flow</p>
         * 
         * <strong>example:</strong>
         * <p>805fbdd0-575e-4146-b35d-ec7f63937b20</p>
         */
        @NameInMap("PairFlowId")
        public String pairFlowId;

        /**
         * <p>Peer Flow\&quot;s input name, required when the output type is Flow</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestInput</p>
         */
        @NameInMap("PairInputName")
        public String pairInputName;

        /**
         * <p>Player limit</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PlayerLimit")
        public Integer playerLimit;

        /**
         * <p>SRT latency, in milliseconds, required only when the input type is SRT-Listener/SRT-Caller</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SrtLatency")
        public Integer srtLatency;

        /**
         * <p>SRT encryption key, required only when the input type is SRT-Listener/SRT-Caller</p>
         * 
         * <strong>example:</strong>
         * <p>FICUBPX4Q77DYHRF</p>
         */
        @NameInMap("SrtPassphrase")
        public String srtPassphrase;

        /**
         * <p>SRT encryption length, required only when the input type is SRT-Listener/SRT-Caller</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("SrtPbkeyLen")
        public Integer srtPbkeyLen;

        public static GetMediaConnectFlowOutputResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetMediaConnectFlowOutputResponseBodyContent self = new GetMediaConnectFlowOutputResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetMediaConnectFlowOutputResponseBodyContent setCidrs(String cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public String getCidrs() {
            return this.cidrs;
        }

        public GetMediaConnectFlowOutputResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaConnectFlowOutputResponseBodyContent setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public GetMediaConnectFlowOutputResponseBodyContent setOutputProtocol(String outputProtocol) {
            this.outputProtocol = outputProtocol;
            return this;
        }
        public String getOutputProtocol() {
            return this.outputProtocol;
        }

        public GetMediaConnectFlowOutputResponseBodyContent setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public GetMediaConnectFlowOutputResponseBodyContent setPairFlowId(String pairFlowId) {
            this.pairFlowId = pairFlowId;
            return this;
        }
        public String getPairFlowId() {
            return this.pairFlowId;
        }

        public GetMediaConnectFlowOutputResponseBodyContent setPairInputName(String pairInputName) {
            this.pairInputName = pairInputName;
            return this;
        }
        public String getPairInputName() {
            return this.pairInputName;
        }

        public GetMediaConnectFlowOutputResponseBodyContent setPlayerLimit(Integer playerLimit) {
            this.playerLimit = playerLimit;
            return this;
        }
        public Integer getPlayerLimit() {
            return this.playerLimit;
        }

        public GetMediaConnectFlowOutputResponseBodyContent setSrtLatency(Integer srtLatency) {
            this.srtLatency = srtLatency;
            return this;
        }
        public Integer getSrtLatency() {
            return this.srtLatency;
        }

        public GetMediaConnectFlowOutputResponseBodyContent setSrtPassphrase(String srtPassphrase) {
            this.srtPassphrase = srtPassphrase;
            return this;
        }
        public String getSrtPassphrase() {
            return this.srtPassphrase;
        }

        public GetMediaConnectFlowOutputResponseBodyContent setSrtPbkeyLen(Integer srtPbkeyLen) {
            this.srtPbkeyLen = srtPbkeyLen;
            return this;
        }
        public Integer getSrtPbkeyLen() {
            return this.srtPbkeyLen;
        }

    }

}
