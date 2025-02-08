// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetNetworkOptimizationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Grpc")
    public String grpc;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Http2Origin")
    public String http2Origin;

    /**
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SmartRouting")
    public String smartRouting;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("UploadMaxFilesize")
    public String uploadMaxFilesize;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Websocket")
    public String websocket;

    public static GetNetworkOptimizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkOptimizationResponseBody self = new GetNetworkOptimizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkOptimizationResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetNetworkOptimizationResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetNetworkOptimizationResponseBody setGrpc(String grpc) {
        this.grpc = grpc;
        return this;
    }
    public String getGrpc() {
        return this.grpc;
    }

    public GetNetworkOptimizationResponseBody setHttp2Origin(String http2Origin) {
        this.http2Origin = http2Origin;
        return this;
    }
    public String getHttp2Origin() {
        return this.http2Origin;
    }

    public GetNetworkOptimizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNetworkOptimizationResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetNetworkOptimizationResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetNetworkOptimizationResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetNetworkOptimizationResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetNetworkOptimizationResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public GetNetworkOptimizationResponseBody setSmartRouting(String smartRouting) {
        this.smartRouting = smartRouting;
        return this;
    }
    public String getSmartRouting() {
        return this.smartRouting;
    }

    public GetNetworkOptimizationResponseBody setUploadMaxFilesize(String uploadMaxFilesize) {
        this.uploadMaxFilesize = uploadMaxFilesize;
        return this;
    }
    public String getUploadMaxFilesize() {
        return this.uploadMaxFilesize;
    }

    public GetNetworkOptimizationResponseBody setWebsocket(String websocket) {
        this.websocket = websocket;
        return this;
    }
    public String getWebsocket() {
        return this.websocket;
    }

}
