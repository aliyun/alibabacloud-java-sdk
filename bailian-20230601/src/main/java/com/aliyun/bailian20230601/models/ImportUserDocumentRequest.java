// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ImportUserDocumentRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileStoreId")
    public Long fileStoreId;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("UserId")
    public String userId;

    public static ImportUserDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportUserDocumentRequest self = new ImportUserDocumentRequest();
        return TeaModel.build(map, self);
    }

    public ImportUserDocumentRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ImportUserDocumentRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ImportUserDocumentRequest setFileStoreId(Long fileStoreId) {
        this.fileStoreId = fileStoreId;
        return this;
    }
    public Long getFileStoreId() {
        return this.fileStoreId;
    }

    public ImportUserDocumentRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public ImportUserDocumentRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public ImportUserDocumentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
