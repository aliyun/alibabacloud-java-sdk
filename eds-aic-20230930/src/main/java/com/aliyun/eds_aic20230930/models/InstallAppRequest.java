// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstallAppRequest extends TeaModel {
    /**
     * <p>The IDs of the apps that you want to install.</p>
     */
    @NameInMap("AppIdList")
    public java.util.List<String> appIdList;

    /**
     * <p>The IDs of the instance groups.</p>
     */
    @NameInMap("InstanceGroupIdList")
    public java.util.List<String> instanceGroupIdList;

    /**
     * <p>The IDs of the cloud phone instances.</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

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

    public InstallAppRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

}
