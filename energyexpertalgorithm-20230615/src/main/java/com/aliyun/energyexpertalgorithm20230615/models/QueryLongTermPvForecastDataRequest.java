// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryLongTermPvForecastDataRequest extends TeaModel {
    @NameInMap("deviceSnList")
    public java.util.List<String> deviceSnList;

    @NameInMap("dsTime")
    public String dsTime;

    @NameInMap("dsType")
    public String dsType;

    @NameInMap("timeZone")
    public String timeZone;

    public static QueryLongTermPvForecastDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLongTermPvForecastDataRequest self = new QueryLongTermPvForecastDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryLongTermPvForecastDataRequest setDeviceSnList(java.util.List<String> deviceSnList) {
        this.deviceSnList = deviceSnList;
        return this;
    }
    public java.util.List<String> getDeviceSnList() {
        return this.deviceSnList;
    }

    public QueryLongTermPvForecastDataRequest setDsTime(String dsTime) {
        this.dsTime = dsTime;
        return this;
    }
    public String getDsTime() {
        return this.dsTime;
    }

    public QueryLongTermPvForecastDataRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public QueryLongTermPvForecastDataRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
