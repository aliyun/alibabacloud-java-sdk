// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemEffectionServiceRequest extends TeaModel {
    /**
     * <p>clientToken</p>
     * 
     * <strong>example:</strong>
     * <p>e2d4306a-bf4d-4345-9ae6-158223c85dbd</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("effectionServiceId")
    public Long effectionServiceId;

    /**
     * <strong>example:</strong>
     * <p>46</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    public static GetProblemEffectionServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProblemEffectionServiceRequest self = new GetProblemEffectionServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetProblemEffectionServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetProblemEffectionServiceRequest setEffectionServiceId(Long effectionServiceId) {
        this.effectionServiceId = effectionServiceId;
        return this;
    }
    public Long getEffectionServiceId() {
        return this.effectionServiceId;
    }

    public GetProblemEffectionServiceRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
