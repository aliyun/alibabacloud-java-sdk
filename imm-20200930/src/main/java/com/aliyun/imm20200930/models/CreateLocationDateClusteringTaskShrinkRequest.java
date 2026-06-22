// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateLocationDateClusteringTaskShrinkRequest extends TeaModel {
    /**
     * <p>The dataset name. For more information, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The date clustering settings.</p>
     * <blockquote>
     * <p>Notice: Modifying this setting also affects existing spatio-temporal clusters in your <code>Dataset</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DateOptions")
    public String dateOptionsShrink;

    /**
     * <p>The location clustering settings.</p>
     * <blockquote>
     * <p>Notice: Modifying this setting also affects existing spatio-temporal clusters in your <code>Dataset</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LocationOptions")
    public String locationOptionsShrink;

    /**
     * <p>The message notification configuration. For more information, see Notification. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The project name. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Custom tags used to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;User&quot;: &quot;Jane&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>Custom information that is returned in the asynchronous notification message. This helps you associate the notification message with your system. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateLocationDateClusteringTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLocationDateClusteringTaskShrinkRequest self = new CreateLocationDateClusteringTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLocationDateClusteringTaskShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setDateOptionsShrink(String dateOptionsShrink) {
        this.dateOptionsShrink = dateOptionsShrink;
        return this;
    }
    public String getDateOptionsShrink() {
        return this.dateOptionsShrink;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setLocationOptionsShrink(String locationOptionsShrink) {
        this.locationOptionsShrink = locationOptionsShrink;
        return this;
    }
    public String getLocationOptionsShrink() {
        return this.locationOptionsShrink;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateLocationDateClusteringTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
