// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetMediaResourceIdRequest extends TeaModel {
    @NameInMap("ExtendInfo")
    public String extendInfo;

    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("Memo")
    public String memo;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("ResourceType")
    public Integer resourceType;

    public static GetMediaResourceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResourceIdRequest self = new GetMediaResourceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaResourceIdRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public GetMediaResourceIdRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public GetMediaResourceIdRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public GetMediaResourceIdRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public GetMediaResourceIdRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

}
