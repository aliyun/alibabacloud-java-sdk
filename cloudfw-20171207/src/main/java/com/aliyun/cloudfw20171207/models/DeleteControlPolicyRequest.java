// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyRequest extends TeaModel {
    // The ID of the access control policy.
    // 
    // To delete an access control policy, you must provide the ID of the policy. You can call the [DescribeControlPolicy](~~138866~~) operation to query the ID.
    @NameInMap("AclUuid")
    public String aclUuid;

    // The direction of the traffic to which the access control policy applies.
    // 
    // Valid values:
    // 
    // *   **in**: inbound traffic
    // *   **out**: outbound traffic
    @NameInMap("Direction")
    public String direction;

    // The natural language of the request and response.
    // 
    // Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the traffic.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlPolicyRequest self = new DeleteControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DeleteControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DeleteControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteControlPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
