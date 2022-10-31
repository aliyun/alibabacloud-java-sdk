// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamMonitorRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InputList")
    public String inputList;

    @NameInMap("MonitorId")
    public String monitorId;

    @NameInMap("MonitorName")
    public String monitorName;

    @NameInMap("OutputTemplate")
    public String outputTemplate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Stream")
    public String stream;

    public static UpdateLiveStreamMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamMonitorRequest self = new UpdateLiveStreamMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamMonitorRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UpdateLiveStreamMonitorRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateLiveStreamMonitorRequest setInputList(String inputList) {
        this.inputList = inputList;
        return this;
    }
    public String getInputList() {
        return this.inputList;
    }

    public UpdateLiveStreamMonitorRequest setMonitorId(String monitorId) {
        this.monitorId = monitorId;
        return this;
    }
    public String getMonitorId() {
        return this.monitorId;
    }

    public UpdateLiveStreamMonitorRequest setMonitorName(String monitorName) {
        this.monitorName = monitorName;
        return this;
    }
    public String getMonitorName() {
        return this.monitorName;
    }

    public UpdateLiveStreamMonitorRequest setOutputTemplate(String outputTemplate) {
        this.outputTemplate = outputTemplate;
        return this;
    }
    public String getOutputTemplate() {
        return this.outputTemplate;
    }

    public UpdateLiveStreamMonitorRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveStreamMonitorRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

}
