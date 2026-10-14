// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEipInstanceRequest extends TeaModel {
    /**
     * <p>The peak bandwidth of the EIP. Default value: 5. Valid values: 5 to 10000. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>Ensures the idempotence of the request to prevent duplicate operations caused by multiple retries.</p>
     * <ul>
     * <li><p>Generate a parameter value from your client and make sure that the value is unique among different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * </li>
     * <li><p>If you use a ClientToken that has been used before and the other request parameters remain unchanged, the client receives the same result as the first submission, without affecting the server-side state.</p>
     * </li>
     * <li><p>You can retry when the API times out or returns the PROCESSING error code. Idempotence is effective in this case. If the response returns an HTTP 200 status code, the retry returns the same result as the previous call without affecting the server-side state. If the response returns an HTTP 4xx status code and the error code is not PROCESSING, idempotence is not effective.</p>
     * </li>
     * <li><p>The ClientToken is valid for 10 minutes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>26C28756-2586-17AF-B802-0DC50D8FDEBB</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>yourDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the Edge Node Service (ENS) edge zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-suzhou-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>Billable methods of the EIP. Currently, only <strong>PostPaid</strong> (pay-as-you-go billing method) is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance ID of the EIP.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Billable methods of the EIP. Currently, only <strong>95BandwidthByMonth</strong> (monthly 95th percentile bandwidth billing) is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95BandwidthByMonth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The IP address.</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The Internet service provider (ISP). Valid values:</p>
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
     * <p>The name of the EIP instance.</p>
     * 
     * <strong>example:</strong>
     * <p>EIP1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The resource tags.</p>
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
         * <p>The tag key of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         * <ul>
         * <li>Cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</li>
         * <li>Can be up to 64 characters in length.</li>
         * <li>Cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
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
