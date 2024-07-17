// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class Principal extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:ram::[AliyunAccountId]:user/username_abc</p>
     */
    @NameInMap("PrincipalArn")
    public String principalArn;

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

}
