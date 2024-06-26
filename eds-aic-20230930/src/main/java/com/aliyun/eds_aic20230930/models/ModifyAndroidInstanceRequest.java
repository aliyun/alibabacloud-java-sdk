// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyAndroidInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acp-8v5bjld0r7tkl****</p>
     */
    @NameInMap("AndroidInstanceId")
    public String androidInstanceId;

    /**
     * <strong>example:</strong>
     * <p>new_name</p>
     */
    @NameInMap("NewAndroidInstanceName")
    public String newAndroidInstanceName;

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

    public ModifyAndroidInstanceRequest setNewAndroidInstanceName(String newAndroidInstanceName) {
        this.newAndroidInstanceName = newAndroidInstanceName;
        return this;
    }
    public String getNewAndroidInstanceName() {
        return this.newAndroidInstanceName;
    }

}
