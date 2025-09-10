// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAddonReleaseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-gpu</p>
     */
    @NameInMap("addonName")
    public String addonName;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("aliyunLang")
    public String aliyunLang;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    @NameInMap("entityRules")
    public EntityDiscoverRule entityRules;

    /**
     * <strong>example:</strong>
     * <p>CS</p>
     */
    @NameInMap("envType")
    public String envType;

    /**
     * <strong>example:</strong>
     * <p>policy-xxxxxxxxxxx</p>
     */
    @NameInMap("parentAddonReleaseId")
    public String parentAddonReleaseId;

    /**
     * <strong>example:</strong>
     * <p>test-gpu-integration-name</p>
     */
    @NameInMap("releaseName")
    public String releaseName;

    /**
     * <strong>example:</strong>
     * <p>{&quot;install&quot;:{&quot;mode&quot;:&quot;auto-install&quot;,&quot;listenPort&quot;:&quot;9400&quot;},&quot;discoverMode&quot;:&quot;instances&quot;,&quot;discover&quot;:{&quot;instances&quot;:&quot;worker-k8s-for-cs-c126d87c76218487e83ab322017f11b44&quot;},&quot;scrapeInterval&quot;:&quot;15&quot;,&quot;enableSecuritecs-nodeyGroupInjection&quot;:&quot;true&quot;,&quot;metricTags&quot;:&quot;&quot;}</p>
     */
    @NameInMap("values")
    public String values;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.2</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateAddonReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAddonReleaseRequest self = new CreateAddonReleaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateAddonReleaseRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public CreateAddonReleaseRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public CreateAddonReleaseRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateAddonReleaseRequest setEntityRules(EntityDiscoverRule entityRules) {
        this.entityRules = entityRules;
        return this;
    }
    public EntityDiscoverRule getEntityRules() {
        return this.entityRules;
    }

    public CreateAddonReleaseRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public CreateAddonReleaseRequest setParentAddonReleaseId(String parentAddonReleaseId) {
        this.parentAddonReleaseId = parentAddonReleaseId;
        return this;
    }
    public String getParentAddonReleaseId() {
        return this.parentAddonReleaseId;
    }

    public CreateAddonReleaseRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public CreateAddonReleaseRequest setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

    public CreateAddonReleaseRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateAddonReleaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
