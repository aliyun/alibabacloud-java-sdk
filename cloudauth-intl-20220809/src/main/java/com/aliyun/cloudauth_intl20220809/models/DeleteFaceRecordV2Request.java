// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteFaceRecordV2Request extends TeaModel {
    /**
     * <p>The face group code. If this parameter is not specified, the face data of the user is deleted from all face groups.</p>
     * 
     * <strong>example:</strong>
     * <p>sgl****7uc</p>
     */
    @NameInMap("FaceGroupCode")
    public String faceGroupCode;

    /**
     * <p>The unique user identifier, which must be consistent with the one used when calling AddFaceRecord. If this parameter was not specified during registration, you can use the default image name.</p>
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
