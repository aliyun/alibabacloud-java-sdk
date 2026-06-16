// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListCACertificateLogRequest extends TeaModel {
    /**
     * <p>The unique identifier of the CA certificate to query.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/328095.html">DescribeCACertificateList</a> to query the unique identifiers of all CA certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static ListCACertificateLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCACertificateLogRequest self = new ListCACertificateLogRequest();
        return TeaModel.build(map, self);
    }

    public ListCACertificateLogRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
