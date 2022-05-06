// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDataSourceItemRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchName")
    public String searchName;

    public static ListDataSourceItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceItemRequest self = new ListDataSourceItemRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceItemRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public ListDataSourceItemRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListDataSourceItemRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListDataSourceItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSourceItemRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

}
