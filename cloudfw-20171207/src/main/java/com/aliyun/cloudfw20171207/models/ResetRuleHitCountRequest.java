// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetRuleHitCountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>211fd804-30f5-470f-ab26-c465a4****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>112.64.126.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static ResetRuleHitCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetRuleHitCountRequest self = new ResetRuleHitCountRequest();
        return TeaModel.build(map, self);
    }

    public ResetRuleHitCountRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public ResetRuleHitCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ResetRuleHitCountRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
