// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RevokeProblemRecoveryRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("problemId")
    public Long problemId;

    @NameInMap("problemNotifyType")
    public String problemNotifyType;

    public static RevokeProblemRecoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeProblemRecoveryRequest self = new RevokeProblemRecoveryRequest();
        return TeaModel.build(map, self);
    }

    public RevokeProblemRecoveryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RevokeProblemRecoveryRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public RevokeProblemRecoveryRequest setProblemNotifyType(String problemNotifyType) {
        this.problemNotifyType = problemNotifyType;
        return this;
    }
    public String getProblemNotifyType() {
        return this.problemNotifyType;
    }

}
