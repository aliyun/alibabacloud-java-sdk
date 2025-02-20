// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListJobHistoryRequest extends TeaModel {
    /**
     * <p>Specifies the number of running records of the migration task to be returned.\
     * Valid values: 0 - 1000.\
     * Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The marker after which the running history of the task is listed.\
     * By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>test_marker</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The execution ID of the task. If you specify an execution ID, only the running history related to the execution ID is listed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("runtimeId")
    public Integer runtimeId;

    public static ListJobHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobHistoryRequest self = new ListJobHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListJobHistoryRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListJobHistoryRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListJobHistoryRequest setRuntimeId(Integer runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public Integer getRuntimeId() {
        return this.runtimeId;
    }

}
