// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopCasterRequest extends TeaModel {
    /**
     * <p>The ID of the production studio. Make sure that the specified CasterId is correct.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, obtain the ID from the CasterId parameter in the response.</p>
     * </li>
     * <li><p>If you create a production studio in the ApsaraVideo Live console, go to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the list on the Cloud Production Studio page is the production studio ID.</p>
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

    public static StopCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCasterRequest self = new StopCasterRequest();
        return TeaModel.build(map, self);
    }

    public StopCasterRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public StopCasterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopCasterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
