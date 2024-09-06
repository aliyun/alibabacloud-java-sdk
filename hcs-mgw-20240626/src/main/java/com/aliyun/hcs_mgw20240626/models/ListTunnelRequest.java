// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListTunnelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("marker")
    public String marker;

    public static ListTunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTunnelRequest self = new ListTunnelRequest();
        return TeaModel.build(map, self);
    }

    public ListTunnelRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListTunnelRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
