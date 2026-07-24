// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsUnfreezeResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public UpdateOssCheckResultsUnfreezeResponseBodyData data;

    /**
     * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOssCheckResultsUnfreezeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsUnfreezeResponseBody self = new UpdateOssCheckResultsUnfreezeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsUnfreezeResponseBody setData(UpdateOssCheckResultsUnfreezeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateOssCheckResultsUnfreezeResponseBodyData getData() {
        return this.data;
    }

    public UpdateOssCheckResultsUnfreezeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateOssCheckResultsUnfreezeResponseBodyData extends TeaModel {
        /**
         * <p>The number of invalid records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InvalidCount")
        public Integer invalidCount;

        /**
         * <p>The number of duplicate records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatCount")
        public Integer repeatCount;

        /**
         * <p>The number of successful records.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static UpdateOssCheckResultsUnfreezeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateOssCheckResultsUnfreezeResponseBodyData self = new UpdateOssCheckResultsUnfreezeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateOssCheckResultsUnfreezeResponseBodyData setInvalidCount(Integer invalidCount) {
            this.invalidCount = invalidCount;
            return this;
        }
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        public UpdateOssCheckResultsUnfreezeResponseBodyData setRepeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        public UpdateOssCheckResultsUnfreezeResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public UpdateOssCheckResultsUnfreezeResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
