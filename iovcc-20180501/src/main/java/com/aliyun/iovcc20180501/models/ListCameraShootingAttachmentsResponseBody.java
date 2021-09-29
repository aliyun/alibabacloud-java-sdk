// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListCameraShootingAttachmentsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Attachments")
    public java.util.List<ListCameraShootingAttachmentsResponseBodyAttachments> attachments;

    public static ListCameraShootingAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCameraShootingAttachmentsResponseBody self = new ListCameraShootingAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCameraShootingAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCameraShootingAttachmentsResponseBody setAttachments(java.util.List<ListCameraShootingAttachmentsResponseBodyAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<ListCameraShootingAttachmentsResponseBodyAttachments> getAttachments() {
        return this.attachments;
    }

    public static class ListCameraShootingAttachmentsResponseBodyAttachments extends TeaModel {
        // 主键id
        @NameInMap("Id")
        public Long id;

        // 文件id
        @NameInMap("FileId")
        public String fileId;

        // 文件类型，0-图片，1-视频
        @NameInMap("FileType")
        public Long fileType;

        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件长度，单位为字节
        @NameInMap("FileLength")
        public Long fileLength;

        // 拍摄时间
        @NameInMap("ShootingTime")
        public Long shootingTime;

        // 附件地址
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        public static ListCameraShootingAttachmentsResponseBodyAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListCameraShootingAttachmentsResponseBodyAttachments self = new ListCameraShootingAttachmentsResponseBodyAttachments();
            return TeaModel.build(map, self);
        }

        public ListCameraShootingAttachmentsResponseBodyAttachments setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCameraShootingAttachmentsResponseBodyAttachments setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListCameraShootingAttachmentsResponseBodyAttachments setFileType(Long fileType) {
            this.fileType = fileType;
            return this;
        }
        public Long getFileType() {
            return this.fileType;
        }

        public ListCameraShootingAttachmentsResponseBodyAttachments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListCameraShootingAttachmentsResponseBodyAttachments setFileLength(Long fileLength) {
            this.fileLength = fileLength;
            return this;
        }
        public Long getFileLength() {
            return this.fileLength;
        }

        public ListCameraShootingAttachmentsResponseBodyAttachments setShootingTime(Long shootingTime) {
            this.shootingTime = shootingTime;
            return this;
        }
        public Long getShootingTime() {
            return this.shootingTime;
        }

        public ListCameraShootingAttachmentsResponseBodyAttachments setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

    }

}
