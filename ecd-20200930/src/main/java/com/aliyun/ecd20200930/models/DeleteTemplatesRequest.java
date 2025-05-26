// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteTemplatesRequest extends TeaModel {
    /**
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The IDs of the templates that you want to delete.</p>
     */
    @NameInMap("TemplateIds")
    public java.util.List<String> templateIds;

    public static DeleteTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplatesRequest self = new DeleteTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTemplatesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DeleteTemplatesRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

}
