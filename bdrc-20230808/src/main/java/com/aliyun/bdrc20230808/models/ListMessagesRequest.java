// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListMessagesRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The message level.</p>
     * 
     * <strong>example:</strong>
     * <p>WARNING</p>
     */
    @NameInMap("MessageLevel")
    public String messageLevel;

    /**
     * <p>Filters messages with a time earlier than the specified value.</p>
     * 
     * <strong>example:</strong>
     * <p>1740019610</p>
     */
    @NameInMap("MessageTimeEarlierThan")
    public Long messageTimeEarlierThan;

    /**
     * <p>Filters messages with a time later than the specified value.</p>
     * 
     * <strong>example:</strong>
     * <p>1740019609</p>
     */
    @NameInMap("MessageTimeLaterThan")
    public Long messageTimeLaterThan;

    /**
     * <p>The message type.</p>
     * 
     * <strong>example:</strong>
     * <p>SUB_PROTECTION_POLICY_MODIFIED</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The pagination token. If there is a next page, this field has a return value. This parameter indicates that there is a next page as long as data is returned. You can use the returned NextToken as a request parameter to obtain the next page of data until Null is returned, which indicates that all data has been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>cae***********99</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessagesRequest self = new ListMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListMessagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMessagesRequest setMessageLevel(String messageLevel) {
        this.messageLevel = messageLevel;
        return this;
    }
    public String getMessageLevel() {
        return this.messageLevel;
    }

    public ListMessagesRequest setMessageTimeEarlierThan(Long messageTimeEarlierThan) {
        this.messageTimeEarlierThan = messageTimeEarlierThan;
        return this;
    }
    public Long getMessageTimeEarlierThan() {
        return this.messageTimeEarlierThan;
    }

    public ListMessagesRequest setMessageTimeLaterThan(Long messageTimeLaterThan) {
        this.messageTimeLaterThan = messageTimeLaterThan;
        return this;
    }
    public Long getMessageTimeLaterThan() {
        return this.messageTimeLaterThan;
    }

    public ListMessagesRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public ListMessagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
