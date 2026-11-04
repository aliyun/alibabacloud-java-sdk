// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserPictureRequest extends TeaModel {
    /**
     * <p>The download URL of the user\&quot;s face image. Only JPEG and JPG images are supported, and the image URL cannot contain Chinese characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/test.jpeg">https://example.com/test.jpeg</a></p>
     */
    @NameInMap("FacePicUrl")
    public String facePicUrl;

    /**
     * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. Keep this value consistent with the <strong>IsolationId</strong> set when calling the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> API operation to add a user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The user ID. Pass in the <strong>UserId</strong> value that was obtained and saved locally after calling the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> API operation to add a user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3mtjaqebeq4d****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AddFaceUserPictureRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserPictureRequest self = new AddFaceUserPictureRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceUserPictureRequest setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
        return this;
    }
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

    public AddFaceUserPictureRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceUserPictureRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
