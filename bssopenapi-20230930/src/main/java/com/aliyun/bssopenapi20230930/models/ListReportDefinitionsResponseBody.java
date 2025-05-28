// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListReportDefinitionsResponseBody extends TeaModel {
    @NameInMap("Metadata")
    public Object metadata;

    @NameInMap("ReportDefinitions")
    public java.util.List<ListReportDefinitionsResponseBodyReportDefinitions> reportDefinitions;

    /**
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListReportDefinitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReportDefinitionsResponseBody self = new ListReportDefinitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReportDefinitionsResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public ListReportDefinitionsResponseBody setReportDefinitions(java.util.List<ListReportDefinitionsResponseBodyReportDefinitions> reportDefinitions) {
        this.reportDefinitions = reportDefinitions;
        return this;
    }
    public java.util.List<ListReportDefinitionsResponseBodyReportDefinitions> getReportDefinitions() {
        return this.reportDefinitions;
    }

    public ListReportDefinitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListReportDefinitionsResponseBodyReportDefinitions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-05</p>
         */
        @NameInMap("BeginBillingCycle")
        public String beginBillingCycle;

        /**
         * <strong>example:</strong>
         * <p>oss-bill</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <strong>example:</strong>
         * <p>1234567812345678</p>
         */
        @NameInMap("OssBucketOwnerAccountId")
        public Long ossBucketOwnerAccountId;

        /**
         * <strong>example:</strong>
         * <p>bill/</p>
         */
        @NameInMap("OssBucketPath")
        public String ossBucketPath;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ReportSourceName")
        public String reportSourceName;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ReportSourceType")
        public String reportSourceType;

        /**
         * <strong>example:</strong>
         * <p>123321</p>
         */
        @NameInMap("ReportTaskId")
        public Long reportTaskId;

        /**
         * <strong>example:</strong>
         * <p>BillingItemDetailForBillingPeriod</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        /**
         * <strong>example:</strong>
         * <p>2025-05-21 10:36:31</p>
         */
        @NameInMap("SubscribeCreateTime")
        public String subscribeCreateTime;

        public static ListReportDefinitionsResponseBodyReportDefinitions build(java.util.Map<String, ?> map) throws Exception {
            ListReportDefinitionsResponseBodyReportDefinitions self = new ListReportDefinitionsResponseBodyReportDefinitions();
            return TeaModel.build(map, self);
        }

        public ListReportDefinitionsResponseBodyReportDefinitions setBeginBillingCycle(String beginBillingCycle) {
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }
        public String getBeginBillingCycle() {
            return this.beginBillingCycle;
        }

        public ListReportDefinitionsResponseBodyReportDefinitions setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public ListReportDefinitionsResponseBodyReportDefinitions setOssBucketOwnerAccountId(Long ossBucketOwnerAccountId) {
            this.ossBucketOwnerAccountId = ossBucketOwnerAccountId;
            return this;
        }
        public Long getOssBucketOwnerAccountId() {
            return this.ossBucketOwnerAccountId;
        }

        public ListReportDefinitionsResponseBodyReportDefinitions setOssBucketPath(String ossBucketPath) {
            this.ossBucketPath = ossBucketPath;
            return this;
        }
        public String getOssBucketPath() {
            return this.ossBucketPath;
        }

        public ListReportDefinitionsResponseBodyReportDefinitions setReportSourceName(String reportSourceName) {
            this.reportSourceName = reportSourceName;
            return this;
        }
        public String getReportSourceName() {
            return this.reportSourceName;
        }

        public ListReportDefinitionsResponseBodyReportDefinitions setReportSourceType(String reportSourceType) {
            this.reportSourceType = reportSourceType;
            return this;
        }
        public String getReportSourceType() {
            return this.reportSourceType;
        }

        public ListReportDefinitionsResponseBodyReportDefinitions setReportTaskId(Long reportTaskId) {
            this.reportTaskId = reportTaskId;
            return this;
        }
        public Long getReportTaskId() {
            return this.reportTaskId;
        }

        public ListReportDefinitionsResponseBodyReportDefinitions setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

        public ListReportDefinitionsResponseBodyReportDefinitions setSubscribeCreateTime(String subscribeCreateTime) {
            this.subscribeCreateTime = subscribeCreateTime;
            return this;
        }
        public String getSubscribeCreateTime() {
            return this.subscribeCreateTime;
        }

    }

}
