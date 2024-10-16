// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndicesRequest extends TeaModel {
    /**
     * <p>The name of the knowledge base. You can query knowledge base by name. The name must be 1 to 20 characters in length and can contain characters classified as letter in Unicode, including English letters, Chinese characters, digits, among others. The name can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>This parameter is left empty by default, which means that all knowledge bases in the specified workspace are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>idx_status_score</p>
     */
    @NameInMap("IndexName")
    public String indexName;

    /**
     * <p>The number of the pages to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of knowledge bases to display on each page. No maximum value. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static ListIndicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIndicesRequest self = new ListIndicesRequest();
        return TeaModel.build(map, self);
    }

    public ListIndicesRequest setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public String getIndexName() {
        return this.indexName;
    }

    public ListIndicesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListIndicesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
