// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEnvironmentRequest extends TeaModel {
    /**
     * <p>The environment name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NPDcP1</p>
     */
    @NameInMap("EnvironmentName")
    public String environmentName;

    /**
     * <p>The name of the environment with the next priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>默认环境</p>
     */
    @NameInMap("NextEnvironmentName")
    public String nextEnvironmentName;

    /**
     * <p>The environment rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>(&quot;ip&quot; eq &quot;1.1.1.1&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123**</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static CreateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentRequest self = new CreateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentRequest setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

    public CreateEnvironmentRequest setNextEnvironmentName(String nextEnvironmentName) {
        this.nextEnvironmentName = nextEnvironmentName;
        return this;
    }
    public String getNextEnvironmentName() {
        return this.nextEnvironmentName;
    }

    public CreateEnvironmentRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateEnvironmentRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
