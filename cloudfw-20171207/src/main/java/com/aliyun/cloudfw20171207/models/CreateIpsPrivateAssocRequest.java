// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateIpsPrivateAssocRequest extends TeaModel {
    /**
     * <p>The language of the request and response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the Internet NAT gateway instance to be associated. This parameter is required. If this parameter is not specified, the ErrorParamsNotEnough error (HTTP 400, Parameters are insufficient.) is returned.</p>
     * <blockquote>
     * <p>The backend does not verify the ID format. Instead, it queries the instance in the private network asset table of Cloud Firewall under the current account. If the instance is not found, the ErrorParamsInvalid error (HTTP 400, Invalid Params) is returned. Common causes include: the resource type is not a NAT gateway, the resource is not managed by Cloud Firewall, or the asynchronous asset synchronization for a newly created NAT gateway is not completed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ngw-c5vhmjdfp5t****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static CreateIpsPrivateAssocRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpsPrivateAssocRequest self = new CreateIpsPrivateAssocRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpsPrivateAssocRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateIpsPrivateAssocRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
