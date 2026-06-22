// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class IndexFileMetaRequest extends TeaModel {
    /**
     * <p>The name of the dataset. To get the dataset name, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The file to be indexed, in JSON format. For more information, see the struct definition.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("File")
    public InputFile file;

    /**
     * <p>The message notification configuration. For more information, see Notification. For the format of the asynchronous notification message, see the Metadata Indexing section in <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message formats</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The name of the project. To get the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Custom information that is returned in the asynchronous notification message. This helps you associate the notification with your services. The maximum length is 2048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static IndexFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        IndexFileMetaRequest self = new IndexFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public IndexFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public IndexFileMetaRequest setFile(InputFile file) {
        this.file = file;
        return this;
    }
    public InputFile getFile() {
        return this.file;
    }

    public IndexFileMetaRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public IndexFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public IndexFileMetaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
