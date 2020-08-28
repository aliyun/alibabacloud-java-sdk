// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageBean")
    @Validation(required = true)
    public SearchAlertContactResponsePageBean pageBean;

    public static SearchAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactResponse self = new SearchAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchAlertContactResponsePageBeanContacts extends TeaModel {
        @NameInMap("ContactId")
        @Validation(required = true)
        public Long contactId;

        @NameInMap("ContactName")
        @Validation(required = true)
        public String contactName;

        @NameInMap("Phone")
        @Validation(required = true)
        public String phone;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("DingRobot")
        @Validation(required = true)
        public String dingRobot;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("SystemNoc")
        @Validation(required = true)
        public Boolean systemNoc;

        public static SearchAlertContactResponsePageBeanContacts build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertContactResponsePageBeanContacts self = new SearchAlertContactResponsePageBeanContacts();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchAlertContactResponsePageBean extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Contacts")
        @Validation(required = true)
        public java.util.List<SearchAlertContactResponsePageBeanContacts> contacts;

        public static SearchAlertContactResponsePageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertContactResponsePageBean self = new SearchAlertContactResponsePageBean();
            return TeaModel.build(map, self);
        }

    }

}
