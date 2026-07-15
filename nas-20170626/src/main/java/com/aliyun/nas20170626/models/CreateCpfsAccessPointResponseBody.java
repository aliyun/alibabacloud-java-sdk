// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateCpfsAccessPointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ap-ie15yd****</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCpfsAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCpfsAccessPointResponseBody self = new CreateCpfsAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCpfsAccessPointResponseBody setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public CreateCpfsAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
