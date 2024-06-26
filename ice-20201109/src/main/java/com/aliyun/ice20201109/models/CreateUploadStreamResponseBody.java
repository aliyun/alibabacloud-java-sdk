// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadStreamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4">http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>c469e944b5a856828dc2</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>eyJFbmRwb2ludCI6Imh0dHBzOi8vb3NzLWNuLXNoYW5naGFpLmFsaXl1bmNzLmNvbSIsIkJ1Y2tldCI6InN6aGQtdmlkZW8iLCJGaWxlTmFtZSI6InZvZC0yOTYzMWEvc3YvNTBmYTJlODQtMTgxMjdhZGRiMTcvNTBmYTJlODQtMTgxMjdhZGRiM***</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <strong>example:</strong>
     * <p>eyJBY2Nlc3NLZXlJZCI6IkxUQUk0Rm53bTk1dHdxQjMxR3IzSE5hRCIsIkFjY2Vzc0tleVNlY3JldCI6Ik9lWllKR0dTMTlkNkZaM1E3UVpJQmdmSVdnM3BPaiIsIkV4cGlyYXRpb24iOiI***</p>
     */
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
