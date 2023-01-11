// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetSimCardStateDistributionRequest extends TeaModel {
    @NameInMap("CredentialNO")
    public String credentialNO;

    @NameInMap("Date")
    public String date;

    public static GetSimCardStateDistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSimCardStateDistributionRequest self = new GetSimCardStateDistributionRequest();
        return TeaModel.build(map, self);
    }

    public GetSimCardStateDistributionRequest setCredentialNO(String credentialNO) {
        this.credentialNO = credentialNO;
        return this;
    }
    public String getCredentialNO() {
        return this.credentialNO;
    }

    public GetSimCardStateDistributionRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
