// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class UpdateInsRequest extends TeaModel {
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Succeed")
    public String succeed;

    @NameInMap("new-param-1")
    public String newParam1;

    @NameInMap("new-param-72444")
    public String newParam72444;

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

    public UpdateInsRequest setNewParam1(String newParam1) {
        this.newParam1 = newParam1;
        return this;
    }
    public String getNewParam1() {
        return this.newParam1;
    }

    public UpdateInsRequest setNewParam72444(String newParam72444) {
        this.newParam72444 = newParam72444;
        return this;
    }
    public String getNewParam72444() {
        return this.newParam72444;
    }

}
