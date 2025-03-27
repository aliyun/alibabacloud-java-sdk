// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetCertificateResponseBody extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>babaffe176ae44e2ad16d3e309b9e506</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A666D44F-19D6-490E-97CF-1A64AB962C57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCertificateResponseBody self = new SetCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCertificateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
