// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyCollectorsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>release-1234567</p>
     */
    @NameInMap("addonReleaseName")
    public String addonReleaseName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Exporter</p>
     */
    @NameInMap("collectorType")
    public String collectorType;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("language")
    public String language;

    public static ListIntegrationPolicyCollectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyCollectorsRequest self = new ListIntegrationPolicyCollectorsRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyCollectorsRequest setAddonReleaseName(String addonReleaseName) {
        this.addonReleaseName = addonReleaseName;
        return this;
    }
    public String getAddonReleaseName() {
        return this.addonReleaseName;
    }

    public ListIntegrationPolicyCollectorsRequest setCollectorType(String collectorType) {
        this.collectorType = collectorType;
        return this;
    }
    public String getCollectorType() {
        return this.collectorType;
    }

    public ListIntegrationPolicyCollectorsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
