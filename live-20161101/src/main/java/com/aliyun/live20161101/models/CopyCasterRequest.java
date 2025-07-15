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
     * <p>The user-generated request token. This token is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the original production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
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
