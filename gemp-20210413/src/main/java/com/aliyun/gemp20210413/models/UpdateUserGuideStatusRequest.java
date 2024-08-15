// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateUserGuideStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>SERVICE_GROUP_GUIDE</p>
     */
    @NameInMap("guideAction")
    public String guideAction;

    public static UpdateUserGuideStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGuideStatusRequest self = new UpdateUserGuideStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserGuideStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateUserGuideStatusRequest setGuideAction(String guideAction) {
        this.guideAction = guideAction;
        return this;
    }
    public String getGuideAction() {
        return this.guideAction;
    }

}
