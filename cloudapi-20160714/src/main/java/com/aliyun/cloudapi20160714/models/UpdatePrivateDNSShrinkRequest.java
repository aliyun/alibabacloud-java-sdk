// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class UpdatePrivateDNSShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api.demo.com</p>
     */
    @NameInMap("IntranetDomain")
    public String intranetDomain;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Records")
    public String recordsShrink;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdatePrivateDNSShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateDNSShrinkRequest self = new UpdatePrivateDNSShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateDNSShrinkRequest setIntranetDomain(String intranetDomain) {
        this.intranetDomain = intranetDomain;
        return this;
    }
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    public UpdatePrivateDNSShrinkRequest setRecordsShrink(String recordsShrink) {
        this.recordsShrink = recordsShrink;
        return this;
    }
    public String getRecordsShrink() {
        return this.recordsShrink;
    }

    public UpdatePrivateDNSShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdatePrivateDNSShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
