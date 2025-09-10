// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAddonReleaseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.0.2</p>
     */
    @NameInMap("addonVersion")
    public String addonVersion;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    @NameInMap("entityRules")
    public EntityDiscoverRule entityRules;

    /**
     * <strong>example:</strong>
     * <p>{&quot;install&quot;:{&quot;mode&quot;:&quot;auto-install&quot;,&quot;listenPort&quot;:&quot;9400&quot;},&quot;discoverMode&quot;:&quot;instances&quot;,&quot;discover&quot;:{&quot;instances&quot;:&quot;worker-k8s-for-cs-c126d87c76218487e83ab322017f11b44&quot;},&quot;scrapeInterval&quot;:&quot;15&quot;,&quot;enableSecuritecs-nodeyGroupInjection&quot;:&quot;true&quot;,&quot;metricTags&quot;:&quot;&quot;}</p>
     */
    @NameInMap("values")
    public String values;

    public static UpdateAddonReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAddonReleaseRequest self = new UpdateAddonReleaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAddonReleaseRequest setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
        return this;
    }
    public String getAddonVersion() {
        return this.addonVersion;
    }

    public UpdateAddonReleaseRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateAddonReleaseRequest setEntityRules(EntityDiscoverRule entityRules) {
        this.entityRules = entityRules;
        return this;
    }
    public EntityDiscoverRule getEntityRules() {
        return this.entityRules;
    }

    public UpdateAddonReleaseRequest setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

}
