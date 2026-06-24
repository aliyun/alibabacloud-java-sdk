// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportRequest extends TeaModel {
    /**
     * <p>Specifies whether to display the details of diagnostic items.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("detail")
    public Boolean detail;

    /**
     * <p>The end timestamp of the query. Unit: milliseconds.</p>
     * <ul>
     * <li>Minimum value: 1000000000000</li>
     * <li>Maximum value: 2000000000000.</li>
     * </ul>
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
     * <p>es</p>
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
     * <p>The number of reports per page. Default value: 10. Minimum value: 1. Maximum value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The start timestamp of the query. Unit: milliseconds.</p>
     * <ul>
     * <li>Minimum value: 1000000000000</li>
     * <li>Maximum value: 2000000000000.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1594569600000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The trigger method of the health diagnostics. Valid values:</p>
     * <ul>
     * <li>SYSTEM (default): automatically triggered by the system</li>
     * <li>INNER: internally triggered</li>
     * <li>USER: manually triggered by the user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("trigger")
    public String trigger;

    public static ListDiagnoseReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseReportRequest self = new ListDiagnoseReportRequest();
        return TeaModel.build(map, self);
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
