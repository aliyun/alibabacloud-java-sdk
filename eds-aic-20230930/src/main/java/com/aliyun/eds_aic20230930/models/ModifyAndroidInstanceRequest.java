// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyAndroidInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the cloud phone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>acp-8v5bjld0r7tkl****</p>
     */
    @NameInMap("AndroidInstanceId")
    public String androidInstanceId;

    @NameInMap("DownBandwidthLimit")
    public Integer downBandwidthLimit;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The new name of the cloud phone instance.</p>
     * <blockquote>
     * <p> The name can be up to 30 characters in length. It can contain letters, digits, colons (:), underscores (_), periods (.), or hyphens (-). It must start with letters but cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>new_name</p>
     */
    @NameInMap("NewAndroidInstanceName")
    public String newAndroidInstanceName;

    @NameInMap("UpBandwidthLimit")
    public Integer upBandwidthLimit;

    public static ModifyAndroidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAndroidInstanceRequest self = new ModifyAndroidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAndroidInstanceRequest setAndroidInstanceId(String androidInstanceId) {
        this.androidInstanceId = androidInstanceId;
        return this;
    }
    public String getAndroidInstanceId() {
        return this.androidInstanceId;
    }

    public ModifyAndroidInstanceRequest setDownBandwidthLimit(Integer downBandwidthLimit) {
        this.downBandwidthLimit = downBandwidthLimit;
        return this;
    }
    public Integer getDownBandwidthLimit() {
        return this.downBandwidthLimit;
    }

    public ModifyAndroidInstanceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyAndroidInstanceRequest setNewAndroidInstanceName(String newAndroidInstanceName) {
        this.newAndroidInstanceName = newAndroidInstanceName;
        return this;
    }
    public String getNewAndroidInstanceName() {
        return this.newAndroidInstanceName;
    }

    public ModifyAndroidInstanceRequest setUpBandwidthLimit(Integer upBandwidthLimit) {
        this.upBandwidthLimit = upBandwidthLimit;
        return this;
    }
    public Integer getUpBandwidthLimit() {
        return this.upBandwidthLimit;
    }

}
