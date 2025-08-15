// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateAdvancedQueryTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SimpleQuery")
    public Boolean simpleQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>x4a0Tw5dQy2J6IRJxf4kng</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>event.eventName: ConsoleSignin AND event.userIdentity.type: root-account</p>
     */
    @NameInMap("TemplateSql")
    public String templateSql;

    public static UpdateAdvancedQueryTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdvancedQueryTemplateRequest self = new UpdateAdvancedQueryTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAdvancedQueryTemplateRequest setSimpleQuery(Boolean simpleQuery) {
        this.simpleQuery = simpleQuery;
        return this;
    }
    public Boolean getSimpleQuery() {
        return this.simpleQuery;
    }

    public UpdateAdvancedQueryTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateAdvancedQueryTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateAdvancedQueryTemplateRequest setTemplateSql(String templateSql) {
        this.templateSql = templateSql;
        return this;
    }
    public String getTemplateSql() {
        return this.templateSql;
    }

}
