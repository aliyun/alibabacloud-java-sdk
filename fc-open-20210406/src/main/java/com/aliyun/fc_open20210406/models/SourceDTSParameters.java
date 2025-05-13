// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class SourceDTSParameters extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dts-cn-shanghai-vpc.aliyuncs.com:18003</p>
     */
    @NameInMap("BrokerUrl")
    public String brokerUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1677340805</p>
     */
    @NameInMap("InitCheckPoint")
    public Long initCheckPoint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsTest123</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtse34j22j025aq26p</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e34z2gm325qp37m</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn_shanghai_vpc_rm_uf6398ykj0218rk6t_dts_trigger_upgrade_from_old_version2</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>This parameter is required.</p>
     * 
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

    public SourceDTSParameters setInitCheckPoint(Long initCheckPoint) {
        this.initCheckPoint = initCheckPoint;
        return this;
    }
    public Long getInitCheckPoint() {
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
