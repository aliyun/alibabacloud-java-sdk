// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryUltraShortTermLoadForecastDataRequest extends TeaModel {
    @NameInMap("deviceSnList")
    public java.util.List<String> deviceSnList;

    @NameInMap("dsTime")
    public String dsTime;

    @NameInMap("dsType")
    public String dsType;

    @NameInMap("timeZone")
    public String timeZone;

    public static QueryUltraShortTermLoadForecastDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUltraShortTermLoadForecastDataRequest self = new QueryUltraShortTermLoadForecastDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryUltraShortTermLoadForecastDataRequest setDeviceSnList(java.util.List<String> deviceSnList) {
        this.deviceSnList = deviceSnList;
        return this;
    }
    public java.util.List<String> getDeviceSnList() {
        return this.deviceSnList;
    }

    public QueryUltraShortTermLoadForecastDataRequest setDsTime(String dsTime) {
        this.dsTime = dsTime;
        return this;
    }
    public String getDsTime() {
        return this.dsTime;
    }

    public QueryUltraShortTermLoadForecastDataRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public QueryUltraShortTermLoadForecastDataRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
