// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateAdvancedQueryTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the simple query mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SimpleQuery")
    public Boolean simpleQuery;

    /**
     * <p>The name of the template, which can contain a maximum of 64 characters. Uniqueness is not required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The query statement of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>event.errorCode: * AND event.userIdentity.accessKeyId: *</p>
     */
    @NameInMap("TemplateSql")
    public String templateSql;

    public static CreateAdvancedQueryTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedQueryTemplateRequest self = new CreateAdvancedQueryTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedQueryTemplateRequest setSimpleQuery(Boolean simpleQuery) {
        this.simpleQuery = simpleQuery;
        return this;
    }
    public Boolean getSimpleQuery() {
        return this.simpleQuery;
    }

    public CreateAdvancedQueryTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateAdvancedQueryTemplateRequest setTemplateSql(String templateSql) {
        this.templateSql = templateSql;
        return this;
    }
    public String getTemplateSql() {
        return this.templateSql;
    }

}
