// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class QueryAuthRequest extends TeaModel {
    @NameInMap("BizNo")
    public String bizNo;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Language")
    public String language;

    @NameInMap("OperatorTypeEnum")
    public String operatorTypeEnum;

    @NameInMap("OrderVid")
    public String orderVid;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RequestFromApp")
    public String requestFromApp;

    @NameInMap("RequestWay")
    public String requestWay;

    @NameInMap("UserNo")
    public String userNo;

    public static QueryAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthRequest self = new QueryAuthRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public QueryAuthRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryAuthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryAuthRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public QueryAuthRequest setOperatorTypeEnum(String operatorTypeEnum) {
        this.operatorTypeEnum = operatorTypeEnum;
        return this;
    }
    public String getOperatorTypeEnum() {
        return this.operatorTypeEnum;
    }

    public QueryAuthRequest setOrderVid(String orderVid) {
        this.orderVid = orderVid;
        return this;
    }
    public String getOrderVid() {
        return this.orderVid;
    }

    public QueryAuthRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryAuthRequest setRequestFromApp(String requestFromApp) {
        this.requestFromApp = requestFromApp;
        return this;
    }
    public String getRequestFromApp() {
        return this.requestFromApp;
    }

    public QueryAuthRequest setRequestWay(String requestWay) {
        this.requestWay = requestWay;
        return this;
    }
    public String getRequestWay() {
        return this.requestWay;
    }

    public QueryAuthRequest setUserNo(String userNo) {
        this.userNo = userNo;
        return this;
    }
    public String getUserNo() {
        return this.userNo;
    }

}
