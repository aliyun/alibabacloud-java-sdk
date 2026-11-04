// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryTimeTemplateDetailRequest extends TeaModel {
    /**
     * <p>The ID of the time template. You can call the <a href="https://help.aliyun.com/document_detail/107890.html">QueryTimeTemplate</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36f06322442e4e3f85a5ae8862c9****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static QueryTimeTemplateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTimeTemplateDetailRequest self = new QueryTimeTemplateDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTimeTemplateDetailRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
