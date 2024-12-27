// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateLocationDateClusteringTaskRequest extends TeaModel {
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
    public CreateLocationDateClusteringTaskRequestDateOptions dateOptions;

    /**
     * <p>The geolocation configurations for clustering.</p>
     * <blockquote>
     * <p> Adjusting these configurations affects existing spatiotemporal clusters for the dataset.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LocationOptions")
    public CreateLocationDateClusteringTaskRequestLocationOptions locationOptions;

    /**
     * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

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
    public java.util.Map<String, ?> tags;

    /**
     * <p>The custom information, which is returned in an asynchronous notification and facilitates notification management. The maximum length of the value is 2,048 bytes.</p>
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
         * <p>The maximum number of days allowed in a gap for a single spatiotemporal cluster. Valid values: 0 to 99999.</p>
         * <p>For example, if travel photos were produced on March 4, 5, and 7, 2024, but not on Marh 6, 2024, and you set the parameter to 1, IMM considers the travel spanning the date range from March 4, 2024 to March 7, 2024 and includes photos within the data range in the same cluster.````</p>
         * <p>We recommend that you set the parameter to a value within the range from 0 to 3.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GapDays")
        public Long gapDays;

        /**
         * <p>The maximum number of days that a single spatiotemporal cluster can span. Valid values: 1 to 99999. IMM does not create a cluster that spans more than the maximum number of days.</p>
         * <p>For example, if you want to create travel photo clusters, you may want to exclude photos that were taken within 15 consecutive days in the same city, because it is likely that these photos were not taken during a travel. In this case, you can set the parameter to 15 to exclude this time range and location from the clustering task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("MaxDays")
        public Long maxDays;

        /**
         * <p>The minimum number of days that a single spatiotemporal cluster can span. Valid values: 1 to 99999. IMM does not create a cluster that spans less than the minimum number of days.</p>
         * <p>For example, if you do not want a one-day tour cluster, you can set the parameter to 2.</p>
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
         * <p>The administrative division levels. You can specify multiple administrative division levels.</p>
         * <p>For example, you uploaded photos that were taken from March 3, 2024 to March 5, 2024 in Hangzhou and photos that were taken from March 6, 2024 to March 8, 2024 in Jiaxing. When you call the operation and set the parameter to <code>[&quot;city&quot;, &quot;province&quot;]</code>, the following spatiotemporal clusters are created from these photos:</p>
         * <ul>
         * <li>March 3, 2024 to March 5, 2024, Hangzhou</li>
         * <li>March 6, 2024 to March 8, 2024, Jiaxing</li>
         * <li>March 3, 2024 to March 8, 2024, Zhejiang</li>
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
