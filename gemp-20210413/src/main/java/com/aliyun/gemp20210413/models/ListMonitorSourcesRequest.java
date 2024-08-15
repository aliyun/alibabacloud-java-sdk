// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListMonitorSourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378FTOKENA11</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static ListMonitorSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorSourcesRequest self = new ListMonitorSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListMonitorSourcesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
