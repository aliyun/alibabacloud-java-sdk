// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateRequest extends TeaModel {
    @NameInMap("Identifier")
    public String identifier;

    public static DescribeCACertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificateRequest self = new DescribeCACertificateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
