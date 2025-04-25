// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaConnectFlowInputRequest extends TeaModel {
    /**
     * <p>The IP address whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>19.168.1.1/32,18.168.1.1/16</p>
     */
    @NameInMap("Cidrs")
    public String cidrs;

    /**
     * <p>The flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>The source URL. You can modify this parameter only when the source type is RTMP-PULL or SRT-Listener.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://pull.test.alivecdn.com/live/alitest</p>
     */
    @NameInMap("InputFromUrl")
    public String inputFromUrl;

    @NameInMap("InputName")
    public String inputName;

    /**
     * <p>The maximum bitrate. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>2000000</p>
     */
    @NameInMap("MaxBitrate")
    public Integer maxBitrate;

    /**
     * <p>The latency for the SRT stream. You can modify this parameter only when the source type is SRT-Listener or SRT-Caller.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SrtLatency")
    public Integer srtLatency;

    /**
     * <p>The SRT key. You can modify this parameter only when the source type is SRT-Listener or SRT-Caller.</p>
     * 
     * <strong>example:</strong>
     * <p>FICUBPX4Q77DYHRF</p>
     */
    @NameInMap("SrtPassphrase")
    public String srtPassphrase;

    /**
     * <p>The encryption key length. You can modify this parameter only when the source type is SRT-Listener or SRT-Caller.</p>
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

    public UpdateMediaConnectFlowInputRequest setInputName(String inputName) {
        this.inputName = inputName;
        return this;
    }
    public String getInputName() {
        return this.inputName;
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
