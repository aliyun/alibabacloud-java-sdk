// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RemoveShowFromShowListRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
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

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the episode.</p>
     * <blockquote>
     * <p> You can obtain the ID by checking the value of the response parameter ShowId of the <a href="https://help.aliyun.com/document_detail/370861.html">AddShowIntoShowList</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("ShowId")
    public String showId;

    /**
     * <p>Specifies whether to remove multiple episodes at a time. Valid values:</p>
     * <ul>
     * <li>true: removes multiple episodes at a time.</li>
     * <li>false: removes a single episode.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not configure this parameter or this parameter is left empty, a single episode is to be removed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isBatchMode")
    public Boolean isBatchMode;

    /**
     * <p>The IDs of episodes that you want to remove.</p>
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
