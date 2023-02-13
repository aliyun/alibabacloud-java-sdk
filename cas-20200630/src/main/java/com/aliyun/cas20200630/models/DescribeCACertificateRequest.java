// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateRequest extends TeaModel {
    /**
     * <p>The unique identifier of the CA certificate that you want to query.</p>
     * <br>
     * <p>>  You can call the [DescribeCACertificateList](~~328095~~) operation to query the unique identifiers of all CA certificates.</p>
     */
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
