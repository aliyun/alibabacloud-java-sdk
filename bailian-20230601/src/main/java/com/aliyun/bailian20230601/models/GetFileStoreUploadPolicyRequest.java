// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetFileStoreUploadPolicyRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileStoreId")
    public Long fileStoreId;

    @NameInMap("UserId")
    public String userId;

    public static GetFileStoreUploadPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileStoreUploadPolicyRequest self = new GetFileStoreUploadPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetFileStoreUploadPolicyRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetFileStoreUploadPolicyRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetFileStoreUploadPolicyRequest setFileStoreId(Long fileStoreId) {
        this.fileStoreId = fileStoreId;
        return this;
    }
    public Long getFileStoreId() {
        return this.fileStoreId;
    }

    public GetFileStoreUploadPolicyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
