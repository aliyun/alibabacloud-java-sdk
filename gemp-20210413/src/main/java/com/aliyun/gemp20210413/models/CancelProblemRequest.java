// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CancelProblemRequest extends TeaModel {
    // 取消原因
    @NameInMap("cancelReason")
    public Long cancelReason;

    // 取消原因描述
    @NameInMap("cancelReasonDescription")
    public String cancelReasonDescription;

    // 幂等校验token
    @NameInMap("clientToken")
    public String clientToken;

    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    // PROBLEM_NOTIFY	通告类型 PROBLEM_NOTIFY：故障通告 PROBLEM_UPDATE：故障更新 PROBLEM_UPGRADE：故障升级 PROBLEM_DEGRADE：故障降级 PROBLEM_RECOVER：故障恢复 PROBLEM_REISSUE： 故障补发 PROBLEM_CANCEL：故障取消
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
