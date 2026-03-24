// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyStorageRequirementsRequest extends TeaModel {
    /**
     * <p>The name of the add-on release.</p>
     * 
     * <strong>example:</strong>
     * <p>release-1234357</p>
     */
    @NameInMap("addonName")
    public String addonName;

    /**
     * <p>The name of the AddonRelease.</p>
     * 
     * <strong>example:</strong>
     * <p>kafka-17201012937917</p>
     */
    @NameInMap("addonReleaseName")
    public String addonReleaseName;

    /**
     * <p>The storage type. Valid values: LogStore, Prometheus, TraceStore, EventStore, and EntityStore.</p>
     * 
     * <strong>example:</strong>
     * <p>LogStore</p>
     */
    @NameInMap("storageType")
    public String storageType;

    public static ListIntegrationPolicyStorageRequirementsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyStorageRequirementsRequest self = new ListIntegrationPolicyStorageRequirementsRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyStorageRequirementsRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListIntegrationPolicyStorageRequirementsRequest setAddonReleaseName(String addonReleaseName) {
        this.addonReleaseName = addonReleaseName;
        return this;
    }
    public String getAddonReleaseName() {
        return this.addonReleaseName;
    }

    public ListIntegrationPolicyStorageRequirementsRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
