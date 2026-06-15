// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ListBlockSendingRequest extends TeaModel {
    /**
     * <p>The start of the time range to query blocked emails.</p>
     * 
     * <strong>example:</strong>
     * <p>1763973206</p>
     */
    @NameInMap("BeginTime")
    public Integer beginTime;

    /**
     * <p>The recipient email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxxx@rcpt.com">xxxx@rcpt.com</a></p>
     */
    @NameInMap("BlockEmail")
    public String blockEmail;

    /**
     * <p>The type of block.</p>
     * <ul>
     * <li><p>UNSUB: Unsubscribe</p>
     * </li>
     * <li><p>REPORT: Spam report</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSUB</p>
     */
    @NameInMap("BlockType")
    public String blockType;

    /**
     * <p>The end of the time range to query blocked emails.</p>
     * 
     * <strong>example:</strong>
     * <p>1764146006</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The maximum number of entries to return.<br>
     * Valid values: 1 to 500.<br></p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the query. If you do not specify this parameter, the query starts from the beginning of the results.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxyyyyyy</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sender email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxxx@sender.com">xxxx@sender.com</a></p>
     */
    @NameInMap("SenderEmail")
    public String senderEmail;

    public static ListBlockSendingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlockSendingRequest self = new ListBlockSendingRequest();
        return TeaModel.build(map, self);
    }

    public ListBlockSendingRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public ListBlockSendingRequest setBlockEmail(String blockEmail) {
        this.blockEmail = blockEmail;
        return this;
    }
    public String getBlockEmail() {
        return this.blockEmail;
    }

    public ListBlockSendingRequest setBlockType(String blockType) {
        this.blockType = blockType;
        return this;
    }
    public String getBlockType() {
        return this.blockType;
    }

    public ListBlockSendingRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ListBlockSendingRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBlockSendingRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBlockSendingRequest setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
        return this;
    }
    public String getSenderEmail() {
        return this.senderEmail;
    }

}
