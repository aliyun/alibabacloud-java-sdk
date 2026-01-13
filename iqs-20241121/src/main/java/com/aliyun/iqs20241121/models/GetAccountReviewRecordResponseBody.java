// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class GetAccountReviewRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>123123213123</p>
     */
    @NameInMap("aliUid")
    public String aliUid;

    /**
     * <strong>example:</strong>
     * <p>申请服务</p>
     */
    @NameInMap("applyType")
    public String applyType;

    /**
     * <strong>example:</strong>
     * <p>18987236721</p>
     */
    @NameInMap("contactName")
    public String contactName;

    /**
     * <strong>example:</strong>
     * <p>测试商品</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>123214889322</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("productName")
    public String productName;

    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("qps")
    public Integer qps;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6788a2c2-157d4ebe-ad979cd4f296</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("sceneDesc")
    public String sceneDesc;

    @NameInMap("scopes")
    public java.util.List<String> scopes;

    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    public static GetAccountReviewRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountReviewRecordResponseBody self = new GetAccountReviewRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountReviewRecordResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public GetAccountReviewRecordResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetAccountReviewRecordResponseBody setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public GetAccountReviewRecordResponseBody setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public GetAccountReviewRecordResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAccountReviewRecordResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetAccountReviewRecordResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GetAccountReviewRecordResponseBody setQps(Integer qps) {
        this.qps = qps;
        return this;
    }
    public Integer getQps() {
        return this.qps;
    }

    public GetAccountReviewRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountReviewRecordResponseBody setSceneDesc(String sceneDesc) {
        this.sceneDesc = sceneDesc;
        return this;
    }
    public String getSceneDesc() {
        return this.sceneDesc;
    }

    public GetAccountReviewRecordResponseBody setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public GetAccountReviewRecordResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
