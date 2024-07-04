// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically release the instance after the image is packaged and uploaded. Only image builders are supported. Default value: false. Valid values:</p>
     * <ul>
     * <li>true: The image is released when the instance is released.</li>
     * <li>false: The image is retained when the instance is released.</li>
     * <li>If you leave this parameter empty, the default value is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteAfterImageUpload")
    public String deleteAfterImageUpload;

    /**
     * <p>The name of the image. The name must be 2 to 128 characters in length. The name can contain letters, digits, colons (:), underscores (<em>), and hyphens (-). It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (</em>), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5rr1bnyrc4tswr8cq3w6y****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp67acfmxazb4p****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static CreateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageRequest self = new CreateImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageRequest setDeleteAfterImageUpload(String deleteAfterImageUpload) {
        this.deleteAfterImageUpload = deleteAfterImageUpload;
        return this;
    }
    public String getDeleteAfterImageUpload() {
        return this.deleteAfterImageUpload;
    }

    public CreateImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateImageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateImageRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
