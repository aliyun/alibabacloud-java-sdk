// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class PushRpaTaskRequest extends TeaModel {
    /**
     * <p>aliyunKp</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AliyunKp")
    public String aliyunKp;

    /**
     * <p>apiType</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("ApiType")
    public String apiType;

    /**
     * <p>bid</p>
     * 
     * <strong>example:</strong>
     * <p>26842</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>lang</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>modelId</p>
     * 
     * <strong>example:</strong>
     * <p>1951</p>
     */
    @NameInMap("ModelId")
    public Long modelId;

    /**
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>originalRequest</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OriginalRequest")
    public String originalRequest;

    /**
     * <p>request</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Request")
    public String request;

    /**
     * <p>status</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>taskId</p>
     * 
     * <strong>example:</strong>
     * <p>833812</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>templateId</p>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>userAccessKeyId</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    /**
     * <p>userBid</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserBid")
    public String userBid;

    /**
     * <p>userCallerParentId</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserCallerParentId")
    public Long userCallerParentId;

    /**
     * <p>userCallerType</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserCallerType")
    public String userCallerType;

    /**
     * <p>userClientIp</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>userKp</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserKp")
    public String userKp;

    /**
     * <p>userMfaPresent</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserMfaPresent")
    public Boolean userMfaPresent;

    /**
     * <p>userSecurityToken</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserSecurityToken")
    public String userSecurityToken;

    public static PushRpaTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRpaTaskRequest self = new PushRpaTaskRequest();
        return TeaModel.build(map, self);
    }

    public PushRpaTaskRequest setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public PushRpaTaskRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public PushRpaTaskRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public PushRpaTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PushRpaTaskRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public PushRpaTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PushRpaTaskRequest setOriginalRequest(String originalRequest) {
        this.originalRequest = originalRequest;
        return this;
    }
    public String getOriginalRequest() {
        return this.originalRequest;
    }

    public PushRpaTaskRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public PushRpaTaskRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public PushRpaTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public PushRpaTaskRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public PushRpaTaskRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public PushRpaTaskRequest setUserBid(String userBid) {
        this.userBid = userBid;
        return this;
    }
    public String getUserBid() {
        return this.userBid;
    }

    public PushRpaTaskRequest setUserCallerParentId(Long userCallerParentId) {
        this.userCallerParentId = userCallerParentId;
        return this;
    }
    public Long getUserCallerParentId() {
        return this.userCallerParentId;
    }

    public PushRpaTaskRequest setUserCallerType(String userCallerType) {
        this.userCallerType = userCallerType;
        return this;
    }
    public String getUserCallerType() {
        return this.userCallerType;
    }

    public PushRpaTaskRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public PushRpaTaskRequest setUserKp(String userKp) {
        this.userKp = userKp;
        return this;
    }
    public String getUserKp() {
        return this.userKp;
    }

    public PushRpaTaskRequest setUserMfaPresent(Boolean userMfaPresent) {
        this.userMfaPresent = userMfaPresent;
        return this;
    }
    public Boolean getUserMfaPresent() {
        return this.userMfaPresent;
    }

    public PushRpaTaskRequest setUserSecurityToken(String userSecurityToken) {
        this.userSecurityToken = userSecurityToken;
        return this;
    }
    public String getUserSecurityToken() {
        return this.userSecurityToken;
    }

}
