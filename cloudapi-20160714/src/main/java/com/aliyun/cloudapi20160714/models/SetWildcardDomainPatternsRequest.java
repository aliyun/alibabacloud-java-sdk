// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetWildcardDomainPatternsRequest extends TeaModel {
    /**
     * <p>The wildcard domain name mode.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The custom domain name.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("WildcardDomainPatterns")
    public String wildcardDomainPatterns;

    public static SetWildcardDomainPatternsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetWildcardDomainPatternsRequest self = new SetWildcardDomainPatternsRequest();
        return TeaModel.build(map, self);
    }

    public SetWildcardDomainPatternsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetWildcardDomainPatternsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetWildcardDomainPatternsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetWildcardDomainPatternsRequest setWildcardDomainPatterns(String wildcardDomainPatterns) {
        this.wildcardDomainPatterns = wildcardDomainPatterns;
        return this;
    }
    public String getWildcardDomainPatterns() {
        return this.wildcardDomainPatterns;
    }

}
