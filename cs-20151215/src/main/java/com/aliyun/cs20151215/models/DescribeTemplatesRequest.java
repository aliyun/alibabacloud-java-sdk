// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplatesRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_num")
    public Long pageNum;

    /**
     * <p>The number of entries per page.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>The type of template. This parameter can be set to a custom value.</p>
     * <ul>
     * <li>If the parameter is set to <code>kubernetes</code>, the template is displayed on the Templates page in the console.</li>
     * <li>If you set the parameter to <code>compose</code>, the template is not displayed on the Templates page in the console.</li>
     * </ul>
     * <p>Default value: <code>kubernetes</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes</p>
     */
    @NameInMap("template_type")
    public String templateType;

    public static DescribeTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesRequest self = new DescribeTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
