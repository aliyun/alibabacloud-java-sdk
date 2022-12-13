// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RecoverProblemRequest extends TeaModel {
    @NameInMap("problemId")
    public Long problemId;

    @NameInMap("problemNotifyType")
    public String problemNotifyType;

    @NameInMap("recoveryTime")
    public String recoveryTime;

    public static RecoverProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverProblemRequest self = new RecoverProblemRequest();
        return TeaModel.build(map, self);
    }

    public RecoverProblemRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public RecoverProblemRequest setProblemNotifyType(String problemNotifyType) {
        this.problemNotifyType = problemNotifyType;
        return this;
    }
    public String getProblemNotifyType() {
        return this.problemNotifyType;
    }

    public RecoverProblemRequest setRecoveryTime(String recoveryTime) {
        this.recoveryTime = recoveryTime;
        return this;
    }
    public String getRecoveryTime() {
        return this.recoveryTime;
    }

}
