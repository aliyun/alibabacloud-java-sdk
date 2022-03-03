// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCredentialPoolStatisticsRequest extends TeaModel {
    @NameInMap("CredentialNO")
    public String credentialNO;

    @NameInMap("Date")
    public String date;

    public static GetCredentialPoolStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialPoolStatisticsRequest self = new GetCredentialPoolStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetCredentialPoolStatisticsRequest setCredentialNO(String credentialNO) {
        this.credentialNO = credentialNO;
        return this;
    }
    public String getCredentialNO() {
        return this.credentialNO;
    }

    public GetCredentialPoolStatisticsRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
