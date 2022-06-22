// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetResourcesPDFReportRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ReportUUID")
    public String reportUUID;

    @NameInMap("Resources")
    public String resources;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetResourcesPDFReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourcesPDFReportRequest self = new GetResourcesPDFReportRequest();
        return TeaModel.build(map, self);
    }

    public GetResourcesPDFReportRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetResourcesPDFReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetResourcesPDFReportRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetResourcesPDFReportRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetResourcesPDFReportRequest setReportUUID(String reportUUID) {
        this.reportUUID = reportUUID;
        return this;
    }
    public String getReportUUID() {
        return this.reportUUID;
    }

    public GetResourcesPDFReportRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public GetResourcesPDFReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
