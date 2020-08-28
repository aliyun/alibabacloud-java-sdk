// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Password")
    public String password;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Description")
    public String description;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Recyclable")
    public Boolean recyclable;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    public static ModifyInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeRequest self = new ModifyInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

}
