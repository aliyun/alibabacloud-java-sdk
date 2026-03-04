// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ScheduleData extends TeaModel {
    /**
     * <p>The information about ad breaks.</p>
     */
    @NameInMap("AdBreaks")
    public java.util.List<ScheduleDataAdBreaks> adBreaks;

    /**
     * <p>The scheduled playback duration.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("ApproximateDurationSeconds")
    public Long approximateDurationSeconds;

    /**
     * <p>The scheduled start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1989128002313</p>
     */
    @NameInMap("ApproximateStartTime")
    public String approximateStartTime;

    /**
     * <p>The entry type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>FillerSlate</li>
     * <li>program</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>program</p>
     */
    @NameInMap("EntryType")
    public String entryType;

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
        /**
         * <p>MessageType</p>
         * 
         * <strong>example:</strong>
         * <p>SPLICE_INSERT</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        /**
         * <p>The time offset.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("OffsetMillis")
        public String offsetMillis;

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
