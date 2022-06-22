// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateInspectJobRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Cron")
    public String cron;

    @NameInMap("Date")
    public Long date;

    @NameInMap("Day")
    public String day;

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

    @NameInMap("Type")
    public String type;

    @NameInMap("Week")
    public String week;

    public static CreateInspectJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectJobRequest self = new CreateInspectJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateInspectJobRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CreateInspectJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateInspectJobRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateInspectJobRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public CreateInspectJobRequest setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public CreateInspectJobRequest setDay(String day) {
        this.day = day;
        return this;
    }
    public String getDay() {
        return this.day;
    }

    public CreateInspectJobRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateInspectJobRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateInspectJobRequest setTerminationDate(Long terminationDate) {
        this.terminationDate = terminationDate;
        return this;
    }
    public Long getTerminationDate() {
        return this.terminationDate;
    }

    public CreateInspectJobRequest setTerminationTime(Long terminationTime) {
        this.terminationTime = terminationTime;
        return this;
    }
    public Long getTerminationTime() {
        return this.terminationTime;
    }

    public CreateInspectJobRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public CreateInspectJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateInspectJobRequest setWeek(String week) {
        this.week = week;
        return this;
    }
    public String getWeek() {
        return this.week;
    }

}
