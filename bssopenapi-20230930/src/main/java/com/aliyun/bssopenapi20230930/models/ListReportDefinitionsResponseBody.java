// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListReportDefinitionsResponseBody extends TeaModel {
    /**
     * <p>Response structure metadata</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>Report definition list</p>
     */
    @NameInMap("ReportDefinitions")
    public java.util.List<ListReportDefinitionsResponseBodyReportDefinitions> reportDefinitions;

    /**
     * <p>Request ID.</p>
     * 
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
         * <p>Whether to enable tag fields</p>
         */
        @NameInMap("AutoTagFields")
        public Boolean autoTagFields;

        /**
         * <p>Push start billing cycle. After the subscription is successfully created, the system automatically pushes data from the start billing cycle to the current time. This parameter is invalid for monthly billing PDF subscriptions and does not re-push historical data. A maximum of data from the last 1 year can be pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05</p>
         */
        @NameInMap("BeginBillingCycle")
        public String beginBillingCycle;

        /**
         * <p>Name of the OSS bucket where files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bill</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <p>UID of the OSS owner that stores the files. Specify this parameter if you subscribe as a BID/ReSeller and want to push data to the OSS of a sub-account. The specified account must be a sub-account of the calling account and must be granted the AliyunConsumeDump2OSSRole permission. Regular users do not need to specify this parameter. The default value is the calling account.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567812345678</p>
         */
        @NameInMap("OssBucketOwnerAccountId")
        public Long ossBucketOwnerAccountId;

        /**
         * <p>OSS bucket storage path.</p>
         * 
         * <strong>example:</strong>
         * <p>bill/</p>
         */
        @NameInMap("OssBucketPath")
        public String ossBucketPath;

        /**
         * <p>Name of the subscription source.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ReportSourceName")
        public String reportSourceName;

        /**
         * <p>Type of the subscription source. Valid values: OSS and MC.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ReportSourceType")
        public String reportSourceType;

        /**
         * <p>Billing subscription task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123321</p>
         */
        @NameInMap("ReportTaskId")
        public Long reportTaskId;

        /**
         * <p>Subscription type. Valid values:</p>
         * <ul>
         * <li>BillingItemDetailForBillingPeriod: billing item consumption details.</li>
         * <li>InstanceDetailForBillingPeriod: instance consumption details.</li>
         * <li>BillingItemDetailMonthly: billing item consumption summary by billing cycle.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BillingItemDetailForBillingPeriod</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        /**
         * <p>Specified subscribed fields</p>
         */
        @NameInMap("SelectedFields")
        public java.util.List<String> selectedFields;

        /**
         * <p>Time when the subscription was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-21 10:36:31</p>
         */
        @NameInMap("SubscribeCreateTime")
        public String subscribeCreateTime;

        public static ListReportDefinitionsResponseBodyReportDefinitions build(java.util.Map<String, ?> map) throws Exception {
            ListReportDefinitionsResponseBodyReportDefinitions self = new ListReportDefinitionsResponseBodyReportDefinitions();
            return TeaModel.build(map, self);
        }

        public ListReportDefinitionsResponseBodyReportDefinitions setAutoTagFields(Boolean autoTagFields) {
            this.autoTagFields = autoTagFields;
            return this;
        }
        public Boolean getAutoTagFields() {
            return this.autoTagFields;
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

        public ListReportDefinitionsResponseBodyReportDefinitions setSelectedFields(java.util.List<String> selectedFields) {
            this.selectedFields = selectedFields;
            return this;
        }
        public java.util.List<String> getSelectedFields() {
            return this.selectedFields;
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
