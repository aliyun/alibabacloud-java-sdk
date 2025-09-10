// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyCustomScrapeJobRulesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>release12345678</p>
     */
    @NameInMap("addonReleaseName")
    public String addonReleaseName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("encryptYaml")
    public Boolean encryptYaml;

    @NameInMap("namespace")
    public String namespace;

    public static ListIntegrationPolicyCustomScrapeJobRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyCustomScrapeJobRulesRequest self = new ListIntegrationPolicyCustomScrapeJobRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyCustomScrapeJobRulesRequest setAddonReleaseName(String addonReleaseName) {
        this.addonReleaseName = addonReleaseName;
        return this;
    }
    public String getAddonReleaseName() {
        return this.addonReleaseName;
    }

    public ListIntegrationPolicyCustomScrapeJobRulesRequest setEncryptYaml(Boolean encryptYaml) {
        this.encryptYaml = encryptYaml;
        return this;
    }
    public Boolean getEncryptYaml() {
        return this.encryptYaml;
    }

    public ListIntegrationPolicyCustomScrapeJobRulesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
