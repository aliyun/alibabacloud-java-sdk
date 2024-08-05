// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveIpControlApisRequest extends TeaModel {
    /**
     * <p>The IDs of the APIs from which you want to unbind the ACL.</p>
     * <ul>
     * <li>If this parameter is not specified, the ACL is unbound from all the APIs in the specified environment of the API group.</li>
     * <li>The IDs of APIs that you want to query. Separate multiple API IDs with commas (,). A maximum of 100 API IDs can be entered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ApiIds")
    public String apiIds;

    /**
     * <p>The ID of the API group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0009db9c828549768a200320714b8930</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the ACL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

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

    public static RemoveIpControlApisRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpControlApisRequest self = new RemoveIpControlApisRequest();
        return TeaModel.build(map, self);
    }

    public RemoveIpControlApisRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public RemoveIpControlApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveIpControlApisRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public RemoveIpControlApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveIpControlApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
