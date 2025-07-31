// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListProjectMembersResponseBodyPageResult pageResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListProjectMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersResponseBody self = new ListProjectMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProjectMembersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListProjectMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectMembersResponseBody setPageResult(ListProjectMembersResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListProjectMembersResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListProjectMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectMembersResponseBodyPageResultProjectMemberList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1702692675000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1721720955000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>12356</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>101111</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LastModifierName")
        public String lastModifierName;

        @NameInMap("RoleIdList")
        public java.util.List<Integer> roleIdList;

        /**
         * <strong>example:</strong>
         * <p>101111</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListProjectMembersResponseBodyPageResultProjectMemberList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyPageResultProjectMemberList self = new ListProjectMembersResponseBodyPageResultProjectMemberList();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyPageResultProjectMemberList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectMembersResponseBodyPageResultProjectMemberList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectMembersResponseBodyPageResultProjectMemberList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListProjectMembersResponseBodyPageResultProjectMemberList setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public ListProjectMembersResponseBodyPageResultProjectMemberList setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public ListProjectMembersResponseBodyPageResultProjectMemberList setRoleIdList(java.util.List<Integer> roleIdList) {
            this.roleIdList = roleIdList;
            return this;
        }
        public java.util.List<Integer> getRoleIdList() {
            return this.roleIdList;
        }

        public ListProjectMembersResponseBodyPageResultProjectMemberList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListProjectMembersResponseBodyPageResultProjectMemberList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListProjectMembersResponseBodyPageResult extends TeaModel {
        @NameInMap("ProjectMemberList")
        public java.util.List<ListProjectMembersResponseBodyPageResultProjectMemberList> projectMemberList;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListProjectMembersResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyPageResult self = new ListProjectMembersResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyPageResult setProjectMemberList(java.util.List<ListProjectMembersResponseBodyPageResultProjectMemberList> projectMemberList) {
            this.projectMemberList = projectMemberList;
            return this;
        }
        public java.util.List<ListProjectMembersResponseBodyPageResultProjectMemberList> getProjectMemberList() {
            return this.projectMemberList;
        }

        public ListProjectMembersResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
