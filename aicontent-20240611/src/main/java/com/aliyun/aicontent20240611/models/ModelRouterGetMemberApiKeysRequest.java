// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetMemberApiKeysRequest extends TeaModel {
    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>John</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ModelRouterGetMemberApiKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetMemberApiKeysRequest self = new ModelRouterGetMemberApiKeysRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetMemberApiKeysRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ModelRouterGetMemberApiKeysRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ModelRouterGetMemberApiKeysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
