// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AddKnowledgeTagsRequest extends TeaModel {
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
     * <p>The location of the knowledge base document.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucketName/path/to/file.pdf</p>
     */
    @NameInMap("FileLocation")
    public String fileLocation;

    /**
     * <p>The JSON string of the tag array. Each tag must be in the following format: {&quot;tag_key&quot;:&quot;key_name&quot;,&quot;tag_value&quot;:&quot;value&quot;}.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;tag_key&quot;:&quot;biz.scene&quot;,&quot;tag_value&quot;:&quot;test&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static AddKnowledgeTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeTagsRequest self = new AddKnowledgeTagsRequest();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeTagsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AddKnowledgeTagsRequest setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public AddKnowledgeTagsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
