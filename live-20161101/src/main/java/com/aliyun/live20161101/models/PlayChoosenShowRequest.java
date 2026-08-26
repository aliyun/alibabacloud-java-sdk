// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PlayChoosenShowRequest extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the CasterId parameter in the response.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, navigate to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> to view the production studio name.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The production studio name in the production studio list on the Cloud Production Studio page is the production studio ID.</li>
     * <li>The production studio must be in the running (Status=1) state. Otherwise, the IncorrectCasterStatus error is returned. For a production studio in the idle state, call StartCaster to start the production studio first.</li>
     * </ul>
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
     * <p>The ID of the show to switch to.</p>
     * <blockquote>
     * <p>You can obtain the ShowId value from the response parameters of the <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a> or <a href="https://help.aliyun.com/document_detail/2848054.html">DescribeShowList</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("ShowId")
    public String showId;

    public static PlayChoosenShowRequest build(java.util.Map<String, ?> map) throws Exception {
        PlayChoosenShowRequest self = new PlayChoosenShowRequest();
        return TeaModel.build(map, self);
    }

    public PlayChoosenShowRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public PlayChoosenShowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PlayChoosenShowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PlayChoosenShowRequest setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

}
