// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveRegistrantProfileRealNameVerificationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <strong>example:</strong>
     * <p>4D73432C-7600-****-ACBB-C3B5CA145D32</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SaveRegistrantProfileRealNameVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveRegistrantProfileRealNameVerificationResponseBody self = new SaveRegistrantProfileRealNameVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveRegistrantProfileRealNameVerificationResponseBody setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveRegistrantProfileRealNameVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
