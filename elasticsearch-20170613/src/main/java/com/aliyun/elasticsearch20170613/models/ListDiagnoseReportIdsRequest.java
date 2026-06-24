// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportIdsRequest extends TeaModel {
    /**
     * <p>The end timestamp of the query.
     * Minimum value: 1000000000000 ms
     * Maximum value: 2000000000000 ms.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1595174399999</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The language of the reports to retrieve. Default value: the browser language. Valid values:</p>
     * <ul>
     * <li>en: English</li>
     * <li>zh: Simplified Chinese</li>
     * <li>zt: Traditional Chinese</li>
     * <li>es: Spanish</li>
     * <li>fr: French.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>The page number. Default value: 1. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of report IDs per page. Default value: 10. Minimum value: 1. Maximum value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The start timestamp of the query.
     * Minimum value: 1000000000000 ms
     * Maximum value: 2000000000000 ms.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1595088000000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The trigger method of the health diagnostics. Valid values: SYSTEM (automatically triggered by the system), INNER (internally triggered), and USER (manually triggered by the user).</p>
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
