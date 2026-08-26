// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterStreamUrlRequest extends TeaModel {
    /**
     * <p>The ID of the production studio. Make sure that the CasterId is correct.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, obtain the ID from the CasterId parameter in the response.</p>
     * </li>
     * <li><p>If you create a production studio in the ApsaraVideo Live console, go to the <strong>ApsaraVideo Live console</strong> and choose <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of a production studio in the list on the Cloud Production Studio page is its ID.</p>
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
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
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
