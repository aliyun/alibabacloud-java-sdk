// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("detail")
    public Boolean detail;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("lang")
    public String lang;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("trigger")
    public String trigger;

    public static ListDiagnoseReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseReportRequest self = new ListDiagnoseReportRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseReportRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListDiagnoseReportRequest setDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }
    public Boolean getDetail() {
        return this.detail;
    }

    public ListDiagnoseReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDiagnoseReportRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDiagnoseReportRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListDiagnoseReportRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListDiagnoseReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDiagnoseReportRequest setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }
    public String getTrigger() {
        return this.trigger;
    }

}
