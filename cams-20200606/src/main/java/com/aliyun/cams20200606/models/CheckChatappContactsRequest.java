// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckChatappContactsRequest extends TeaModel {
    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("Contacts")
    public java.util.List<String> contacts;

    @NameInMap("CustWabaId")
    public String custWabaId;

    @NameInMap("From")
    public String from;

    public static CheckChatappContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckChatappContactsRequest self = new CheckChatappContactsRequest();
        return TeaModel.build(map, self);
    }

    public CheckChatappContactsRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public CheckChatappContactsRequest setContacts(java.util.List<String> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<String> getContacts() {
        return this.contacts;
    }

    public CheckChatappContactsRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public CheckChatappContactsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
