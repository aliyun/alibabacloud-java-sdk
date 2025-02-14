// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaConnectFlowInputRequest extends TeaModel {
    /**
     * <p>IP whitelist</p>
     * 
     * <strong>example:</strong>
     * <p>19.168.1.1/32,18.168.1.1/16</p>
     */
    @NameInMap("Cidrs")
    public String cidrs;

    /**
     * <p>Flow instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>Input URL, modifiable when the input type is RTMP-PULL/SRT-Listener</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://pull.test.alivecdn.com/live/alitest</p>
     */
    @NameInMap("InputFromUrl")
    public String inputFromUrl;

    /**
     * <p>Input bitrate</p>
     * 
     * <strong>example:</strong>
     * <p>2000000</p>
     */
    @NameInMap("MaxBitrate")
    public Integer maxBitrate;

    /**
     * <p>SRT latency, modifiable when the input type is SRT-Listener/SRT-Caller</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SrtLatency")
    public Integer srtLatency;

    /**
     * <p>SRT encryption key, modifiable when the input type is SRT-Listener/SRT-Caller</p>
     * 
     * <strong>example:</strong>
     * <p>FICUBPX4Q77DYHRF</p>
     */
    @NameInMap("SrtPassphrase")
    public String srtPassphrase;

    /**
     * <p>SRT encryption length, modifiable when the input type is SRT-Listener/SRT-Caller</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("SrtPbkeyLen")
    public Integer srtPbkeyLen;

    public static UpdateMediaConnectFlowInputRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaConnectFlowInputRequest self = new UpdateMediaConnectFlowInputRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaConnectFlowInputRequest setCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public String getCidrs() {
        return this.cidrs;
    }

    public UpdateMediaConnectFlowInputRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public UpdateMediaConnectFlowInputRequest setInputFromUrl(String inputFromUrl) {
        this.inputFromUrl = inputFromUrl;
        return this;
    }
    public String getInputFromUrl() {
        return this.inputFromUrl;
    }

    public UpdateMediaConnectFlowInputRequest setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
        return this;
    }
    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    public UpdateMediaConnectFlowInputRequest setSrtLatency(Integer srtLatency) {
        this.srtLatency = srtLatency;
        return this;
    }
    public Integer getSrtLatency() {
        return this.srtLatency;
    }

    public UpdateMediaConnectFlowInputRequest setSrtPassphrase(String srtPassphrase) {
        this.srtPassphrase = srtPassphrase;
        return this;
    }
    public String getSrtPassphrase() {
        return this.srtPassphrase;
    }

    public UpdateMediaConnectFlowInputRequest setSrtPbkeyLen(Integer srtPbkeyLen) {
        this.srtPbkeyLen = srtPbkeyLen;
        return this;
    }
    public Integer getSrtPbkeyLen() {
        return this.srtPbkeyLen;
    }

}
