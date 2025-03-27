// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ImportCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>676303114031776</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>7C352CB7-CD88-50CF-9D0D-E81BDF020E7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImportCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportCertificateResponseBody self = new ImportCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportCertificateResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ImportCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
