// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UnbindAppRequest extends TeaModel {
    /**
     * <p>The list of application IDs to dissociate from the specified image version. Verify that each application is associated with the selected image version beforehand.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppIdList")
    public java.util.List<String> appIdList;

    /**
     * <p>The ID of the image from which the applications are to be dissociated. The image must be a custom image or community image manageable by the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1example****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the image version from which the applications are to be dissociated. If omitted, the current active version of the image is used. If specified, the version must belong to the image specified by ImageId.</p>
     * 
     * <strong>example:</strong>
     * <p>iv-bp1example****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static UnbindAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAppRequest self = new UnbindAppRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAppRequest setAppIdList(java.util.List<String> appIdList) {
        this.appIdList = appIdList;
        return this;
    }
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    public UnbindAppRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UnbindAppRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
