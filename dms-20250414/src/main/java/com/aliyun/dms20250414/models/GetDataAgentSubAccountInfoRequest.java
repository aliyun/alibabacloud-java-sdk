// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentSubAccountInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DmsUnit")
    public String dmsUnit;

    /**
     * <strong>example:</strong>
     * <p>20282*****7591</p>
     */
    @NameInMap("SubAccountId")
    public String subAccountId;

    public static GetDataAgentSubAccountInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentSubAccountInfoRequest self = new GetDataAgentSubAccountInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDataAgentSubAccountInfoRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public GetDataAgentSubAccountInfoRequest setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

}
