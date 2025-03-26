// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class QueryApplicationAccessIdRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("applicationAccessId")
    public String applicationAccessId;

    public static QueryApplicationAccessIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationAccessIdRequest self = new QueryApplicationAccessIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationAccessIdRequest setApplicationAccessId(String applicationAccessId) {
        this.applicationAccessId = applicationAccessId;
        return this;
    }
    public String getApplicationAccessId() {
        return this.applicationAccessId;
    }

}
