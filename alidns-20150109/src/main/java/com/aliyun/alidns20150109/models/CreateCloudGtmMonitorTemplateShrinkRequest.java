// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmMonitorTemplateShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FailureRate")
    public Integer failureRate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IspCityNodes")
    public String ispCityNodesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static CreateCloudGtmMonitorTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmMonitorTemplateShrinkRequest self = new CreateCloudGtmMonitorTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setFailureRate(Integer failureRate) {
        this.failureRate = failureRate;
        return this;
    }
    public Integer getFailureRate() {
        return this.failureRate;
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setIspCityNodesShrink(String ispCityNodesShrink) {
        this.ispCityNodesShrink = ispCityNodesShrink;
        return this;
    }
    public String getIspCityNodesShrink() {
        return this.ispCityNodesShrink;
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateCloudGtmMonitorTemplateShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
