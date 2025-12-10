// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEipInstanceRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth of the EIP. Default value: 5. Valid values: 5 to 10000. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. This prevents repeated operations caused by multiple retries.</p>
     * <ul>
     * <li>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</li>
     * <li>If you use a ClientToken that has been used and other request parameters remain unchanged in a repeated request, the client will receive the same result as the first request. This does not affect the status of your server.</li>
     * <li>You can initiate a retry when the operation times out or the error code is PROCESSING. The idempotence is valid. If HTTP status code 200 is returned, the client receives the same result as the last request. However, your server status is not affected. If HTTP status code 4xx is returned and error code is not PROCESSING, the idempotence is invalid.</li>
     * <li>A client token is valid for 10 minutes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>26C28756-2586-17AF-B802-0DC50D8FDEBB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>yourDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-suzhou-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The billing method of the EIP. Set the value to <strong>PostPaid</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metering method of the EIP. Set the value to <strong>95BandwidthByMonth</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95BandwidthByMonth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The Internet service provider. Valid values:</p>
     * <ul>
     * <li><strong>cmcc</strong>: China Mobile.</li>
     * <li><strong>unicom</strong>: China Unicom.</li>
     * <li><strong>telecom</strong>: China Telecom.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cmcc</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The name of the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>EIP1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateEipInstanceRequestTag> tag;

    public static CreateEipInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEipInstanceRequest self = new CreateEipInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEipInstanceRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateEipInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEipInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEipInstanceRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateEipInstanceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateEipInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEipInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateEipInstanceRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public CreateEipInstanceRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public CreateEipInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEipInstanceRequest setTag(java.util.List<CreateEipInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEipInstanceRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateEipInstanceRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         * <ul>
         * <li>The key cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</li>
         * <li>The key must be up to 64 characters in length.</li>
         * <li>The tag key cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the resource. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with acs: or contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEipInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEipInstanceRequestTag self = new CreateEipInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEipInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEipInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
