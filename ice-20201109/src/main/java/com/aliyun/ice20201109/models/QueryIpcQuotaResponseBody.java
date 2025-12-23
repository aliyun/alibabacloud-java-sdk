// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryIpcQuotaResponseBody extends TeaModel {
    @NameInMap("IpcQuotaInfos")
    public java.util.List<QueryIpcQuotaResponseBodyIpcQuotaInfos> ipcQuotaInfos;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>39</p>
     */
    @NameInMap("Total")
    public String total;

    public static QueryIpcQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIpcQuotaResponseBody self = new QueryIpcQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIpcQuotaResponseBody setIpcQuotaInfos(java.util.List<QueryIpcQuotaResponseBodyIpcQuotaInfos> ipcQuotaInfos) {
        this.ipcQuotaInfos = ipcQuotaInfos;
        return this;
    }
    public java.util.List<QueryIpcQuotaResponseBodyIpcQuotaInfos> getIpcQuotaInfos() {
        return this.ipcQuotaInfos;
    }

    public QueryIpcQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIpcQuotaResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class QueryIpcQuotaResponseBodyIpcQuotaInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>understand</p>
         */
        @NameInMap("Capability")
        public String capability;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ConsumedQuota")
        public Long consumedQuota;

        /**
         * <strong>example:</strong>
         * <p>2025-12-21T16:00:00Z</p>
         */
        @NameInMap("DateTime")
        public String dateTime;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MaxQuota")
        public Long maxQuota;

        public static QueryIpcQuotaResponseBodyIpcQuotaInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryIpcQuotaResponseBodyIpcQuotaInfos self = new QueryIpcQuotaResponseBodyIpcQuotaInfos();
            return TeaModel.build(map, self);
        }

        public QueryIpcQuotaResponseBodyIpcQuotaInfos setCapability(String capability) {
            this.capability = capability;
            return this;
        }
        public String getCapability() {
            return this.capability;
        }

        public QueryIpcQuotaResponseBodyIpcQuotaInfos setConsumedQuota(Long consumedQuota) {
            this.consumedQuota = consumedQuota;
            return this;
        }
        public Long getConsumedQuota() {
            return this.consumedQuota;
        }

        public QueryIpcQuotaResponseBodyIpcQuotaInfos setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public QueryIpcQuotaResponseBodyIpcQuotaInfos setMaxQuota(Long maxQuota) {
            this.maxQuota = maxQuota;
            return this;
        }
        public Long getMaxQuota() {
            return this.maxQuota;
        }

    }

}
