// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyRequest extends TeaModel {
    /**
     * <p>The UUID of the access control policy.</p>
     * <p>To delete an access control policy, you must specify the UUID of the policy. You can call the <a href="https://help.aliyun.com/document_detail/138866.html">DescribeControlPolicy</a> operation to query the UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df221ad84c</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The direction of the traffic to which the access control policy applies.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound.</li>
     * <li><strong>out</strong>: outbound.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language of the content within the request and response.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default)</li>
     * <li><strong>en</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
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

    @Deprecated
    public DeleteControlPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
