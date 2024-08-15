// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CancelProblemRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>取消原因</p>
     */
    @NameInMap("cancelReason")
    public Long cancelReason;

    /**
     * <strong>example:</strong>
     * <p>原因描述</p>
     */
    @NameInMap("cancelReasonDescription")
    public String cancelReasonDescription;

    /**
     * <strong>example:</strong>
     * <p>4361a0e1-6747-4834-96ce-0c4840fd3812</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>312</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    /**
     * <strong>example:</strong>
     * <p>PROBLEM_NOTIFY</p>
     */
    @NameInMap("problemNotifyType")
    public Long problemNotifyType;

    public static CancelProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelProblemRequest self = new CancelProblemRequest();
        return TeaModel.build(map, self);
    }

    public CancelProblemRequest setCancelReason(Long cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }
    public Long getCancelReason() {
        return this.cancelReason;
    }

    public CancelProblemRequest setCancelReasonDescription(String cancelReasonDescription) {
        this.cancelReasonDescription = cancelReasonDescription;
        return this;
    }
    public String getCancelReasonDescription() {
        return this.cancelReasonDescription;
    }

    public CancelProblemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CancelProblemRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public CancelProblemRequest setProblemNotifyType(Long problemNotifyType) {
        this.problemNotifyType = problemNotifyType;
        return this;
    }
    public Long getProblemNotifyType() {
        return this.problemNotifyType;
    }

}
