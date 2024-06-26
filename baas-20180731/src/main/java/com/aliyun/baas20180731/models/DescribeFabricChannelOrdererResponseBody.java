// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChannelOrdererResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricChannelOrdererResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricChannelOrdererResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChannelOrdererResponseBody self = new DescribeFabricChannelOrdererResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChannelOrdererResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricChannelOrdererResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricChannelOrdererResponseBody setResult(java.util.List<DescribeFabricChannelOrdererResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricChannelOrdererResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricChannelOrdererResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricChannelOrdererResponseBodyResult extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static DescribeFabricChannelOrdererResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChannelOrdererResponseBodyResult self = new DescribeFabricChannelOrdererResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChannelOrdererResponseBodyResult setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeFabricChannelOrdererResponseBodyResult setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public DescribeFabricChannelOrdererResponseBodyResult setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFabricChannelOrdererResponseBodyResult setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

}
