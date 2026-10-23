// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UninstallAppRequest extends TeaModel {
    /**
     * <p>The list of application IDs.</p>
     */
    @NameInMap("AppIdList")
    public java.util.List<String> appIdList;

    /**
     * <p>The list of instance group IDs. You must specify either this parameter or the InstanceIdList parameter. If both parameters are specified, only the InstanceGroupIdList parameter takes effect.</p>
     */
    @NameInMap("InstanceGroupIdList")
    public java.util.List<String> instanceGroupIdList;

    /**
     * <p>The list of instance IDs. You must specify either this parameter or the InstanceGroupIdList parameter. If both parameters are specified, only the InstanceGroupIdList parameter takes effect.</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

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

    public UninstallAppRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

}
