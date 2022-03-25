// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DataStoreCredentialRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Type")
    public String type;

    public static DataStoreCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        DataStoreCredentialRequest self = new DataStoreCredentialRequest();
        return TeaModel.build(map, self);
    }

    public DataStoreCredentialRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DataStoreCredentialRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
