// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateCloudPhoneNodeSystemImageRequest extends TeaModel {
    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-075cllfeuazh0****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The list of cloud phone normal matrix IDs.</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    public static UpdateCloudPhoneNodeSystemImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudPhoneNodeSystemImageRequest self = new UpdateCloudPhoneNodeSystemImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudPhoneNodeSystemImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateCloudPhoneNodeSystemImageRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

}
