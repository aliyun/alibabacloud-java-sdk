// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchIndexFileMetaRequest extends TeaModel {
    /**
     * <p>The dataset name. For more information about how to obtain the dataset name, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>A list of OSS files. This is an array in JSON format that can contain up to 100 files.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Files")
    public java.util.List<InputFile> files;

    /**
     * <p>The notification configuration. For more information, click Notification. For the format of asynchronous notification messages, see the metadata indexing section in <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message formats</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The project name. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Custom user data. This parameter takes effect only when you specify an MNS configuration for the Notification parameter. The data is returned in the asynchronous notification message, which you can use to associate the message with your services. The maximum length is 2048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;id&quot;: &quot;test-id&quot;,
     *       &quot;name&quot;: &quot;test-name&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static BatchIndexFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchIndexFileMetaRequest self = new BatchIndexFileMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchIndexFileMetaRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchIndexFileMetaRequest setFiles(java.util.List<InputFile> files) {
        this.files = files;
        return this;
    }
    public java.util.List<InputFile> getFiles() {
        return this.files;
    }

    public BatchIndexFileMetaRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public BatchIndexFileMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchIndexFileMetaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
