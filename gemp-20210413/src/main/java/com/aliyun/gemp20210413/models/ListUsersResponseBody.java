// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<ListUsersResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>c26f36de-1ec8-496a-a828-880676c5ef81</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setData(java.util.List<ListUsersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUsersResponseBodyData> getData() {
        return this.data;
    }

    public ListUsersResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUsersResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SUB</p>
         */
        @NameInMap("accountType")
        public Long accountType;

        /**
         * <strong>example:</strong>
         * <p>23456tre</p>
         */
        @NameInMap("appAccount")
        public String appAccount;

        /**
         * <strong>example:</strong>
         * <p>2345****@qq.com</p>
         */
        @NameInMap("email")
        public String email;

        @NameInMap("gmtActive")
        public String gmtActive;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("isActive")
        public Long isActive;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isEditableUser")
        public Long isEditableUser;

        @NameInMap("isOperation")
        public Integer isOperation;

        @NameInMap("isRam")
        public Integer isRam;

        /**
         * <strong>example:</strong>
         * <p>RELATED关联  NOT_RELATED 未关联</p>
         */
        @NameInMap("isRelated")
        public String isRelated;

        /**
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>53624523</p>
         */
        @NameInMap("ramId")
        public Long ramId;

        @NameInMap("roleIdList")
        public java.util.List<Long> roleIdList;

        @NameInMap("roleNameList")
        public java.util.List<String> roleNameList;

        /**
         * <strong>example:</strong>
         * <p>DINGDING</p>
         */
        @NameInMap("synergyChannel")
        public String synergyChannel;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("userId")
        public Long userId;

        @NameInMap("username")
        public String username;

        public static ListUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyData self = new ListUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyData setAccountType(Long accountType) {
            this.accountType = accountType;
            return this;
        }
        public Long getAccountType() {
            return this.accountType;
        }

        public ListUsersResponseBodyData setAppAccount(String appAccount) {
            this.appAccount = appAccount;
            return this;
        }
        public String getAppAccount() {
            return this.appAccount;
        }

        public ListUsersResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyData setGmtActive(String gmtActive) {
            this.gmtActive = gmtActive;
            return this;
        }
        public String getGmtActive() {
            return this.gmtActive;
        }

        public ListUsersResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUsersResponseBodyData setIsActive(Long isActive) {
            this.isActive = isActive;
            return this;
        }
        public Long getIsActive() {
            return this.isActive;
        }

        public ListUsersResponseBodyData setIsEditableUser(Long isEditableUser) {
            this.isEditableUser = isEditableUser;
            return this;
        }
        public Long getIsEditableUser() {
            return this.isEditableUser;
        }

        public ListUsersResponseBodyData setIsOperation(Integer isOperation) {
            this.isOperation = isOperation;
            return this;
        }
        public Integer getIsOperation() {
            return this.isOperation;
        }

        public ListUsersResponseBodyData setIsRam(Integer isRam) {
            this.isRam = isRam;
            return this;
        }
        public Integer getIsRam() {
            return this.isRam;
        }

        public ListUsersResponseBodyData setIsRelated(String isRelated) {
            this.isRelated = isRelated;
            return this;
        }
        public String getIsRelated() {
            return this.isRelated;
        }

        public ListUsersResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListUsersResponseBodyData setRamId(Long ramId) {
            this.ramId = ramId;
            return this;
        }
        public Long getRamId() {
            return this.ramId;
        }

        public ListUsersResponseBodyData setRoleIdList(java.util.List<Long> roleIdList) {
            this.roleIdList = roleIdList;
            return this;
        }
        public java.util.List<Long> getRoleIdList() {
            return this.roleIdList;
        }

        public ListUsersResponseBodyData setRoleNameList(java.util.List<String> roleNameList) {
            this.roleNameList = roleNameList;
            return this;
        }
        public java.util.List<String> getRoleNameList() {
            return this.roleNameList;
        }

        public ListUsersResponseBodyData setSynergyChannel(String synergyChannel) {
            this.synergyChannel = synergyChannel;
            return this;
        }
        public String getSynergyChannel() {
            return this.synergyChannel;
        }

        public ListUsersResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
