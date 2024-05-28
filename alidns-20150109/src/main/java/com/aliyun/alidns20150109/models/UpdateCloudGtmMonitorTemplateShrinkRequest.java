// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmMonitorTemplateShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("ExtendInfo")
    public String extendInfo;

    @NameInMap("FailureRate")
    public Integer failureRate;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IspCityNodes")
    public String ispCityNodesShrink;

    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Timeout")
    public Integer timeout;

    public static UpdateCloudGtmMonitorTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmMonitorTemplateShrinkRequest self = new UpdateCloudGtmMonitorTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setFailureRate(Integer failureRate) {
        this.failureRate = failureRate;
        return this;
    }
    public Integer getFailureRate() {
        return this.failureRate;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setIspCityNodesShrink(String ispCityNodesShrink) {
        this.ispCityNodesShrink = ispCityNodesShrink;
        return this;
    }
    public String getIspCityNodesShrink() {
        return this.ispCityNodesShrink;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
