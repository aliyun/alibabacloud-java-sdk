// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteDnsInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F7E4322D-D679-5ACB-A909-490D2F0E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOfficeSiteDnsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteDnsInfoResponseBody self = new ModifyOfficeSiteDnsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteDnsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
