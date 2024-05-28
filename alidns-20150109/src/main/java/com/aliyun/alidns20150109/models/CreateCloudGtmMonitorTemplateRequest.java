// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmMonitorTemplateRequest extends TeaModel {
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
    public java.util.List<CreateCloudGtmMonitorTemplateRequestIspCityNodes> ispCityNodes;

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

    public static CreateCloudGtmMonitorTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmMonitorTemplateRequest self = new CreateCloudGtmMonitorTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmMonitorTemplateRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCloudGtmMonitorTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudGtmMonitorTemplateRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public CreateCloudGtmMonitorTemplateRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public CreateCloudGtmMonitorTemplateRequest setFailureRate(Integer failureRate) {
        this.failureRate = failureRate;
        return this;
    }
    public Integer getFailureRate() {
        return this.failureRate;
    }

    public CreateCloudGtmMonitorTemplateRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public CreateCloudGtmMonitorTemplateRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateCloudGtmMonitorTemplateRequest setIspCityNodes(java.util.List<CreateCloudGtmMonitorTemplateRequestIspCityNodes> ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public java.util.List<CreateCloudGtmMonitorTemplateRequestIspCityNodes> getIspCityNodes() {
        return this.ispCityNodes;
    }

    public CreateCloudGtmMonitorTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCloudGtmMonitorTemplateRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateCloudGtmMonitorTemplateRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class CreateCloudGtmMonitorTemplateRequestIspCityNodes extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("IspCode")
        public String ispCode;

        public static CreateCloudGtmMonitorTemplateRequestIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudGtmMonitorTemplateRequestIspCityNodes self = new CreateCloudGtmMonitorTemplateRequestIspCityNodes();
            return TeaModel.build(map, self);
        }

        public CreateCloudGtmMonitorTemplateRequestIspCityNodes setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public CreateCloudGtmMonitorTemplateRequestIspCityNodes setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
