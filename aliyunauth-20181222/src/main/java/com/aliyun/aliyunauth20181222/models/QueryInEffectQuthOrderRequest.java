// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class QueryInEffectQuthOrderRequest extends TeaModel {
    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("Language")
    public String language;

    @NameInMap("OperatorTypeEnum")
    public String operatorTypeEnum;

    @NameInMap("RequestFromApp")
    public String requestFromApp;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestWay")
    public String requestWay;

    @NameInMap("UserNo")
    public String userNo;

    public static QueryInEffectQuthOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInEffectQuthOrderRequest self = new QueryInEffectQuthOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryInEffectQuthOrderRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryInEffectQuthOrderRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryInEffectQuthOrderRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public QueryInEffectQuthOrderRequest setOperatorTypeEnum(String operatorTypeEnum) {
        this.operatorTypeEnum = operatorTypeEnum;
        return this;
    }
    public String getOperatorTypeEnum() {
        return this.operatorTypeEnum;
    }

    public QueryInEffectQuthOrderRequest setRequestFromApp(String requestFromApp) {
        this.requestFromApp = requestFromApp;
        return this;
    }
    public String getRequestFromApp() {
        return this.requestFromApp;
    }

    public QueryInEffectQuthOrderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInEffectQuthOrderRequest setRequestWay(String requestWay) {
        this.requestWay = requestWay;
        return this;
    }
    public String getRequestWay() {
        return this.requestWay;
    }

    public QueryInEffectQuthOrderRequest setUserNo(String userNo) {
        this.userNo = userNo;
        return this;
    }
    public String getUserNo() {
        return this.userNo;
    }

}
