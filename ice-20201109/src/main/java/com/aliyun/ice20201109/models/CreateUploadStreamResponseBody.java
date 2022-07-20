// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadStreamResponseBody extends TeaModel {
    @NameInMap("FileURL")
    public String fileURL;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadAddress")
    public String uploadAddress;

    @NameInMap("UploadAuth")
    public String uploadAuth;

    public static CreateUploadStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadStreamResponseBody self = new CreateUploadStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUploadStreamResponseBody setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public CreateUploadStreamResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public CreateUploadStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadStreamResponseBody setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public CreateUploadStreamResponseBody setUploadAuth(String uploadAuth) {
        this.uploadAuth = uploadAuth;
        return this;
    }
    public String getUploadAuth() {
        return this.uploadAuth;
    }

}
