// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListServiceConnectionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sericeConnectionType")
    public String sericeConnectionType;

    public static ListServiceConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConnectionsRequest self = new ListServiceConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceConnectionsRequest setSericeConnectionType(String sericeConnectionType) {
        this.sericeConnectionType = sericeConnectionType;
        return this;
    }
    public String getSericeConnectionType() {
        return this.sericeConnectionType;
    }

}
