// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListAuthorityResponseBody extends TeaModel {
    /**
     * <p>The permissions.</p>
     */
    @NameInMap("AuthorityList")
    public ListAuthorityResponseBodyAuthorityList authorityList;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorityResponseBody self = new ListAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorityResponseBody setAuthorityList(ListAuthorityResponseBodyAuthorityList authorityList) {
        this.authorityList = authorityList;
        return this;
    }
    public ListAuthorityResponseBodyAuthorityList getAuthorityList() {
        return this.authorityList;
    }

    public ListAuthorityResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
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

    public static class ListAuthorityResponseBodyAuthorityListAuthorityActionListAction extends TeaModel {
        /**
         * <p>The code of the permission.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description of the permission.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the permission group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the permission.</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListAuthorityResponseBodyAuthorityListAuthorityActionListAction build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorityResponseBodyAuthorityListAuthorityActionListAction self = new ListAuthorityResponseBodyAuthorityListAuthorityActionListAction();
            return TeaModel.build(map, self);
        }

        public ListAuthorityResponseBodyAuthorityListAuthorityActionListAction setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
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
        /**
         * <p>The set of permissions.</p>
         */
        @NameInMap("ActionList")
        public ListAuthorityResponseBodyAuthorityListAuthorityActionList actionList;

        /**
         * <p>The description of the permission group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the permission group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the permission group.</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListAuthorityResponseBodyAuthorityListAuthority build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorityResponseBodyAuthorityListAuthority self = new ListAuthorityResponseBodyAuthorityListAuthority();
            return TeaModel.build(map, self);
        }

        public ListAuthorityResponseBodyAuthorityListAuthority setActionList(ListAuthorityResponseBodyAuthorityListAuthorityActionList actionList) {
            this.actionList = actionList;
            return this;
        }
        public ListAuthorityResponseBodyAuthorityListAuthorityActionList getActionList() {
            return this.actionList;
        }

        public ListAuthorityResponseBodyAuthorityListAuthority setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAuthorityResponseBodyAuthorityListAuthority setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
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
