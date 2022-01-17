// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class UploadCommodityFileRequest extends TeaModel {
    @NameInMap("FileContentType")
    public String fileContentType;

    @NameInMap("FileResource")
    public String fileResource;

    @NameInMap("FileResourceType")
    public String fileResourceType;

    public static UploadCommodityFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCommodityFileRequest self = new UploadCommodityFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadCommodityFileRequest setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
        return this;
    }
    public String getFileContentType() {
        return this.fileContentType;
    }

    public UploadCommodityFileRequest setFileResource(String fileResource) {
        this.fileResource = fileResource;
        return this;
    }
    public String getFileResource() {
        return this.fileResource;
    }

    public UploadCommodityFileRequest setFileResourceType(String fileResourceType) {
        this.fileResourceType = fileResourceType;
        return this;
    }
    public String getFileResourceType() {
        return this.fileResourceType;
    }

}
