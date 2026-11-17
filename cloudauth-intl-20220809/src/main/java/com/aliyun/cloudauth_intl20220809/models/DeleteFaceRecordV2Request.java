// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteFaceRecordV2Request extends TeaModel {
    /**
     * <p>The code of the face group. If you do not specify this parameter, the face data of the user in all face groups is deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>sgl****7uc</p>
     */
    @NameInMap("FaceGroupCode")
    public String faceGroupCode;

    /**
     * <p>The unique identifier of the user. This value must be the same as the one specified when the face record was added by using AddFaceRecord. If no user identifier was specified when the record was added, you can use the default image name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231****</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    public static DeleteFaceRecordV2Request build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceRecordV2Request self = new DeleteFaceRecordV2Request();
        return TeaModel.build(map, self);
    }

    public DeleteFaceRecordV2Request setFaceGroupCode(String faceGroupCode) {
        this.faceGroupCode = faceGroupCode;
        return this;
    }
    public String getFaceGroupCode() {
        return this.faceGroupCode;
    }

    public DeleteFaceRecordV2Request setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

}
