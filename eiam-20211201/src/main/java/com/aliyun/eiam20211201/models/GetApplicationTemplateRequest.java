// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationTemplateRequest extends TeaModel {
    /**
     * <p>应用模板id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apt_ramuser_xxxx</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    public static GetApplicationTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationTemplateRequest self = new GetApplicationTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationTemplateRequest setApplicationTemplateId(String applicationTemplateId) {
        this.applicationTemplateId = applicationTemplateId;
        return this;
    }
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

}
