// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("SecurityGroupType")
    public String securityGroupType;

    @NameInMap("Tag")
    public java.util.List<CreateSecurityGroupRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupRequest self = new CreateSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateSecurityGroupRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static CreateSecurityGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityGroupRequestTag self = new CreateSecurityGroupRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
