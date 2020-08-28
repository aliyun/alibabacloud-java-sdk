// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Contacts")
    @Validation(required = true)
    public DescribeContactListResponseContacts contacts;

    public static DescribeContactListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactListResponse self = new DescribeContactListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeContactListResponseContactsContactChannels extends TeaModel {
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

        public static DescribeContactListResponseContactsContactChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseContactsContactChannels self = new DescribeContactListResponseContactsContactChannels();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContactListResponseContactsContactChannelsState extends TeaModel {
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

        public static DescribeContactListResponseContactsContactChannelsState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseContactsContactChannelsState self = new DescribeContactListResponseContactsContactChannelsState();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContactListResponseContactsContactContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        @Validation(required = true)
        public java.util.List<String> contactGroup;

        public static DescribeContactListResponseContactsContactContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseContactsContactContactGroups self = new DescribeContactListResponseContactsContactContactGroups();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContactListResponseContactsContact extends TeaModel {
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
        public DescribeContactListResponseContactsContactChannels channels;

        @NameInMap("ChannelsState")
        @Validation(required = true)
        public DescribeContactListResponseContactsContactChannelsState channelsState;

        @NameInMap("ContactGroups")
        @Validation(required = true)
        public DescribeContactListResponseContactsContactContactGroups contactGroups;

        public static DescribeContactListResponseContactsContact build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseContactsContact self = new DescribeContactListResponseContactsContact();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContactListResponseContacts extends TeaModel {
        @NameInMap("Contact")
        @Validation(required = true)
        public java.util.List<DescribeContactListResponseContactsContact> contact;

        public static DescribeContactListResponseContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseContacts self = new DescribeContactListResponseContacts();
            return TeaModel.build(map, self);
        }

    }

}
