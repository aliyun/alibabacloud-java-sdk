// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterSceneAudioRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, obtain the value of CasterId from the response.</p>
     * </li>
     * <li><p>If you create a production studio in the ApsaraVideo Live console, view the ID on the <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of a production studio in the list on the Cloud Production Studio page is the ID of the production studio.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>97df6b7f-3490-47d2-ac50-88338765****</p>
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
     * <p>The ID of the scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>97df6b7f-3490-47d2-ac50-88339087****</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static DescribeCasterSceneAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterSceneAudioRequest self = new DescribeCasterSceneAudioRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterSceneAudioRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterSceneAudioRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCasterSceneAudioRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCasterSceneAudioRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
