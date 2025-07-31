// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsBatchFeedbackResponseBody extends TeaModel {
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
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("Tips")
    public String tips;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static UpdateOssCheckResultsBatchFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsBatchFeedbackResponseBody self = new UpdateOssCheckResultsBatchFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsBatchFeedbackResponseBody setInvalidCount(Integer invalidCount) {
        this.invalidCount = invalidCount;
        return this;
    }
    public Integer getInvalidCount() {
        return this.invalidCount;
    }

    public UpdateOssCheckResultsBatchFeedbackResponseBody setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }
    public Integer getRepeatCount() {
        return this.repeatCount;
    }

    public UpdateOssCheckResultsBatchFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateOssCheckResultsBatchFeedbackResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public UpdateOssCheckResultsBatchFeedbackResponseBody setTips(String tips) {
        this.tips = tips;
        return this;
    }
    public String getTips() {
        return this.tips;
    }

    public UpdateOssCheckResultsBatchFeedbackResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
