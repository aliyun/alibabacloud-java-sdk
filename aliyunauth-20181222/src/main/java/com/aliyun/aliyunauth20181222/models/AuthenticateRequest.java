// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class AuthenticateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Language")
    public String language;

    @NameInMap("OperateCode")
    public String operateCode;

    @NameInMap("OperatorTypeEnum")
    public String operatorTypeEnum;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RequestFromApp")
    public String requestFromApp;

    @NameInMap("RequestWay")
    public String requestWay;

    @NameInMap("UserNo")
    public String userNo;

    public static AuthenticateRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthenticateRequest self = new AuthenticateRequest();
        return TeaModel.build(map, self);
    }

    public AuthenticateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthenticateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public AuthenticateRequest setOperateCode(String operateCode) {
        this.operateCode = operateCode;
        return this;
    }
    public String getOperateCode() {
        return this.operateCode;
    }

    public AuthenticateRequest setOperatorTypeEnum(String operatorTypeEnum) {
        this.operatorTypeEnum = operatorTypeEnum;
        return this;
    }
    public String getOperatorTypeEnum() {
        return this.operatorTypeEnum;
    }

    public AuthenticateRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AuthenticateRequest setRequestFromApp(String requestFromApp) {
        this.requestFromApp = requestFromApp;
        return this;
    }
    public String getRequestFromApp() {
        return this.requestFromApp;
    }

    public AuthenticateRequest setRequestWay(String requestWay) {
        this.requestWay = requestWay;
        return this;
    }
    public String getRequestWay() {
        return this.requestWay;
    }

    public AuthenticateRequest setUserNo(String userNo) {
        this.userNo = userNo;
        return this;
    }
    public String getUserNo() {
        return this.userNo;
    }

}
