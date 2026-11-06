// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAdaptorRequest extends TeaModel {
    /**
     * <p>The ID of the application adaptation to be processed. <strong>Required</strong>. It must point to the same application adaptation as AppId and AppVersionId.</p>
     * 
     * <strong>example:</strong>
     * <p>adt-bp1example****</p>
     */
    @NameInMap("AdaptorId")
    public String adaptorId;

    /**
     * <p>The ID of the application. <strong>Required</strong>. It must match the application corresponding to AdaptorId.</p>
     * 
     * <strong>example:</strong>
     * <p>app-bp1example****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the application version. <strong>Required</strong>. It must match the application version corresponding to AdaptorId. This parameter is not the image version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>apv-bp1example****</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    /**
     * <p>The ID of the image to be dissociated. <strong>Must be provided together with VersionId</strong>. If both parameters are not specified at the same time, the adaptation deletion process starts.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1example****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the image version to be dissociated. It must be provided together with ImageId and belong to the specified image.</p>
     * 
     * <strong>example:</strong>
     * <p>iv-bp1example****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static DeleteAdaptorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdaptorRequest self = new DeleteAdaptorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAdaptorRequest setAdaptorId(String adaptorId) {
        this.adaptorId = adaptorId;
        return this;
    }
    public String getAdaptorId() {
        return this.adaptorId;
    }

    public DeleteAdaptorRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAdaptorRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public DeleteAdaptorRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DeleteAdaptorRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
