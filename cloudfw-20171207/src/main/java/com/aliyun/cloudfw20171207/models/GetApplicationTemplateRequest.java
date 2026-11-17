// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class GetApplicationTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the application template to query. The template must exist within the current Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ati-4f0691c56b8d4f06</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    /**
     * <p>The return scope for built-in application actions. Valid values:</p>
     * <ul>
     * <li><strong>Custom</strong>: returns only applications whose actions have been customized by the user. This is the default value.</li>
     * <li><strong>All</strong>: returns all built-in applications.
     * The priority of action effectiveness is: user customization &gt; template default &gt; application library default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("BuiltInApplicationActionType")
    public String builtInApplicationActionType;

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

    public GetApplicationTemplateRequest setBuiltInApplicationActionType(String builtInApplicationActionType) {
        this.builtInApplicationActionType = builtInApplicationActionType;
        return this;
    }
    public String getBuiltInApplicationActionType() {
        return this.builtInApplicationActionType;
    }

}
