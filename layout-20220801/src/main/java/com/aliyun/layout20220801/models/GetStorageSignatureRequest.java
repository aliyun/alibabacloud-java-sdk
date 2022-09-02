// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class GetStorageSignatureRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileSize")
    public String fileSize;

    @NameInMap("Type")
    public String type;

    public static GetStorageSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageSignatureRequest self = new GetStorageSignatureRequest();
        return TeaModel.build(map, self);
    }

    public GetStorageSignatureRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public GetStorageSignatureRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetStorageSignatureRequest setFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public String getFileSize() {
        return this.fileSize;
    }

    public GetStorageSignatureRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
