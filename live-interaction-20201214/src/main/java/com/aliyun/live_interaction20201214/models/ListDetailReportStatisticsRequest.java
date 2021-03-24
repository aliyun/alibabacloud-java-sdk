// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListDetailReportStatisticsRequest extends TeaModel {
    // 应用Id
    @NameInMap("AppId")
    public String appId;

    // 请求
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
        // 开始时间，utc
        @NameInMap("StartTime")
        public String startTime;

        // 结束时间，utc
        @NameInMap("EndTime")
        public String endTime;

        // 报表类型  user、groupChat、message
        @NameInMap("ReportStatisticsType")
        public String reportStatisticsType;

        public static ListDetailReportStatisticsRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListDetailReportStatisticsRequestRequestParams self = new ListDetailReportStatisticsRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ListDetailReportStatisticsRequestRequestParams setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
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

    }

}
