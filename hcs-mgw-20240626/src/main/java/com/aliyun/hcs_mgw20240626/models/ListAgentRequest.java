// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListAgentRequest extends TeaModel {
    /**
     * <p>Specifies the number of agents to be returned.\
     * Valid values: 0 - 1000.\
     * Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The marker after which the agents are listed.\
     * By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>test_agent</p>
     */
    @NameInMap("marker")
    public String marker;

    public static ListAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRequest self = new ListAgentRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListAgentRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
