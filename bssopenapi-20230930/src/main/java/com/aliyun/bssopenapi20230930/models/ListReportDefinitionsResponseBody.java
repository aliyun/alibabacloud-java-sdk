// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListReportDefinitionsResponseBody extends TeaModel {
    /**
     * <p>The metadata of the response struct.</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("ReportDefinitions")
    public java.util.List<ListReportDefinitionsResponseBodyReportDefinitions> reportDefinitions;

    /**
     * <p>The request ID.</p>
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
         * <p>The start billing cycle for push. After the subscription is created, the system automatically pushes data from the start billing cycle to the current time. This parameter does not take effect for monthly bill PDF subscriptions, and historical data is not re-pushed. Data within the last year can be pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05</p>
         */
        @NameInMap("BeginBillingCycle")
        public String beginBillingCycle;

        /**
         * <p>The name of the OSS bucket that stores the files.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bill</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <p>The UID of the OSS bucket owner that stores the files. Specify this parameter when a Bid/Reseller subscription needs to push data to the OSS bucket of a sub-account. The specified account must be a sub-account of the calling account and must be granted the AliyunConsumeDump2OSSRole permission. Regular users do not need to specify this parameter. The calling account is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567812345678</p>
         */
        @NameInMap("OssBucketOwnerAccountId")
        public Long ossBucketOwnerAccountId;

        /**
         * <p>The storage path of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>bill/</p>
         */
        @NameInMap("OssBucketPath")
        public String ossBucketPath;

        /**
         * <p>The subscription source name.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ReportSourceName")
        public String reportSourceName;

        /**
         * <p>The subscription source. Valid values: OSS and MC.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ReportSourceType")
        public String reportSourceType;

        /**
         * <p>The bill subscription task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123321</p>
         */
        @NameInMap("ReportTaskId")
        public Long reportTaskId;

        /**
         * <p>The subscription type. Valid values:</p>
         * <ul>
         * <li>BillingItemDetailForBillingPeriod: billable item consumption details.</li>
         * <li>InstanceDetailForBillingPeriod: instance consumption details.</li>
         * <li>BillingItemDetailMonthly: billable item consumption summary by billing cycle.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BillingItemDetailForBillingPeriod</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        /**
         * <p>The time when the subscription was created.</p>
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
