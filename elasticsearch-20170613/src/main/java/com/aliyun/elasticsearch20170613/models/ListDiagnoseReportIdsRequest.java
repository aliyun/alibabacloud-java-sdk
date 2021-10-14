// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportIdsRequest extends TeaModel {
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

    public static ListDiagnoseReportIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseReportIdsRequest self = new ListDiagnoseReportIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseReportIdsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDiagnoseReportIdsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDiagnoseReportIdsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListDiagnoseReportIdsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListDiagnoseReportIdsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDiagnoseReportIdsRequest setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }
    public String getTrigger() {
        return this.trigger;
    }

}
