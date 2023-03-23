// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class PublishRasterRequest extends TeaModel {
    @NameInMap("AcquisitionDate")
    public String acquisitionDate;

    @NameInMap("AttachDownloadUrl")
    public String attachDownloadUrl;

    @NameInMap("AttachFileType")
    public String attachFileType;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("Name")
    public String name;

    public static PublishRasterRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRasterRequest self = new PublishRasterRequest();
        return TeaModel.build(map, self);
    }

    public PublishRasterRequest setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
        return this;
    }
    public String getAcquisitionDate() {
        return this.acquisitionDate;
    }

    public PublishRasterRequest setAttachDownloadUrl(String attachDownloadUrl) {
        this.attachDownloadUrl = attachDownloadUrl;
        return this;
    }
    public String getAttachDownloadUrl() {
        return this.attachDownloadUrl;
    }

    public PublishRasterRequest setAttachFileType(String attachFileType) {
        this.attachFileType = attachFileType;
        return this;
    }
    public String getAttachFileType() {
        return this.attachFileType;
    }

    public PublishRasterRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public PublishRasterRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public PublishRasterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
