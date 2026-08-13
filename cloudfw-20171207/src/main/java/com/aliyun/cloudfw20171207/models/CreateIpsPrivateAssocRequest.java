// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateIpsPrivateAssocRequest extends TeaModel {
    /**
     * <p>The language of the request and response messages.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the Internet NAT gateway instance to associate. This parameter is required. If this parameter is not specified, ErrorParamsNotEnough is returned (HTTP 400, Parameters are insufficient.).</p>
     * <blockquote>
     * <p>The backend does not validate the ID format. Instead, it queries the instance in the Cloud Firewall private network asset table for the current account. If the instance is not found, ErrorParamsInvalid is returned (HTTP 400, Invalid Params). Common scenarios include the resource type not being a NAT gateway, the resource not being managed by Cloud Firewall, or a newly created NAT gateway for which asynchronous asset synchronization has not yet completed.</p>
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
