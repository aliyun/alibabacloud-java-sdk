// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterRequest extends TeaModel {
    /**
     * <p>The ID of the production studio. Make sure that you specify the correct CasterId.</p>
     * <ul>
     * <li><p>If you created a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, obtain the CasterId from the response.</p>
     * </li>
     * <li><p>If you created a production studio in the ApsaraVideo Live console, go to the <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>On the Cloud Production Studio page, the name of a production studio in the list is its ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
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

    public static DeleteCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterRequest self = new DeleteCasterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteCasterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
