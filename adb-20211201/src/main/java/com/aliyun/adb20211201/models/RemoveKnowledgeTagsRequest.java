// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RemoveKnowledgeTagsRequest extends TeaModel {
    /**
     * <p>The database cluster ID.</p>
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
     * <p>2131234</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The knowledge base document location.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/doc.pdf</p>
     */
    @NameInMap("FileLocation")
    public String fileLocation;

    /**
     * <p>The JSON string of the tag array to be deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;tag_key&quot;:&quot;biz.scene&quot;,&quot;tag_value&quot;:&quot;test&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static RemoveKnowledgeTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveKnowledgeTagsRequest self = new RemoveKnowledgeTagsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveKnowledgeTagsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public RemoveKnowledgeTagsRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public RemoveKnowledgeTagsRequest setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public RemoveKnowledgeTagsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
