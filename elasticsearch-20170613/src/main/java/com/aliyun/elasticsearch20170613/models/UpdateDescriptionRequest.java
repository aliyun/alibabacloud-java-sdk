// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDescriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aliyunes_name_test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The new name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B350****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDescriptionRequest self = new UpdateDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDescriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
