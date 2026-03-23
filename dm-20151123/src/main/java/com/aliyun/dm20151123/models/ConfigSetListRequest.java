// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetListRequest extends TeaModel {
    /**
     * <p>Specifies whether to query all configuration sets. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The keyword to search by name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page index. The value starts from 1. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public String pageIndex;

    /**
     * <p>The number of entries per page. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static ConfigSetListRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetListRequest self = new ConfigSetListRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetListRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ConfigSetListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ConfigSetListRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public ConfigSetListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
