// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AttachStandardRoomHttpsCertificateResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public AttachStandardRoomHttpsCertificateResponseBodyResult result;

    public static AttachStandardRoomHttpsCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachStandardRoomHttpsCertificateResponseBody self = new AttachStandardRoomHttpsCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachStandardRoomHttpsCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachStandardRoomHttpsCertificateResponseBody setResult(AttachStandardRoomHttpsCertificateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AttachStandardRoomHttpsCertificateResponseBodyResult getResult() {
        return this.result;
    }

    public static class AttachStandardRoomHttpsCertificateResponseBodyResult extends TeaModel {
        // 证书Id
        @NameInMap("CertificateId")
        public String certificateId;

        public static AttachStandardRoomHttpsCertificateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AttachStandardRoomHttpsCertificateResponseBodyResult self = new AttachStandardRoomHttpsCertificateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AttachStandardRoomHttpsCertificateResponseBodyResult setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

}
