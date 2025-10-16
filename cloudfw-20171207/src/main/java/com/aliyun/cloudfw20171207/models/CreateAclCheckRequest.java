// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateAclCheckRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AclType")
    public String aclType;

    @NameInMap("CheckNames")
    public java.util.List<String> checkNames;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static CreateAclCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAclCheckRequest self = new CreateAclCheckRequest();
        return TeaModel.build(map, self);
    }

    public CreateAclCheckRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public CreateAclCheckRequest setCheckNames(java.util.List<String> checkNames) {
        this.checkNames = checkNames;
        return this;
    }
    public java.util.List<String> getCheckNames() {
        return this.checkNames;
    }

    public CreateAclCheckRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
