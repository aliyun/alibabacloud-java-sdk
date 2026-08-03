// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateAdvancedQueryTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4ABAEA6E-C740-5CE2-A003-643E551964F5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the simple query mode is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SimpleQuery")
    public String simpleQuery;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>x4a0Tw5dQy2J6IRJxf4kng</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The query statement.</p>
     * 
     * <strong>example:</strong>
     * <p>event.errorCode: * AND event.userIdentity.accessKeyId: *</p>
     */
    @NameInMap("TemplateSql")
    public String templateSql;

    public static CreateAdvancedQueryTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedQueryTemplateResponseBody self = new CreateAdvancedQueryTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedQueryTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAdvancedQueryTemplateResponseBody setSimpleQuery(String simpleQuery) {
        this.simpleQuery = simpleQuery;
        return this;
    }
    public String getSimpleQuery() {
        return this.simpleQuery;
    }

    public CreateAdvancedQueryTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateAdvancedQueryTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateAdvancedQueryTemplateResponseBody setTemplateSql(String templateSql) {
        this.templateSql = templateSql;
        return this;
    }
    public String getTemplateSql() {
        return this.templateSql;
    }

}
