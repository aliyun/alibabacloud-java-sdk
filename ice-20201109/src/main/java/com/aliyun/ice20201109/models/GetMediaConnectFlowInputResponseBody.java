// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectFlowInputResponseBody extends TeaModel {
    /**
     * <p>The response body.</p>
     */
    @NameInMap("Content")
    public GetMediaConnectFlowInputResponseBodyContent content;

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
     * <p>D4C231DF-103A-55FF-8D09-E699552457DE</p>
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

    public static GetMediaConnectFlowInputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConnectFlowInputResponseBody self = new GetMediaConnectFlowInputResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaConnectFlowInputResponseBody setContent(GetMediaConnectFlowInputResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetMediaConnectFlowInputResponseBodyContent getContent() {
        return this.content;
    }

    public GetMediaConnectFlowInputResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetMediaConnectFlowInputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaConnectFlowInputResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public static class GetMediaConnectFlowInputResponseBodyContent extends TeaModel {
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

        /**
         * <p>The source name.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestInput</p>
         */
        @NameInMap("InputName")
        public String inputName;

        /**
         * <p>The source type.</p>
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
         * <p>RTMP-PUSH</p>
         */
        @NameInMap("InputProtocol")
        public String inputProtocol;

        /**
         * <p>The source URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://1.2.3.4:1935/live/AliTestInput_8666ec062190f00e263012666319a5be</p>
         */
        @NameInMap("InputUrl")
        public String inputUrl;

        /**
         * <p>The maximum bitrate. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2000000</p>
         */
        @NameInMap("MaxBitrate")
        public Integer maxBitrate;

        /**
         * <p>The ID of the source flow. This parameter is returned when the source type is Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>05c3adf4-aa0e-421d-a991-48ceae3e642e</p>
         */
        @NameInMap("PairFlowId")
        public String pairFlowId;

        /**
         * <p>The output of the source flow. This parameter is returned when the source type is Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestOutput</p>
         */
        @NameInMap("PairOutputName")
        public String pairOutputName;

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

        public static GetMediaConnectFlowInputResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetMediaConnectFlowInputResponseBodyContent self = new GetMediaConnectFlowInputResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetMediaConnectFlowInputResponseBodyContent setCidrs(String cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public String getCidrs() {
            return this.cidrs;
        }

        public GetMediaConnectFlowInputResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaConnectFlowInputResponseBodyContent setInputName(String inputName) {
            this.inputName = inputName;
            return this;
        }
        public String getInputName() {
            return this.inputName;
        }

        public GetMediaConnectFlowInputResponseBodyContent setInputProtocol(String inputProtocol) {
            this.inputProtocol = inputProtocol;
            return this;
        }
        public String getInputProtocol() {
            return this.inputProtocol;
        }

        public GetMediaConnectFlowInputResponseBodyContent setInputUrl(String inputUrl) {
            this.inputUrl = inputUrl;
            return this;
        }
        public String getInputUrl() {
            return this.inputUrl;
        }

        public GetMediaConnectFlowInputResponseBodyContent setMaxBitrate(Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        public GetMediaConnectFlowInputResponseBodyContent setPairFlowId(String pairFlowId) {
            this.pairFlowId = pairFlowId;
            return this;
        }
        public String getPairFlowId() {
            return this.pairFlowId;
        }

        public GetMediaConnectFlowInputResponseBodyContent setPairOutputName(String pairOutputName) {
            this.pairOutputName = pairOutputName;
            return this;
        }
        public String getPairOutputName() {
            return this.pairOutputName;
        }

        public GetMediaConnectFlowInputResponseBodyContent setSrtLatency(Integer srtLatency) {
            this.srtLatency = srtLatency;
            return this;
        }
        public Integer getSrtLatency() {
            return this.srtLatency;
        }

        public GetMediaConnectFlowInputResponseBodyContent setSrtPassphrase(String srtPassphrase) {
            this.srtPassphrase = srtPassphrase;
            return this;
        }
        public String getSrtPassphrase() {
            return this.srtPassphrase;
        }

        public GetMediaConnectFlowInputResponseBodyContent setSrtPbkeyLen(Integer srtPbkeyLen) {
            this.srtPbkeyLen = srtPbkeyLen;
            return this;
        }
        public Integer getSrtPbkeyLen() {
            return this.srtPbkeyLen;
        }

    }

}
