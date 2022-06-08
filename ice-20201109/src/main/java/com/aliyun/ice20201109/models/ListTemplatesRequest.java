// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    // 创建来源
    @NameInMap("CreateSource")
    public String createSource;

    // 搜索关键词，可以根据模板id和title搜索
    @NameInMap("Keyword")
    public String keyword;

    // 当前页码。默认值为1。
    @NameInMap("PageNo")
    public Long pageNo;

    // 分页大小，每页显示条数。默认值为10，最大值为100。
    @NameInMap("PageSize")
    public Long pageSize;

    // 排序参数，默认根据创建时间倒序
    @NameInMap("SortType")
    public String sortType;

    // 模板状态
    @NameInMap("Status")
    public String status;

    // 模板类型
    @NameInMap("Type")
    public String type;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
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

    public ListTemplatesRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ListTemplatesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
