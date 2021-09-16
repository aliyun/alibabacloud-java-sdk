// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConsumerChannelResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ConsumerChannels")
    public java.util.List<DescribeConsumerChannelResponseBodyConsumerChannels> consumerChannels;

    public static DescribeConsumerChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumerChannelResponseBody self = new DescribeConsumerChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsumerChannelResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeConsumerChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsumerChannelResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeConsumerChannelResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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

    public DescribeConsumerChannelResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeConsumerChannelResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConsumerChannelResponseBody setConsumerChannels(java.util.List<DescribeConsumerChannelResponseBodyConsumerChannels> consumerChannels) {
        this.consumerChannels = consumerChannels;
        return this;
    }
    public java.util.List<DescribeConsumerChannelResponseBodyConsumerChannels> getConsumerChannels() {
        return this.consumerChannels;
    }

    public static class DescribeConsumerChannelResponseBodyConsumerChannels extends TeaModel {
        @NameInMap("ConsumerGroupUserName")
        public String consumerGroupUserName;

        @NameInMap("ConsumerGroupId")
        public String consumerGroupId;

        @NameInMap("MessageDelay")
        public Long messageDelay;

        @NameInMap("ConsumerGroupName")
        public String consumerGroupName;

        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        @NameInMap("UnconsumedData")
        public Long unconsumedData;

        public static DescribeConsumerChannelResponseBodyConsumerChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsumerChannelResponseBodyConsumerChannels self = new DescribeConsumerChannelResponseBodyConsumerChannels();
            return TeaModel.build(map, self);
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setConsumerGroupUserName(String consumerGroupUserName) {
            this.consumerGroupUserName = consumerGroupUserName;
            return this;
        }
        public String getConsumerGroupUserName() {
            return this.consumerGroupUserName;
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setMessageDelay(Long messageDelay) {
            this.messageDelay = messageDelay;
            return this;
        }
        public Long getMessageDelay() {
            return this.messageDelay;
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setConsumerGroupName(String consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }
        public String getConsumerGroupName() {
            return this.consumerGroupName;
        }

        public DescribeConsumerChannelResponseBodyConsumerChannels setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
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
