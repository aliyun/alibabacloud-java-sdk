// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic release of the instance after the image is packaged and uploaded. This parameter is supported only for build instances.</p>
     * <ul>
     * <li>true: The image is released together with the instance when the instance is released.</li>
     * <li>false: The image is retained when the instance is released.</li>
     * <li>If this parameter is left empty, the default value is false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteAfterImageUpload")
    public String deleteAfterImageUpload;

    /**
     * <p>The image name. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5rr1bnyrc4tswr8cq3w6y****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp67acfmxazb4p****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The region of the destination OSS bucket where the image is stored.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("TargetOSSRegionId")
    public String targetOSSRegionId;

    /**
     * <p>Specifies whether to include data cloud disks when creating the image.</p>
     * 
     * <strong>example:</strong>
     * <p>Valid values:
     * true: includes data cloud disks.
     * false: default value. Does not include data cloud disks</p>
     */
    @NameInMap("WithDataDisks")
    public Boolean withDataDisks;

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

    public CreateImageRequest setTargetOSSRegionId(String targetOSSRegionId) {
        this.targetOSSRegionId = targetOSSRegionId;
        return this;
    }
    public String getTargetOSSRegionId() {
        return this.targetOSSRegionId;
    }

    public CreateImageRequest setWithDataDisks(Boolean withDataDisks) {
        this.withDataDisks = withDataDisks;
        return this;
    }
    public Boolean getWithDataDisks() {
        return this.withDataDisks;
    }

}
