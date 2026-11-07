// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateLocalityRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh (default): Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>hkhon1po62@c3df23522******</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>example-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether to enable zone affinity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The name of the MSE namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>myNamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The reserved parameter. This parameter is not used.</p>
     * 
     * <strong>example:</strong>
     * <p>No input required</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The source of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>edasmsc</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The threshold for zone affinity to take effect. The zone affinity routing feature is enabled for a zone only when the proportion of instances of the current application deployed in the zone exceeds this threshold. That is, when a consumer sends a request to the application, the request is preferentially routed to an instance in the same zone as the consumer.</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("Threshold")
    public Double threshold;

    public static UpdateLocalityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocalityRuleRequest self = new UpdateLocalityRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLocalityRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateLocalityRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateLocalityRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLocalityRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateLocalityRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateLocalityRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateLocalityRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public UpdateLocalityRuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateLocalityRuleRequest setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

}
