// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySchedulePeriodListRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageId")
    public Integer pageId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScheduleCode")
    public String scheduleCode;

    public static QuerySchedulePeriodListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySchedulePeriodListRequest self = new QuerySchedulePeriodListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySchedulePeriodListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySchedulePeriodListRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySchedulePeriodListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySchedulePeriodListRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

}
