// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConsumerChannelResponseBody extends TeaModel {
    /**
     * <p>The details of the consumer groups.</p>
     */
    @NameInMap("ConsumerChannels")
    public java.util.List<DescribeConsumerChannelResponseBodyConsumerChannels> consumerChannels;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The number of the returned page.</p>
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
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of consumer groups.</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeConsumerChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumerChannelResponseBody self = new DescribeConsumerChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsumerChannelResponseBody setConsumerChannels(java.util.List<DescribeConsumerChannelResponseBodyConsumerChannels> consumerChannels) {
        this.consumerChannels = consumerChannels;
        return this;
    }
    public java.util.List<DescribeConsumerChannelResponseBodyConsumerChannels> getConsumerChannels() {
        return this.consumerChannels;
    }

    public DescribeConsumerChannelResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeConsumerChannelResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeConsumerChannelResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeConsumerChannelResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConsumerChannelResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeConsumerChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsumerChannelResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeConsumerChannelResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeConsumerChannelResponseBodyConsumerChannels extends TeaModel {
        /**
         * <p>The ID of the consumer group.</p>
         */
        @NameInMap("ConsumerGroupId")
        public String consumerGroupId;

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
         * <p>The consumption checkpoint, which is the time when the latest data record was consumed by the change tracking client. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
         */
        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        /**
         * <p>The message latency, which is the timestamp of the latest data consumed by the downstream client minus the timestamp of the latest data tracked by the change tracking task. The value is a UNIX timestamp. Unit: seconds.</p>
         * <br>
         * <p>For example, the latest data in the source database is generated at 10:00. The change tracking task reads the data generated at 09:55, and the downstream client consumes the data generated at 09:30. In this case, the message latency is the UNIX timestamp difference between 09:55 and 09:30.</p>
         * <br>
         * <p>>  If the return value of this parameter is **-1**, no client is connected to the consumer group.</p>
         */
        @NameInMap("MessageDelay")
        public Long messageDelay;

        /**
         * <p>The total number of unconsumed messages, which is the number of unconsumed data records plus the number of heartbeat messages.</p>
         * <br>
         * <p>>  If the return value of this parameter is -1, no client is connected to the consumer group.</p>
         */
        @NameInMap("UnconsumedData")
        public Long unconsumedData;

        public static DescribeConsumerChannelResponseBodyConsumerChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsumerChannelResponseBodyConsumerChannels self = new DescribeConsumerChannelResponseBodyConsumerChannels();
            return TeaModel.build(map, self);
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setConsumerGroupName(String consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }
        public String getConsumerGroupName() {
            return this.consumerGroupName;
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setConsumerGroupUserName(String consumerGroupUserName) {
            this.consumerGroupUserName = consumerGroupUserName;
            return this;
        }
        public String getConsumerGroupUserName() {
            return this.consumerGroupUserName;
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setMessageDelay(Long messageDelay) {
            this.messageDelay = messageDelay;
            return this;
        }
        public Long getMessageDelay() {
            return this.messageDelay;
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setUnconsumedData(Long unconsumedData) {
            this.unconsumedData = unconsumedData;
            return this;
        }
        public Long getUnconsumedData() {
            return this.unconsumedData;
        }

    }

}
