// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class ModifyFaceRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4EB35****87</p>
     */
    @NameInMap("FaceGroupCode")
    public String faceGroupCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("ImgOssInfos")
    public String imgOssInfos;

    public static ModifyFaceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFaceRecordRequest self = new ModifyFaceRecordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFaceRecordRequest setFaceGroupCode(String faceGroupCode) {
        this.faceGroupCode = faceGroupCode;
        return this;
    }
    public String getFaceGroupCode() {
        return this.faceGroupCode;
    }

    public ModifyFaceRecordRequest setImgOssInfos(String imgOssInfos) {
        this.imgOssInfos = imgOssInfos;
        return this;
    }
    public String getImgOssInfos() {
        return this.imgOssInfos;
    }

}
