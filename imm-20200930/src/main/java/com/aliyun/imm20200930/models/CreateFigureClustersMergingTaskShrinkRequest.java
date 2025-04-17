// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFigureClustersMergingTaskShrinkRequest extends TeaModel {
    /**
     * <p>The name of the dataset. For more information, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset001</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The ID of the source group. You must specify either From or Froms, but not both.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster-2ab85905-23ba-4632-b2d8-1c21cfe****</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The IDs of source clustering groups. You must specify either From or Froms, but not both. You can specify up to 100 task IDs.</p>
     */
    @NameInMap("Froms")
    public String fromsShrink;

    /**
     * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The custom tags, which can be used to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;val&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The ID of the destination clustering group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster-4a3a71c1-c092-4788-8826-2f65d17****</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>The custom data, which is returned in an asynchronous notification and facilitates notification management. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateFigureClustersMergingTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFigureClustersMergingTaskShrinkRequest self = new CreateFigureClustersMergingTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFigureClustersMergingTaskShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setFromsShrink(String fromsShrink) {
        this.fromsShrink = fromsShrink;
        return this;
    }
    public String getFromsShrink() {
        return this.fromsShrink;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public CreateFigureClustersMergingTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
