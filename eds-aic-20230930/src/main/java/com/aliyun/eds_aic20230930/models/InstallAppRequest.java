// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstallAppRequest extends TeaModel {
    @NameInMap("AppIdList")
    public java.util.List<String> appIdList;

    @NameInMap("InstanceGroupIdList")
    public java.util.List<String> instanceGroupIdList;

    public static InstallAppRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAppRequest self = new InstallAppRequest();
        return TeaModel.build(map, self);
    }

    public InstallAppRequest setAppIdList(java.util.List<String> appIdList) {
        this.appIdList = appIdList;
        return this;
    }
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    public InstallAppRequest setInstanceGroupIdList(java.util.List<String> instanceGroupIdList) {
        this.instanceGroupIdList = instanceGroupIdList;
        return this;
    }
    public java.util.List<String> getInstanceGroupIdList() {
        return this.instanceGroupIdList;
    }

}
