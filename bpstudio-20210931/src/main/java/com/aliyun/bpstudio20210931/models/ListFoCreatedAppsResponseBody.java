// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListFoCreatedAppsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The templates.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListFoCreatedAppsResponseBodyData> data;

    /**
     * <p>The returned error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Cannot find region according to your domain.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40F63F07-3AB6-53B3-8825-0580C130E3EA</p>
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
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>JIX9NEZUALGS46UI</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The URL of the error report.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api.aliyun.com/troubleshoot?q=ServiceUnavailable&product=BPStudio&requestId=4CDA03A3-C652-1408-8ABD-7E652A7CBFB6">https://api.aliyun.com/troubleshoot?q=ServiceUnavailable&amp;product=BPStudio&amp;requestId=4CDA03A3-C652-1408-8ABD-7E652A7CBFB6</a></p>
         */
        @NameInMap("ReportUrl")
        public String reportUrl;

        /**
         * <p>The state of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployed_Success
         * Destroyed_Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>容灾计划1</p>
         */
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
