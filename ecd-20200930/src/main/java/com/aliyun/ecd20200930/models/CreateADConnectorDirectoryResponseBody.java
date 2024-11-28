// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorDirectoryResponseBody extends TeaModel {
    /**
     * <p>The details of AD connectors.</p>
     */
    @NameInMap("AdConnectors")
    public java.util.List<CreateADConnectorDirectoryResponseBodyAdConnectors> adConnectors;

    /**
     * <p>The ID of the AD directory.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-gx2x1dhsmu52rd****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE99D5E-93A1-493F-B1CB-0ABD4D05BEFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The AD trust password.</p>
     * 
     * <strong>example:</strong>
     * <p>82Tg****</p>
     */
    @NameInMap("TrustPassword")
    public String trustPassword;

    public static CreateADConnectorDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateADConnectorDirectoryResponseBody self = new CreateADConnectorDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateADConnectorDirectoryResponseBody setAdConnectors(java.util.List<CreateADConnectorDirectoryResponseBodyAdConnectors> adConnectors) {
        this.adConnectors = adConnectors;
        return this;
    }
    public java.util.List<CreateADConnectorDirectoryResponseBodyAdConnectors> getAdConnectors() {
        return this.adConnectors;
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

    public CreateADConnectorDirectoryResponseBody setTrustPassword(String trustPassword) {
        this.trustPassword = trustPassword;
        return this;
    }
    public String getTrustPassword() {
        return this.trustPassword;
    }

    public static class CreateADConnectorDirectoryResponseBodyAdConnectors extends TeaModel {
        /**
         * <p>The connection address.</p>
         * 
         * <strong>example:</strong>
         * <p><code>127.0.**.**</code></p>
         */
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
