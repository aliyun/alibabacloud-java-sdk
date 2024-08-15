// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlanServicesRequest extends TeaModel {
    /**
     * <p>clientToken</p>
     * 
     * <strong>example:</strong>
     * <p>A5A1FEAE-9C47-011C-9C73-A376BC2REQUEST</p>
     */
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
