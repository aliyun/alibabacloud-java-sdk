// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetNetworkOptimizationResponseBody extends TeaModel {
    /**
     * <p>Configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Configuration type, which can be used to query global or rule configurations. Value range:</p>
     * <ul>
     * <li>global: Query global configuration.</li>
     * <li>rule: Query rule configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>Whether to enable GRPC, default is disabled. Value range:</p>
     * <ul>
     * <li>on: Enable</li>
     * <li>off: Disable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Grpc")
    public String grpc;

    /**
     * <p>Whether to enable HTTP2 origin, default is disabled. Value range:</p>
     * <ul>
     * <li>on: Enable</li>
     * <li>off: Disable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Http2Origin")
    public String http2Origin;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true</li>
     * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq \&quot;video.example.com\&quot;)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. This parameter is not required when adding a global configuration. Value range:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>Rule name. This parameter is not required when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Rule execution order. The smaller the value, the higher the priority.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Site configuration version number. For sites with version management enabled, this parameter can specify the effective site version, defaulting to version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>Whether to enable smart routing service, default is disabled. Value range:</p>
     * <ul>
     * <li>on: Enable</li>
     * <li>off: Disable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SmartRouting")
    public String smartRouting;

    /**
     * <p>Maximum upload file size in MB, with a range from 100 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("UploadMaxFilesize")
    public String uploadMaxFilesize;

    /**
     * <p>Whether to enable Websocket, default is enabled. Value range:</p>
     * <ul>
     * <li>on: Enable</li>
     * <li>off: Disable</li>
     * </ul>
     * 
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
