// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAddonReleaseRequest extends TeaModel {
    /**
     * <p>Addon name. When AddonName is provided, it will ignore the ReleaseName parameter and batch uninstall all AddonReleases belonging to the same Addon.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-gpu</p>
     */
    @NameInMap("addonName")
    public String addonName;

    /**
     * <p>Whether to force deletion, default is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("force")
    public Boolean force;

    /**
     * <p>The name of the AddonRelease.</p>
     * 
     * <strong>example:</strong>
     * <p>test-gpu-integration-name</p>
     */
    @NameInMap("releaseName")
    public String releaseName;

    public static DeleteAddonReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAddonReleaseRequest self = new DeleteAddonReleaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAddonReleaseRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public DeleteAddonReleaseRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteAddonReleaseRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

}
