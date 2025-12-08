// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class QueryFaceImageTemplateRequest extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>6cd509ea-54fa-4730-8e9d-c94cadcda048</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static QueryFaceImageTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceImageTemplateRequest self = new QueryFaceImageTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceImageTemplateRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryFaceImageTemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryFaceImageTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
