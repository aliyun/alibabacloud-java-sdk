// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVSwitchRequest extends TeaModel {
    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("CidrBlock")
    @Validation(required = true)
    public String cidrBlock;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitchName")
    public String vSwitchName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateVSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchRequest self = new CreateVSwitchRequest();
        return TeaModel.build(map, self);
    }

}
