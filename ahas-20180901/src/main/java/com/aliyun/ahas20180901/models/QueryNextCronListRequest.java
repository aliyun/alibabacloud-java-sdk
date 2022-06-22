// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryNextCronListRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Cron")
    public String cron;

    @NameInMap("Date")
    public Long date;

    @NameInMap("Day")
    public String day;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("TerminationDate")
    public Long terminationDate;

    @NameInMap("TerminationTime")
    public Long terminationTime;

    @NameInMap("Time")
    public Long time;

    @NameInMap("Week")
    public String week;

    public static QueryNextCronListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNextCronListRequest self = new QueryNextCronListRequest();
        return TeaModel.build(map, self);
    }

    public QueryNextCronListRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryNextCronListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryNextCronListRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryNextCronListRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public QueryNextCronListRequest setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public QueryNextCronListRequest setDay(String day) {
        this.day = day;
        return this;
    }
    public String getDay() {
        return this.day;
    }

    public QueryNextCronListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryNextCronListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryNextCronListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryNextCronListRequest setTerminationDate(Long terminationDate) {
        this.terminationDate = terminationDate;
        return this;
    }
    public Long getTerminationDate() {
        return this.terminationDate;
    }

    public QueryNextCronListRequest setTerminationTime(Long terminationTime) {
        this.terminationTime = terminationTime;
        return this;
    }
    public Long getTerminationTime() {
        return this.terminationTime;
    }

    public QueryNextCronListRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public QueryNextCronListRequest setWeek(String week) {
        this.week = week;
        return this;
    }
    public String getWeek() {
        return this.week;
    }

}
