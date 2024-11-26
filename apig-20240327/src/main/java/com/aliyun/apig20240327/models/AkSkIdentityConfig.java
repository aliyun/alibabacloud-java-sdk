// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AkSkIdentityConfig extends TeaModel {
    @NameInMap("ak")
    public String ak;

    @NameInMap("generateMode")
    public String generateMode;

    @NameInMap("sk")
    public String sk;

    @NameInMap("type")
    public String type;

    public static AkSkIdentityConfig build(java.util.Map<String, ?> map) throws Exception {
        AkSkIdentityConfig self = new AkSkIdentityConfig();
        return TeaModel.build(map, self);
    }

    public AkSkIdentityConfig setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public AkSkIdentityConfig setGenerateMode(String generateMode) {
        this.generateMode = generateMode;
        return this;
    }
    public String getGenerateMode() {
        return this.generateMode;
    }

    public AkSkIdentityConfig setSk(String sk) {
        this.sk = sk;
        return this;
    }
    public String getSk() {
        return this.sk;
    }

    public AkSkIdentityConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
