// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialCreateOnePictureResponseBody extends TeaModel {
    @NameInMap("AuditStatus")
    public String auditStatus;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Id")
    public Long id;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("Remarks")
    public String remarks;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Source")
    public String source;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Thumbnail")
    public String thumbnail;

    @NameInMap("UploadStatus")
    public String uploadStatus;

    @NameInMap("Uploader")
    public String uploader;

    public static MaterialCreateOnePictureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MaterialCreateOnePictureResponseBody self = new MaterialCreateOnePictureResponseBody();
        return TeaModel.build(map, self);
    }

    public MaterialCreateOnePictureResponseBody setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public MaterialCreateOnePictureResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public MaterialCreateOnePictureResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public MaterialCreateOnePictureResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MaterialCreateOnePictureResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MaterialCreateOnePictureResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MaterialCreateOnePictureResponseBody setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public MaterialCreateOnePictureResponseBody setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public MaterialCreateOnePictureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MaterialCreateOnePictureResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public MaterialCreateOnePictureResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public MaterialCreateOnePictureResponseBody setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public MaterialCreateOnePictureResponseBody setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
        return this;
    }
    public String getUploadStatus() {
        return this.uploadStatus;
    }

    public MaterialCreateOnePictureResponseBody setUploader(String uploader) {
        this.uploader = uploader;
        return this;
    }
    public String getUploader() {
        return this.uploader;
    }

}
