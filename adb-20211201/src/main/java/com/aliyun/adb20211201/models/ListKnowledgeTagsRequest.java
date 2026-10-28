// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListKnowledgeTagsRequest extends TeaModel {
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
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2112314</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The location of the knowledge base document.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/doc.pdf</p>
     */
    @NameInMap("FileLocation")
    public String fileLocation;

    public static ListKnowledgeTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeTagsRequest self = new ListKnowledgeTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeTagsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListKnowledgeTagsRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ListKnowledgeTagsRequest setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

}
