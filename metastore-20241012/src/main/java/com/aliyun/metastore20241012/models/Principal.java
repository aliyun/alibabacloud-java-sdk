// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class Principal extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:ram::[AliyunAccountId]:user/username_abc</p>
     */
    @NameInMap("PrincipalArn")
    public String principalArn;

    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("PrincipalType")
    public String principalType;

    public static Principal build(java.util.Map<String, ?> map) throws Exception {
        Principal self = new Principal();
        return TeaModel.build(map, self);
    }

    public Principal setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
        return this;
    }
    public String getPrincipalArn() {
        return this.principalArn;
    }

    public Principal setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public Principal setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}
