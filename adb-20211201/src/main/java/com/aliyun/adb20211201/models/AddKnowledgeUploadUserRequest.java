// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AddKnowledgeUploadUserRequest extends TeaModel {
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
     * <p>3214123</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The path of the knowledge base document.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucketName/path/to/file.pdf</p>
     */
    @NameInMap("FileLocation")
    public String fileLocation;

    /**
     * <p>The JSON string of the authorized users array.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;alice&quot;,&quot;bob&quot;]</p>
     */
    @NameInMap("Users")
    public String users;

    public static AddKnowledgeUploadUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeUploadUserRequest self = new AddKnowledgeUploadUserRequest();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeUploadUserRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AddKnowledgeUploadUserRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AddKnowledgeUploadUserRequest setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public AddKnowledgeUploadUserRequest setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

}
