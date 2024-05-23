// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateFileUrlByKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("FileKey")
    public String fileKey;

    @NameInMap("FileName")
    public String fileName;

    public static GenerateFileUrlByKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUrlByKeyRequest self = new GenerateFileUrlByKeyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateFileUrlByKeyRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GenerateFileUrlByKeyRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public GenerateFileUrlByKeyRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
