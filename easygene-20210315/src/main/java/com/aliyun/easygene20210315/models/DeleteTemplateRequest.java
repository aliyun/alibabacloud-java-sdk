// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-template</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-workspace</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static DeleteTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateRequest self = new DeleteTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public DeleteTemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
