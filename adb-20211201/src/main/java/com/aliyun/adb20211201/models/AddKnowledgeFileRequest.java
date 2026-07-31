// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AddKnowledgeFileRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp19aaaaaa****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The file address. Currently, only OSS paths are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket_name/file/path</p>
     */
    @NameInMap("FileLocation")
    public String fileLocation;

    /**
     * <p>The file type.</p>
     * 
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>Specifies whether the file is a folder.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDir")
    public Boolean isDir;

    /**
     * <p>The file tags in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;game&quot;}</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The user who uploads the knowledge base file.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("UploadUser")
    public String uploadUser;

    public static AddKnowledgeFileRequest build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeFileRequest self = new AddKnowledgeFileRequest();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeFileRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AddKnowledgeFileRequest setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }
    public String getFileLocation() {
        return this.fileLocation;
    }

    public AddKnowledgeFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public AddKnowledgeFileRequest setIsDir(Boolean isDir) {
        this.isDir = isDir;
        return this;
    }
    public Boolean getIsDir() {
        return this.isDir;
    }

    public AddKnowledgeFileRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public AddKnowledgeFileRequest setUploadUser(String uploadUser) {
        this.uploadUser = uploadUser;
        return this;
    }
    public String getUploadUser() {
        return this.uploadUser;
    }

}
