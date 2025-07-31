// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsFreezeResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateOssCheckResultsFreezeResponseBodyData data;

    /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InvalidCount")
        public Integer invalidCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatCount")
        public Integer repeatCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
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
