// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserPictureRequest extends TeaModel {
    /**
     * <p>The unique identifier of the user\&quot;s face image. Set this parameter to the <strong>Data</strong> value that you obtained and saved locally after you called the <a href="https://help.aliyun.com/document_detail/312040.html">AddFaceUserPicutre</a> operation to add the face image for the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1bb580ef7****</p>
     */
    @NameInMap("FacePicMd5")
    public String facePicMd5;

    /**
     * <p>The business isolation ID. It is used to isolate data between different business applications under the same Alibaba Cloud account. Set this parameter to the same value as the <strong>IsolationId</strong> that you specified when you called the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The user ID. Set this parameter to the <strong>UserId</strong> value that you obtained and saved locally after you called the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3mtjaqebeq4d****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeleteFaceUserPictureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserPictureRequest self = new DeleteFaceUserPictureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserPictureRequest setFacePicMd5(String facePicMd5) {
        this.facePicMd5 = facePicMd5;
        return this;
    }
    public String getFacePicMd5() {
        return this.facePicMd5;
    }

    public DeleteFaceUserPictureRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public DeleteFaceUserPictureRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
