// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListCACertificateLogRequest extends TeaModel {
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
