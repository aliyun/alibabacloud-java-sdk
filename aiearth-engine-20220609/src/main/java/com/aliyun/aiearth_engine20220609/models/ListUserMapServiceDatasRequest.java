// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListUserMapServiceDatasRequest extends TeaModel {
    @NameInMap("CreateDay")
    public String createDay;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListUserMapServiceDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserMapServiceDatasRequest self = new ListUserMapServiceDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListUserMapServiceDatasRequest setCreateDay(String createDay) {
        this.createDay = createDay;
        return this;
    }
    public String getCreateDay() {
        return this.createDay;
    }

    public ListUserMapServiceDatasRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListUserMapServiceDatasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUserMapServiceDatasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserMapServiceDatasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
