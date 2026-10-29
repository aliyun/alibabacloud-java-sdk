// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class TriggerKnowledgeFileParseRequest extends TeaModel {
    /**
     * <p>The ADB instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp19aaaaaa****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the knowledge base file. You must specify either this parameter or FileLocation, but not both.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The URL of a single knowledge base file. You must specify either this parameter or FileId, but not both. You cannot specify a directory. The URL must uniquely point to an existing file.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/doc.pdf</p>
     */
    @NameInMap("FileLocation")
    public String fileLocation;

    public static TriggerKnowledgeFileParseRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerKnowledgeFileParseRequest self = new TriggerKnowledgeFileParseRequest();
        return TeaModel.build(map, self);
    }

    public TriggerKnowledgeFileParseRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public TriggerKnowledgeFileParseRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public TriggerKnowledgeFileParseRequest setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

}
