// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFileUploadSignedUrlRequest extends TeaModel {
    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("Filename")
    public String filename;

    @NameInMap("Size")
    public Long size;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DescribeFileUploadSignedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileUploadSignedUrlRequest self = new DescribeFileUploadSignedUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileUploadSignedUrlRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public DescribeFileUploadSignedUrlRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DescribeFileUploadSignedUrlRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public DescribeFileUploadSignedUrlRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DescribeFileUploadSignedUrlRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
