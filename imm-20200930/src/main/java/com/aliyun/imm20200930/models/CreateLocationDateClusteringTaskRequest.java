// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateLocationDateClusteringTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DateOptions")
    public CreateLocationDateClusteringTaskRequestDateOptions dateOptions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LocationOptions")
    public CreateLocationDateClusteringTaskRequestLocationOptions locationOptions;

    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

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
         * <p>This parameter is required.</p>
         */
        @NameInMap("GapDays")
        public Long gapDays;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MaxDays")
        public Long maxDays;

        /**
         * <p>This parameter is required.</p>
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
