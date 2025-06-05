// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAirflowLoginTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af-b3a7f110a6vmvn7xxxxxx</p>
     */
    @NameInMap("AirflowId")
    public String airflowId;

    public static CreateAirflowLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAirflowLoginTokenRequest self = new CreateAirflowLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateAirflowLoginTokenRequest setAirflowId(String airflowId) {
        this.airflowId = airflowId;
        return this;
    }
    public String getAirflowId() {
        return this.airflowId;
    }

}
