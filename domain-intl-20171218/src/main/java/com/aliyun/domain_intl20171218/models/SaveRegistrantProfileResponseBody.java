// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveRegistrantProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12380891</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <strong>example:</strong>
     * <p>A9C35C47-3366-482E-B872-8C9EA4733FE9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SaveRegistrantProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveRegistrantProfileResponseBody self = new SaveRegistrantProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveRegistrantProfileResponseBody setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveRegistrantProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
