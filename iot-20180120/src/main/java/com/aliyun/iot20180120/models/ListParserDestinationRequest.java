// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListParserDestinationRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("IsFailover")
    public Boolean isFailover;

    @NameInMap("ParserId")
    public Long parserId;

    public static ListParserDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListParserDestinationRequest self = new ListParserDestinationRequest();
        return TeaModel.build(map, self);
    }

    public ListParserDestinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListParserDestinationRequest setIsFailover(Boolean isFailover) {
        this.isFailover = isFailover;
        return this;
    }
    public Boolean getIsFailover() {
        return this.isFailover;
    }

    public ListParserDestinationRequest setParserId(Long parserId) {
        this.parserId = parserId;
        return this;
    }
    public Long getParserId() {
        return this.parserId;
    }

}
