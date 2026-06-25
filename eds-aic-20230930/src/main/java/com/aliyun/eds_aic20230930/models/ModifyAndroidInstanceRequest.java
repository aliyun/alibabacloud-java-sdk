// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyAndroidInstanceRequest extends TeaModel {
    /**
     * <p>The ID of a single instance. If you specify this parameter, InstanceIds is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>acp-8v5bjld0r7tkl****</p>
     */
    @NameInMap("AndroidInstanceId")
    public String androidInstanceId;

    /**
     * <p>The limit for downstream bandwidth. Unit: Mbps.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DownBandwidthLimit")
    public Integer downBandwidthLimit;

    /**
     * <p>The list of Android instance IDs. You can specify from 1 to 100 IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The new name for the instance.</p>
     * <blockquote>
     * <ul>
     * <li>The name can be up to 30 characters long. It must start with a letter or a Chinese character and cannot start with http\:// or https\://. The name can contain only letters, digits, Chinese characters, colons (:), underscores (_), periods (.), and hyphens (-).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>new_name</p>
     */
    @NameInMap("NewAndroidInstanceName")
    public String newAndroidInstanceName;

    /**
     * <p>The limit for upstream bandwidth. Unit: Mbps.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
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
