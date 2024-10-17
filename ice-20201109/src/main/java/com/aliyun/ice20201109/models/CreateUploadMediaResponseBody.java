// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadMediaResponseBody extends TeaModel {
    /**
     * <p>The OSS URL of the file. The URL does not contain the information used for authentication.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://outin-***.oss-cn-north-2-gov-1.aliyuncs.com/sv/40360f05-181f63c3110-0004-cd8e-27f-de3c9.mp4">http://outin-***.oss-cn-north-2-gov-1.aliyuncs.com/sv/40360f05-181f63c3110-0004-cd8e-27f-de3c9.mp4</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>The ID of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The URL of the media asset.</p>
     * <blockquote>
     * <p> If a domain name for Alibaba Cloud CDN (CDN) is specified, a CDN URL is returned. Otherwise, an OSS URL is returned. If the HTTP status code 403 is returned when you access the URL from your browser, the URL authentication feature of ApsaraVideo VOD is enabled. To resolve this issue, disable URL authentication or generate an authentication signature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxq-live-playback.oss-cn-shanghai.aliyuncs.com/capture/5d96d2b4-111b-4e5d-a0e5-20f44405bb55.mp4">https://xxq-live-playback.oss-cn-shanghai.aliyuncs.com/capture/5d96d2b4-111b-4e5d-a0e5-20f44405bb55.mp4</a></p>
     */
    @NameInMap("MediaURL")
    public String mediaURL;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E84BE44-58A7-<strong><strong>-</strong></strong>-FBEBEA16EF94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload URL.</p>
     * <blockquote>
     * <p> The returned upload URL is a Base64-encoded URL. You must decode the Base64-encoded upload URL before you use an SDK or call an API operation to upload media files. You need to parse UploadAddress only if you use OSS SDK or call an OSS API operation to upload media files.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJFbmRwb2ludCI6Imh0dHBzOi8vb3NzLWNuLXNoYW5naGFpLmFsaXl1bmNzLmNvbSIsIkJ1Y2tldCI6InN6aGQtdmlkZW8iLCJGaWxlTmFtZSI6InZvZC0yOTYzMWEvc3YvNTBmYTJlODQtMTgxMjdhZGRiMTcvNTBmYTJlODQtMTgxMjdhZGRiM***</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>The upload credential.</p>
     * <blockquote>
     * <p> The returned upload credential is a Base64-encoded value. You must decode the Base64-encoded upload URL before you use an SDK or call an API operation to upload media files. You need to parse UploadAuth only if you use OSS SDK or call an OSS API operation to upload media files.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJBY2Nlc3NLZXlJZCI6IkxUQUk0Rm53bTk1dHdxQjMxR3IzSE5hRCIsIkFjY2Vzc0tleVNlY3JldCI6Ik9lWllKR0dTMTlkNkZaM1E3UVpJQmdmSVdnM3BPaiIsIkV4cGlyYXRpb24iOiI***</p>
     */
    @NameInMap("UploadAuth")
    public String uploadAuth;

    public static CreateUploadMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadMediaResponseBody self = new CreateUploadMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUploadMediaResponseBody setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public CreateUploadMediaResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public CreateUploadMediaResponseBody setMediaURL(String mediaURL) {
        this.mediaURL = mediaURL;
        return this;
    }
    public String getMediaURL() {
        return this.mediaURL;
    }

    public CreateUploadMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUploadMediaResponseBody setUploadAddress(String uploadAddress) {
        this.uploadAddress = uploadAddress;
        return this;
    }
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    public CreateUploadMediaResponseBody setUploadAuth(String uploadAuth) {
        this.uploadAuth = uploadAuth;
        return this;
    }
    public String getUploadAuth() {
        return this.uploadAuth;
    }

}
