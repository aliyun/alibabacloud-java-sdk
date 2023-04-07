// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CopyCdsFileRequest extends TeaModel {
    @NameInMap("AutoRename")
    public Boolean autoRename;

    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("ParentFolderId")
    public String parentFolderId;

    @NameInMap("RegionId")
    public String regionId;

    public static CopyCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyCdsFileRequest self = new CopyCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public CopyCdsFileRequest setAutoRename(Boolean autoRename) {
        this.autoRename = autoRename;
        return this;
    }
    public Boolean getAutoRename() {
        return this.autoRename;
    }

    public CopyCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CopyCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public CopyCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CopyCdsFileRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public CopyCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
