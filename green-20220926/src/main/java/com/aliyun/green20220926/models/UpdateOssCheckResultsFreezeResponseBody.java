// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsFreezeResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public UpdateOssCheckResultsFreezeResponseBodyData data;

    /**
     * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOssCheckResultsFreezeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsFreezeResponseBody self = new UpdateOssCheckResultsFreezeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsFreezeResponseBody setData(UpdateOssCheckResultsFreezeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateOssCheckResultsFreezeResponseBodyData getData() {
        return this.data;
    }

    public UpdateOssCheckResultsFreezeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateOssCheckResultsFreezeResponseBodyData extends TeaModel {
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
         * <p>The number of successful operations.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static UpdateOssCheckResultsFreezeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateOssCheckResultsFreezeResponseBodyData self = new UpdateOssCheckResultsFreezeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateOssCheckResultsFreezeResponseBodyData setInvalidCount(Integer invalidCount) {
            this.invalidCount = invalidCount;
            return this;
        }
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        public UpdateOssCheckResultsFreezeResponseBodyData setRepeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        public UpdateOssCheckResultsFreezeResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public UpdateOssCheckResultsFreezeResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
