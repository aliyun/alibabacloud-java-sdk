// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ChannelAssemblyProgram extends TeaModel {
    /**
     * <p>The ad breaks.</p>
     */
    @NameInMap("AdBreaks")
    public java.util.List<ChannelAssemblyProgramAdBreaks> adBreaks;

    /**
     * <p>The ARN of the program.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ims:mediaweaver:<regionId>:<userId>:program/myChannel/MyProgram</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The name of the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>MyChannel</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>Extracts a clip from the source.</p>
     * 
     * <strong>example:</strong>
     * <p>{StartOffsetMillis: 213123, EndOffsetMillis: 213134}</p>
     */
    @NameInMap("ClipRange")
    public String clipRange;

    /**
     * <p>The time when the program was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-02T00:58:19Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the program was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-02T00:58:19Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The name of the program.</p>
     * 
     * <strong>example:</strong>
     * <p>program1</p>
     */
    @NameInMap("ProgramName")
    public String programName;

    /**
     * <p>The name of the source location.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    /**
     * <p>The name of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>MySource</p>
     */
    @NameInMap("SourceName")
    public String sourceName;

    /**
     * <p>The source type. Valid values: vodSource and liveSource.</p>
     * 
     * <strong>example:</strong>
     * <p>vodSource</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The program transition method.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;: &quot;RELATIVE&quot;, &quot;RelativePosition&quot;: &quot;AFTER_PROGRAM&quot;, &quot;RelativeProgram&quot;: &quot;program2&quot;}</p>
     */
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
        /**
         * <p>The name of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>The SCTE-35 message type.</p>
         * 
         * <strong>example:</strong>
         * <p>SPLICE_INSERT</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        /**
         * <p>The position to insert the ad marker, as an offset relative to the beginning of the program. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("OffsetMillis")
        public Long offsetMillis;

        /**
         * <p>The name of the program.</p>
         * 
         * <strong>example:</strong>
         * <p>program_name</p>
         */
        @NameInMap("ProgramName")
        public String programName;

        /**
         * <p>The name of the source location.</p>
         * 
         * <strong>example:</strong>
         * <p>MySourceLocation</p>
         */
        @NameInMap("SourceLocationName")
        public String sourceLocationName;

        /**
         * <p>The name of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>MyAdSource</p>
         */
        @NameInMap("SourceName")
        public String sourceName;

        /**
         * <p>The SpliceInsert configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AvailNumber&quot;:0,&quot;AvailExpected&quot;:0,&quot;SpliceEventID&quot;:1,&quot;UniqueProgramID&quot;:0}</p>
         */
        @NameInMap("SpliceInsertSettings")
        public String spliceInsertSettings;

        /**
         * <p>The TimeSignal configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;segmentationEventID&quot;:0,&quot;segmentationUPIDType&quot;:14,&quot;segmentationUPID&quot;:&quot;upid&quot;,&quot;segmentationTypeID&quot;:48,&quot;segmentNumber&quot;:0,&quot;segmentsExpected&quot;:0,&quot;subSegmentNumber&quot;:1,&quot;subSegmentsExpected&quot;:0}</p>
         */
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
