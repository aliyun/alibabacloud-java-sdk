// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorDirectoryResponse extends TeaModel {
    @NameInMap("DirectoryId")
    @Validation(required = true)
    public String directoryId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TrustPassword")
    @Validation(required = true)
    public String trustPassword;

    @NameInMap("AdConnectors")
    @Validation(required = true)
    public java.util.List<CreateADConnectorDirectoryResponseAdConnectors> adConnectors;

    public static CreateADConnectorDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateADConnectorDirectoryResponse self = new CreateADConnectorDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateADConnectorDirectoryResponse setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateADConnectorDirectoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateADConnectorDirectoryResponse setTrustPassword(String trustPassword) {
        this.trustPassword = trustPassword;
        return this;
    }
    public String getTrustPassword() {
        return this.trustPassword;
    }

    public CreateADConnectorDirectoryResponse setAdConnectors(java.util.List<CreateADConnectorDirectoryResponseAdConnectors> adConnectors) {
        this.adConnectors = adConnectors;
        return this;
    }
    public java.util.List<CreateADConnectorDirectoryResponseAdConnectors> getAdConnectors() {
        return this.adConnectors;
    }

    public static class CreateADConnectorDirectoryResponseAdConnectors extends TeaModel {
        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        public static CreateADConnectorDirectoryResponseAdConnectors build(java.util.Map<String, ?> map) throws Exception {
            CreateADConnectorDirectoryResponseAdConnectors self = new CreateADConnectorDirectoryResponseAdConnectors();
            return TeaModel.build(map, self);
        }

        public CreateADConnectorDirectoryResponseAdConnectors setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

    }

}
