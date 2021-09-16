// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConsumerGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Success")
    public String success;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ConsumerChannels")
    public DescribeConsumerGroupResponseBodyConsumerChannels consumerChannels;

    public static DescribeConsumerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumerGroupResponseBody self = new DescribeConsumerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsumerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsumerGroupResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeConsumerGroupResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeConsumerGroupResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeConsumerGroupResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeConsumerGroupResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeConsumerGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConsumerGroupResponseBody setConsumerChannels(DescribeConsumerGroupResponseBodyConsumerChannels consumerChannels) {
        this.consumerChannels = consumerChannels;
        return this;
    }
    public DescribeConsumerGroupResponseBodyConsumerChannels getConsumerChannels() {
        return this.consumerChannels;
    }

    public static class DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel extends TeaModel {
        @NameInMap("ConsumerGroupUserName")
        public String consumerGroupUserName;

        @NameInMap("ConsumerGroupID")
        public String consumerGroupID;

        @NameInMap("MessageDelay")
        public Long messageDelay;

        @NameInMap("ConsumerGroupName")
        public String consumerGroupName;

        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        @NameInMap("UnconsumedData")
        public Long unconsumedData;

        public static DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel self = new DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel();
            return TeaModel.build(map, self);
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setConsumerGroupUserName(String consumerGroupUserName) {
            this.consumerGroupUserName = consumerGroupUserName;
            return this;
        }
        public String getConsumerGroupUserName() {
            return this.consumerGroupUserName;
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setConsumerGroupID(String consumerGroupID) {
            this.consumerGroupID = consumerGroupID;
            return this;
        }
        public String getConsumerGroupID() {
            return this.consumerGroupID;
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setMessageDelay(Long messageDelay) {
            this.messageDelay = messageDelay;
            return this;
        }
        public Long getMessageDelay() {
            return this.messageDelay;
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setConsumerGroupName(String consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }
        public String getConsumerGroupName() {
            return this.consumerGroupName;
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setUnconsumedData(Long unconsumedData) {
            this.unconsumedData = unconsumedData;
            return this;
        }
        public Long getUnconsumedData() {
            return this.unconsumedData;
        }

    }

    public static class DescribeConsumerGroupResponseBodyConsumerChannels extends TeaModel {
        @NameInMap("DescribeConsumerChannel")
        public java.util.List<DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel> describeConsumerChannel;

        public static DescribeConsumerGroupResponseBodyConsumerChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsumerGroupResponseBodyConsumerChannels self = new DescribeConsumerGroupResponseBodyConsumerChannels();
            return TeaModel.build(map, self);
        }

        public DescribeConsumerGroupResponseBodyConsumerChannels setDescribeConsumerChannel(java.util.List<DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel> describeConsumerChannel) {
            this.describeConsumerChannel = describeConsumerChannel;
            return this;
        }
        public java.util.List<DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel> getDescribeConsumerChannel() {
            return this.describeConsumerChannel;
        }

    }

}
