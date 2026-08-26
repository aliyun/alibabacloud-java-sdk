// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartPlaylistRequest extends TeaModel {
    /**
     * <p>The start offset for the video file. This parameter is valid only for video files. Unit: milliseconds.</p>
     * <p>A value greater than 0 specifies the start time relative to the first frame.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the playlist. If you add items to the playlist by calling the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation, use the value of the ProgramId parameter that is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("ProgramId")
    public String programId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The restart mode. Valid values:</p>
     * <ul>
     * <li><p><strong>Restart</strong>: Starts from the beginning.</p>
     * </li>
     * <li><p><strong>Continue</strong>: Resumes playback from where it was stopped. The <strong>StartItemId</strong> parameter is required only when you set the <strong>ResumeMode</strong> parameter to <strong>Custom</strong>.</p>
     * </li>
     * <li><p><strong>Custom</strong>: Custom start point.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("ResumeMode")
    public String resumeMode;

    /**
     * <p>The ID of the item to play first. When the carousel starts, this item is played.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required only when you set <strong>ResumeMode</strong> to <strong>Custom</strong>.</p>
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
