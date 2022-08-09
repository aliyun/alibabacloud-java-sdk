// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class UploadFileRequest extends TeaModel {
    @NameInMap("EncryptData")
    public String encryptData;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uid")
    public String uid;

    public static UploadFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileRequest self = new UploadFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadFileRequest setEncryptData(String encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public String getEncryptData() {
        return this.encryptData;
    }

    public UploadFileRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadFileRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadFileRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UploadFileRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
