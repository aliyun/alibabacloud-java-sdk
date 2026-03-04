// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateYikeAssetUploadResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4">http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>eyJTZWN1cml0a2VuIjoiQ0FJU3p3TjF****</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <strong>example:</strong>
     * <p>eyJFbmRwb2ludCI6Imm****</p>
     */
    @NameInMap("UploadAuth")
    public String uploadAuth;

    public static CreateYikeAssetUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeAssetUploadResponseBody self = new CreateYikeAssetUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateYikeAssetUploadResponseBody setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public CreateYikeAssetUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateYikeAssetUploadResponseBody setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public CreateYikeAssetUploadResponseBody setUploadAuth(String uploadAuth) {
        this.uploadAuth = uploadAuth;
        return this;
    }
    public String getUploadAuth() {
        return this.uploadAuth;
    }

}
