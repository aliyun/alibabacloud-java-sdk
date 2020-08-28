// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVpcRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("VpcName")
    public String vpcName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static CreateVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcRequest self = new CreateVpcRequest();
        return TeaModel.build(map, self);
    }

}
