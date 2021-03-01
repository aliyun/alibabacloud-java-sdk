// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListAuthorityResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("AuthorityList")
    public ListAuthorityResponseBodyAuthorityList authorityList;

    public static ListAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorityResponseBody self = new ListAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorityResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAuthorityResponseBody setAuthorityList(ListAuthorityResponseBodyAuthorityList authorityList) {
        this.authorityList = authorityList;
        return this;
    }
    public ListAuthorityResponseBodyAuthorityList getAuthorityList() {
        return this.authorityList;
    }

    public static class ListAuthorityResponseBodyAuthorityListAuthorityActionListAction extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static ListAuthorityResponseBodyAuthorityListAuthorityActionListAction build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorityResponseBodyAuthorityListAuthorityActionListAction self = new ListAuthorityResponseBodyAuthorityListAuthorityActionListAction();
            return TeaModel.build(map, self);
        }

        public ListAuthorityResponseBodyAuthorityListAuthorityActionListAction setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAuthorityResponseBodyAuthorityListAuthorityActionListAction setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListAuthorityResponseBodyAuthorityListAuthorityActionListAction setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAuthorityResponseBodyAuthorityListAuthorityActionListAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAuthorityResponseBodyAuthorityListAuthorityActionList extends TeaModel {
        @NameInMap("Action")
        public java.util.List<ListAuthorityResponseBodyAuthorityListAuthorityActionListAction> action;

        public static ListAuthorityResponseBodyAuthorityListAuthorityActionList build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorityResponseBodyAuthorityListAuthorityActionList self = new ListAuthorityResponseBodyAuthorityListAuthorityActionList();
            return TeaModel.build(map, self);
        }

        public ListAuthorityResponseBodyAuthorityListAuthorityActionList setAction(java.util.List<ListAuthorityResponseBodyAuthorityListAuthorityActionListAction> action) {
            this.action = action;
            return this;
        }
        public java.util.List<ListAuthorityResponseBodyAuthorityListAuthorityActionListAction> getAction() {
            return this.action;
        }

    }

    public static class ListAuthorityResponseBodyAuthorityListAuthority extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ActionList")
        public ListAuthorityResponseBodyAuthorityListAuthorityActionList actionList;

        @NameInMap("Name")
        public String name;

        public static ListAuthorityResponseBodyAuthorityListAuthority build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorityResponseBodyAuthorityListAuthority self = new ListAuthorityResponseBodyAuthorityListAuthority();
            return TeaModel.build(map, self);
        }

        public ListAuthorityResponseBodyAuthorityListAuthority setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListAuthorityResponseBodyAuthorityListAuthority setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAuthorityResponseBodyAuthorityListAuthority setActionList(ListAuthorityResponseBodyAuthorityListAuthorityActionList actionList) {
            this.actionList = actionList;
            return this;
        }
        public ListAuthorityResponseBodyAuthorityListAuthorityActionList getActionList() {
            return this.actionList;
        }

        public ListAuthorityResponseBodyAuthorityListAuthority setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAuthorityResponseBodyAuthorityList extends TeaModel {
        @NameInMap("Authority")
        public java.util.List<ListAuthorityResponseBodyAuthorityListAuthority> authority;

        public static ListAuthorityResponseBodyAuthorityList build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorityResponseBodyAuthorityList self = new ListAuthorityResponseBodyAuthorityList();
            return TeaModel.build(map, self);
        }

        public ListAuthorityResponseBodyAuthorityList setAuthority(java.util.List<ListAuthorityResponseBodyAuthorityListAuthority> authority) {
            this.authority = authority;
            return this;
        }
        public java.util.List<ListAuthorityResponseBodyAuthorityListAuthority> getAuthority() {
            return this.authority;
        }

    }

}
