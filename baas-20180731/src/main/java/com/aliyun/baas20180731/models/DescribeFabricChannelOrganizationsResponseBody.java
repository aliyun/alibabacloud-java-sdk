// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChannelOrganizationsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeFabricChannelOrganizationsResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricChannelOrganizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChannelOrganizationsResponseBody self = new DescribeFabricChannelOrganizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChannelOrganizationsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricChannelOrganizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricChannelOrganizationsResponseBody setResult(DescribeFabricChannelOrganizationsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricChannelOrganizationsResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeFabricChannelOrganizationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricChannelOrganizationsResponseBodyResultAnchorPeers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Integer port;

        public static DescribeFabricChannelOrganizationsResponseBodyResultAnchorPeers build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChannelOrganizationsResponseBodyResultAnchorPeers self = new DescribeFabricChannelOrganizationsResponseBodyResultAnchorPeers();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChannelOrganizationsResponseBodyResultAnchorPeers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResultAnchorPeers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tlsroot")
        public String tlsroot;

        public static DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes self = new DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes setTlsroot(String tlsroot) {
            this.tlsroot = tlsroot;
            return this;
        }
        public String getTlsroot() {
            return this.tlsroot;
        }

    }

    public static class DescribeFabricChannelOrganizationsResponseBodyResult extends TeaModel {
        @NameInMap("AnchorPeers")
        public java.util.List<DescribeFabricChannelOrganizationsResponseBodyResultAnchorPeers> anchorPeers;

        @NameInMap("Crls")
        public String crls;

        @NameInMap("MspId")
        public String mspId;

        @NameInMap("MspType")
        public String mspType;

        @NameInMap("Orderer")
        public Boolean orderer;

        @NameInMap("OrdererNodes")
        public java.util.List<DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        public String rootCertificates;

        @NameInMap("TlsRootCertificates")
        public String tlsRootCertificates;

        public static DescribeFabricChannelOrganizationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChannelOrganizationsResponseBodyResult self = new DescribeFabricChannelOrganizationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChannelOrganizationsResponseBodyResult setAnchorPeers(java.util.List<DescribeFabricChannelOrganizationsResponseBodyResultAnchorPeers> anchorPeers) {
            this.anchorPeers = anchorPeers;
            return this;
        }
        public java.util.List<DescribeFabricChannelOrganizationsResponseBodyResultAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResult setCrls(String crls) {
            this.crls = crls;
            return this;
        }
        public String getCrls() {
            return this.crls;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResult setMspId(String mspId) {
            this.mspId = mspId;
            return this;
        }
        public String getMspId() {
            return this.mspId;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResult setMspType(String mspType) {
            this.mspType = mspType;
            return this;
        }
        public String getMspType() {
            return this.mspType;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResult setOrderer(Boolean orderer) {
            this.orderer = orderer;
            return this;
        }
        public Boolean getOrderer() {
            return this.orderer;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResult setOrdererNodes(java.util.List<DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes> ordererNodes) {
            this.ordererNodes = ordererNodes;
            return this;
        }
        public java.util.List<DescribeFabricChannelOrganizationsResponseBodyResultOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResult setRootCertificates(String rootCertificates) {
            this.rootCertificates = rootCertificates;
            return this;
        }
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        public DescribeFabricChannelOrganizationsResponseBodyResult setTlsRootCertificates(String tlsRootCertificates) {
            this.tlsRootCertificates = tlsRootCertificates;
            return this;
        }
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

    }

}
