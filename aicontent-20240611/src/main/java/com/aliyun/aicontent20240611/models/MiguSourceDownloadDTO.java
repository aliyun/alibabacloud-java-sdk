// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class MiguSourceDownloadDTO extends TeaModel {
    /**
     * <p>The OSS pre-signed download URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://bucket.oss-cn-beijing.aliyuncs.com/pipeline/source/xxx.mp4?Expires=1700000000&Signature=xxx">https://bucket.oss-cn-beijing.aliyuncs.com/pipeline/source/xxx.mp4?Expires=1700000000&amp;Signature=xxx</a></p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <p>The expiration time of the download URL, in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-28T12:00:00Z</p>
     */
    @NameInMap("expiresAt")
    public String expiresAt;

    /**
     * <p>The download request method. The value is fixed to GET.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>The unique identifier of the source file.</p>
     * 
     * <strong>example:</strong>
     * <p>3f2a1b9c8d7e4f60a1b2c3d4e5f6a7b8</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    public static MiguSourceDownloadDTO build(java.util.Map<String, ?> map) throws Exception {
        MiguSourceDownloadDTO self = new MiguSourceDownloadDTO();
        return TeaModel.build(map, self);
    }

    public MiguSourceDownloadDTO setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public MiguSourceDownloadDTO setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public MiguSourceDownloadDTO setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public MiguSourceDownloadDTO setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}
