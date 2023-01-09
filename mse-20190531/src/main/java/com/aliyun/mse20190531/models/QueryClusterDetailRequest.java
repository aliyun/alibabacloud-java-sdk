// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDetailRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // Specifies whether to query access control lists (ACLs).
    @NameInMap("AclSwitch")
    public Boolean aclSwitch;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the order.
    @NameInMap("OrderId")
    public String orderId;

    public static QueryClusterDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterDetailRequest self = new QueryClusterDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterDetailRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryClusterDetailRequest setAclSwitch(Boolean aclSwitch) {
        this.aclSwitch = aclSwitch;
        return this;
    }
    public Boolean getAclSwitch() {
        return this.aclSwitch;
    }

    public QueryClusterDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryClusterDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
