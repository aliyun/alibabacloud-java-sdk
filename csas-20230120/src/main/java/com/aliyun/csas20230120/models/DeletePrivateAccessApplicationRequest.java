// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeletePrivateAccessApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    public static DeletePrivateAccessApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateAccessApplicationRequest self = new DeletePrivateAccessApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrivateAccessApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
