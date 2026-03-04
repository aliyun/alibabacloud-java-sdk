// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateYikeAssetUploadRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mp4</p>
     */
    @NameInMap("FileExt")
    public String fileExt;

    public static CreateYikeAssetUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeAssetUploadRequest self = new CreateYikeAssetUploadRequest();
        return TeaModel.build(map, self);
    }

    public CreateYikeAssetUploadRequest setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

}
