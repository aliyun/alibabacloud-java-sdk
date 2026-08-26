// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddPlaylistItemsRequest extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster operation</a>, check the CasterId parameter value returned by the CreateCaster operation.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, navigate to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studios</strong> &gt; <strong>Cloud Production Studio</strong> to view the production studio name.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The production studio name in the production studio list on the Cloud Production Studio page of the ApsaraVideo Live console is the production studio ID.</p>
     * </blockquote>
     * <p>The production studio must meet the following configurations:</p>
     * <ul>
     * <li><strong>NormType</strong>: <strong>3</strong>. Create a lightweight carousel production studio in advance. You can call the <strong>CreateCaster</strong> operation to create a production studio.</li>
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
     * <p>The playlist item configuration. If this is the first time you add a playlist item, specify this parameter for initialization. For more information, see <strong>ProgramConfig</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;RepeatNumber&quot;:&quot;0&quot;,&quot;ProgramName&quot;:&quot;my program&quot;}]</p>
     */
    @NameInMap("ProgramConfig")
    public String programConfig;

    /**
     * <p>The playlist ID. If the production studio already has a playlist, you must specify the corresponding ProgramId. If no playlist has been created, you can leave this parameter empty, and the system performs automatic creation.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("ProgramId")
    public String programId;

    /**
     * <p>The list of playlist item inputs. The value is a JSON string. For more information, see <strong>InputProgramItem</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ItemName&quot;:&quot;item1&quot;,&quot;ResourceType&quot;:&quot;vod&quot;,&quot;ResourceValue&quot;:&quot;5f8809f2-3352-4d1f-a8f7-86f9429f****&quot;}, {&quot;ItemName&quot;: &quot;item2&quot;,&quot;ResourceType&quot;: &quot;vod&quot;,&quot;ResourceValue&quot;: &quot;e7411c0b-dd98-4c61-a545-f8bfba6c****&quot;}]</p>
     */
    @NameInMap("ProgramItems")
    public String programItems;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
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
