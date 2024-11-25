// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotTemplatesRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: [1,n). Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword. You can use the template ID or name as the keyword to search for templates. If you search for templates by name, fuzzy match is supported.</p>
     * <ul>
     * <li>It cannot exceed 128 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    /**
     * <p>The sorting order. By default, the query results are sorted by creation time in descending order.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>asc: sorts the query results by creation time in ascending order.</li>
     * <li>desc: sorts the query results by creation time in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The template IDs.</p>
     * <ul>
     * <li>If you specify the SearchKeyWord parameter, this condition does not take effect.</li>
     * <li>The maximum length of the array is 200.</li>
     * </ul>
     */
    @NameInMap("TemplateIds")
    public java.util.List<String> templateIds;

    /**
     * <p>The type of the template. By default, all types are queried.</p>
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

    public static ListLiveSnapshotTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveSnapshotTemplatesRequest self = new ListLiveSnapshotTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveSnapshotTemplatesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListLiveSnapshotTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveSnapshotTemplatesRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public ListLiveSnapshotTemplatesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveSnapshotTemplatesRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public ListLiveSnapshotTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
