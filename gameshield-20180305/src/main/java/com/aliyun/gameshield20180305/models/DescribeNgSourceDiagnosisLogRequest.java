// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeNgSourceDiagnosisLogRequest extends TeaModel {
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

    @NameInMap("AppId")
    public String appId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourcePort")
    public String sourcePort;

    @NameInMap("DetectPort")
    public String detectPort;

    @NameInMap("DetectIp")
    public String detectIp;

    public static DescribeNgSourceDiagnosisLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNgSourceDiagnosisLogRequest self = new DescribeNgSourceDiagnosisLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNgSourceDiagnosisLogRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeNgSourceDiagnosisLogRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNgSourceDiagnosisLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeNgSourceDiagnosisLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeNgSourceDiagnosisLogRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeNgSourceDiagnosisLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNgSourceDiagnosisLogRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeNgSourceDiagnosisLogRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeNgSourceDiagnosisLogRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeNgSourceDiagnosisLogRequest setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }
    public String getSourcePort() {
        return this.sourcePort;
    }

    public DescribeNgSourceDiagnosisLogRequest setDetectPort(String detectPort) {
        this.detectPort = detectPort;
        return this;
    }
    public String getDetectPort() {
        return this.detectPort;
    }

    public DescribeNgSourceDiagnosisLogRequest setDetectIp(String detectIp) {
        this.detectIp = detectIp;
        return this;
    }
    public String getDetectIp() {
        return this.detectIp;
    }

}
