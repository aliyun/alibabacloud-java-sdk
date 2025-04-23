// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobTemplatesRequest extends TeaModel {
    /**
     * <p>The name of the job template.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87248.html">ListJobTemplates</a> operation to obtain the job template name.</p>
     * 
     * <strong>example:</strong>
     * <p>jobtemplateName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number to return. Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page. Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListJobTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobTemplatesRequest self = new ListJobTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListJobTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListJobTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
