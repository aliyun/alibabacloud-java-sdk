// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveRegistrantProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3600000</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <strong>example:</strong>
     * <p>D09B153B-294D-42F1-BB61-F1C72136DFD3</p>
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
