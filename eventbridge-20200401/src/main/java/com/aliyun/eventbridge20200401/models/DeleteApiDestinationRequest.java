// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteApiDestinationRequest extends TeaModel {
    /**
     * <p>The name of the API destination.</p>
     */
    @NameInMap("ApiDestinationName")
    public String apiDestinationName;

    public static DeleteApiDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiDestinationRequest self = new DeleteApiDestinationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiDestinationRequest setApiDestinationName(String apiDestinationName) {
        this.apiDestinationName = apiDestinationName;
        return this;
    }
    public String getApiDestinationName() {
        return this.apiDestinationName;
    }

}
