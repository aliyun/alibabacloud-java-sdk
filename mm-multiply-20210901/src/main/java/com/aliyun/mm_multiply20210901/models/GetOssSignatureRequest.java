// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetOssSignatureRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Size")
    public Long size;

    public static GetOssSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssSignatureRequest self = new GetOssSignatureRequest();
        return TeaModel.build(map, self);
    }

    public GetOssSignatureRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetOssSignatureRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetOssSignatureRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
