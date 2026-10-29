// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ForkKnowledgeFileRequest extends TeaModel {
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
     * <p>The ID of the knowledge base file. You must specify either this parameter or FileLocation, but not both. Use a decimal positive integer string without leading zeros. Valid values: 1 to 9223372036854775807.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The address of a single file in the knowledge base. You must specify either this parameter or FileId, but not both. You cannot specify a directory. The address must uniquely locate an active file.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/doc.pdf</p>
     */
    @NameInMap("FileLocation")
    public String fileLocation;

    /**
     * <p>The initial business tags for the new record. Use a JSON string of a JSON object or an array of tag_key/tag_value objects. If omitted, the source tags are not inherited.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;biz.game&quot;:&quot;yys&quot;}</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The initial authorized user for the new record. You can pass a JSON string of a single user identifier or a user array. If omitted, no initial user authorization is applied, and the source authorization is not inherited.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;alice&quot;,&quot;bob&quot;]</p>
     */
    @NameInMap("UploadUser")
    public String uploadUser;

    public static ForkKnowledgeFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ForkKnowledgeFileRequest self = new ForkKnowledgeFileRequest();
        return TeaModel.build(map, self);
    }

    public ForkKnowledgeFileRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ForkKnowledgeFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ForkKnowledgeFileRequest setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public ForkKnowledgeFileRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ForkKnowledgeFileRequest setUploadUser(String uploadUser) {
        this.uploadUser = uploadUser;
        return this;
    }
    public String getUploadUser() {
        return this.uploadUser;
    }

}
