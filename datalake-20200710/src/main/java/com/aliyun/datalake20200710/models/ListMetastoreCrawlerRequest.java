// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMetastoreCrawlerRequest extends TeaModel {
    @NameInMap("Creator")
    public String creator;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("ExecuteType")
    public String executeType;

    @NameInMap("Name")
    public String name;

    @NameInMap("OrderCol")
    public String orderCol;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    public static ListMetastoreCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetastoreCrawlerRequest self = new ListMetastoreCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public ListMetastoreCrawlerRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListMetastoreCrawlerRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ListMetastoreCrawlerRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    public ListMetastoreCrawlerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMetastoreCrawlerRequest setOrderCol(String orderCol) {
        this.orderCol = orderCol;
        return this;
    }
    public String getOrderCol() {
        return this.orderCol;
    }

    public ListMetastoreCrawlerRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListMetastoreCrawlerRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMetastoreCrawlerRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetastoreCrawlerRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
