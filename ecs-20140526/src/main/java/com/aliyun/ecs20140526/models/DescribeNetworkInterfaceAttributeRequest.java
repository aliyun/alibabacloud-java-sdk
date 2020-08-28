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

    public static class DescribeNetworkInterfaceAttributeRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeNetworkInterfaceAttributeRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeRequestTag self = new DescribeNetworkInterfaceAttributeRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
