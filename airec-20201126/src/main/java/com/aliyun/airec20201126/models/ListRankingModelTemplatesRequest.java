// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingModelTemplatesRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("size")
    public Long size;

    public static ListRankingModelTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRankingModelTemplatesRequest self = new ListRankingModelTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListRankingModelTemplatesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListRankingModelTemplatesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
