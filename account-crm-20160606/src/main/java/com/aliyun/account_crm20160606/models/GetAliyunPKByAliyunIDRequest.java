// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAliyunPKByAliyunIDRequest extends TeaModel {
    @NameInMap("AliyunId")
    public String aliyunId;

    @NameInMap("Email")
    public String email;

    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("PK")
    public String PK;

    public static GetAliyunPKByAliyunIDRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunPKByAliyunIDRequest self = new GetAliyunPKByAliyunIDRequest();
        return TeaModel.build(map, self);
    }

    public GetAliyunPKByAliyunIDRequest setAliyunId(String aliyunId) {
        this.aliyunId = aliyunId;
        return this;
    }
    public String getAliyunId() {
        return this.aliyunId;
    }

    public GetAliyunPKByAliyunIDRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetAliyunPKByAliyunIDRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public GetAliyunPKByAliyunIDRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public GetAliyunPKByAliyunIDRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
