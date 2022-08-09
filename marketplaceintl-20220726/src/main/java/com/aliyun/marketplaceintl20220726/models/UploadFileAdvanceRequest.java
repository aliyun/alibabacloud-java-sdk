// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class UploadFileAdvanceRequest extends TeaModel {
    @NameInMap("FileUrlObject")
    @Validation(required = true)
    public java.io.InputStream fileUrlObject;

    @NameInMap("EncryptData")
    public String encryptData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uid")
    public String uid;

    public static UploadFileAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileAdvanceRequest self = new UploadFileAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public UploadFileAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public UploadFileAdvanceRequest setEncryptData(String encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public String getEncryptData() {
        return this.encryptData;
    }

    public UploadFileAdvanceRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadFileAdvanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UploadFileAdvanceRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
