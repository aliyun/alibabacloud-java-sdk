// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveTrafficControlApisRequest extends TeaModel {
    /**
     * <p>The IDs of the APIs from which you want to unbind a specified throttling policy.</p>
     * <ul>
     * <li>If this parameter is not specified, the throttling policy is unbound from all the APIs in the specified environment of the API group.</li>
     * <li>Separate multiple API IDs with commas (,). A maximum of 100 API IDs can be entered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3b81fd160f5645e097cc8855d75a1cf6,46fbb52840d146f186e38e8e70fc8c12</p>
     */
    @NameInMap("ApiIds")
    public String apiIds;

    /**
     * <p>The ID of the API group containing the APIs from which you want to unbind a specified throttling policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0009db9c828549768a200320714b8930</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4223a10e-eed3-46a6-8b7c-23003f488153</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong></li>
     * <li><strong>TEST</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>The ID of the throttling policy that you want to unbind from APIs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
     */
    @NameInMap("TrafficControlId")
    public String trafficControlId;

    public static RemoveTrafficControlApisRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTrafficControlApisRequest self = new RemoveTrafficControlApisRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTrafficControlApisRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public RemoveTrafficControlApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveTrafficControlApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveTrafficControlApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public RemoveTrafficControlApisRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

}
