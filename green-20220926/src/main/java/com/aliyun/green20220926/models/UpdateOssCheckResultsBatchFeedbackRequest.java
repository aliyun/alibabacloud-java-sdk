// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsBatchFeedbackRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>misreport</p>
     */
    @NameInMap("Feedback")
    public String feedback;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Items")
    public String items;

    /**
     * <strong>example:</strong>
     * <p>P_XHDUS</p>
     */
    @NameInMap("ParentTaskId")
    public String parentTaskId;

    public static UpdateOssCheckResultsBatchFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsBatchFeedbackRequest self = new UpdateOssCheckResultsBatchFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsBatchFeedbackRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public UpdateOssCheckResultsBatchFeedbackRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public UpdateOssCheckResultsBatchFeedbackRequest setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }
    public String getParentTaskId() {
        return this.parentTaskId;
    }

}
