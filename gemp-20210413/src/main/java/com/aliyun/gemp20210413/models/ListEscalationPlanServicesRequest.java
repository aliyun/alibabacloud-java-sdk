// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlanServicesRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    public static ListEscalationPlanServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlanServicesRequest self = new ListEscalationPlanServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlanServicesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
