// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class Program extends TeaModel {
    @NameInMap("AdBreaks")
    public java.util.List<ProgramAdBreaks> adBreaks;

    @NameInMap("Arn")
    public String arn;

    @NameInMap("ChannelName")
    public String channelName;

    @NameInMap("ClipRange")
    public String clipRange;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("ProgramName")
    public String programName;

    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    @NameInMap("SourceName")
    public String sourceName;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Transition")
    public String transition;

    public static Program build(java.util.Map<String, ?> map) throws Exception {
        Program self = new Program();
        return TeaModel.build(map, self);
    }

    public Program setAdBreaks(java.util.List<ProgramAdBreaks> adBreaks) {
        this.adBreaks = adBreaks;
        return this;
    }
    public java.util.List<ProgramAdBreaks> getAdBreaks() {
        return this.adBreaks;
    }

    public Program setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public Program setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public Program setClipRange(String clipRange) {
        this.clipRange = clipRange;
        return this;
    }
    public String getClipRange() {
        return this.clipRange;
    }

    public Program setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Program setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Program setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public Program setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public Program setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public Program setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public Program setTransition(String transition) {
        this.transition = transition;
        return this;
    }
    public String getTransition() {
        return this.transition;
    }

    public static class ProgramAdBreaks extends TeaModel {
        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("MessageType")
        public String messageType;

        @NameInMap("OffsetMillis")
        public Long offsetMillis;

        @NameInMap("ProgramName")
        public String programName;

        @NameInMap("SourceLocationName")
        public String sourceLocationName;

        @NameInMap("SourceName")
        public String sourceName;

        @NameInMap("SpliceInsertSettings")
        public String spliceInsertSettings;

        @NameInMap("TimeSignalSettings")
        public String timeSignalSettings;

        public static ProgramAdBreaks build(java.util.Map<String, ?> map) throws Exception {
            ProgramAdBreaks self = new ProgramAdBreaks();
            return TeaModel.build(map, self);
        }

        public ProgramAdBreaks setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public ProgramAdBreaks setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public ProgramAdBreaks setOffsetMillis(Long offsetMillis) {
            this.offsetMillis = offsetMillis;
            return this;
        }
        public Long getOffsetMillis() {
            return this.offsetMillis;
        }

        public ProgramAdBreaks setProgramName(String programName) {
            this.programName = programName;
            return this;
        }
        public String getProgramName() {
            return this.programName;
        }

        public ProgramAdBreaks setSourceLocationName(String sourceLocationName) {
            this.sourceLocationName = sourceLocationName;
            return this;
        }
        public String getSourceLocationName() {
            return this.sourceLocationName;
        }

        public ProgramAdBreaks setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ProgramAdBreaks setSpliceInsertSettings(String spliceInsertSettings) {
            this.spliceInsertSettings = spliceInsertSettings;
            return this;
        }
        public String getSpliceInsertSettings() {
            return this.spliceInsertSettings;
        }

        public ProgramAdBreaks setTimeSignalSettings(String timeSignalSettings) {
            this.timeSignalSettings = timeSignalSettings;
            return this;
        }
        public String getTimeSignalSettings() {
            return this.timeSignalSettings;
        }

    }

}
