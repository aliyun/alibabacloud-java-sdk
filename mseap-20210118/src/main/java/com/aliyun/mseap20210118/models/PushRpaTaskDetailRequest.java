// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class PushRpaTaskDetailRequest extends TeaModel {
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
     * <p>MPC</p>
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
     * <p>inputData</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://wssq.sbj.cnipa.gov.cn:9080/tmsve/wssqsy_getCayzDl.xhtml">http://wssq.sbj.cnipa.gov.cn:9080/tmsve/wssqsy_getCayzDl.xhtml</a></p>
     */
    @NameInMap("InputData")
    public String inputData;

    /**
     * <p>inputHtml</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InputHtml")
    public String inputHtml;

    /**
     * <p>inputScreenshot</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InputScreenshot")
    public String inputScreenshot;

    /**
     * <p>lang</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>modelDetailId</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ModelDetailId")
    public Long modelDetailId;

    /**
     * <p>originalRequest</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OriginalRequest")
    public String originalRequest;

    /**
     * <p>outputData</p>
     */
    @NameInMap("OutputData")
    public String outputData;

    /**
     * <p>outputHtml</p>
     * 
     * <strong>example:</strong>
     * <div class=\\"photobox\\" id=\\"Layer3\\" style=\\"visibility: visible
     */
    @NameInMap("OutputHtml")
    public String outputHtml;

    /**
     * <p>outputScreenshot</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://dbu-nap-p-test.oss-cn-beijing.aliyuncs.com/202301/20230110/5782089/1673334129101-d111874e-f181-4d1c-8edc-83e789975329.jpg?Expires=1675926129&OSSAccessKeyId=hObpgEXoca42qH3V&Signature=------">http://dbu-nap-p-test.oss-cn-beijing.aliyuncs.com/202301/20230110/5782089/1673334129101-d111874e-f181-4d1c-8edc-83e789975329.jpg?Expires=1675926129&amp;OSSAccessKeyId=hObpgEXoca42qH3V&amp;Signature=------</a></p>
     */
    @NameInMap("OutputScreenshot")
    public String outputScreenshot;

    /**
     * <p>status</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>taskDetailId</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskDetailId")
    public Long taskDetailId;

    /**
     * <p>taskId</p>
     * 
     * <strong>example:</strong>
     * <p>5596654</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

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
     * <p>userSecurityToken</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserSecurityToken")
    public String userSecurityToken;

    public static PushRpaTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRpaTaskDetailRequest self = new PushRpaTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public PushRpaTaskDetailRequest setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public PushRpaTaskDetailRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public PushRpaTaskDetailRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public PushRpaTaskDetailRequest setInputData(String inputData) {
        this.inputData = inputData;
        return this;
    }
    public String getInputData() {
        return this.inputData;
    }

    public PushRpaTaskDetailRequest setInputHtml(String inputHtml) {
        this.inputHtml = inputHtml;
        return this;
    }
    public String getInputHtml() {
        return this.inputHtml;
    }

    public PushRpaTaskDetailRequest setInputScreenshot(String inputScreenshot) {
        this.inputScreenshot = inputScreenshot;
        return this;
    }
    public String getInputScreenshot() {
        return this.inputScreenshot;
    }

    public PushRpaTaskDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PushRpaTaskDetailRequest setModelDetailId(Long modelDetailId) {
        this.modelDetailId = modelDetailId;
        return this;
    }
    public Long getModelDetailId() {
        return this.modelDetailId;
    }

    public PushRpaTaskDetailRequest setOriginalRequest(String originalRequest) {
        this.originalRequest = originalRequest;
        return this;
    }
    public String getOriginalRequest() {
        return this.originalRequest;
    }

    public PushRpaTaskDetailRequest setOutputData(String outputData) {
        this.outputData = outputData;
        return this;
    }
    public String getOutputData() {
        return this.outputData;
    }

    public PushRpaTaskDetailRequest setOutputHtml(String outputHtml) {
        this.outputHtml = outputHtml;
        return this;
    }
    public String getOutputHtml() {
        return this.outputHtml;
    }

    public PushRpaTaskDetailRequest setOutputScreenshot(String outputScreenshot) {
        this.outputScreenshot = outputScreenshot;
        return this;
    }
    public String getOutputScreenshot() {
        return this.outputScreenshot;
    }

    public PushRpaTaskDetailRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public PushRpaTaskDetailRequest setTaskDetailId(Long taskDetailId) {
        this.taskDetailId = taskDetailId;
        return this;
    }
    public Long getTaskDetailId() {
        return this.taskDetailId;
    }

    public PushRpaTaskDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public PushRpaTaskDetailRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    public PushRpaTaskDetailRequest setUserBid(String userBid) {
        this.userBid = userBid;
        return this;
    }
    public String getUserBid() {
        return this.userBid;
    }

    public PushRpaTaskDetailRequest setUserCallerParentId(Long userCallerParentId) {
        this.userCallerParentId = userCallerParentId;
        return this;
    }
    public Long getUserCallerParentId() {
        return this.userCallerParentId;
    }

    public PushRpaTaskDetailRequest setUserCallerType(String userCallerType) {
        this.userCallerType = userCallerType;
        return this;
    }
    public String getUserCallerType() {
        return this.userCallerType;
    }

    public PushRpaTaskDetailRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public PushRpaTaskDetailRequest setUserKp(String userKp) {
        this.userKp = userKp;
        return this;
    }
    public String getUserKp() {
        return this.userKp;
    }

    public PushRpaTaskDetailRequest setUserSecurityToken(String userSecurityToken) {
        this.userSecurityToken = userSecurityToken;
        return this;
    }
    public String getUserSecurityToken() {
        return this.userSecurityToken;
    }

}
