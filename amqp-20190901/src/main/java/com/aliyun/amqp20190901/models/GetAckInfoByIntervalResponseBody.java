// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetAckInfoByIntervalResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetAckInfoByIntervalResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAckInfoByIntervalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAckInfoByIntervalResponseBody self = new GetAckInfoByIntervalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAckInfoByIntervalResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAckInfoByIntervalResponseBody setData(GetAckInfoByIntervalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAckInfoByIntervalResponseBodyData getData() {
        return this.data;
    }

    public GetAckInfoByIntervalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAckInfoByIntervalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAckInfoByIntervalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAckInfoByIntervalResponseBodyDataVoList extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ConnectionId")
        public String connectionId;

        @NameInMap("DeliveryTag")
        public Long deliveryTag;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RocketMqMsgId")
        public String rocketMqMsgId;

        @NameInMap("Rt")
        public Integer rt;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static GetAckInfoByIntervalResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            GetAckInfoByIntervalResponseBodyDataVoList self = new GetAckInfoByIntervalResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public GetAckInfoByIntervalResponseBodyDataVoList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetAckInfoByIntervalResponseBodyDataVoList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public GetAckInfoByIntervalResponseBodyDataVoList setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public GetAckInfoByIntervalResponseBodyDataVoList setDeliveryTag(Long deliveryTag) {
            this.deliveryTag = deliveryTag;
            return this;
        }
        public Long getDeliveryTag() {
            return this.deliveryTag;
        }

        public GetAckInfoByIntervalResponseBodyDataVoList setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetAckInfoByIntervalResponseBodyDataVoList setRocketMqMsgId(String rocketMqMsgId) {
            this.rocketMqMsgId = rocketMqMsgId;
            return this;
        }
        public String getRocketMqMsgId() {
            return this.rocketMqMsgId;
        }

        public GetAckInfoByIntervalResponseBodyDataVoList setRt(Integer rt) {
            this.rt = rt;
            return this;
        }
        public Integer getRt() {
            return this.rt;
        }

        public GetAckInfoByIntervalResponseBodyDataVoList setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class GetAckInfoByIntervalResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("VoList")
        public java.util.List<GetAckInfoByIntervalResponseBodyDataVoList> voList;

        public static GetAckInfoByIntervalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAckInfoByIntervalResponseBodyData self = new GetAckInfoByIntervalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAckInfoByIntervalResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetAckInfoByIntervalResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAckInfoByIntervalResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetAckInfoByIntervalResponseBodyData setVoList(java.util.List<GetAckInfoByIntervalResponseBodyDataVoList> voList) {
            this.voList = voList;
            return this;
        }
        public java.util.List<GetAckInfoByIntervalResponseBodyDataVoList> getVoList() {
            return this.voList;
        }

    }

}
