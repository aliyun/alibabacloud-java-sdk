// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddMediaConnectFlowInputRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>19.168.1.1/32,18.168.1.1/16</p>
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
     * <p>rtmp://pull.test.alivecdn.com/live/alitest</p>
     */
    @NameInMap("InputFromUrl")
    public String inputFromUrl;

    /**
     * <strong>example:</strong>
     * <p>AliTestInput</p>
     */
    @NameInMap("InputName")
    public String inputName;

    /**
     * <strong>example:</strong>
     * <p>RTMP-PUSH</p>
     */
    @NameInMap("InputProtocol")
    public String inputProtocol;

    /**
     * <strong>example:</strong>
     * <p>2000000</p>
     */
    @NameInMap("MaxBitrate")
    public Integer maxBitrate;

    /**
     * <strong>example:</strong>
     * <p>805fbdd0-575e-4146-b35d-ec7f63937b20</p>
     */
    @NameInMap("PairFlowId")
    public String pairFlowId;

    /**
     * <strong>example:</strong>
     * <p>AliTestOutput</p>
     */
    @NameInMap("PairOutputName")
    public String pairOutputName;

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

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("SrtPbkeylen")
    public String srtPbkeylen;

    /**
     * <strong>example:</strong>
     * <p>BETTERG08S01</p>
     */
    @NameInMap("SrtPbkeyssen")
    public String srtPbkeyssen;

    public static AddMediaConnectFlowInputRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMediaConnectFlowInputRequest self = new AddMediaConnectFlowInputRequest();
        return TeaModel.build(map, self);
    }

    public AddMediaConnectFlowInputRequest setCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public String getCidrs() {
        return this.cidrs;
    }

    public AddMediaConnectFlowInputRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public AddMediaConnectFlowInputRequest setInputFromUrl(String inputFromUrl) {
        this.inputFromUrl = inputFromUrl;
        return this;
    }
    public String getInputFromUrl() {
        return this.inputFromUrl;
    }

    public AddMediaConnectFlowInputRequest setInputName(String inputName) {
        this.inputName = inputName;
        return this;
    }
    public String getInputName() {
        return this.inputName;
    }

    public AddMediaConnectFlowInputRequest setInputProtocol(String inputProtocol) {
        this.inputProtocol = inputProtocol;
        return this;
    }
    public String getInputProtocol() {
        return this.inputProtocol;
    }

    public AddMediaConnectFlowInputRequest setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
        return this;
    }
    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    public AddMediaConnectFlowInputRequest setPairFlowId(String pairFlowId) {
        this.pairFlowId = pairFlowId;
        return this;
    }
    public String getPairFlowId() {
        return this.pairFlowId;
    }

    public AddMediaConnectFlowInputRequest setPairOutputName(String pairOutputName) {
        this.pairOutputName = pairOutputName;
        return this;
    }
    public String getPairOutputName() {
        return this.pairOutputName;
    }

    public AddMediaConnectFlowInputRequest setSrtLatency(Integer srtLatency) {
        this.srtLatency = srtLatency;
        return this;
    }
    public Integer getSrtLatency() {
        return this.srtLatency;
    }

    public AddMediaConnectFlowInputRequest setSrtPassphrase(String srtPassphrase) {
        this.srtPassphrase = srtPassphrase;
        return this;
    }
    public String getSrtPassphrase() {
        return this.srtPassphrase;
    }

    public AddMediaConnectFlowInputRequest setSrtPbkeyLen(String srtPbkeyLen) {
        this.srtPbkeyLen = srtPbkeyLen;
        return this;
    }
    public String getSrtPbkeyLen() {
        return this.srtPbkeyLen;
    }

    public AddMediaConnectFlowInputRequest setSrtPbkeylen(String srtPbkeylen) {
        this.srtPbkeylen = srtPbkeylen;
        return this;
    }
    public String getSrtPbkeylen() {
        return this.srtPbkeylen;
    }

    public AddMediaConnectFlowInputRequest setSrtPbkeyssen(String srtPbkeyssen) {
        this.srtPbkeyssen = srtPbkeyssen;
        return this;
    }
    public String getSrtPbkeyssen() {
        return this.srtPbkeyssen;
    }

}
