// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetStandardRoomHttpsCertificateResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public GetStandardRoomHttpsCertificateResponseBodyResult result;

    public static GetStandardRoomHttpsCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStandardRoomHttpsCertificateResponseBody self = new GetStandardRoomHttpsCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStandardRoomHttpsCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStandardRoomHttpsCertificateResponseBody setResult(GetStandardRoomHttpsCertificateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetStandardRoomHttpsCertificateResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetStandardRoomHttpsCertificateResponseBodyResult extends TeaModel {
        // 证书名称
        @NameInMap("CertificateName")
        public String certificateName;

        // 使用证书的确切域名
        @NameInMap("DomainName")
        public String domainName;

        // 证书创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 证书过期时间
        @NameInMap("ExpireTime")
        public String expireTime;

        public static GetStandardRoomHttpsCertificateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetStandardRoomHttpsCertificateResponseBodyResult self = new GetStandardRoomHttpsCertificateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetStandardRoomHttpsCertificateResponseBodyResult setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public GetStandardRoomHttpsCertificateResponseBodyResult setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetStandardRoomHttpsCertificateResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStandardRoomHttpsCertificateResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

    }

}
