// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListJobHistoryRequest extends TeaModel {
    /**
     * <p>The maximum number of history entries to return.<br> Valid values: 1 to 1000.<br> Default value: 1000.<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The pagination token. Set this parameter to the marker value returned in the previous response to retrieve the next page of results. If not specified, results are returned from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>test_marker</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The execution ID of a specific run. Specify this parameter to retrieve the run history for only that execution.</p>
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
