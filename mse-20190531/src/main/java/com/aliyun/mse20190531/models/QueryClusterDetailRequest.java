// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterDetailRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to query access control lists (ACLs).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AclSwitch")
    public Boolean aclSwitch;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-st21ri2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>20576750143****</p>
     */
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
