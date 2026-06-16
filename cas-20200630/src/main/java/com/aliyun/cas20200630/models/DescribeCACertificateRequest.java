// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateRequest extends TeaModel {
    /**
     * <p>The unique identifier of the CA certificate to query.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> to query the unique identifiers of all CA certificates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
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
