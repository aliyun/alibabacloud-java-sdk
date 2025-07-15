// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditPlaylistRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The configurations of the episode list. For more information, see the <strong>ProgramConfig</strong> section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;RepeatNumber&quot;:&quot;0&quot;,&quot;ProgramName&quot;:&quot;my program&quot;}]</p>
     */
    @NameInMap("ProgramConfig")
    public String programConfig;

    /**
     * <p>The ID of the episode list. If the episode list was created by calling the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation, check the value of the response parameter ProgramId to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("ProgramId")
    public String programId;

    /**
     * <p>The episodes that you want to add to the production studio. The value is a JSON string. For more information, see the <strong>InputProgramItem</strong> section of this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ItemName&quot;:&quot;item1&quot;,&quot;ResourceType&quot;:&quot;vod&quot;,&quot;ResourceValue&quot;:&quot;5f8809f2-3352-4d1f-a8f7-86f9429f****&quot;}, {&quot;ItemName&quot;: &quot;item2&quot;,&quot;ResourceType&quot;: &quot;vod&quot;,&quot;ResourceValue&quot;: &quot;e7411c0b-dd98-4c61-a545-f8bfba6c****&quot;}]</p>
     */
    @NameInMap("ProgramItems")
    public String programItems;

    @NameInMap("RegionId")
    public String regionId;

    public static EditPlaylistRequest build(java.util.Map<String, ?> map) throws Exception {
        EditPlaylistRequest self = new EditPlaylistRequest();
        return TeaModel.build(map, self);
    }

    public EditPlaylistRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EditPlaylistRequest setProgramConfig(String programConfig) {
        this.programConfig = programConfig;
        return this;
    }
    public String getProgramConfig() {
        return this.programConfig;
    }

    public EditPlaylistRequest setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public EditPlaylistRequest setProgramItems(String programItems) {
        this.programItems = programItems;
        return this;
    }
    public String getProgramItems() {
        return this.programItems;
    }

    public EditPlaylistRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
