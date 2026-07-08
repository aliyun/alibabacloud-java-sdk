// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateUploadConfigRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.docx</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The parent folder.</p>
     * <ul>
     * <li><p>materialDocument: The Material Library for AI Writing Assistant.</p>
     * </li>
     * <li><p>datasetUpload: The dataset for AI Search.</p>
     * </li>
     * <li><p>intervenes: Interventions.</p>
     * </li>
     * <li><p>temp: A temporary upload folder. Files in this folder are released periodically.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset</p>
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
