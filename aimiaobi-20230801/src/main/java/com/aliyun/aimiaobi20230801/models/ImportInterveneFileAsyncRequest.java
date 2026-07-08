// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ImportInterveneFileAsyncRequest extends TeaModel {
    /**
     * <p>Unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Name of the uploaded file</p>
     * 
     * <strong>example:</strong>
     * <p>import.xls</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>OSS key of the file</p>
     * 
     * <strong>example:</strong>
     * <p>import.xls</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <p>File URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx/import.xls">https://xxx/import.xls</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    public static ImportInterveneFileAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportInterveneFileAsyncRequest self = new ImportInterveneFileAsyncRequest();
        return TeaModel.build(map, self);
    }

    public ImportInterveneFileAsyncRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ImportInterveneFileAsyncRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public ImportInterveneFileAsyncRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public ImportInterveneFileAsyncRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
