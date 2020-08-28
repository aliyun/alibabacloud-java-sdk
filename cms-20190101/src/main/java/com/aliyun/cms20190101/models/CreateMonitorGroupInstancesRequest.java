// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupInstancesRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("Instances")
    @Validation(required = true)
    public java.util.List<CreateMonitorGroupInstancesRequestInstances> instances;

    public static CreateMonitorGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupInstancesRequest self = new CreateMonitorGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateMonitorGroupInstancesRequestInstances extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        public static CreateMonitorGroupInstancesRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            CreateMonitorGroupInstancesRequestInstances self = new CreateMonitorGroupInstancesRequestInstances();
            return TeaModel.build(map, self);
        }

    }

}
