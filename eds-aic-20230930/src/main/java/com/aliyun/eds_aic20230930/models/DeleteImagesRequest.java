// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteImagesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageIds")
    public java.util.List<String> imageIds;

    public static DeleteImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagesRequest self = new DeleteImagesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImagesRequest setImageIds(java.util.List<String> imageIds) {
        this.imageIds = imageIds;
        return this;
    }
    public java.util.List<String> getImageIds() {
        return this.imageIds;
    }

}
