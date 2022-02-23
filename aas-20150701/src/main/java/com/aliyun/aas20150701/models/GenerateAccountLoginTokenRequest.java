// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GenerateAccountLoginTokenRequest extends TeaModel {
    @NameInMap("TargetPk")
    public String targetPk;

    public static GenerateAccountLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAccountLoginTokenRequest self = new GenerateAccountLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAccountLoginTokenRequest setTargetPk(String targetPk) {
        this.targetPk = targetPk;
        return this;
    }
    public String getTargetPk() {
        return this.targetPk;
    }

}
