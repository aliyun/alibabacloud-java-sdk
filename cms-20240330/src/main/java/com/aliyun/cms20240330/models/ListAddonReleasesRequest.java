// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAddonReleasesRequest extends TeaModel {
    /**
     * <p>Addon component name.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-gpu</p>
     */
    @NameInMap("addonName")
    public String addonName;

    /**
     * <p>Parent AddonReleaseId.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-xxxxxxxxxxxxx</p>
     */
    @NameInMap("parentAddonReleaseId")
    public String parentAddonReleaseId;

    public static ListAddonReleasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAddonReleasesRequest self = new ListAddonReleasesRequest();
        return TeaModel.build(map, self);
    }

    public ListAddonReleasesRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListAddonReleasesRequest setParentAddonReleaseId(String parentAddonReleaseId) {
        this.parentAddonReleaseId = parentAddonReleaseId;
        return this;
    }
    public String getParentAddonReleaseId() {
        return this.parentAddonReleaseId;
    }

}
