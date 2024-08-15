// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemSubtotalsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4361a0e1-6747-4834-96ce-0c4840fdB812</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1231</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    public static ListProblemSubtotalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProblemSubtotalsRequest self = new ListProblemSubtotalsRequest();
        return TeaModel.build(map, self);
    }

    public ListProblemSubtotalsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListProblemSubtotalsRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
