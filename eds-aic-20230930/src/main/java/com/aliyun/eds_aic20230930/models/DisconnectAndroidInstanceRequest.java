// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DisconnectAndroidInstanceRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>If you use the Cloud Phone Matrix Edition and the instance stream pattern is collaborative mode, you can specify <code>EndUserId</code> to disconnect a specific user and invalidate the corresponding ticket.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>This parameter is not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>A list of instance IDs. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static DisconnectAndroidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DisconnectAndroidInstanceRequest self = new DisconnectAndroidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DisconnectAndroidInstanceRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DisconnectAndroidInstanceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
