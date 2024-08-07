// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataArchiveCountResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetDataArchiveCountResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B63CAC5-BD7F-5C7C-82C9-59DFFBC3C5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataArchiveCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataArchiveCountResponseBody self = new GetDataArchiveCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataArchiveCountResponseBody setData(GetDataArchiveCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataArchiveCountResponseBodyData getData() {
        return this.data;
    }

    public GetDataArchiveCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataArchiveCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataArchiveCountResponseBodyData extends TeaModel {
        /**
         * <p>The number of tickets that data archiving failed.</p>
         * 
         * <strong>example:</strong>
         * <p>1**</p>
         */
        @NameInMap("FailCount")
        public Long failCount;

        /**
         * <p>The number of tickets that data archiving is in progress.</p>
         * 
         * <strong>example:</strong>
         * <p>2**</p>
         */
        @NameInMap("ProcessingCount")
        public Long processingCount;

        /**
         * <p>The number of tickets that data archiving is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>3**</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        /**
         * <p>The total number of data archiving tickets.</p>
         * 
         * <strong>example:</strong>
         * <p>6**</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetDataArchiveCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveCountResponseBodyData self = new GetDataArchiveCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveCountResponseBodyData setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public GetDataArchiveCountResponseBodyData setProcessingCount(Long processingCount) {
            this.processingCount = processingCount;
            return this;
        }
        public Long getProcessingCount() {
            return this.processingCount;
        }

        public GetDataArchiveCountResponseBodyData setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public GetDataArchiveCountResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
