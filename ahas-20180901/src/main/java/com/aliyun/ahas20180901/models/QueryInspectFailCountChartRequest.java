// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryInspectFailCountChartRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("DayCount")
    public Integer dayCount;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryInspectFailCountChartRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInspectFailCountChartRequest self = new QueryInspectFailCountChartRequest();
        return TeaModel.build(map, self);
    }

    public QueryInspectFailCountChartRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryInspectFailCountChartRequest setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
        return this;
    }
    public Integer getDayCount() {
        return this.dayCount;
    }

    public QueryInspectFailCountChartRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryInspectFailCountChartRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
