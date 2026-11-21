// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyServiceMonitorsRequest extends TeaModel {
    /**
     * <p>The name of the add-on release.</p>
     * 
     * <strong>example:</strong>
     * <p>release-12345678</p>
     */
    @NameInMap("addonReleaseName")
    public String addonReleaseName;

    /**
     * <p>The collector identifier. If a release exists, pass the release name. Otherwise, pass the component name.</p>
     * 
     * <strong>example:</strong>
     * <p>collector:metric-agent:policy:policy-bfd3d455fd6f4bc8</p>
     */
    @NameInMap("collectorReleaseName")
    public String collectorReleaseName;

    /**
     * <p>Specifies whether to encrypt the YAML content.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("encryptYaml")
    public Boolean encryptYaml;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>arms-prom</p>
     */
    @NameInMap("namespace")
    public String namespace;

    public static ListIntegrationPolicyServiceMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyServiceMonitorsRequest self = new ListIntegrationPolicyServiceMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyServiceMonitorsRequest setAddonReleaseName(String addonReleaseName) {
        this.addonReleaseName = addonReleaseName;
        return this;
    }
    public String getAddonReleaseName() {
        return this.addonReleaseName;
    }

    public ListIntegrationPolicyServiceMonitorsRequest setCollectorReleaseName(String collectorReleaseName) {
        this.collectorReleaseName = collectorReleaseName;
        return this;
    }
    public String getCollectorReleaseName() {
        return this.collectorReleaseName;
    }

    public ListIntegrationPolicyServiceMonitorsRequest setEncryptYaml(Boolean encryptYaml) {
        this.encryptYaml = encryptYaml;
        return this;
    }
    public Boolean getEncryptYaml() {
        return this.encryptYaml;
    }

    public ListIntegrationPolicyServiceMonitorsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
