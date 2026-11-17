// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteWebFilterTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the web filtering template to delete. This parameter is required. If you leave this parameter empty, a parameter fault is returned. The template must exist within the current Alibaba Cloud account. A template cannot be deleted if it is referenced by an access control policy of the Internet border, NAT firewalls, or virtual private cloud (VPC) firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>wft-3f2a9c1d4b5e6f70</p>
     */
    @NameInMap("WebFilterTemplateId")
    public String webFilterTemplateId;

    public static DeleteWebFilterTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebFilterTemplateRequest self = new DeleteWebFilterTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebFilterTemplateRequest setWebFilterTemplateId(String webFilterTemplateId) {
        this.webFilterTemplateId = webFilterTemplateId;
        return this;
    }
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

}
