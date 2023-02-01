// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class UpdateInsRequest extends TeaModel {
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Succeed")
    public String succeed;

    @NameInMap("new-param-72")
    public String newParam72;

    public static UpdateInsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInsRequest self = new UpdateInsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInsRequest setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateInsRequest setSucceed(String succeed) {
        this.succeed = succeed;
        return this;
    }
    public String getSucceed() {
        return this.succeed;
    }

    public UpdateInsRequest setNewParam72(String newParam72) {
        this.newParam72 = newParam72;
        return this;
    }
    public String getNewParam72() {
        return this.newParam72;
    }

}
