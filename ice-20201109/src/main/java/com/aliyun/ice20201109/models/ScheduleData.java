// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ScheduleData extends TeaModel {
    @NameInMap("AdBreaks")
    public java.util.List<ScheduleDataAdBreaks> adBreaks;

    @NameInMap("ApproximateDurationSeconds")
    public Long approximateDurationSeconds;

    @NameInMap("ApproximateStartTime")
    public String approximateStartTime;

    @NameInMap("EntryType")
    public String entryType;

    @NameInMap("ProgramName")
    public String programName;

    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    @NameInMap("SourceName")
    public String sourceName;

    @NameInMap("SourceType")
    public String sourceType;

    public static ScheduleData build(java.util.Map<String, ?> map) throws Exception {
        ScheduleData self = new ScheduleData();
        return TeaModel.build(map, self);
    }

    public ScheduleData setAdBreaks(java.util.List<ScheduleDataAdBreaks> adBreaks) {
        this.adBreaks = adBreaks;
        return this;
    }
    public java.util.List<ScheduleDataAdBreaks> getAdBreaks() {
        return this.adBreaks;
    }

    public ScheduleData setApproximateDurationSeconds(Long approximateDurationSeconds) {
        this.approximateDurationSeconds = approximateDurationSeconds;
        return this;
    }
    public Long getApproximateDurationSeconds() {
        return this.approximateDurationSeconds;
    }

    public ScheduleData setApproximateStartTime(String approximateStartTime) {
        this.approximateStartTime = approximateStartTime;
        return this;
    }
    public String getApproximateStartTime() {
        return this.approximateStartTime;
    }

    public ScheduleData setEntryType(String entryType) {
        this.entryType = entryType;
        return this;
    }
    public String getEntryType() {
        return this.entryType;
    }

    public ScheduleData setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public ScheduleData setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public ScheduleData setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public ScheduleData setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class ScheduleDataAdBreaks extends TeaModel {
        @NameInMap("MessageType")
        public String messageType;

        @NameInMap("OffsetMillis")
        public String offsetMillis;

        @NameInMap("SourceLocationName")
        public String sourceLocationName;

        @NameInMap("SourceName")
        public String sourceName;

        @NameInMap("SpliceInsertSettings")
        public String spliceInsertSettings;

        @NameInMap("TimeSignalSettings")
        public String timeSignalSettings;

        public static ScheduleDataAdBreaks build(java.util.Map<String, ?> map) throws Exception {
            ScheduleDataAdBreaks self = new ScheduleDataAdBreaks();
            return TeaModel.build(map, self);
        }

        public ScheduleDataAdBreaks setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public ScheduleDataAdBreaks setOffsetMillis(String offsetMillis) {
            this.offsetMillis = offsetMillis;
            return this;
        }
        public String getOffsetMillis() {
            return this.offsetMillis;
        }

        public ScheduleDataAdBreaks setSourceLocationName(String sourceLocationName) {
            this.sourceLocationName = sourceLocationName;
            return this;
        }
        public String getSourceLocationName() {
            return this.sourceLocationName;
        }

        public ScheduleDataAdBreaks setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ScheduleDataAdBreaks setSpliceInsertSettings(String spliceInsertSettings) {
            this.spliceInsertSettings = spliceInsertSettings;
            return this;
        }
        public String getSpliceInsertSettings() {
            return this.spliceInsertSettings;
        }

        public ScheduleDataAdBreaks setTimeSignalSettings(String timeSignalSettings) {
            this.timeSignalSettings = timeSignalSettings;
            return this;
        }
        public String getTimeSignalSettings() {
            return this.timeSignalSettings;
        }

    }

}
