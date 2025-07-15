// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistItemsRequest extends TeaModel {
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

    /**
     * <p>The IDs of the episodes that you want to query. Separate episode IDs with commas (,). If you set this parameter, only the information about the specified episodes is returned. If you do not set this parameter, the information about all episodes in the episode list is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>c10f3d63-eacf-4fbf-bd48-a07a6ba7****,c09f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
     */
    @NameInMap("ProgramItemIds")
    public String programItemIds;

    @NameInMap("RegionId")
    public String regionId;

    public static ListPlaylistItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPlaylistItemsRequest self = new ListPlaylistItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListPlaylistItemsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListPlaylistItemsRequest setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public ListPlaylistItemsRequest setProgramItemIds(String programItemIds) {
        this.programItemIds = programItemIds;
        return this;
    }
    public String getProgramItemIds() {
        return this.programItemIds;
    }

    public ListPlaylistItemsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
