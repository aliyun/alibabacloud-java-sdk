// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListDetailReportStatisticsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public ListDetailReportStatisticsRequestRequestParams requestParams;

    public static ListDetailReportStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDetailReportStatisticsRequest self = new ListDetailReportStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListDetailReportStatisticsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListDetailReportStatisticsRequest setRequestParams(ListDetailReportStatisticsRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public ListDetailReportStatisticsRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class ListDetailReportStatisticsRequestRequestParams extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ReportStatisticsType")
        public String reportStatisticsType;

        @NameInMap("StartTime")
        public String startTime;

        public static ListDetailReportStatisticsRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListDetailReportStatisticsRequestRequestParams self = new ListDetailReportStatisticsRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ListDetailReportStatisticsRequestRequestParams setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDetailReportStatisticsRequestRequestParams setReportStatisticsType(String reportStatisticsType) {
            this.reportStatisticsType = reportStatisticsType;
            return this;
        }
        public String getReportStatisticsType() {
            return this.reportStatisticsType;
        }

        public ListDetailReportStatisticsRequestRequestParams setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
