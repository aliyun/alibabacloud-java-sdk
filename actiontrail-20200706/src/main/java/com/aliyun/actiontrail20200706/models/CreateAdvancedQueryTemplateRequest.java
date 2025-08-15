// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateAdvancedQueryTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SimpleQuery")
    public Boolean simpleQuery;

    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>event.eventName: ConsoleSignin AND event.userIdentity.type: root-account</p>
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
