// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemNoticeRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("problemId")
    public Long problemId;

    @NameInMap("problemNotifyType")
    public String problemNotifyType;

    public static UpdateProblemNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemNoticeRequest self = new UpdateProblemNoticeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProblemNoticeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProblemNoticeRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public UpdateProblemNoticeRequest setProblemNotifyType(String problemNotifyType) {
        this.problemNotifyType = problemNotifyType;
        return this;
    }
    public String getProblemNotifyType() {
        return this.problemNotifyType;
    }

}
