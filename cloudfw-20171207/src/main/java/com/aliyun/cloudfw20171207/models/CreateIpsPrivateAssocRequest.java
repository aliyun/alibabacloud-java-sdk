// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateIpsPrivateAssocRequest extends TeaModel {
    /**
     * <p>The language type for the request and response messages. Valid values:</p>
     * <ul>
     * <li>en: English.</li>
     * <li>zh: Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The instance ID. This parameter is required. If this parameter is not specified, the API returns error code -103201. Only NAT gateway instance IDs (in the format ngw-<em>) that are protected by Cloud Firewall are accepted. Other resource types such as vpc-</em> or eip-* are rejected.</p>
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
