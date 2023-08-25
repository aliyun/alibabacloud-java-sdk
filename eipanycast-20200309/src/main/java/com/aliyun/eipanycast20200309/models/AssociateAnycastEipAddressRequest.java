// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AssociateAnycastEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP.</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The association mode. Valid values:</p>
     * <br>
     * <p>*   **Default**: the default mode. In this mode, cloud resources to be associated are set as default origin servers.</p>
     * <p>*   **Normal**: the standard mode. In this mode, cloud resources to be associated are set as standard origin servers.</p>
     * <br>
     * <p>> You can associate an Anycast EIP with cloud resources in multiple regions. However, you can set only one cloud resource as the default origin server. Other cloud resources are set as standard origin servers. If you do not specify or add an access point, requests are forwarded to the default origin server.</p>
     * <br>
     * <p>*   If this is your first time to associate an Anycast EIP with a cloud resource, set the value to **Default**.</p>
     * <p>*   If not, you can also set the value to **Default**, which specifies a new default origin server. In this case, the previous origin server functions as a standard origin server.</p>
     */
    @NameInMap("AssociationMode")
    public String associationMode;

    /**
     * <p>The ID of the cloud resource with which you want to associate the Anycast EIP.</p>
     */
    @NameInMap("BindInstanceId")
    public String bindInstanceId;

    /**
     * <p>The ID of the region where the cloud resource is deployed.</p>
     * <br>
     * <p>You can associate Anycast EIPs only with cloud resources in specific regions. You can call the [DescribeAnycastServerRegions](~~171939~~) operation to query the region IDs.</p>
     */
    @NameInMap("BindInstanceRegionId")
    public String bindInstanceRegionId;

    /**
     * <p>The type of cloud resource with which you want to associate the Anycast EIP. Valid values:</p>
     * <br>
     * <p>*   **SlbInstance**: an internal-facing Server Load Balancer (SLB) instance that is deployed in a virtual private cloud (VPC)</p>
     * <p>*   **NetworkInterface**: an elastic network interface (ENI)</p>
     */
    @NameInMap("BindInstanceType")
    public String bindInstanceType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request. After the request passes the precheck, the Anycast EIP is not associated with the instance. The system checks the required parameters, request syntax, and limits. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the API request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The information about the access points in associated access areas when you associate an Anycast EIP with a cloud resource.</p>
     * <br>
     * <p>If this is your first time to associate an Anycast EIP with a cloud resource, ignore this parameter. The system automatically associates all access areas.</p>
     * <br>
     * <p>You can call the [DescribeAnycastPopLocations](~~171938~~) operation to query information about access points in supported access areas.</p>
     */
    @NameInMap("PopLocations")
    public java.util.List<AssociateAnycastEipAddressRequestPopLocations> popLocations;

    /**
     * <p>The secondary private IP address of the ENI with which you want to associate the Anycast EIP.</p>
     * <br>
     * <p>This parameter is valid only when you set **BindInstanceType** to **NetworkInterface**. If you do not set this parameter, the primary private IP address of the ENI is used.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    public static AssociateAnycastEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateAnycastEipAddressRequest self = new AssociateAnycastEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public AssociateAnycastEipAddressRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public AssociateAnycastEipAddressRequest setAssociationMode(String associationMode) {
        this.associationMode = associationMode;
        return this;
    }
    public String getAssociationMode() {
        return this.associationMode;
    }

    public AssociateAnycastEipAddressRequest setBindInstanceId(String bindInstanceId) {
        this.bindInstanceId = bindInstanceId;
        return this;
    }
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    public AssociateAnycastEipAddressRequest setBindInstanceRegionId(String bindInstanceRegionId) {
        this.bindInstanceRegionId = bindInstanceRegionId;
        return this;
    }
    public String getBindInstanceRegionId() {
        return this.bindInstanceRegionId;
    }

    public AssociateAnycastEipAddressRequest setBindInstanceType(String bindInstanceType) {
        this.bindInstanceType = bindInstanceType;
        return this;
    }
    public String getBindInstanceType() {
        return this.bindInstanceType;
    }

    public AssociateAnycastEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateAnycastEipAddressRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateAnycastEipAddressRequest setPopLocations(java.util.List<AssociateAnycastEipAddressRequestPopLocations> popLocations) {
        this.popLocations = popLocations;
        return this;
    }
    public java.util.List<AssociateAnycastEipAddressRequestPopLocations> getPopLocations() {
        return this.popLocations;
    }

    public AssociateAnycastEipAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static class AssociateAnycastEipAddressRequestPopLocations extends TeaModel {
        /**
         * <p>The information about the access points in associated access areas when you associate an Anycast EIP with a cloud resource.</p>
         * <br>
         * <p>If this is your first time to associate an Anycast EIP with a cloud resource, ignore this parameter. The system automatically associates all access areas.</p>
         * <br>
         * <p>You can call the [DescribeAnycastPopLocations](~~171938~~) operation to query information about access points in supported access areas.</p>
         */
        @NameInMap("PopLocation")
        public String popLocation;

        public static AssociateAnycastEipAddressRequestPopLocations build(java.util.Map<String, ?> map) throws Exception {
            AssociateAnycastEipAddressRequestPopLocations self = new AssociateAnycastEipAddressRequestPopLocations();
            return TeaModel.build(map, self);
        }

        public AssociateAnycastEipAddressRequestPopLocations setPopLocation(String popLocation) {
            this.popLocation = popLocation;
            return this;
        }
        public String getPopLocation() {
            return this.popLocation;
        }

    }

}
