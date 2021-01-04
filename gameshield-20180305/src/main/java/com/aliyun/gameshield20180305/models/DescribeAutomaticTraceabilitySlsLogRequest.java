// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAutomaticTraceabilitySlsLogRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("EsnAppId")
    public String esnAppId;

    @NameInMap("Source")
    public String source;

    public static DescribeAutomaticTraceabilitySlsLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomaticTraceabilitySlsLogRequest self = new DescribeAutomaticTraceabilitySlsLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutomaticTraceabilitySlsLogRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAutomaticTraceabilitySlsLogRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAutomaticTraceabilitySlsLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeAutomaticTraceabilitySlsLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAutomaticTraceabilitySlsLogRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeAutomaticTraceabilitySlsLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutomaticTraceabilitySlsLogRequest setEsnAppId(String esnAppId) {
        this.esnAppId = esnAppId;
        return this;
    }
    public String getEsnAppId() {
        return this.esnAppId;
    }

    public DescribeAutomaticTraceabilitySlsLogRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
