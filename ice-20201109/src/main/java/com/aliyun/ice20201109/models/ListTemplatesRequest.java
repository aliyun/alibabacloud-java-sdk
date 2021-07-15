// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    // 模板类型
    @NameInMap("Type")
    public String type;

    // 模板状态
    @NameInMap("Status")
    public String status;

    // 创建来源
    @NameInMap("CreateSource")
    public String createSource;

    // 搜索关键词，可以根据模板id和title搜索
    @NameInMap("Keyword")
    public String keyword;

    // 排序参数，默认根据创建时间倒序
    @NameInMap("SortType")
    public String sortType;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListTemplatesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTemplatesRequest setCreateSource(String createSource) {
        this.createSource = createSource;
        return this;
    }
    public String getCreateSource() {
        return this.createSource;
    }

    public ListTemplatesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTemplatesRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

}
