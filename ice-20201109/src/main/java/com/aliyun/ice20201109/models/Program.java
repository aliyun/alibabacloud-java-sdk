// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class Program extends TeaModel {
    /**
     * <p>The ad breaks.</p>
     */
    @NameInMap("AdBreaks")
    public java.util.List<ProgramAdBreaks> adBreaks;

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
     * <p>The information about the clip.</p>
     * 
     * <strong>example:</strong>
     * <p>{StartOffsetMillis: 213123, EndOffsetMillis: 213134}</p>
     */
    @NameInMap("ClipRange")
    public String clipRange;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-02T00:58:19Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The modification time.</p>
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
     * <p>The source type.</p>
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
        /**
         * <p>The name of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>MyChannel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>MessageType</p>
         * 
         * <strong>example:</strong>
         * <p>SPLICE_INSERT</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        /**
         * <p>The offset.</p>
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
