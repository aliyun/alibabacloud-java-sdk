// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddPlaylistItemsRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
     * </blockquote>
     * <p>The production studio must use the following configurations:</p>
     * <ul>
     * <li><strong>NormType</strong>: 3****. You need to call the <strong>CreateCaster</strong> operation to create a production studio for lightweight carousel playback in advance.</li>
     * <li><strong>CasterTemplate</strong>: lp_noTranscode.</li>
     * <li><strong>channelEnable</strong>: 0.</li>
     * <li><strong>programEffect</strong>: 1.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0e94d1f4-1a65-445c-9dcf-de8b3b8d****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The configurations of the episode list. If the episode list is added to the production studio for the first time, specify this parameter to pass in the initial configurations. For more information, see the <strong>ProgramConfig</strong> section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;RepeatNumber&quot;:&quot;0&quot;,&quot;ProgramName&quot;:&quot;my program&quot;}]</p>
     */
    @NameInMap("ProgramConfig")
    public String programConfig;

    /**
     * <p>The ID of the episode list. If you do not specify this parameter, an episode list is created by default.</p>
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

    public static AddPlaylistItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPlaylistItemsRequest self = new AddPlaylistItemsRequest();
        return TeaModel.build(map, self);
    }

    public AddPlaylistItemsRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddPlaylistItemsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddPlaylistItemsRequest setProgramConfig(String programConfig) {
        this.programConfig = programConfig;
        return this;
    }
    public String getProgramConfig() {
        return this.programConfig;
    }

    public AddPlaylistItemsRequest setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public AddPlaylistItemsRequest setProgramItems(String programItems) {
        this.programItems = programItems;
        return this;
    }
    public String getProgramItems() {
        return this.programItems;
    }

    public AddPlaylistItemsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
