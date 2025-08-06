// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AssociateAnycastEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aeip-bp1ix34fralt4ykf3****</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The association mode. Valid values:</p>
     * <ul>
     * <li><strong>Default</strong>: the default mode. In this mode, the endpoint to be associated serves as the default origin server.</li>
     * <li><strong>Normal</strong>: the standard mode. In this mode, the endpoint to be associated serves as a standard origin server.</li>
     * </ul>
     * <blockquote>
     * <p>You can associate endpoints in multiple regions with an Anycast EIP. However, only one endpoint can serve as the default origin server. Others serve as standard origin servers. If you do not specify or add an access point, requests are forwarded to the default origin server.\</p>
     * </blockquote>
     * <ul>
     * <li>If this is your first time to associate an Anycast EIP with an endpoint, set the value to <strong>Default</strong>.</li>
     * <li>If not, you can also set the value to <strong>Default</strong>, which specifies a new default origin server. In this case, the previous origin server functions as a standard origin server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("AssociationMode")
    public String associationMode;

    /**
     * <p>The ID of the endpoint with which you want to associate the Anycast EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-d7oxbixhxv1uupnon****</p>
     */
    @NameInMap("BindInstanceId")
    public String bindInstanceId;

    /**
     * <p>The ID of the region where the endpoint is deployed.</p>
     * <p>You can associate Anycast EIPs only with endpoints in specific regions. You can call the <a href="https://help.aliyun.com/document_detail/171939.html">DescribeAnycastServerRegions</a> operation to query the region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>us-west-1</p>
     */
    @NameInMap("BindInstanceRegionId")
    public String bindInstanceRegionId;

    /**
     * <p>The type of endpoint with which you want to associate the Anycast EIP. Valid values:</p>
     * <ul>
     * <li><strong>SlbInstance</strong>: internal-facing Server Load Balancer (SLB) instance that is deployed in a virtual private cloud (VPC)</li>
     * <li><strong>NetworkInterface</strong>: elastic network interface (ENI)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SlbInstance</p>
     */
    @NameInMap("BindInstanceType")
    public String bindInstanceType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The information about the access points in associated access areas when you associate an Anycast EIP with an endpoint.</p>
     * <p>If this is your first time to associate an Anycast EIP with an endpoint, ignore this parameter. The system automatically associates all access areas.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/171938.html">DescribeAnycastPopLocations</a> operation to query information about access points in supported access areas.</p>
     */
    @NameInMap("PopLocations")
    public java.util.List<AssociateAnycastEipAddressRequestPopLocations> popLocations;

    /**
     * <p>The secondary private IP address of the ENI with which you want to associate the Anycast EIP.</p>
     * <p>This parameter is valid only when you set <strong>BindInstanceType</strong> to <strong>NetworkInterface</strong>. If you do not set this parameter, the primary private IP address of the ENI is used.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
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
         * <p>The information about the access points in associated access areas when you associate an Anycast EIP with an endpoint.</p>
         * <p>If this is your first time to associate an Anycast EIP with an endpoint, ignore this parameter. The system automatically associates all access areas.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/171938.html">DescribeAnycastPopLocations</a> operation to query information about access points in supported access areas.</p>
         * 
         * <strong>example:</strong>
         * <p>us-west-1-pop</p>
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
