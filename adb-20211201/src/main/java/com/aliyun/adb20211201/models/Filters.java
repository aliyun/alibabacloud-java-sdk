// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class Filters extends TeaModel {
    @NameInMap("AppIdRegex")
    public String appIdRegex;

    @NameInMap("AppNameRegex")
    public String appNameRegex;

    @NameInMap("AppState")
    public String appState;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("ExecutionTimeRange")
    public FiltersExecutionTimeRange executionTimeRange;

    @NameInMap("SubmitTimeRange")
    public FiltersSubmitTimeRange submitTimeRange;

    @NameInMap("TermiatedTimeRange")
    public FiltersTermiatedTimeRange termiatedTimeRange;

    public static Filters build(java.util.Map<String, ?> map) throws Exception {
        Filters self = new Filters();
        return TeaModel.build(map, self);
    }

    public Filters setAppIdRegex(String appIdRegex) {
        this.appIdRegex = appIdRegex;
        return this;
    }
    public String getAppIdRegex() {
        return this.appIdRegex;
    }

    public Filters setAppNameRegex(String appNameRegex) {
        this.appNameRegex = appNameRegex;
        return this;
    }
    public String getAppNameRegex() {
        return this.appNameRegex;
    }

    public Filters setAppState(String appState) {
        this.appState = appState;
        return this;
    }
    public String getAppState() {
        return this.appState;
    }

    public Filters setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public Filters setExecutionTimeRange(FiltersExecutionTimeRange executionTimeRange) {
        this.executionTimeRange = executionTimeRange;
        return this;
    }
    public FiltersExecutionTimeRange getExecutionTimeRange() {
        return this.executionTimeRange;
    }

    public Filters setSubmitTimeRange(FiltersSubmitTimeRange submitTimeRange) {
        this.submitTimeRange = submitTimeRange;
        return this;
    }
    public FiltersSubmitTimeRange getSubmitTimeRange() {
        return this.submitTimeRange;
    }

    public Filters setTermiatedTimeRange(FiltersTermiatedTimeRange termiatedTimeRange) {
        this.termiatedTimeRange = termiatedTimeRange;
        return this;
    }
    public FiltersTermiatedTimeRange getTermiatedTimeRange() {
        return this.termiatedTimeRange;
    }

    public static class FiltersExecutionTimeRange extends TeaModel {
        @NameInMap("MaxTimeInSeconds")
        public Long maxTimeInSeconds;

        @NameInMap("MinTimeInSeconds")
        public Long minTimeInSeconds;

        public static FiltersExecutionTimeRange build(java.util.Map<String, ?> map) throws Exception {
            FiltersExecutionTimeRange self = new FiltersExecutionTimeRange();
            return TeaModel.build(map, self);
        }

        public FiltersExecutionTimeRange setMaxTimeInSeconds(Long maxTimeInSeconds) {
            this.maxTimeInSeconds = maxTimeInSeconds;
            return this;
        }
        public Long getMaxTimeInSeconds() {
            return this.maxTimeInSeconds;
        }

        public FiltersExecutionTimeRange setMinTimeInSeconds(Long minTimeInSeconds) {
            this.minTimeInSeconds = minTimeInSeconds;
            return this;
        }
        public Long getMinTimeInSeconds() {
            return this.minTimeInSeconds;
        }

    }

    public static class FiltersSubmitTimeRange extends TeaModel {
        @NameInMap("MaxTimeInMills")
        public Long maxTimeInMills;

        @NameInMap("MinTimeInMills")
        public Long minTimeInMills;

        public static FiltersSubmitTimeRange build(java.util.Map<String, ?> map) throws Exception {
            FiltersSubmitTimeRange self = new FiltersSubmitTimeRange();
            return TeaModel.build(map, self);
        }

        public FiltersSubmitTimeRange setMaxTimeInMills(Long maxTimeInMills) {
            this.maxTimeInMills = maxTimeInMills;
            return this;
        }
        public Long getMaxTimeInMills() {
            return this.maxTimeInMills;
        }

        public FiltersSubmitTimeRange setMinTimeInMills(Long minTimeInMills) {
            this.minTimeInMills = minTimeInMills;
            return this;
        }
        public Long getMinTimeInMills() {
            return this.minTimeInMills;
        }

    }

    public static class FiltersTermiatedTimeRange extends TeaModel {
        @NameInMap("MaxTimeInMills")
        public Long maxTimeInMills;

        @NameInMap("MinTimeInMills")
        public Long minTimeInMills;

        public static FiltersTermiatedTimeRange build(java.util.Map<String, ?> map) throws Exception {
            FiltersTermiatedTimeRange self = new FiltersTermiatedTimeRange();
            return TeaModel.build(map, self);
        }

        public FiltersTermiatedTimeRange setMaxTimeInMills(Long maxTimeInMills) {
            this.maxTimeInMills = maxTimeInMills;
            return this;
        }
        public Long getMaxTimeInMills() {
            return this.maxTimeInMills;
        }

        public FiltersTermiatedTimeRange setMinTimeInMills(Long minTimeInMills) {
            this.minTimeInMills = minTimeInMills;
            return this;
        }
        public Long getMinTimeInMills() {
            return this.minTimeInMills;
        }

    }

}
