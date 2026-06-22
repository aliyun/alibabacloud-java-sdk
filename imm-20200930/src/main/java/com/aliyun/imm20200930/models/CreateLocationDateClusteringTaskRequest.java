// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateLocationDateClusteringTaskRequest extends TeaModel {
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
    public CreateLocationDateClusteringTaskRequestDateOptions dateOptions;

    /**
     * <p>The location clustering settings.</p>
     * <blockquote>
     * <p>Notice: Modifying this setting also affects existing spatio-temporal clusters in your <code>Dataset</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LocationOptions")
    public CreateLocationDateClusteringTaskRequestLocationOptions locationOptions;

    /**
     * <p>The message notification configuration. For more information, see Notification. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

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
    public java.util.Map<String, ?> tags;

    /**
     * <p>Custom information that is returned in the asynchronous notification message. This helps you associate the notification message with your system. The maximum length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateLocationDateClusteringTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLocationDateClusteringTaskRequest self = new CreateLocationDateClusteringTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLocationDateClusteringTaskRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateLocationDateClusteringTaskRequest setDateOptions(CreateLocationDateClusteringTaskRequestDateOptions dateOptions) {
        this.dateOptions = dateOptions;
        return this;
    }
    public CreateLocationDateClusteringTaskRequestDateOptions getDateOptions() {
        return this.dateOptions;
    }

    public CreateLocationDateClusteringTaskRequest setLocationOptions(CreateLocationDateClusteringTaskRequestLocationOptions locationOptions) {
        this.locationOptions = locationOptions;
        return this;
    }
    public CreateLocationDateClusteringTaskRequestLocationOptions getLocationOptions() {
        return this.locationOptions;
    }

    public CreateLocationDateClusteringTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateLocationDateClusteringTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateLocationDateClusteringTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateLocationDateClusteringTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateLocationDateClusteringTaskRequestDateOptions extends TeaModel {
        /**
         * <p>The maximum number of gap days allowed in a single spatio-temporal group. The value must be in the range of 0 to 99,999.</p>
         * <p>For example, a user has photos from March 4–5 and March 7, but not from March 6. If you assume that the photos from March 4–7 belong to the same trip, set this parameter to <code>1 day</code>. This allows the gap of <code>1 day</code> on March 6 to be included in the same spatio-temporal cluster.</p>
         * <p>Set this parameter to a value from 0 to 3.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GapDays")
        public Long gapDays;

        /**
         * <p>The maximum number of days in a single spatio-temporal group. The value must be in the range of 1 to 99,999. Clusters with more days than this value are not detected or stored.</p>
         * <p>For example, if a user takes photos in the same location for more than 15 consecutive days, this location might be their residence rather than a travel destination. If you want to exclude this time period and location from the spatio-temporal clusters, set this parameter to 15.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("MaxDays")
        public Long maxDays;

        /**
         * <p>The minimum number of days in a single spatio-temporal group. The value must be in the range of 1 to 99,999. Clusters with fewer days than this value are not detected or stored.</p>
         * <p>For example, if you do not want to include one-day trips in the generated groups, set this parameter to 2.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinDays")
        public Long minDays;

        public static CreateLocationDateClusteringTaskRequestDateOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateLocationDateClusteringTaskRequestDateOptions self = new CreateLocationDateClusteringTaskRequestDateOptions();
            return TeaModel.build(map, self);
        }

        public CreateLocationDateClusteringTaskRequestDateOptions setGapDays(Long gapDays) {
            this.gapDays = gapDays;
            return this;
        }
        public Long getGapDays() {
            return this.gapDays;
        }

        public CreateLocationDateClusteringTaskRequestDateOptions setMaxDays(Long maxDays) {
            this.maxDays = maxDays;
            return this;
        }
        public Long getMaxDays() {
            return this.maxDays;
        }

        public CreateLocationDateClusteringTaskRequestDateOptions setMinDays(Long minDays) {
            this.minDays = minDays;
            return this;
        }
        public Long getMinDays() {
            return this.minDays;
        }

    }

    public static class CreateLocationDateClusteringTaskRequestLocationOptions extends TeaModel {
        /**
         * <p>A list of administrative levels for grouping. You can select multiple levels.</p>
         * <p>For example, a user uploads photos taken in Hangzhou from March 3 to March 5 and photos taken in Jiaxing from March 6 to March 8. If you set this parameter to <code>[&quot;city&quot;, &quot;province&quot;]</code>, the following spatio-temporal clusters are generated:</p>
         * <ul>
         * <li><p>March 3 to March 5, Hangzhou</p>
         * </li>
         * <li><p>March 6 to March 8, Jiaxing</p>
         * </li>
         * <li><p>March 3 to March 8, Zhejiang</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("LocationDateClusterLevels")
        public java.util.List<String> locationDateClusterLevels;

        public static CreateLocationDateClusteringTaskRequestLocationOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateLocationDateClusteringTaskRequestLocationOptions self = new CreateLocationDateClusteringTaskRequestLocationOptions();
            return TeaModel.build(map, self);
        }

        public CreateLocationDateClusteringTaskRequestLocationOptions setLocationDateClusterLevels(java.util.List<String> locationDateClusterLevels) {
            this.locationDateClusterLevels = locationDateClusterLevels;
            return this;
        }
        public java.util.List<String> getLocationDateClusterLevels() {
            return this.locationDateClusterLevels;
        }

    }

}
