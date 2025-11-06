// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetStatisticsByVhostResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetStatisticsByVhostResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetStatisticsByVhostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStatisticsByVhostResponseBody self = new GetStatisticsByVhostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStatisticsByVhostResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetStatisticsByVhostResponseBody setData(GetStatisticsByVhostResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStatisticsByVhostResponseBodyData getData() {
        return this.data;
    }

    public GetStatisticsByVhostResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStatisticsByVhostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStatisticsByVhostResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics extends TeaModel {
        @NameInMap("AckQps")
        public Float ackQps;

        @NameInMap("ConfirmQps")
        public Float confirmQps;

        @NameInMap("DeliverQps")
        public Float deliverQps;

        @NameInMap("GetQps")
        public Float getQps;

        @NameInMap("Prefetch")
        public Integer prefetch;

        @NameInMap("PublishQps")
        public Float publishQps;

        @NameInMap("State")
        public Integer state;

        @NameInMap("Unacked")
        public Integer unacked;

        @NameInMap("Unconfirmed")
        public Integer unconfirmed;

        public static GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics self = new GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics();
            return TeaModel.build(map, self);
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics setAckQps(Float ackQps) {
            this.ackQps = ackQps;
            return this;
        }
        public Float getAckQps() {
            return this.ackQps;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics setConfirmQps(Float confirmQps) {
            this.confirmQps = confirmQps;
            return this;
        }
        public Float getConfirmQps() {
            return this.confirmQps;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics setDeliverQps(Float deliverQps) {
            this.deliverQps = deliverQps;
            return this;
        }
        public Float getDeliverQps() {
            return this.deliverQps;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics setGetQps(Float getQps) {
            this.getQps = getQps;
            return this;
        }
        public Float getGetQps() {
            return this.getQps;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics setPrefetch(Integer prefetch) {
            this.prefetch = prefetch;
            return this;
        }
        public Integer getPrefetch() {
            return this.prefetch;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics setPublishQps(Float publishQps) {
            this.publishQps = publishQps;
            return this;
        }
        public Float getPublishQps() {
            return this.publishQps;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics setUnacked(Integer unacked) {
            this.unacked = unacked;
            return this;
        }
        public Integer getUnacked() {
            return this.unacked;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics setUnconfirmed(Integer unconfirmed) {
            this.unconfirmed = unconfirmed;
            return this;
        }
        public Integer getUnconfirmed() {
            return this.unconfirmed;
        }

    }

    public static class GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsList extends TeaModel {
        @NameInMap("ChannelStatistics")
        public java.util.List<GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics> channelStatistics;

        public static GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsList build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsList self = new GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsList();
            return TeaModel.build(map, self);
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsList setChannelStatistics(java.util.List<GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics> channelStatistics) {
            this.channelStatistics = channelStatistics;
            return this;
        }
        public java.util.List<GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsListChannelStatistics> getChannelStatistics() {
            return this.channelStatistics;
        }

    }

    public static class GetStatisticsByVhostResponseBodyDataConnectionStatistics extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("ChannelNum")
        public Integer channelNum;

        @NameInMap("ChannelStatisticsList")
        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsList channelStatisticsList;

        @NameInMap("ConnectionName")
        public String connectionName;

        @NameInMap("DeliverQps")
        public Float deliverQps;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("PublishQps")
        public Float publishQps;

        @NameInMap("RemoteAddress")
        public String remoteAddress;

        @NameInMap("SecurityTransport")
        public Boolean securityTransport;

        @NameInMap("State")
        public Integer state;

        public static GetStatisticsByVhostResponseBodyDataConnectionStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsByVhostResponseBodyDataConnectionStatistics self = new GetStatisticsByVhostResponseBodyDataConnectionStatistics();
            return TeaModel.build(map, self);
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatistics setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatistics setChannelNum(Integer channelNum) {
            this.channelNum = channelNum;
            return this;
        }
        public Integer getChannelNum() {
            return this.channelNum;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatistics setChannelStatisticsList(GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsList channelStatisticsList) {
            this.channelStatisticsList = channelStatisticsList;
            return this;
        }
        public GetStatisticsByVhostResponseBodyDataConnectionStatisticsChannelStatisticsList getChannelStatisticsList() {
            return this.channelStatisticsList;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatistics setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatistics setDeliverQps(Float deliverQps) {
            this.deliverQps = deliverQps;
            return this;
        }
        public Float getDeliverQps() {
            return this.deliverQps;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatistics setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatistics setPublishQps(Float publishQps) {
            this.publishQps = publishQps;
            return this;
        }
        public Float getPublishQps() {
            return this.publishQps;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatistics setRemoteAddress(String remoteAddress) {
            this.remoteAddress = remoteAddress;
            return this;
        }
        public String getRemoteAddress() {
            return this.remoteAddress;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatistics setSecurityTransport(Boolean securityTransport) {
            this.securityTransport = securityTransport;
            return this;
        }
        public Boolean getSecurityTransport() {
            return this.securityTransport;
        }

        public GetStatisticsByVhostResponseBodyDataConnectionStatistics setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

    }

    public static class GetStatisticsByVhostResponseBodyData extends TeaModel {
        @NameInMap("ConnectionStatistics")
        public java.util.List<GetStatisticsByVhostResponseBodyDataConnectionStatistics> connectionStatistics;

        public static GetStatisticsByVhostResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsByVhostResponseBodyData self = new GetStatisticsByVhostResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStatisticsByVhostResponseBodyData setConnectionStatistics(java.util.List<GetStatisticsByVhostResponseBodyDataConnectionStatistics> connectionStatistics) {
            this.connectionStatistics = connectionStatistics;
            return this;
        }
        public java.util.List<GetStatisticsByVhostResponseBodyDataConnectionStatistics> getConnectionStatistics() {
            return this.connectionStatistics;
        }

    }

}
