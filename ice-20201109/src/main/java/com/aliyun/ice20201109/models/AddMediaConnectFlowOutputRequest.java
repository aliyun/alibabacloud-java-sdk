// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddMediaConnectFlowOutputRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>83.17.231.31/32</p>
     */
    @NameInMap("Cidrs")
    public String cidrs;

    /**
     * <strong>example:</strong>
     * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <strong>example:</strong>
     * <p>AliTestOutput</p>
     */
    @NameInMap("OutputName")
    public String outputName;

    /**
     * <strong>example:</strong>
     * <p>RTMP-PULL</p>
     */
    @NameInMap("OutputProtocol")
    public String outputProtocol;

    /**
     * <strong>example:</strong>
     * <p>rtmp://push.test.alivecdn.com/live/alitest</p>
     */
    @NameInMap("OutputToUrl")
    public String outputToUrl;

    /**
     * <strong>example:</strong>
     * <p>8666ec062190f00e263012666319a5be</p>
     */
    @NameInMap("PairChannelId")
    public String pairChannelId;

    /**
     * <strong>example:</strong>
     * <p>8666ec062190f00e263012666319a5be</p>
     */
    @NameInMap("PairFlowId")
    public String pairFlowId;

    /**
     * <strong>example:</strong>
     * <p>AliTestInput</p>
     */
    @NameInMap("PairInputName")
    public String pairInputName;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PlayerLimit")
    public Integer playerLimit;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SrtLatency")
    public Integer srtLatency;

    /**
     * <strong>example:</strong>
     * <p>BETTERG08S01</p>
     */
    @NameInMap("SrtPassphrase")
    public String srtPassphrase;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("SrtPbkeyLen")
    public String srtPbkeyLen;

    public static AddMediaConnectFlowOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMediaConnectFlowOutputRequest self = new AddMediaConnectFlowOutputRequest();
        return TeaModel.build(map, self);
    }

    public AddMediaConnectFlowOutputRequest setCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public String getCidrs() {
        return this.cidrs;
    }

    public AddMediaConnectFlowOutputRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public AddMediaConnectFlowOutputRequest setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }
    public String getOutputName() {
        return this.outputName;
    }

    public AddMediaConnectFlowOutputRequest setOutputProtocol(String outputProtocol) {
        this.outputProtocol = outputProtocol;
        return this;
    }
    public String getOutputProtocol() {
        return this.outputProtocol;
    }

    public AddMediaConnectFlowOutputRequest setOutputToUrl(String outputToUrl) {
        this.outputToUrl = outputToUrl;
        return this;
    }
    public String getOutputToUrl() {
        return this.outputToUrl;
    }

    public AddMediaConnectFlowOutputRequest setPairChannelId(String pairChannelId) {
        this.pairChannelId = pairChannelId;
        return this;
    }
    public String getPairChannelId() {
        return this.pairChannelId;
    }

    public AddMediaConnectFlowOutputRequest setPairFlowId(String pairFlowId) {
        this.pairFlowId = pairFlowId;
        return this;
    }
    public String getPairFlowId() {
        return this.pairFlowId;
    }

    public AddMediaConnectFlowOutputRequest setPairInputName(String pairInputName) {
        this.pairInputName = pairInputName;
        return this;
    }
    public String getPairInputName() {
        return this.pairInputName;
    }

    public AddMediaConnectFlowOutputRequest setPlayerLimit(Integer playerLimit) {
        this.playerLimit = playerLimit;
        return this;
    }
    public Integer getPlayerLimit() {
        return this.playerLimit;
    }

    public AddMediaConnectFlowOutputRequest setSrtLatency(Integer srtLatency) {
        this.srtLatency = srtLatency;
        return this;
    }
    public Integer getSrtLatency() {
        return this.srtLatency;
    }

    public AddMediaConnectFlowOutputRequest setSrtPassphrase(String srtPassphrase) {
        this.srtPassphrase = srtPassphrase;
        return this;
    }
    public String getSrtPassphrase() {
        return this.srtPassphrase;
    }

    public AddMediaConnectFlowOutputRequest setSrtPbkeyLen(String srtPbkeyLen) {
        this.srtPbkeyLen = srtPbkeyLen;
        return this;
    }
    public String getSrtPbkeyLen() {
        return this.srtPbkeyLen;
    }

}
