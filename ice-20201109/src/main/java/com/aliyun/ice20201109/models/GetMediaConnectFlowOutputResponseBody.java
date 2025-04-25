// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectFlowOutputResponseBody extends TeaModel {
    /**
     * <p>The response body.</p>
     */
    @NameInMap("Content")
    public GetMediaConnectFlowOutputResponseBodyContent content;

    /**
     * <p>The call description.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0DB23DCE-0D69-598B-AA7C-7268D55E2F89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned error code. A value of 0 indicates the call is successful.</p>
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
         * <p>The IP address whitelist in CIDR format. CIDR blocks are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>10.211.0.0/17</p>
         */
        @NameInMap("Cidrs")
        public String cidrs;

        /**
         * <p>The time when the flow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-18T01:29:24Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Forbid")
        public String forbid;

        /**
         * <p>The output name.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestInput</p>
         */
        @NameInMap("OutputName")
        public String outputName;

        /**
         * <p>The output type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RTMP-PUSH</li>
         * <li>SRT-Caller</li>
         * <li>RTMP-PULL</li>
         * <li>SRT-Listener</li>
         * <li>Flow</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SRT-PULL</p>
         */
        @NameInMap("OutputProtocol")
        public String outputProtocol;

        /**
         * <p>The output URL.</p>
         * 
         * <strong>example:</strong>
         * <p>srt://1.2.3.4:1025</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The ID of the destination flow. This parameter is returned when the output type is Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>805fbdd0-575e-4146-b35d-ec7f63937b20</p>
         */
        @NameInMap("PairFlowId")
        public String pairFlowId;

        /**
         * <p>The source name of the destination flow. This parameter is returned when the output type is Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestInput</p>
         */
        @NameInMap("PairInputName")
        public String pairInputName;

        /**
         * <p>The maximum number of viewers.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PlayerLimit")
        public Integer playerLimit;

        /**
         * <p>The latency for the SRT stream. Unit: milliseconds. This parameter is returned when the source type is SRT-Listener or SRT-Caller.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SrtLatency")
        public Integer srtLatency;

        /**
         * <p>The SRT key. This parameter is returned when the source type is SRT-Listener or SRT-Caller.</p>
         * 
         * <strong>example:</strong>
         * <p>FICUBPX4Q77DYHRF</p>
         */
        @NameInMap("SrtPassphrase")
        public String srtPassphrase;

        /**
         * <p>The encryption key length. This parameter is returned when the source type is SRT-Listener or SRT-Caller.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0</li>
         * <li>16</li>
         * <li>24</li>
         * <li>32</li>
         * </ul>
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

        public GetMediaConnectFlowOutputResponseBodyContent setForbid(String forbid) {
            this.forbid = forbid;
            return this;
        }
        public String getForbid() {
            return this.forbid;
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
