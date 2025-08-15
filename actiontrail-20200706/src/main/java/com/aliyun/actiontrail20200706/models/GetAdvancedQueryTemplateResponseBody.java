// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAdvancedQueryTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>32110C73-0004-5141-9DA7-4B8045C8173A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SimpleQuery")
    public Boolean simpleQuery;

    /**
     * <strong>example:</strong>
     * <p>utpl-N9fpjnFBSWauSXhVNP3erw</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>event.userIdentity.type: root-account AND event.userIdentity.accessKeyId: *</p>
     */
    @NameInMap("TemplateSql")
    public String templateSql;

    public static GetAdvancedQueryTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdvancedQueryTemplateResponseBody self = new GetAdvancedQueryTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdvancedQueryTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAdvancedQueryTemplateResponseBody setSimpleQuery(Boolean simpleQuery) {
        this.simpleQuery = simpleQuery;
        return this;
    }
    public Boolean getSimpleQuery() {
        return this.simpleQuery;
    }

    public GetAdvancedQueryTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetAdvancedQueryTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetAdvancedQueryTemplateResponseBody setTemplateSql(String templateSql) {
        this.templateSql = templateSql;
        return this;
    }
    public String getTemplateSql() {
        return this.templateSql;
    }

}
