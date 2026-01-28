// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationResourceRequest extends TeaModel {
    /**
     * <p>授权资源标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arres_01kgh3jvt7pk093rv6giu0c0qxxxx</p>
     */
    @NameInMap("AuthorizationResourceId")
    public String authorizationResourceId;

    /**
     * <p>授权规则标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAuthorizationResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationResourceRequest self = new GetAuthorizationResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationResourceRequest setAuthorizationResourceId(String authorizationResourceId) {
        this.authorizationResourceId = authorizationResourceId;
        return this;
    }
    public String getAuthorizationResourceId() {
        return this.authorizationResourceId;
    }

    public GetAuthorizationResourceRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public GetAuthorizationResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
