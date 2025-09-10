// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyPodMonitorsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>release-123456789</p>
     */
    @NameInMap("addonReleaseName")
    public String addonReleaseName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("encryptYaml")
    public Boolean encryptYaml;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    public static ListIntegrationPolicyPodMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyPodMonitorsRequest self = new ListIntegrationPolicyPodMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyPodMonitorsRequest setAddonReleaseName(String addonReleaseName) {
        this.addonReleaseName = addonReleaseName;
        return this;
    }
    public String getAddonReleaseName() {
        return this.addonReleaseName;
    }

    public ListIntegrationPolicyPodMonitorsRequest setEncryptYaml(Boolean encryptYaml) {
        this.encryptYaml = encryptYaml;
        return this;
    }
    public Boolean getEncryptYaml() {
        return this.encryptYaml;
    }

    public ListIntegrationPolicyPodMonitorsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
