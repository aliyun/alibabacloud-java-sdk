// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public String pageIndex;

    /**
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
