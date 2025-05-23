// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateProgramRequest extends TeaModel {
    /**
     * <p>The information about ad breaks.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;MessageType&quot;:&quot;SPLICE_INSERT&quot;,&quot;OffsetMillis&quot;:1000,&quot;SourceLocationName&quot;:&quot;MySourceLocation&quot;,&quot;SourceName&quot;:&quot;MyAdSource&quot;,&quot;SpliceInsertSettings&quot;:{&quot;AvailNumber&quot;:0,&quot;AvailExpected&quot;:0,&quot;SpliceEventID&quot;:1,&quot;UniqueProgramID&quot;:0}}]</p>
     */
    @NameInMap("AdBreaks")
    public String adBreaks;

    /**
     * <p>The name of the channel.</p>
     * <p>This parameter is required.</p>
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
     * <p>The name of the program.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>program1</p>
     */
    @NameInMap("ProgramName")
    public String programName;

    /**
     * <p>The source location.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourceLcation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    /**
     * <p>The name of the source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySource</p>
     */
    @NameInMap("SourceName")
    public String sourceName;

    /**
     * <p>The source type of the program.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vodSource</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The program transition method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;: &quot;RELATIVE&quot;, &quot;RelativePosition&quot;: &quot;AFTER_PROGRAM&quot;, &quot;RelativeProgram&quot;: &quot;program2&quot;}</p>
     */
    @NameInMap("Transition")
    public String transition;

    public static CreateProgramRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProgramRequest self = new CreateProgramRequest();
        return TeaModel.build(map, self);
    }

    public CreateProgramRequest setAdBreaks(String adBreaks) {
        this.adBreaks = adBreaks;
        return this;
    }
    public String getAdBreaks() {
        return this.adBreaks;
    }

    public CreateProgramRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateProgramRequest setClipRange(String clipRange) {
        this.clipRange = clipRange;
        return this;
    }
    public String getClipRange() {
        return this.clipRange;
    }

    public CreateProgramRequest setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public CreateProgramRequest setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public CreateProgramRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public CreateProgramRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateProgramRequest setTransition(String transition) {
        this.transition = transition;
        return this;
    }
    public String getTransition() {
        return this.transition;
    }

}
