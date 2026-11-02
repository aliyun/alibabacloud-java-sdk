// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotTemplatesRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: [1, n). Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of items per page. Valid values: [1, 100]. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword. You can search by template ID or name. Fuzzy match is supported for template names.</p>
     * <ul>
     * <li>The maximum length is 128 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    /**
     * <p>The sort order. By default, the results are sorted by CreateTime in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The template IDs used for the query.</p>
     * <ul>
     * <li>If SearchKeyWord is specified, this parameter does not take effect.</li>
     * <li>The maximum array length is 200.</li>
     * </ul>
     */
    @NameInMap("TemplateIds")
    public java.util.List<String> templateIds;

    /**
     * <p>The templatetype. By default, all types are queried.</p>
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
