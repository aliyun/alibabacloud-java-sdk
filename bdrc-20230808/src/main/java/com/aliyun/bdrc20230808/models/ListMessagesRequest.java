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
     * <p>Message level.</p>
     * 
     * <strong>example:</strong>
     * <p>WARNING</p>
     */
    @NameInMap("MessageLevel")
    public String messageLevel;

    /**
     * <p>Messages with time earlier than this value.</p>
     * 
     * <strong>example:</strong>
     * <p>1740019610</p>
     */
    @NameInMap("MessageTimeEarlierThan")
    public Long messageTimeEarlierThan;

    /**
     * <p>Messages with time later than this value.</p>
     * 
     * <strong>example:</strong>
     * <p>1740019609</p>
     */
    @NameInMap("MessageTimeLaterThan")
    public Long messageTimeLaterThan;

    /**
     * <p>Message type.</p>
     * 
     * <strong>example:</strong>
     * <p>SUB_PROTECTION_POLICY_MODIFIED</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The pagination token. If more entries are to be returned on the next page, a pagination token is returned.</p>
     * <blockquote>
     * <p>If this parameter returns data, it indicates that there are more pages. You can use the returned NextToken as a request parameter to obtain the next page of data until it returns Null, indicating that all data has been obtained.</p>
     * </blockquote>
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
