// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateNetworkOptimizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SmartRouting")
    public String smartRouting;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("UploadMaxFilesize")
    public String uploadMaxFilesize;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Websocket")
    public String websocket;

    public static UpdateNetworkOptimizationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkOptimizationRequest self = new UpdateNetworkOptimizationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkOptimizationRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateNetworkOptimizationRequest setGrpc(String grpc) {
        this.grpc = grpc;
        return this;
    }
    public String getGrpc() {
        return this.grpc;
    }

    public UpdateNetworkOptimizationRequest setHttp2Origin(String http2Origin) {
        this.http2Origin = http2Origin;
        return this;
    }
    public String getHttp2Origin() {
        return this.http2Origin;
    }

    public UpdateNetworkOptimizationRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateNetworkOptimizationRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateNetworkOptimizationRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateNetworkOptimizationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateNetworkOptimizationRequest setSmartRouting(String smartRouting) {
        this.smartRouting = smartRouting;
        return this;
    }
    public String getSmartRouting() {
        return this.smartRouting;
    }

    public UpdateNetworkOptimizationRequest setUploadMaxFilesize(String uploadMaxFilesize) {
        this.uploadMaxFilesize = uploadMaxFilesize;
        return this;
    }
    public String getUploadMaxFilesize() {
        return this.uploadMaxFilesize;
    }

    public UpdateNetworkOptimizationRequest setWebsocket(String websocket) {
        this.websocket = websocket;
        return this;
    }
    public String getWebsocket() {
        return this.websocket;
    }

}
