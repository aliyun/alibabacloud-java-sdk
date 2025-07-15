// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCdnDiagnoseInfoRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("app")
    public String app;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("intervalType")
    public String intervalType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("phase")
    public Integer phase;

    @NameInMap("requestType")
    public String requestType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("streamName")
    public String streamName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("streamSuffix")
    public String streamSuffix;

    public static DescribeLiveCdnDiagnoseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCdnDiagnoseInfoRequest self = new DescribeLiveCdnDiagnoseInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCdnDiagnoseInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeLiveCdnDiagnoseInfoRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeLiveCdnDiagnoseInfoRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeLiveCdnDiagnoseInfoRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeLiveCdnDiagnoseInfoRequest setIntervalType(String intervalType) {
        this.intervalType = intervalType;
        return this;
    }
    public String getIntervalType() {
        return this.intervalType;
    }

    public DescribeLiveCdnDiagnoseInfoRequest setPhase(Integer phase) {
        this.phase = phase;
        return this;
    }
    public Integer getPhase() {
        return this.phase;
    }

    public DescribeLiveCdnDiagnoseInfoRequest setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public DescribeLiveCdnDiagnoseInfoRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeLiveCdnDiagnoseInfoRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DescribeLiveCdnDiagnoseInfoRequest setStreamSuffix(String streamSuffix) {
        this.streamSuffix = streamSuffix;
        return this;
    }
    public String getStreamSuffix() {
        return this.streamSuffix;
    }

}
