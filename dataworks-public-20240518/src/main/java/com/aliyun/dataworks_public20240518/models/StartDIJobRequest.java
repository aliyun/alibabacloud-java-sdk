// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StartDIJobRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceToRerun")
    public Boolean forceToRerun;

    @NameInMap("RealtimeStartSettings")
    public StartDIJobRequestRealtimeStartSettings realtimeStartSettings;

    public static StartDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDIJobRequest self = new StartDIJobRequest();
        return TeaModel.build(map, self);
    }

    public StartDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public StartDIJobRequest setForceToRerun(Boolean forceToRerun) {
        this.forceToRerun = forceToRerun;
        return this;
    }
    public Boolean getForceToRerun() {
        return this.forceToRerun;
    }

    public StartDIJobRequest setRealtimeStartSettings(StartDIJobRequestRealtimeStartSettings realtimeStartSettings) {
        this.realtimeStartSettings = realtimeStartSettings;
        return this;
    }
    public StartDIJobRequestRealtimeStartSettings getRealtimeStartSettings() {
        return this.realtimeStartSettings;
    }

    public static class StartDIJobRequestRealtimeStartSettingsFailoverSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UpperLimit")
        public Long upperLimit;

        public static StartDIJobRequestRealtimeStartSettingsFailoverSettings build(java.util.Map<String, ?> map) throws Exception {
            StartDIJobRequestRealtimeStartSettingsFailoverSettings self = new StartDIJobRequestRealtimeStartSettingsFailoverSettings();
            return TeaModel.build(map, self);
        }

        public StartDIJobRequestRealtimeStartSettingsFailoverSettings setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public StartDIJobRequestRealtimeStartSettingsFailoverSettings setUpperLimit(Long upperLimit) {
            this.upperLimit = upperLimit;
            return this;
        }
        public Long getUpperLimit() {
            return this.upperLimit;
        }

    }

    public static class StartDIJobRequestRealtimeStartSettings extends TeaModel {
        @NameInMap("FailoverSettings")
        public StartDIJobRequestRealtimeStartSettingsFailoverSettings failoverSettings;

        /**
         * <strong>example:</strong>
         * <p>1671516776</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static StartDIJobRequestRealtimeStartSettings build(java.util.Map<String, ?> map) throws Exception {
            StartDIJobRequestRealtimeStartSettings self = new StartDIJobRequestRealtimeStartSettings();
            return TeaModel.build(map, self);
        }

        public StartDIJobRequestRealtimeStartSettings setFailoverSettings(StartDIJobRequestRealtimeStartSettingsFailoverSettings failoverSettings) {
            this.failoverSettings = failoverSettings;
            return this;
        }
        public StartDIJobRequestRealtimeStartSettingsFailoverSettings getFailoverSettings() {
            return this.failoverSettings;
        }

        public StartDIJobRequestRealtimeStartSettings setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
