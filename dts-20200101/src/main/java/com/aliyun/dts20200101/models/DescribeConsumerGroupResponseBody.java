// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConsumerGroupResponseBody extends TeaModel {
    /**
     * <p>The list of consumer groups.</p>
     */
    @NameInMap("ConsumerChannels")
    public DescribeConsumerGroupResponseBodyConsumerChannels consumerChannels;

    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of consumer groups that can be displayed on one page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of consumer groups.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeConsumerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumerGroupResponseBody self = new DescribeConsumerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsumerGroupResponseBody setConsumerChannels(DescribeConsumerGroupResponseBodyConsumerChannels consumerChannels) {
        this.consumerChannels = consumerChannels;
        return this;
    }
    public DescribeConsumerGroupResponseBodyConsumerChannels getConsumerChannels() {
        return this.consumerChannels;
    }

    public DescribeConsumerGroupResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
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

    public DescribeConsumerGroupResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeConsumerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsumerGroupResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeConsumerGroupResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel extends TeaModel {
        /**
         * <p>The ID of the consumer group.</p>
         */
        @NameInMap("ConsumerGroupID")
        public String consumerGroupID;

        /**
         * <p>The name of the consumer group.</p>
         */
        @NameInMap("ConsumerGroupName")
        public String consumerGroupName;

        /**
         * <p>The username of the consumer group.</p>
         */
        @NameInMap("ConsumerGroupUserName")
        public String consumerGroupUserName;

        /**
         * <p>The consumption checkpoint, which is the time when the latest data record was consumed by the change tracking client. The format is *yyyy-MM-dd*T*HH:mm:ss*Z. The time is displayed in UTC.</p>
         */
        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        /**
         * <p>The message delay, which is the current time minus the timestamp of the earliest unconsumed message in the change tracking instance. Unit: seconds.</p>
         * <br>
         * <p>>  If the return value of this parameter is **-1**, no client is connected to the consumer group.</p>
         */
        @NameInMap("MessageDelay")
        public Long messageDelay;

        /**
         * <p>The total number of unconsumed messages, which is the number of unconsumed data records plus the number of heartbeat messages.</p>
         * <br>
         * <p>>  If the return value of this parameter is **-1**, no client is connected to the consumer group.</p>
         */
        @NameInMap("UnconsumedData")
        public Long unconsumedData;

        public static DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel self = new DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel();
            return TeaModel.build(map, self);
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setConsumerGroupID(String consumerGroupID) {
            this.consumerGroupID = consumerGroupID;
            return this;
        }
        public String getConsumerGroupID() {
            return this.consumerGroupID;
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setConsumerGroupName(String consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }
        public String getConsumerGroupName() {
            return this.consumerGroupName;
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setConsumerGroupUserName(String consumerGroupUserName) {
            this.consumerGroupUserName = consumerGroupUserName;
            return this;
        }
        public String getConsumerGroupUserName() {
            return this.consumerGroupUserName;
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeConsumerGroupResponseBodyConsumerChannelsDescribeConsumerChannel setMessageDelay(Long messageDelay) {
            this.messageDelay = messageDelay;
            return this;
        }
        public Long getMessageDelay() {
            return this.messageDelay;
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
