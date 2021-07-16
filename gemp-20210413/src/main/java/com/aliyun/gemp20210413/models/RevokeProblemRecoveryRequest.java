// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RevokeProblemRecoveryRequest extends TeaModel {
    // 故障ID
    @NameInMap("problemId")
    public Long problemId;

    // 通告类型 PROBLEM_NOTIFY：故障通告 PROBLEM_UPDATE：故障更新 PROBLEM_UPGRADE：故障升级 PROBLEM_DEGRADE：故障降级 PROBLEM_RECOVER：故障恢复 PROBLEM_REISSUE： 故障补发 PROBLEM_CANCEL：故障取消
    @NameInMap("problemNotifyType")
    public String problemNotifyType;

    // 幂等校验Id
    @NameInMap("clientToken")
    public String clientToken;

    public static RevokeProblemRecoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeProblemRecoveryRequest self = new RevokeProblemRecoveryRequest();
        return TeaModel.build(map, self);
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

    public RevokeProblemRecoveryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
