// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckChatappContactsShrinkRequest extends TeaModel {
    // 通道类型
    @NameInMap("ChannelType")
    public String channelType;

    // 需要查询的用户列表,单次调用最多查询10个。注意：用户号码必须加国家码
    @NameInMap("Contacts")
    public String contactsShrink;

    // ISV客户wabaId
    @NameInMap("CustWabaId")
    public String custWabaId;

    // 发送号码,所选择ChannelType下的Business账号，即在控制台上审核通过的Number
    @NameInMap("From")
    public String from;

    public static CheckChatappContactsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckChatappContactsShrinkRequest self = new CheckChatappContactsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckChatappContactsShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public CheckChatappContactsShrinkRequest setContactsShrink(String contactsShrink) {
        this.contactsShrink = contactsShrink;
        return this;
    }
    public String getContactsShrink() {
        return this.contactsShrink;
    }

    public CheckChatappContactsShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public CheckChatappContactsShrinkRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
