// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class SyncSignInInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QRCode")
    public String QRCode;

    public static SyncSignInInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncSignInInfoRequest self = new SyncSignInInfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncSignInInfoRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public SyncSignInInfoRequest setQRCode(String QRCode) {
        this.QRCode = QRCode;
        return this;
    }
    public String getQRCode() {
        return this.QRCode;
    }

}
