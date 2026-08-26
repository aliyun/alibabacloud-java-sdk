// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RemoveShowFromShowListRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the CasterId value that is returned in the response.</p>
     * </li>
     * <li><p>If you created the production studio in the LIVE console, find the production studio name in the LIVE console by choosing <strong>LIVE Console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The show ID.</p>
     * <blockquote>
     * <p>Obtain the ShowId from the response of the <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("ShowId")
    public String showId;

    /**
     * <p>Specifies whether to delete shows in a batch. Valid values:</p>
     * <ul>
     * <li><p>true: Deletes shows in a batch.</p>
     * </li>
     * <li><p>false: Deletes a single show.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter or leave it empty, a single show is deleted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isBatchMode")
    public Boolean isBatchMode;

    /**
     * <p>The IDs of the shows to delete.</p>
     */
    @NameInMap("showIdList")
    public java.util.List<String> showIdList;

    public static RemoveShowFromShowListRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveShowFromShowListRequest self = new RemoveShowFromShowListRequest();
        return TeaModel.build(map, self);
    }

    public RemoveShowFromShowListRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public RemoveShowFromShowListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveShowFromShowListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveShowFromShowListRequest setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

    public RemoveShowFromShowListRequest setIsBatchMode(Boolean isBatchMode) {
        this.isBatchMode = isBatchMode;
        return this;
    }
    public Boolean getIsBatchMode() {
        return this.isBatchMode;
    }

    public RemoveShowFromShowListRequest setShowIdList(java.util.List<String> showIdList) {
        this.showIdList = showIdList;
        return this;
    }
    public java.util.List<String> getShowIdList() {
        return this.showIdList;
    }

}
