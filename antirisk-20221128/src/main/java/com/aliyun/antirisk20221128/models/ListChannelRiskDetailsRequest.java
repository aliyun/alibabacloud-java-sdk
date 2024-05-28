// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class ListChannelRiskDetailsRequest extends TeaModel {
    @NameInMap("channel")
    public String channel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("end")
    public String end;

    @NameInMap("isAllChannel")
    public String isAllChannel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("start")
    public String start;

    public static ListChannelRiskDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChannelRiskDetailsRequest self = new ListChannelRiskDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListChannelRiskDetailsRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ListChannelRiskDetailsRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListChannelRiskDetailsRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public ListChannelRiskDetailsRequest setIsAllChannel(String isAllChannel) {
        this.isAllChannel = isAllChannel;
        return this;
    }
    public String getIsAllChannel() {
        return this.isAllChannel;
    }

    public ListChannelRiskDetailsRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
