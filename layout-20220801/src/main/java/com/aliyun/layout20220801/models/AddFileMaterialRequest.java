// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class AddFileMaterialRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileSize")
    public String fileSize;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("ThumbUrl")
    public String thumbUrl;

    @NameInMap("Title")
    public String title;

    @NameInMap("TreeNodeId")
    public String treeNodeId;

    @NameInMap("Type")
    public String type;

    public static AddFileMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFileMaterialRequest self = new AddFileMaterialRequest();
        return TeaModel.build(map, self);
    }

    public AddFileMaterialRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public AddFileMaterialRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AddFileMaterialRequest setFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public String getFileSize() {
        return this.fileSize;
    }

    public AddFileMaterialRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AddFileMaterialRequest setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }
    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public AddFileMaterialRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AddFileMaterialRequest setTreeNodeId(String treeNodeId) {
        this.treeNodeId = treeNodeId;
        return this;
    }
    public String getTreeNodeId() {
        return this.treeNodeId;
    }

    public AddFileMaterialRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
