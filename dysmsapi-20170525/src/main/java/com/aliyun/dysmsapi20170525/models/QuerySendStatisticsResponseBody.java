// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendStatisticsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>Other values indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QuerySendStatisticsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>819BE656-D2E0-4858-8B21-B2E47708****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QuerySendStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySendStatisticsResponseBody self = new QuerySendStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySendStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySendStatisticsResponseBody setData(QuerySendStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySendStatisticsResponseBodyData getData() {
        return this.data;
    }

    public QuerySendStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySendStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySendStatisticsResponseBodyDataTargetList extends TeaModel {
        /**
         * <p>The number of messages without a delivery receipt.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NoRespondedCount")
        public Long noRespondedCount;

        /**
         * <p>The number of messages with a delivery receipt that indicates a failure.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RespondedFailCount")
        public Long respondedFailCount;

        /**
         * <p>The number of messages with a delivery receipt that indicates a success.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("RespondedSuccessCount")
        public Long respondedSuccessCount;

        /**
         * <p>The date when the message is sent. Format: yyyyMMdd. Example: 20181225.</p>
         * 
         * <strong>example:</strong>
         * <p>20201010</p>
         */
        @NameInMap("SendDate")
        public String sendDate;

        /**
         * <p>The number of delivered messages.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static QuerySendStatisticsResponseBodyDataTargetList build(java.util.Map<String, ?> map) throws Exception {
            QuerySendStatisticsResponseBodyDataTargetList self = new QuerySendStatisticsResponseBodyDataTargetList();
            return TeaModel.build(map, self);
        }

        public QuerySendStatisticsResponseBodyDataTargetList setNoRespondedCount(Long noRespondedCount) {
            this.noRespondedCount = noRespondedCount;
            return this;
        }
        public Long getNoRespondedCount() {
            return this.noRespondedCount;
        }

        public QuerySendStatisticsResponseBodyDataTargetList setRespondedFailCount(Long respondedFailCount) {
            this.respondedFailCount = respondedFailCount;
            return this;
        }
        public Long getRespondedFailCount() {
            return this.respondedFailCount;
        }

        public QuerySendStatisticsResponseBodyDataTargetList setRespondedSuccessCount(Long respondedSuccessCount) {
            this.respondedSuccessCount = respondedSuccessCount;
            return this;
        }
        public Long getRespondedSuccessCount() {
            return this.respondedSuccessCount;
        }

        public QuerySendStatisticsResponseBodyDataTargetList setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public QuerySendStatisticsResponseBodyDataTargetList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class QuerySendStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>The details of the data returned.</p>
         */
        @NameInMap("TargetList")
        public java.util.List<QuerySendStatisticsResponseBodyDataTargetList> targetList;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static QuerySendStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySendStatisticsResponseBodyData self = new QuerySendStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySendStatisticsResponseBodyData setTargetList(java.util.List<QuerySendStatisticsResponseBodyDataTargetList> targetList) {
            this.targetList = targetList;
            return this;
        }
        public java.util.List<QuerySendStatisticsResponseBodyDataTargetList> getTargetList() {
            return this.targetList;
        }

        public QuerySendStatisticsResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
