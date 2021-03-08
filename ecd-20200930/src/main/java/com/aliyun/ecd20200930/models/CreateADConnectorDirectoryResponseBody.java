// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorDirectoryResponseBody extends TeaModel {
    @NameInMap("TrustPassword")
    public String trustPassword;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AdConnectors")
    public java.util.List<CreateADConnectorDirectoryResponseBodyAdConnectors> adConnectors;

    public static CreateADConnectorDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateADConnectorDirectoryResponseBody self = new CreateADConnectorDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateADConnectorDirectoryResponseBody setTrustPassword(String trustPassword) {
        this.trustPassword = trustPassword;
        return this;
    }
    public String getTrustPassword() {
        return this.trustPassword;
    }

    public CreateADConnectorDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateADConnectorDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateADConnectorDirectoryResponseBody setAdConnectors(java.util.List<CreateADConnectorDirectoryResponseBodyAdConnectors> adConnectors) {
        this.adConnectors = adConnectors;
        return this;
    }
    public java.util.List<CreateADConnectorDirectoryResponseBodyAdConnectors> getAdConnectors() {
        return this.adConnectors;
    }

    public static class CreateADConnectorDirectoryResponseBodyAdConnectors extends TeaModel {
        @NameInMap("Address")
        public String address;

        public static CreateADConnectorDirectoryResponseBodyAdConnectors build(java.util.Map<String, ?> map) throws Exception {
            CreateADConnectorDirectoryResponseBodyAdConnectors self = new CreateADConnectorDirectoryResponseBodyAdConnectors();
            return TeaModel.build(map, self);
        }

        public CreateADConnectorDirectoryResponseBodyAdConnectors setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

    }

}
