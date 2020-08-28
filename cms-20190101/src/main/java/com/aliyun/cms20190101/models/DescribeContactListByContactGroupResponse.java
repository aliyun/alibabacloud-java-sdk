// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListByContactGroupResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Contacts")
    @Validation(required = true)
    public DescribeContactListByContactGroupResponseContacts contacts;

    public static DescribeContactListByContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactListByContactGroupResponse self = new DescribeContactListByContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeContactListByContactGroupResponseContactsContactChannels extends TeaModel {
        @NameInMap("SMS")
        @Validation(required = true)
        public String SMS;

        @NameInMap("Mail")
        @Validation(required = true)
        public String mail;

        @NameInMap("AliIM")
        @Validation(required = true)
        public String aliIM;

        @NameInMap("DingWebHook")
        @Validation(required = true)
        public String dingWebHook;

        public static DescribeContactListByContactGroupResponseContactsContactChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListByContactGroupResponseContactsContactChannels self = new DescribeContactListByContactGroupResponseContactsContactChannels();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContactListByContactGroupResponseContactsContact extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("Channels")
        @Validation(required = true)
        public DescribeContactListByContactGroupResponseContactsContactChannels channels;

        public static DescribeContactListByContactGroupResponseContactsContact build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListByContactGroupResponseContactsContact self = new DescribeContactListByContactGroupResponseContactsContact();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContactListByContactGroupResponseContacts extends TeaModel {
        @NameInMap("Contact")
        @Validation(required = true)
        public java.util.List<DescribeContactListByContactGroupResponseContactsContact> contact;

        public static DescribeContactListByContactGroupResponseContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListByContactGroupResponseContacts self = new DescribeContactListByContactGroupResponseContacts();
            return TeaModel.build(map, self);
        }

    }

}
