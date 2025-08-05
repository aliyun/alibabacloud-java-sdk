// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetTaskInstanceLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("RunNumber")
    public Integer runNumber;

    public static GetTaskInstanceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInstanceLogRequest self = new GetTaskInstanceLogRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskInstanceLogRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetTaskInstanceLogRequest setRunNumber(Integer runNumber) {
        this.runNumber = runNumber;
        return this;
    }
    public Integer getRunNumber() {
        return this.runNumber;
    }

}
