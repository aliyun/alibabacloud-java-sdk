// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerChannelRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("ConsumerGroupId")
    public String consumerGroupId;

    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    @NameInMap("ConsumerGroupUserName")
    public String consumerGroupUserName;

    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    public static ModifyConsumerChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerChannelRequest self = new ModifyConsumerChannelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerChannelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyConsumerChannelRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyConsumerChannelRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyConsumerChannelRequest setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    public ModifyConsumerChannelRequest setConsumerGroupPassword(String consumerGroupPassword) {
        this.consumerGroupPassword = consumerGroupPassword;
        return this;
    }
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    public ModifyConsumerChannelRequest setConsumerGroupUserName(String consumerGroupUserName) {
        this.consumerGroupUserName = consumerGroupUserName;
        return this;
    }
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

    public ModifyConsumerChannelRequest setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

}
