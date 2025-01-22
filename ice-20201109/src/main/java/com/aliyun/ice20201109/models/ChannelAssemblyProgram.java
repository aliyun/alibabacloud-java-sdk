// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ChannelAssemblyProgram extends TeaModel {
    @NameInMap("AdBreaks")
    public java.util.List<ChannelAssemblyProgramAdBreaks> adBreaks;

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

    public static ChannelAssemblyProgram build(java.util.Map<String, ?> map) throws Exception {
        ChannelAssemblyProgram self = new ChannelAssemblyProgram();
        return TeaModel.build(map, self);
    }

    public ChannelAssemblyProgram setAdBreaks(java.util.List<ChannelAssemblyProgramAdBreaks> adBreaks) {
        this.adBreaks = adBreaks;
        return this;
    }
    public java.util.List<ChannelAssemblyProgramAdBreaks> getAdBreaks() {
        return this.adBreaks;
    }

    public ChannelAssemblyProgram setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public ChannelAssemblyProgram setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public ChannelAssemblyProgram setClipRange(String clipRange) {
        this.clipRange = clipRange;
        return this;
    }
    public String getClipRange() {
        return this.clipRange;
    }

    public ChannelAssemblyProgram setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ChannelAssemblyProgram setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ChannelAssemblyProgram setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public ChannelAssemblyProgram setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public ChannelAssemblyProgram setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public ChannelAssemblyProgram setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ChannelAssemblyProgram setTransition(String transition) {
        this.transition = transition;
        return this;
    }
    public String getTransition() {
        return this.transition;
    }

    public static class ChannelAssemblyProgramAdBreaks extends TeaModel {
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

        public static ChannelAssemblyProgramAdBreaks build(java.util.Map<String, ?> map) throws Exception {
            ChannelAssemblyProgramAdBreaks self = new ChannelAssemblyProgramAdBreaks();
            return TeaModel.build(map, self);
        }

        public ChannelAssemblyProgramAdBreaks setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public ChannelAssemblyProgramAdBreaks setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public ChannelAssemblyProgramAdBreaks setOffsetMillis(Long offsetMillis) {
            this.offsetMillis = offsetMillis;
            return this;
        }
        public Long getOffsetMillis() {
            return this.offsetMillis;
        }

        public ChannelAssemblyProgramAdBreaks setProgramName(String programName) {
            this.programName = programName;
            return this;
        }
        public String getProgramName() {
            return this.programName;
        }

        public ChannelAssemblyProgramAdBreaks setSourceLocationName(String sourceLocationName) {
            this.sourceLocationName = sourceLocationName;
            return this;
        }
        public String getSourceLocationName() {
            return this.sourceLocationName;
        }

        public ChannelAssemblyProgramAdBreaks setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ChannelAssemblyProgramAdBreaks setSpliceInsertSettings(String spliceInsertSettings) {
            this.spliceInsertSettings = spliceInsertSettings;
            return this;
        }
        public String getSpliceInsertSettings() {
            return this.spliceInsertSettings;
        }

        public ChannelAssemblyProgramAdBreaks setTimeSignalSettings(String timeSignalSettings) {
            this.timeSignalSettings = timeSignalSettings;
            return this;
        }
        public String getTimeSignalSettings() {
            return this.timeSignalSettings;
        }

    }

}
