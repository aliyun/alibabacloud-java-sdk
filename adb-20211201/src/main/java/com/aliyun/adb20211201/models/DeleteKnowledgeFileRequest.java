// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeFileRequest extends TeaModel {
    /**
     * <p>The ID of the ADB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp19aaaaaa****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>2131213</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The path of the knowledge base document.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/doc.pdf</p>
     */
    @NameInMap("FileLocation")
    public String fileLocation;

    public static DeleteKnowledgeFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeFileRequest self = new DeleteKnowledgeFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeFileRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteKnowledgeFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DeleteKnowledgeFileRequest setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

}
