// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterRequest extends TeaModel {
    /**
     * <p>The name of the new production studio.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>caster001</p>
     */
    @NameInMap("CasterName")
    public String casterName;

    /**
     * <p>A client-generated token that ensures the idempotence of the request.</p>
     * <p>Generate a unique value for this parameter for each request. The token can contain a maximum of 64 ASCII characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>The ID of the production studio to copy.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the CasterId value that is returned.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, go to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> to view the production studio name.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of a production studio on the Cloud Production Studio page is its production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("SrcCasterId")
    public String srcCasterId;

    public static CopyCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterRequest self = new CopyCasterRequest();
        return TeaModel.build(map, self);
    }

    public CopyCasterRequest setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public CopyCasterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CopyCasterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopyCasterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CopyCasterRequest setSrcCasterId(String srcCasterId) {
        this.srcCasterId = srcCasterId;
        return this;
    }
    public String getSrcCasterId() {
        return this.srcCasterId;
    }

}
