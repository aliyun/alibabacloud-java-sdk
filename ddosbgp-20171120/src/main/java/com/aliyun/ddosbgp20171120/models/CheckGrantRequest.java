// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class CheckGrantRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CheckGrantRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckGrantRequest self = new CheckGrantRequest();
        return TeaModel.build(map, self);
    }

    public CheckGrantRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
