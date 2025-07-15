// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartPlaylistRequest extends TeaModel {
    /**
     * <p>The offset of the position where the system starts the playback. This parameter takes effect only if the input source is a video file. Unit: milliseconds.</p>
     * <p>A value greater than 0 indicates an offset from the first frame.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the episode list. If the episode list was created by calling the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation, check the value of the response parameter ProgramId to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The method to resume the playback of the episode list. Valid values:</p>
     * <ul>
     * <li><strong>Restart</strong>: resumes the playback from the beginning.</li>
     * <li><strong>Continue</strong>: resumes the playback from the position where the previous playback stops. The <strong>StartItemId</strong> parameter is required only if you set <strong>ResumeMode</strong> to <strong>Custom</strong>.</li>
     * <li><strong>Custom</strong>: resumes the playback from a custom position.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("ResumeMode")
    public String resumeMode;

    /**
     * <p>The ID of the first episode to play. This episode is the first to play in carousel playback.</p>
     * <blockquote>
     * <p> This parameter is required only if you set ResumeMode to Custom.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>asdfasdfasdf****</p>
     */
    @NameInMap("StartItemId")
    public String startItemId;

    public static StartPlaylistRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPlaylistRequest self = new StartPlaylistRequest();
        return TeaModel.build(map, self);
    }

    public StartPlaylistRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public StartPlaylistRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartPlaylistRequest setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public StartPlaylistRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartPlaylistRequest setResumeMode(String resumeMode) {
        this.resumeMode = resumeMode;
        return this;
    }
    public String getResumeMode() {
        return this.resumeMode;
    }

    public StartPlaylistRequest setStartItemId(String startItemId) {
        this.startItemId = startItemId;
        return this;
    }
    public String getStartItemId() {
        return this.startItemId;
    }

}
