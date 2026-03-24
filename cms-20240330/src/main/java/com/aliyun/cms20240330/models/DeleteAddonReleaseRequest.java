// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAddonReleaseRequest extends TeaModel {
    /**
     * <p>The name of the add-on. If you specify this parameter, the ReleaseName parameter is ignored and all AddonReleases that belong to the add-on are uninstalled in a batch.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-gpu</p>
     */
    @NameInMap("addonName")
    public String addonName;

    /**
     * <p>Specifies whether to forcibly delete the add-on release. The default value is false.</p>
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
