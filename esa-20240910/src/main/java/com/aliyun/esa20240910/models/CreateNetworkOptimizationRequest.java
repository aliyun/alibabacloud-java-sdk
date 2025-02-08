// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateNetworkOptimizationRequest extends TeaModel {
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
     * <p>340035003106221</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

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

    public static CreateNetworkOptimizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkOptimizationRequest self = new CreateNetworkOptimizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkOptimizationRequest setGrpc(String grpc) {
        this.grpc = grpc;
        return this;
    }
    public String getGrpc() {
        return this.grpc;
    }

    public CreateNetworkOptimizationRequest setHttp2Origin(String http2Origin) {
        this.http2Origin = http2Origin;
        return this;
    }
    public String getHttp2Origin() {
        return this.http2Origin;
    }

    public CreateNetworkOptimizationRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateNetworkOptimizationRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateNetworkOptimizationRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateNetworkOptimizationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateNetworkOptimizationRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public CreateNetworkOptimizationRequest setSmartRouting(String smartRouting) {
        this.smartRouting = smartRouting;
        return this;
    }
    public String getSmartRouting() {
        return this.smartRouting;
    }

    public CreateNetworkOptimizationRequest setUploadMaxFilesize(String uploadMaxFilesize) {
        this.uploadMaxFilesize = uploadMaxFilesize;
        return this;
    }
    public String getUploadMaxFilesize() {
        return this.uploadMaxFilesize;
    }

    public CreateNetworkOptimizationRequest setWebsocket(String websocket) {
        this.websocket = websocket;
        return this;
    }
    public String getWebsocket() {
        return this.websocket;
    }

}
