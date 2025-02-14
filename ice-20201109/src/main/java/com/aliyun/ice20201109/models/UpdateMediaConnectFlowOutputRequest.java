// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaConnectFlowOutputRequest extends TeaModel {
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
     * <p>Output name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliTestOutput</p>
     */
    @NameInMap("OutputName")
    public String outputName;

    /**
     * <p>Output address, modifiable when the output type is RTMP-PUSH/SRT-Caller mode</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://push.test.alivecdn.com/live/alitest</p>
     */
    @NameInMap("OutputToUrl")
    public String outputToUrl;

    /**
     * <p>Player limit</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PlayerLimit")
    public String playerLimit;

    /**
     * <p>SRT latency, modifiable when the input type is SRT-Listener/SRT-Caller</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SrtLatency")
    public String srtLatency;

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
    public String srtPbkeyLen;

    public static UpdateMediaConnectFlowOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaConnectFlowOutputRequest self = new UpdateMediaConnectFlowOutputRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaConnectFlowOutputRequest setCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public String getCidrs() {
        return this.cidrs;
    }

    public UpdateMediaConnectFlowOutputRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public UpdateMediaConnectFlowOutputRequest setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }
    public String getOutputName() {
        return this.outputName;
    }

    public UpdateMediaConnectFlowOutputRequest setOutputToUrl(String outputToUrl) {
        this.outputToUrl = outputToUrl;
        return this;
    }
    public String getOutputToUrl() {
        return this.outputToUrl;
    }

    public UpdateMediaConnectFlowOutputRequest setPlayerLimit(String playerLimit) {
        this.playerLimit = playerLimit;
        return this;
    }
    public String getPlayerLimit() {
        return this.playerLimit;
    }

    public UpdateMediaConnectFlowOutputRequest setSrtLatency(String srtLatency) {
        this.srtLatency = srtLatency;
        return this;
    }
    public String getSrtLatency() {
        return this.srtLatency;
    }

    public UpdateMediaConnectFlowOutputRequest setSrtPassphrase(String srtPassphrase) {
        this.srtPassphrase = srtPassphrase;
        return this;
    }
    public String getSrtPassphrase() {
        return this.srtPassphrase;
    }

    public UpdateMediaConnectFlowOutputRequest setSrtPbkeyLen(String srtPbkeyLen) {
        this.srtPbkeyLen = srtPbkeyLen;
        return this;
    }
    public String getSrtPbkeyLen() {
        return this.srtPbkeyLen;
    }

}
