// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveRegistrantProfileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    public static SaveRegistrantProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveRegistrantProfileResponseBody self = new SaveRegistrantProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveRegistrantProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveRegistrantProfileResponseBody setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

}
