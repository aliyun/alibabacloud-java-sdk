// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class MiguSourceUploadDTO extends TeaModel {
    /**
     * <p>The expiration time of the upload URL in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-28T12:00:00Z</p>
     */
    @NameInMap("expiresAt")
    public String expiresAt;

    /**
     * <p>The type of the source file (uppercase). Valid values: VIDEO, IMAGE, AUDIO, and TEXT.</p>
     * 
     * <strong>example:</strong>
     * <p>VIDEO</p>
     */
    @NameInMap("fileType")
    public String fileType;

    /**
     * <p>The unique identifier of the source file, used for subsequent generation tasks and downloads.</p>
     * 
     * <strong>example:</strong>
     * <p>3f2a1b9c8d7e4f60a1b2c3d4e5f6a7b8</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The OSS pre-signed upload URL. Use the PUT method to upload the file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://bucket.oss-cn-beijing.aliyuncs.com/pipeline/source/xxx.mp4?Expires=1700000000&Signature=xxx">https://bucket.oss-cn-beijing.aliyuncs.com/pipeline/source/xxx.mp4?Expires=1700000000&amp;Signature=xxx</a></p>
     */
    @NameInMap("uploadUrl")
    public String uploadUrl;

    public static MiguSourceUploadDTO build(java.util.Map<String, ?> map) throws Exception {
        MiguSourceUploadDTO self = new MiguSourceUploadDTO();
        return TeaModel.build(map, self);
    }

    public MiguSourceUploadDTO setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public MiguSourceUploadDTO setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public MiguSourceUploadDTO setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public MiguSourceUploadDTO setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

}
