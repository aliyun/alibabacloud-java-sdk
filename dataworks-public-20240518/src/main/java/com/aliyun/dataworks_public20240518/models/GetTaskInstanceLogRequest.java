// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTaskInstanceLogRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The sequence number of an instance run. Minimum value: 1. By default, the latest run is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
