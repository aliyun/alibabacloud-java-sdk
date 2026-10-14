// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkRequest extends TeaModel {
    /**
     * <p>The CIDR block of the network. You can use one of the following CIDR blocks or their subsets:</p>
     * <ul>
     * <li><p>10.0.0.0/8 (default).</p>
     * </li>
     * <li><p>172.16.0.0/12.</p>
     * </li>
     * <li><p>192.168.0.0/16.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>A description of the network.</p>
     * <p>Must be 2 to 256 characters long, start with a letter or a Chinese character, and cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>this is my first network</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>The node ID of ENS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("Ipv6Isp")
    public String ipv6Isp;

    /**
     * <p>The network name. Follow these naming rules:</p>
     * <ul>
     * <li><p>Must be 2 to 128 characters long, using English or Chinese characters.</p>
     * </li>
     * <li><p>Must start with a letter or a Chinese character. Cannot start with http\:// or https\://.</p>
     * </li>
     * <li><p>Can contain digits, colons (:), underscores (_), or hyphens (-).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("NetworkName")
    public String networkName;

    /**
     * <p>Resource tags.</p>
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
         * <p>The tag key for the instance. N ranges from <strong>1</strong> to <strong>20</strong>.</p>
         * <ul>
         * <li><p>Cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </li>
         * <li><p>Supports up to 64 characters.</p>
         * </li>
         * <li><p>Cannot be an empty string.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value for the resource. N ranges from 1 to 20. This value can be an empty string once provided. It supports up to 128 characters, cannot start with acs:, and cannot contain http\:// or https\://.</p>
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
