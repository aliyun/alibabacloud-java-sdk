// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterScenesRequest extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the CasterId parameter value returned by the CreateCaster operation.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, go to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studios</strong> &gt; <strong>Cloud Production Studio</strong> to view the ID.</p>
     * </li>
     * <li><p>The production studio specified by CasterId must have a DomainName configured through SetCasterConfig. Otherwise, the error InvalidDomainName.NotFound is returned.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the production studio list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80787064-1c94-4dc1-85ce-9409960a****</p>
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
     * <p>The scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b5f8c837-ceeb-424f-b30b-68e94e86****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static DescribeCasterScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterScenesRequest self = new DescribeCasterScenesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterScenesRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterScenesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCasterScenesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCasterScenesRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
