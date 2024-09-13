// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryRecordMinutesUrlResponseBody extends TeaModel {
    @NameInMap("recordMinutesUrls")
    public java.util.List<QueryRecordMinutesUrlResponseBodyRecordMinutesUrls> recordMinutesUrls;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static QueryRecordMinutesUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordMinutesUrlResponseBody self = new QueryRecordMinutesUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordMinutesUrlResponseBody setRecordMinutesUrls(java.util.List<QueryRecordMinutesUrlResponseBodyRecordMinutesUrls> recordMinutesUrls) {
        this.recordMinutesUrls = recordMinutesUrls;
        return this;
    }
    public java.util.List<QueryRecordMinutesUrlResponseBodyRecordMinutesUrls> getRecordMinutesUrls() {
        return this.recordMinutesUrls;
    }

    public QueryRecordMinutesUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordMinutesUrlResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public QueryRecordMinutesUrlResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class QueryRecordMinutesUrlResponseBodyRecordMinutesUrls extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("RecordMinutesUrl")
        public String recordMinutesUrl;

        public static QueryRecordMinutesUrlResponseBodyRecordMinutesUrls build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordMinutesUrlResponseBodyRecordMinutesUrls self = new QueryRecordMinutesUrlResponseBodyRecordMinutesUrls();
            return TeaModel.build(map, self);
        }

        public QueryRecordMinutesUrlResponseBodyRecordMinutesUrls setRecordMinutesUrl(String recordMinutesUrl) {
            this.recordMinutesUrl = recordMinutesUrl;
            return this;
        }
        public String getRecordMinutesUrl() {
            return this.recordMinutesUrl;
        }

    }

}
