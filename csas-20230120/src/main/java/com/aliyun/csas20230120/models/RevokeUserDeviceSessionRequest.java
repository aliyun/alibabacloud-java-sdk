// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RevokeUserDeviceSessionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2987b3e0-8108-2f99-4d18-3b4f1c1c36d7</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>su_xxxxxxxx</p>
     */
    @NameInMap("SaseUserId")
    public String saseUserId;

    public static RevokeUserDeviceSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeUserDeviceSessionRequest self = new RevokeUserDeviceSessionRequest();
        return TeaModel.build(map, self);
    }

    public RevokeUserDeviceSessionRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

    public RevokeUserDeviceSessionRequest setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

}
