// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170405.models;

import com.aliyun.tea.*;

public class EdasProduceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("synchro")
    public Boolean synchro;

    public static EdasProduceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EdasProduceResponseBody self = new EdasProduceResponseBody();
        return TeaModel.build(map, self);
    }

    public EdasProduceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EdasProduceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EdasProduceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EdasProduceResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

}
