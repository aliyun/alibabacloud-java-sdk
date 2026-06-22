// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchIndexFileMetaShrinkRequest extends TeaModel {
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
    public String filesShrink;

    /**
     * <p>The notification configuration. For more information, click Notification. For the format of asynchronous notification messages, see the metadata indexing section in <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message formats</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

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

    public static BatchIndexFileMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchIndexFileMetaShrinkRequest self = new BatchIndexFileMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchIndexFileMetaShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public BatchIndexFileMetaShrinkRequest setFilesShrink(String filesShrink) {
        this.filesShrink = filesShrink;
        return this;
    }
    public String getFilesShrink() {
        return this.filesShrink;
    }

    public BatchIndexFileMetaShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public BatchIndexFileMetaShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchIndexFileMetaShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
