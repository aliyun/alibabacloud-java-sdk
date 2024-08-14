// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateUploadConfigRequest extends TeaModel {
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
     * <p>test.docx</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>datasetUpload</p>
     */
    @NameInMap("ParentDir")
    public String parentDir;

    public static GenerateUploadConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadConfigRequest self = new GenerateUploadConfigRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUploadConfigRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GenerateUploadConfigRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GenerateUploadConfigRequest setParentDir(String parentDir) {
        this.parentDir = parentDir;
        return this;
    }
    public String getParentDir() {
        return this.parentDir;
    }

}
