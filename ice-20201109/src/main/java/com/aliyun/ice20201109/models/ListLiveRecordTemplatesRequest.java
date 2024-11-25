// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordTemplatesRequest extends TeaModel {
    /**
     * <p>The search keyword. You can use the template ID or name as the keyword to search for templates. If you search for templates by name, fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test template</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The sorting order. By default, the query results are sorted by creation time in descending order.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>asc: sorts the query results in ascending order.</li>
     * <li>desc: sorts the query results in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("TemplateIds")
    public java.util.List<String> templateIds;

    /**
     * <p>The type of the template.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>system</li>
     * <li>custom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListLiveRecordTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordTemplatesRequest self = new ListLiveRecordTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordTemplatesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListLiveRecordTemplatesRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLiveRecordTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLiveRecordTemplatesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveRecordTemplatesRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public ListLiveRecordTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
