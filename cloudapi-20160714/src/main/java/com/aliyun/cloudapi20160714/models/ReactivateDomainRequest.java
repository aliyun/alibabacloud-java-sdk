// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ReactivateDomainRequest extends TeaModel {
    /**
     * <p>*   This operation is intended for API providers.</p>
     * <p>*   You must solve the problem that is mentioned in the domain name exception prompt before you can reactivate the domain name.</p>
     * <p>*   A typical reason why a custom domain name becomes abnormal is that the domain name does not have an ICP filing or the domain name is included in a blacklist by the administration. When a custom domain name is abnormal, users cannot use it to access APIs.</p>
     * <p>*   You can call this operation to reactivate the domain name to resume normal access.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ReactivateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ReactivateDomainRequest self = new ReactivateDomainRequest();
        return TeaModel.build(map, self);
    }

    public ReactivateDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ReactivateDomainRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ReactivateDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
