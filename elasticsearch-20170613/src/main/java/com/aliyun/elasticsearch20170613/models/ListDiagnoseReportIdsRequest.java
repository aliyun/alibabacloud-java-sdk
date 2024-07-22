// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportIdsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value must be a UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1595174399999</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The language of the reports.</p>
     * 
     * <strong>example:</strong>
     * <p>spanish</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>The number of the page to return. Valid values: 1 to 200. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 500. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The beginning of the time range to query. The value must be a UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1595088000000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The method that is used to trigger health diagnostics. Valid values: SYSTEM, INNER, and USER.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
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
