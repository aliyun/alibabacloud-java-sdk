// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListMigrationJobsRequest extends TeaModel {
    // 任务名称
    @NameInMap("name")
    public String name;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("sortCol")
    public String sortCol;

    @NameInMap("sortType")
    public String sortType;

    // 源
    @NameInMap("source")
    public String source;

    // 来源系统,MigrationJobTypeEnum[DTS,SMC,OSS,value,desc]
    @NameInMap("type")
    public String type;

    public static ListMigrationJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationJobsRequest self = new ListMigrationJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListMigrationJobsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMigrationJobsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMigrationJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMigrationJobsRequest setSortCol(String sortCol) {
        this.sortCol = sortCol;
        return this;
    }
    public String getSortCol() {
        return this.sortCol;
    }

    public ListMigrationJobsRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ListMigrationJobsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListMigrationJobsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
