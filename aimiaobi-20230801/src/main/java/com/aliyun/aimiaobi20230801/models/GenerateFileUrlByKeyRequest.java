// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateFileUrlByKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>oss://default/oss-bucket-name/aimiaobi/2021/07/01/1625126400000/1.docx</p>
     */
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
