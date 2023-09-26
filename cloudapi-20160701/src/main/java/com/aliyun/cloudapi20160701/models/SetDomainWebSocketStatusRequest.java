// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class SetDomainWebSocketStatusRequest extends TeaModel {
    @NameInMap("ActionValue")
    public String actionValue;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetDomainWebSocketStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainWebSocketStatusRequest self = new SetDomainWebSocketStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainWebSocketStatusRequest setActionValue(String actionValue) {
        this.actionValue = actionValue;
        return this;
    }
    public String getActionValue() {
        return this.actionValue;
    }

    public SetDomainWebSocketStatusRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainWebSocketStatusRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDomainWebSocketStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
