// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class CmdbCommonPostAPIRequest extends TeaModel {
    // account
    @NameInMap("Account")
    public String account;

    // appName
    @NameInMap("AppName")
    public String appName;

    // method
    @NameInMap("Method")
    public String method;

    // param
    @NameInMap("Param")
    public String param;

    // signature
    @NameInMap("Signature")
    public String signature;

    // timestamp
    @NameInMap("Timestamp")
    public Long timestamp;

    public static CmdbCommonPostAPIRequest build(java.util.Map<String, ?> map) throws Exception {
        CmdbCommonPostAPIRequest self = new CmdbCommonPostAPIRequest();
        return TeaModel.build(map, self);
    }

    public CmdbCommonPostAPIRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CmdbCommonPostAPIRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CmdbCommonPostAPIRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CmdbCommonPostAPIRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public CmdbCommonPostAPIRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CmdbCommonPostAPIRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
