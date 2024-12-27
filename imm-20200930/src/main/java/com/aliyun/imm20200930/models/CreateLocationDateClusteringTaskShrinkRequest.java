// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateLocationDateClusteringTaskShrinkRequest extends TeaModel {
    /**
     * <p>The name of the dataset.<a href="~~478160~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The date configurations for clustering.</p>
     * <blockquote>
     * <p> Adjusting these configurations affects existing spatiotemporal clusters for the dataset.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DateOptions")
    public String dateOptionsShrink;

    /**
     * <p>The geolocation configurations for clustering.</p>
     * <blockquote>
     * <p> Adjusting these configurations affects existing spatiotemporal clusters for the dataset.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LocationOptions")
    public String locationOptionsShrink;

    /**
     * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;User&quot;: &quot;Jane&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The custom information, which is returned in an asynchronous notification and facilitates notification management. The maximum length of the value is 2,048 bytes.</p>
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
