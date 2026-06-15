// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ListBlockSendingResponseBody extends TeaModel {
    /**
     * <p>A list of data about unsubscribes or spam reports.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListBlockSendingResponseBodyData> data;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. An empty string indicates that no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxyyyy</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBlockSendingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBlockSendingResponseBody self = new ListBlockSendingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBlockSendingResponseBody setData(java.util.List<ListBlockSendingResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBlockSendingResponseBodyData> getData() {
        return this.data;
    }

    public ListBlockSendingResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBlockSendingResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBlockSendingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBlockSendingResponseBodyData extends TeaModel {
        /**
         * <p>The recipient email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxxx@rcpt.com">xxxx@rcpt.com</a></p>
         */
        @NameInMap("BlockEmail")
        public String blockEmail;

        /**
         * <p>The time the block was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>1723259364</p>
         */
        @NameInMap("BlockTime")
        public Integer blockTime;

        /**
         * <p>The reason for the block. The value is a bitset. The meaning of each bit is as follows:</p>
         * <ul>
         * <li><p>0: The reason is not specified.</p>
         * </li>
         * <li><p>1: The recipient is not interested in the content.</p>
         * </li>
         * <li><p>2: The content is repetitive.</p>
         * </li>
         * <li><p>3: The content is sent too frequently.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Reason")
        public Integer reason;

        /**
         * <p>The time the email was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>1723249364</p>
         */
        @NameInMap("SendTime")
        public Integer sendTime;

        /**
         * <p>The sender email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxxx@sender.com">xxxx@sender.com</a></p>
         */
        @NameInMap("SenderEmail")
        public String senderEmail;

        public static ListBlockSendingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBlockSendingResponseBodyData self = new ListBlockSendingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBlockSendingResponseBodyData setBlockEmail(String blockEmail) {
            this.blockEmail = blockEmail;
            return this;
        }
        public String getBlockEmail() {
            return this.blockEmail;
        }

        public ListBlockSendingResponseBodyData setBlockTime(Integer blockTime) {
            this.blockTime = blockTime;
            return this;
        }
        public Integer getBlockTime() {
            return this.blockTime;
        }

        public ListBlockSendingResponseBodyData setReason(Integer reason) {
            this.reason = reason;
            return this;
        }
        public Integer getReason() {
            return this.reason;
        }

        public ListBlockSendingResponseBodyData setSendTime(Integer sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public Integer getSendTime() {
            return this.sendTime;
        }

        public ListBlockSendingResponseBodyData setSenderEmail(String senderEmail) {
            this.senderEmail = senderEmail;
            return this;
        }
        public String getSenderEmail() {
            return this.senderEmail;
        }

    }

}
