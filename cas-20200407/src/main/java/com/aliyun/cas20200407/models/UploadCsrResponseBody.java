// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadCsrResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the CSR. You can use this ID to obtain the content of the CSR. For more information, see <a href="https://help.aliyun.com/document_detail/2709720.html">GetCsrDetail</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2271</p>
     */
    @NameInMap("CsrId")
    public Long csrId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadCsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadCsrResponseBody self = new UploadCsrResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadCsrResponseBody setCsrId(Long csrId) {
        this.csrId = csrId;
        return this;
    }
    public Long getCsrId() {
        return this.csrId;
    }

    public UploadCsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
