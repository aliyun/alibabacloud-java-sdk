// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamMonitorRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InputList")
    public String inputList;

    @NameInMap("MonitorName")
    public String monitorName;

    @NameInMap("OutputTemplate")
    public String outputTemplate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Stream")
    public String stream;

    public static CreateLiveStreamMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveStreamMonitorRequest self = new CreateLiveStreamMonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveStreamMonitorRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateLiveStreamMonitorRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateLiveStreamMonitorRequest setInputList(String inputList) {
        this.inputList = inputList;
        return this;
    }
    public String getInputList() {
        return this.inputList;
    }

    public CreateLiveStreamMonitorRequest setMonitorName(String monitorName) {
        this.monitorName = monitorName;
        return this;
    }
    public String getMonitorName() {
        return this.monitorName;
    }

    public CreateLiveStreamMonitorRequest setOutputTemplate(String outputTemplate) {
        this.outputTemplate = outputTemplate;
        return this;
    }
    public String getOutputTemplate() {
        return this.outputTemplate;
    }

    public CreateLiveStreamMonitorRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLiveStreamMonitorRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

}
