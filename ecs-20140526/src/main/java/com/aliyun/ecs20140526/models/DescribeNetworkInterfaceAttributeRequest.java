// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfaceAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<DescribeNetworkInterfaceAttributeRequestTag> tag;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    @NameInMap("Attribute")
    public String attribute;

    public static DescribeNetworkInterfaceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfaceAttributeRequest self = new DescribeNetworkInterfaceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfaceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkInterfaceAttributeRequest setTag(java.util.List<DescribeNetworkInterfaceAttributeRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeNetworkInterfaceAttributeRequestTag> getTag() {
        return this.tag;
    }

    public DescribeNetworkInterfaceAttributeRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DescribeNetworkInterfaceAttributeRequest setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    public String getAttribute() {
        return this.attribute;
    }

    public static class DescribeNetworkInterfaceAttributeRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeNetworkInterfaceAttributeRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeRequestTag self = new DescribeNetworkInterfaceAttributeRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNetworkInterfaceAttributeRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
