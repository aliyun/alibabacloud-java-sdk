// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmMonitorTemplateRequest extends TeaModel {
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
    public java.util.List<UpdateCloudGtmMonitorTemplateRequestIspCityNodes> ispCityNodes;

    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Timeout")
    public Integer timeout;

    public static UpdateCloudGtmMonitorTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmMonitorTemplateRequest self = new UpdateCloudGtmMonitorTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmMonitorTemplateRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmMonitorTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmMonitorTemplateRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public UpdateCloudGtmMonitorTemplateRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public UpdateCloudGtmMonitorTemplateRequest setFailureRate(Integer failureRate) {
        this.failureRate = failureRate;
        return this;
    }
    public Integer getFailureRate() {
        return this.failureRate;
    }

    public UpdateCloudGtmMonitorTemplateRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateCloudGtmMonitorTemplateRequest setIspCityNodes(java.util.List<UpdateCloudGtmMonitorTemplateRequestIspCityNodes> ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public java.util.List<UpdateCloudGtmMonitorTemplateRequestIspCityNodes> getIspCityNodes() {
        return this.ispCityNodes;
    }

    public UpdateCloudGtmMonitorTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCloudGtmMonitorTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateCloudGtmMonitorTemplateRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class UpdateCloudGtmMonitorTemplateRequestIspCityNodes extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("IspCode")
        public String ispCode;

        public static UpdateCloudGtmMonitorTemplateRequestIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudGtmMonitorTemplateRequestIspCityNodes self = new UpdateCloudGtmMonitorTemplateRequestIspCityNodes();
            return TeaModel.build(map, self);
        }

        public UpdateCloudGtmMonitorTemplateRequestIspCityNodes setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public UpdateCloudGtmMonitorTemplateRequestIspCityNodes setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
