// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemEffectionServiceRequest extends TeaModel {
    /**
     * <p>clientToken</p>
     * 
     * <strong>example:</strong>
     * <p>e0b6735e-1a04-4d6b-a625-d2350612492c</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>567</p>
     */
    @NameInMap("effectionServiceId")
    public Long effectionServiceId;

    /**
     * <strong>example:</strong>
     * <p>876</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    public static DeleteProblemEffectionServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemEffectionServiceRequest self = new DeleteProblemEffectionServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProblemEffectionServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteProblemEffectionServiceRequest setEffectionServiceId(Long effectionServiceId) {
        this.effectionServiceId = effectionServiceId;
        return this;
    }
    public Long getEffectionServiceId() {
        return this.effectionServiceId;
    }

    public DeleteProblemEffectionServiceRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
