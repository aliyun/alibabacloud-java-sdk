// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StartDIJobRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated. Use the Id parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    /**
     * <p>Deprecated</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceToRerun")
    public Boolean forceToRerun;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The settings for starting real-time synchronization.</p>
     */
    @NameInMap("RealtimeStartSettings")
    public StartDIJobRequestRealtimeStartSettings realtimeStartSettings;

    public static StartDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDIJobRequest self = new StartDIJobRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
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

    public StartDIJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
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
         * <p>The failover interval. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        @Deprecated
        public Long interval;

        /**
         * <p>The maximum number of failovers allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UpperLimit")
        @Deprecated
        public Long upperLimit;

        public static StartDIJobRequestRealtimeStartSettingsFailoverSettings build(java.util.Map<String, ?> map) throws Exception {
            StartDIJobRequestRealtimeStartSettingsFailoverSettings self = new StartDIJobRequestRealtimeStartSettingsFailoverSettings();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public StartDIJobRequestRealtimeStartSettingsFailoverSettings setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        @Deprecated
        public StartDIJobRequestRealtimeStartSettingsFailoverSettings setUpperLimit(Long upperLimit) {
            this.upperLimit = upperLimit;
            return this;
        }
        public Long getUpperLimit() {
            return this.upperLimit;
        }

    }

    public static class StartDIJobRequestRealtimeStartSettings extends TeaModel {
        /**
         * <p>The failover settings.</p>
         */
        @NameInMap("FailoverSettings")
        @Deprecated
        public StartDIJobRequestRealtimeStartSettingsFailoverSettings failoverSettings;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1671516776</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static StartDIJobRequestRealtimeStartSettings build(java.util.Map<String, ?> map) throws Exception {
            StartDIJobRequestRealtimeStartSettings self = new StartDIJobRequestRealtimeStartSettings();
            return TeaModel.build(map, self);
        }

        @Deprecated
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
