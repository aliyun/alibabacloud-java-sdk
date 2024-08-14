// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ImportInterveneFileRequest extends TeaModel {
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
     * <p>import.xls</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <strong>example:</strong>
     * <p>import.xsl</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxx/xxx.xls">http://xxx/xxx.xls</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    public static ImportInterveneFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportInterveneFileRequest self = new ImportInterveneFileRequest();
        return TeaModel.build(map, self);
    }

    public ImportInterveneFileRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ImportInterveneFileRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public ImportInterveneFileRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public ImportInterveneFileRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
