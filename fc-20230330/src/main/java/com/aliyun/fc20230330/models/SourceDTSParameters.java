// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SourceDTSParameters extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dts-cn-shanghai-vpc.com:18003</p>
     */
    @NameInMap("BrokerUrl")
    public String brokerUrl;

    /**
     * <strong>example:</strong>
     * <p>1677340805</p>
     */
    @NameInMap("InitCheckPoint")
    public Integer initCheckPoint;

    /**
     * <strong>example:</strong>
     * <p>dtsTest123</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>dtse34j22j025a****</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <strong>example:</strong>
     * <p>e34z2gm325q****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>cn_shanghai_vpc_rm_uf6398ykj0218****_dts_trigger_upgrade_from_old_version2</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <strong>example:</strong>
     * <p>dts_trigger</p>
     */
    @NameInMap("Username")
    public String username;

    public static SourceDTSParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceDTSParameters self = new SourceDTSParameters();
        return TeaModel.build(map, self);
    }

    public SourceDTSParameters setBrokerUrl(String brokerUrl) {
        this.brokerUrl = brokerUrl;
        return this;
    }
    public String getBrokerUrl() {
        return this.brokerUrl;
    }

    public SourceDTSParameters setInitCheckPoint(Integer initCheckPoint) {
        this.initCheckPoint = initCheckPoint;
        return this;
    }
    public Integer getInitCheckPoint() {
        return this.initCheckPoint;
    }

    public SourceDTSParameters setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SourceDTSParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SourceDTSParameters setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public SourceDTSParameters setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SourceDTSParameters setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public SourceDTSParameters setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
