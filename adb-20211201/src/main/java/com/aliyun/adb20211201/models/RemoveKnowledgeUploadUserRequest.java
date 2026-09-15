// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RemoveKnowledgeUploadUserRequest extends TeaModel {
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
     * <p>The location of the knowledge base document.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/doc.pdf</p>
     */
    @NameInMap("FileLocation")
    public String fileLocation;

    /**
     * <p>The JSON string of the array of authorized users to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;alice&quot;,&quot;bob&quot;]</p>
     */
    @NameInMap("Users")
    public String users;

    public static RemoveKnowledgeUploadUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveKnowledgeUploadUserRequest self = new RemoveKnowledgeUploadUserRequest();
        return TeaModel.build(map, self);
    }

    public RemoveKnowledgeUploadUserRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public RemoveKnowledgeUploadUserRequest setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public RemoveKnowledgeUploadUserRequest setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

}
