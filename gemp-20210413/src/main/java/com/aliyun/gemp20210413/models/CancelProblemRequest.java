// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CancelProblemRequest extends TeaModel {
    @NameInMap("cancelReason")
    public Long cancelReason;

    @NameInMap("cancelReasonDescription")
    public String cancelReasonDescription;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("problemId")
    public Long problemId;

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
