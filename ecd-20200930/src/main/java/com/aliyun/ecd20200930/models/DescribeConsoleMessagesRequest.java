// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeConsoleMessagesRequest extends TeaModel {
    /**
     * <p>The business channel, which is used to limit the business to which the messages to query belong. Valid values: enterprise, standard, office, business, lincore_team, and AGENTIC_CLOUD_COMPUTER. The values are not case-sensitive. Default value: enterprise. Unrecognized channel values are also processed as enterprise.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The list of client types to which operational messages apply. A maximum of 100 items can be specified. Valid values: Windows (Windows client), Mac (macOS client), Web (web client), and Hardware (hardware terminal). For Mac, macOS is also supported. The matching is not case-sensitive. If multiple types are specified, a message is matched if it applies to any of the specified types. Do not pass duplicate types. To filter by client type, provide a non-empty list. If this parameter is not specified, messages are not filtered by client type. Do not specify this parameter when querying NOTIFICATION messages.</p>
     */
    @NameInMap("ClientTypes")
    public java.util.List<String> clientTypes;

    /**
     * <p>The search keyword, which is used to perform a fuzzy match on the message title or body. A message is returned if either the title or the body matches the keyword. If this parameter is not specified or an empty string is passed, messages are not filtered by keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>System maintenance</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The list of message IDs to query. A maximum of 100 message IDs can be specified. If multiple IDs are specified, a message is matched if its ID matches any of the specified IDs. If this parameter is not specified or an empty list is passed, messages are not filtered by message ID. If no message ID matches, an empty list is returned.</p>
     */
    @NameInMap("MessageIds")
    public java.util.List<String> messageIds;

    /**
     * <p>The message level filter condition for notification messages. Valid values: STRONG (strong message) and WEAK (weak message). The values are not case-sensitive. If this parameter is not specified or an unrecognized value is passed, messages are not filtered by message level. Do not specify this parameter when querying OPERATIONAL messages.</p>
     * 
     * <strong>example:</strong>
     * <p>STRONG</p>
     */
    @NameInMap("MessageLevel")
    public String messageLevel;

    /**
     * <p>The message type. Valid values: OPERATIONAL (client operational message), WALLPAPER (desktop wallpaper text message), NOTIFICATION (message center notification), and CUSTOM_WALLPAPER (custom desktop wallpaper). The values are not case-sensitive. If this parameter is not specified or an unrecognized value is passed, messages are not filtered by message type.</p>
     * 
     * <strong>example:</strong>
     * <p>NOTIFICATION</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The page number of the query result. Pages start from 1. Default value: 1. If the value is less than 1, it is processed as 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Valid values: 1 to 200. Default value: 200. If the value is less than 1 or greater than 200, it is processed as 200.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of target IDs to match. A maximum of 100 items can be specified. To filter by target, provide a non-empty list and specify TargetType at the same time. Currently, only the first ID is used for Organization, EndUser, and AdUser. Queries for EndUser and AdUser also match messages targeted at the organization to which the user belongs and all users. Queries for Organization include messages for all convenience users and are compatible with fuzzy matching of organization IDs. Other target matching methods match based on the target ID, and the target type of the returned records is not guaranteed to be consistent with TargetType. Currently, Tag does not perform target ID filtering.</p>
     */
    @NameInMap("TargetIds")
    public java.util.List<String> targetIds;

    /**
     * <p>The target matching method. Valid values: AllUsers (all convenience users), EndUser (specified convenience user), Organization (convenience user organization), Desktop (cloud computer), ResourceGroup (resource group), Region (region), Tag (tag), AdAllUsers (all AD users), AdUser (specified AD user), and AdOrg (AD organization). The values are not case-sensitive. If TargetIds is specified, this parameter must also be specified. The target type in the query results is not guaranteed to be consistent with this parameter. If only this parameter is specified without target IDs, no target filtering is applied. Currently, Tag does not perform target filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>EndUser</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static DescribeConsoleMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsoleMessagesRequest self = new DescribeConsoleMessagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConsoleMessagesRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public DescribeConsoleMessagesRequest setClientTypes(java.util.List<String> clientTypes) {
        this.clientTypes = clientTypes;
        return this;
    }
    public java.util.List<String> getClientTypes() {
        return this.clientTypes;
    }

    public DescribeConsoleMessagesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeConsoleMessagesRequest setMessageIds(java.util.List<String> messageIds) {
        this.messageIds = messageIds;
        return this;
    }
    public java.util.List<String> getMessageIds() {
        return this.messageIds;
    }

    public DescribeConsoleMessagesRequest setMessageLevel(String messageLevel) {
        this.messageLevel = messageLevel;
        return this;
    }
    public String getMessageLevel() {
        return this.messageLevel;
    }

    public DescribeConsoleMessagesRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public DescribeConsoleMessagesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeConsoleMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConsoleMessagesRequest setTargetIds(java.util.List<String> targetIds) {
        this.targetIds = targetIds;
        return this;
    }
    public java.util.List<String> getTargetIds() {
        return this.targetIds;
    }

    public DescribeConsoleMessagesRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
