// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UninstallAppRequest extends TeaModel {
    @NameInMap("AppIdList")
    public java.util.List<String> appIdList;

    @NameInMap("InstanceGroupIdList")
    public java.util.List<String> instanceGroupIdList;

    public static UninstallAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallAppRequest self = new UninstallAppRequest();
        return TeaModel.build(map, self);
    }

    public UninstallAppRequest setAppIdList(java.util.List<String> appIdList) {
        this.appIdList = appIdList;
        return this;
    }
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    public UninstallAppRequest setInstanceGroupIdList(java.util.List<String> instanceGroupIdList) {
        this.instanceGroupIdList = instanceGroupIdList;
        return this;
    }
    public java.util.List<String> getInstanceGroupIdList() {
        return this.instanceGroupIdList;
    }

}
