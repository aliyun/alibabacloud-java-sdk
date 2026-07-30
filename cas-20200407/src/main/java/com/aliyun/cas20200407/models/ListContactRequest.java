// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListContactRequest extends TeaModel {
    /**
     * <p>The current page number for pagination. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The search keyword. For example, a keyword in the name, email address, or phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>186</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of contacts to display per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    public static ListContactRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactRequest self = new ListContactRequest();
        return TeaModel.build(map, self);
    }

    public ListContactRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListContactRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListContactRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
