// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteApplicationTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the application program template to delete. This parameter is required. If you leave this parameter empty, a parameter fault is returned. The template must exist within the current Alibaba Cloud account. You cannot delete a template if it contains custom application program rules or is referenced by an access control policy of the Internet border, NAT, or virtual private cloud (VPC) firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>ati-4f0691c56b8d4f06</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    public static DeleteApplicationTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationTemplateRequest self = new DeleteApplicationTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationTemplateRequest setApplicationTemplateId(String applicationTemplateId) {
        this.applicationTemplateId = applicationTemplateId;
        return this;
    }
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

}
