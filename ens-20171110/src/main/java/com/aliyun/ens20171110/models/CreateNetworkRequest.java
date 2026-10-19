// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkRequest extends TeaModel {
    /**
     * <p>The CIDR block of the network. You can use one of the following CIDR blocks or their subsets as the CIDR block of the network:</p>
     * <ul>
     * <li>10.0.0.0/8 (default).</li>
     * <li>172.16.0.0/12.</li>
     * <li>192.168.0.0/16.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The description of the network.</p>
     * <p>The description must be 2 to 256 characters in length, and must start with a letter or a Chinese character. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>this is my first network</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable IPv6. Valid values:</p>
     * <ul>
     * <li>false (default): disables IPv6.</li>
     * <li>true: enables IPv6.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>The ID of the ENS edge zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ISP of the IPv6 address. Valid values:</p>
     * <ul>
     * <li>cmcc</li>
     * <li>telecom</li>
     * <li>unicom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("Ipv6Isp")
    public String ipv6Isp;

    /**
     * <p>The name of the network. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name must start with a letter or a Chinese character, and cannot start with http:// or https://.</li>
     * <li>The name can contain digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("NetworkName")
    public String networkName;

    /**
     * <p>The resource tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNetworkRequestTag> tag;

    public static CreateNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkRequest self = new CreateNetworkRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateNetworkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    public CreateNetworkRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateNetworkRequest setIpv6Isp(String ipv6Isp) {
        this.ipv6Isp = ipv6Isp;
        return this;
    }
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    public CreateNetworkRequest setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }
    public String getNetworkName() {
        return this.networkName;
    }

    public CreateNetworkRequest setTag(java.util.List<CreateNetworkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateNetworkRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateNetworkRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         * <ul>
         * <li>The key cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</li>
         * <li>The key can be up to 64 characters in length.</li>
         * <li>The key cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the resource. Valid values of N: 1 to 20. The value can be an empty string. The value can be up to 128 characters in length, and cannot start with acs: or contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateNetworkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkRequestTag self = new CreateNetworkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateNetworkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNetworkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
