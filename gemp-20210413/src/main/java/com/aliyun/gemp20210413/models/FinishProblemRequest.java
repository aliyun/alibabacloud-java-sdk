// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class FinishProblemRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6338F42D-ED0B-442C-932C-657300AFB4BB</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>3123</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    public static FinishProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishProblemRequest self = new FinishProblemRequest();
        return TeaModel.build(map, self);
    }

    public FinishProblemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FinishProblemRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
