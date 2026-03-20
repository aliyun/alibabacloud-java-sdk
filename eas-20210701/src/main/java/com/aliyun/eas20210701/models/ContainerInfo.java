// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ContainerInfo extends TeaModel {
    /**
     * <p>The reason why the container is in the current state.</p>
     * 
     * <strong>example:</strong>
     * <p>PodInitializing</p>
     */
    @NameInMap("CurrentReaon")
    public String currentReaon;

    /**
     * <p>The current state of the container. Valid values:</p>
     * <ul>
     * <li>Waiting</li>
     * <li>Running</li>
     * <li>Terminated</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Waiting</p>
     */
    @NameInMap("CurrentStatus")
    public String currentStatus;

    /**
     * <p>The time when the container entered the current state.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-21T06:17:57Z</p>
     */
    @NameInMap("CurrentTimestamp")
    public String currentTimestamp;

    /**
     * <p>The image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-shanghai.aliyuncs.com/eas/echo_cn-shanghai:v0.0.1-20210129111320</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The reason why the container is in the last state.</p>
     * 
     * <strong>example:</strong>
     * <p>Error</p>
     */
    @NameInMap("LastReason")
    public String lastReason;

    /**
     * <p>The last state of the container. Valid values:</p>
     * <ul>
     * <li>Waiting</li>
     * <li>Running</li>
     * <li>Terminated</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Terminated</p>
     */
    @NameInMap("LastStatus")
    public String lastStatus;

    /**
     * <p>The time when the container entered the last state.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-21T05:17:57Z</p>
     */
    @NameInMap("LastTimestamp")
    public String lastTimestamp;

    /**
     * <p>The container name.</p>
     * 
     * <strong>example:</strong>
     * <p>worker0</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The port number.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>Indicates whether the container passed the health check.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ready")
    public Boolean ready;

    /**
     * <p>The number of times the container restarted.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
