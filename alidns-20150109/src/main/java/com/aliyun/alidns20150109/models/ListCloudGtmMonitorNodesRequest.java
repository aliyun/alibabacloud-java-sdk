// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmMonitorNodesRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static ListCloudGtmMonitorNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmMonitorNodesRequest self = new ListCloudGtmMonitorNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmMonitorNodesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
