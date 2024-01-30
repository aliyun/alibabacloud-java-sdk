// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListFoCreatedAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListFoCreatedAppsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFoCreatedAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFoCreatedAppsResponseBody self = new ListFoCreatedAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFoCreatedAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFoCreatedAppsResponseBody setData(java.util.List<ListFoCreatedAppsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFoCreatedAppsResponseBodyData> getData() {
        return this.data;
    }

    public ListFoCreatedAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFoCreatedAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFoCreatedAppsResponseBodyData extends TeaModel {
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ReportUrl")
        public String reportUrl;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        public static ListFoCreatedAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFoCreatedAppsResponseBodyData self = new ListFoCreatedAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFoCreatedAppsResponseBodyData setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListFoCreatedAppsResponseBodyData setReportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }
        public String getReportUrl() {
            return this.reportUrl;
        }

        public ListFoCreatedAppsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFoCreatedAppsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
