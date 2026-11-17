// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetImageDistributeInfoRequest extends TeaModel {
    /**
     * <p>The ID of the image whose region distribution information you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1example****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the image version. If this parameter is not specified, the online version of the image is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>iv-xxx</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static GetImageDistributeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageDistributeInfoRequest self = new GetImageDistributeInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetImageDistributeInfoRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetImageDistributeInfoRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
