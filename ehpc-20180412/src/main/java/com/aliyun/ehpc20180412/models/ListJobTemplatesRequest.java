// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobTemplatesRequest extends TeaModel {
    /**
     * <p>The name of the job template.</p>
     * <br>
     * <p>You can call the [ListJobTemplates](~~87248~~) operation to obtain the job template name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return. Page numbers start from 1.</p>
     * <br>
     * <p>Default value: 1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10</p>
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
