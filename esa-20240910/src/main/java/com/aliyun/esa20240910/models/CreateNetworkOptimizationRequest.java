// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateNetworkOptimizationRequest extends TeaModel {
    /**
     * <p>Indicates whether to enable GRPC, disabled by default. Possible values:</p>
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
     * <p>Indicates whether to enable HTTP2 origin, disabled by default. Possible values:</p>
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
     * <p>Rule content.</p>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. Possible values:</p>
     * <ul>
     * <li>on: Enable</li>
     * <li>off: Disable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>Rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340035003106221</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Version number of the site configuration. For sites with version management enabled, this parameter specifies the version to which the configuration applies, defaulting to version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>Indicates whether to enable smart routing service, disabled by default. Possible values:</p>
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
     * <p>Maximum file size for upload, in MB. Range: 100～500.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("UploadMaxFilesize")
    public String uploadMaxFilesize;

    /**
     * <p>Indicates whether to enable Websocket, enabled by default. Possible values:</p>
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
