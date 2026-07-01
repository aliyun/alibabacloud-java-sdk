// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendStatisticsResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><p>OK: The request was successful.</p>
     * </li>
     * <li><p>For other values, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</p>
     * </li>
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
     * <p>The description of the status code.</p>
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
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
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
         * <p>The number of messages with no delivery receipts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NoRespondedCount")
        public Long noRespondedCount;

        /**
         * <p>The number of messages with failed delivery receipts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RespondedFailCount")
        public Long respondedFailCount;

        /**
         * <p>The number of messages with successful delivery receipts.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("RespondedSuccessCount")
        public Long respondedSuccessCount;

        /**
         * <p>The date the messages were sent. Format: yyyyMMdd.</p>
         * 
         * <strong>example:</strong>
         * <p>20201010</p>
         */
        @NameInMap("SendDate")
        public String sendDate;

        /**
         * <p>The number of successfully sent messages (billable message count).</p>
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
         * <p>A list of delivery statistics.</p>
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
