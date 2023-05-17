// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ContainerInfo extends TeaModel {
    @NameInMap("CurrentReaon")
    public String currentReaon;

    @NameInMap("CurrentStatus")
    public String currentStatus;

    @NameInMap("CurrentTimestamp")
    public String currentTimestamp;

    @NameInMap("Image")
    public String image;

    @NameInMap("LastReason")
    public String lastReason;

    @NameInMap("LastStatus")
    public String lastStatus;

    @NameInMap("LastTimestamp")
    public String lastTimestamp;

    @NameInMap("Name")
    public String name;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Ready")
    public Boolean ready;

    @NameInMap("RestartCount")
    public Integer restartCount;

    public static ContainerInfo build(java.util.Map<String, ?> map) throws Exception {
        ContainerInfo self = new ContainerInfo();
        return TeaModel.build(map, self);
    }

    public ContainerInfo setCurrentReaon(String currentReaon) {
        this.currentReaon = currentReaon;
        return this;
    }
    public String getCurrentReaon() {
        return this.currentReaon;
    }

    public ContainerInfo setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }
    public String getCurrentStatus() {
        return this.currentStatus;
    }

    public ContainerInfo setCurrentTimestamp(String currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
        return this;
    }
    public String getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    public ContainerInfo setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ContainerInfo setLastReason(String lastReason) {
        this.lastReason = lastReason;
        return this;
    }
    public String getLastReason() {
        return this.lastReason;
    }

    public ContainerInfo setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }
    public String getLastStatus() {
        return this.lastStatus;
    }

    public ContainerInfo setLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }
    public String getLastTimestamp() {
        return this.lastTimestamp;
    }

    public ContainerInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContainerInfo setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ContainerInfo setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }
    public Boolean getReady() {
        return this.ready;
    }

    public ContainerInfo setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }
    public Integer getRestartCount() {
        return this.restartCount;
    }

}
