// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterStreamUrlRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <p>If you create a production studio through the <a href="~~69338#doc-api-live-CreateCaster~~">CreateCaster</a> interface, check the value of the CasterId parameter in the response.</p>
     * <p>If you create a production studio through the ApsaraVideo Live Console, log in to the console, then check the ID of the production studio through the following path:</p>
     * <p>Production Studios &gt; Production Studio Management</p>
     * <blockquote>
     * <p> The CasterId is reflected in the Name column on the Production Studio Management page.</p>
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

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCasterStreamUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterStreamUrlRequest self = new DescribeCasterStreamUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterStreamUrlRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterStreamUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCasterStreamUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
