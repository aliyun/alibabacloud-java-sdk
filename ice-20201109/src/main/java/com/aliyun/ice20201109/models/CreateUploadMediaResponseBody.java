// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadMediaResponseBody extends TeaModel {
    /**
     * <p>The OSS URL of the file (without authentication).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://outin-***.oss-cn-north-2-gov-1.aliyuncs.com/sv/40360f05-181f63c3110-0004-cd8e-27f-de3c9.mp4">http://outin-***.oss-cn-north-2-gov-1.aliyuncs.com/sv/40360f05-181f63c3110-0004-cd8e-27f-de3c9.mp4</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>The media asset ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The media asset URL.</p>
     * <blockquote>
     * <p>If a CDN domain name is configured, a CDN URL is returned. Otherwise, an OSS URL is returned. If the returned MediaURL is inaccessible (403) in a browser, URL signing is enabled for the VOD domain name. Disable URL signing or generate a signing signature.</p>
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
     * <p>The upload address.</p>
     * <blockquote>
     * <p>The upload address returned by the operation is a Base64-encoded value. When you call an SDK or API to upload media assets, decode the value by using Base64 before use. Only uploads through the native OSS SDK or OSS API require you to parse UploadAddress.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJTZWN1cml0a2VuIjoiQ0FJU3p3TjF****</p>
     */
    @NameInMap("UploadAddress")
    public String uploadAddress;

    /**
     * <p>The upload credential.</p>
     * <blockquote>
     * <p>The upload credential returned by the operation is a Base64-encoded value. When you call an SDK or API to upload media assets, decode the value by using Base64 before use. Only uploads through the native OSS SDK or OSS API require you to parse UploadAuth.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJFbmRwb2ludCI6Imm****</p>
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
