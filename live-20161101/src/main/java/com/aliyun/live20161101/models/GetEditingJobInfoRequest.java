// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEditingJobInfoRequest extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the CasterId parameter in the response.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, navigate to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studios</strong> &gt; <strong>Cloud Production Studio</strong> to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The name of the production studio in the production studio list on the Cloud Production Studio page is the production studio ID.</li>
     * <li>CasterId must be a production studio with NormType=6 (playlist mode). Using a production studio with other NormType values (such as 1 or 3) returns InvalidShowList.NotFound. You can filter by NormType=6 in the DescribeCasters response.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
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
     * <p>The ID of the show to query.</p>
     * <blockquote>
     * <p>You can obtain the ShowId value from the response of the <a href="https://help.aliyun.com/document_detail/370861.html">AddShowIntoShowList</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>72200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("ShowId")
    public String showId;

    public static GetEditingJobInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEditingJobInfoRequest self = new GetEditingJobInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetEditingJobInfoRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public GetEditingJobInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetEditingJobInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEditingJobInfoRequest setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

}
