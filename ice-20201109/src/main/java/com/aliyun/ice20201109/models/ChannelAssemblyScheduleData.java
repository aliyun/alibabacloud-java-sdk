// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ChannelAssemblyScheduleData extends TeaModel {
    @NameInMap("AdBreaks")
    public java.util.List<ChannelAssemblyScheduleDataAdBreaks> adBreaks;

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

    public static ChannelAssemblyScheduleData build(java.util.Map<String, ?> map) throws Exception {
        ChannelAssemblyScheduleData self = new ChannelAssemblyScheduleData();
        return TeaModel.build(map, self);
    }

    public ChannelAssemblyScheduleData setAdBreaks(java.util.List<ChannelAssemblyScheduleDataAdBreaks> adBreaks) {
        this.adBreaks = adBreaks;
        return this;
    }
    public java.util.List<ChannelAssemblyScheduleDataAdBreaks> getAdBreaks() {
        return this.adBreaks;
    }

    public ChannelAssemblyScheduleData setApproximateDurationSeconds(Long approximateDurationSeconds) {
        this.approximateDurationSeconds = approximateDurationSeconds;
        return this;
    }
    public Long getApproximateDurationSeconds() {
        return this.approximateDurationSeconds;
    }

    public ChannelAssemblyScheduleData setApproximateStartTime(String approximateStartTime) {
        this.approximateStartTime = approximateStartTime;
        return this;
    }
    public String getApproximateStartTime() {
        return this.approximateStartTime;
    }

    public ChannelAssemblyScheduleData setEntryType(String entryType) {
        this.entryType = entryType;
        return this;
    }
    public String getEntryType() {
        return this.entryType;
    }

    public ChannelAssemblyScheduleData setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public ChannelAssemblyScheduleData setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public ChannelAssemblyScheduleData setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public ChannelAssemblyScheduleData setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class ChannelAssemblyScheduleDataAdBreaks extends TeaModel {
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

        public static ChannelAssemblyScheduleDataAdBreaks build(java.util.Map<String, ?> map) throws Exception {
            ChannelAssemblyScheduleDataAdBreaks self = new ChannelAssemblyScheduleDataAdBreaks();
            return TeaModel.build(map, self);
        }

        public ChannelAssemblyScheduleDataAdBreaks setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public ChannelAssemblyScheduleDataAdBreaks setOffsetMillis(String offsetMillis) {
            this.offsetMillis = offsetMillis;
            return this;
        }
        public String getOffsetMillis() {
            return this.offsetMillis;
        }

        public ChannelAssemblyScheduleDataAdBreaks setSourceLocationName(String sourceLocationName) {
            this.sourceLocationName = sourceLocationName;
            return this;
        }
        public String getSourceLocationName() {
            return this.sourceLocationName;
        }

        public ChannelAssemblyScheduleDataAdBreaks setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ChannelAssemblyScheduleDataAdBreaks setSpliceInsertSettings(String spliceInsertSettings) {
            this.spliceInsertSettings = spliceInsertSettings;
            return this;
        }
        public String getSpliceInsertSettings() {
            return this.spliceInsertSettings;
        }

        public ChannelAssemblyScheduleDataAdBreaks setTimeSignalSettings(String timeSignalSettings) {
            this.timeSignalSettings = timeSignalSettings;
            return this;
        }
        public String getTimeSignalSettings() {
            return this.timeSignalSettings;
        }

    }

}
