// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryWabaBusinessInfoRequest extends TeaModel {
    /**
     * <p>The space ID of the user under the independent software vendor (ISV) account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ID of the WABA.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WabaId")
    public String wabaId;

    public static QueryWabaBusinessInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWabaBusinessInfoRequest self = new QueryWabaBusinessInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryWabaBusinessInfoRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public QueryWabaBusinessInfoRequest setWabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }
    public String getWabaId() {
        return this.wabaId;
    }

}
