// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateAdvancedQueryTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>145318BE-DEE1-4C57-AA7C-5BE7D34A6AE0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the simple query mode is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SimpleQuery")
    public String simpleQuery;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>utpl-QNL3dpYkQcyjZxrIQC****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the template. The maximum length is 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>example-template</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The query statement of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>event.userIdentity.type: root-account AND event.userIdentity.accessKeyId: *</p>
     */
    @NameInMap("TemplateSql")
    public String templateSql;

    public static UpdateAdvancedQueryTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdvancedQueryTemplateResponseBody self = new UpdateAdvancedQueryTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAdvancedQueryTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAdvancedQueryTemplateResponseBody setSimpleQuery(String simpleQuery) {
        this.simpleQuery = simpleQuery;
        return this;
    }
    public String getSimpleQuery() {
        return this.simpleQuery;
    }

    public UpdateAdvancedQueryTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateAdvancedQueryTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateAdvancedQueryTemplateResponseBody setTemplateSql(String templateSql) {
        this.templateSql = templateSql;
        return this;
    }
    public String getTemplateSql() {
        return this.templateSql;
    }

}
