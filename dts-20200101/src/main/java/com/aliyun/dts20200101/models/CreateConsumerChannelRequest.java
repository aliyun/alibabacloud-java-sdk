// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateConsumerChannelRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    @NameInMap("ConsumerGroupUserName")
    public String consumerGroupUserName;

    public static CreateConsumerChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerChannelRequest self = new CreateConsumerChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerChannelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateConsumerChannelRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public CreateConsumerChannelRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public CreateConsumerChannelRequest setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    public CreateConsumerChannelRequest setConsumerGroupPassword(String consumerGroupPassword) {
        this.consumerGroupPassword = consumerGroupPassword;
        return this;
    }
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    public CreateConsumerChannelRequest setConsumerGroupUserName(String consumerGroupUserName) {
        this.consumerGroupUserName = consumerGroupUserName;
        return this;
    }
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

}
