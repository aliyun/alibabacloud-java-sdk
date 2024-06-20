// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRamUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListRamUsersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>24753D71-C91D-1A38-A8AD-372BF12453F6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRamUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRamUsersResponseBody self = new ListRamUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRamUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRamUsersResponseBody setData(ListRamUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRamUsersResponseBodyData getData() {
        return this.data;
    }

    public ListRamUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRamUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRamUsersResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListRamUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRamUsersResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>15772400000****</p>
         */
        @NameInMap("AliyunUid")
        public Long aliyunUid;

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <strong>example:</strong>
         * <p>1382114****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <strong>example:</strong>
         * <p>28036411123456****</p>
         */
        @NameInMap("RamId")
        public String ramId;

        public static ListRamUsersResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListRamUsersResponseBodyDataList self = new ListRamUsersResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListRamUsersResponseBodyDataList setAliyunUid(Long aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        public ListRamUsersResponseBodyDataList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListRamUsersResponseBodyDataList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListRamUsersResponseBodyDataList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListRamUsersResponseBodyDataList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListRamUsersResponseBodyDataList setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public ListRamUsersResponseBodyDataList setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

    }

    public static class ListRamUsersResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListRamUsersResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRamUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRamUsersResponseBodyData self = new ListRamUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRamUsersResponseBodyData setList(java.util.List<ListRamUsersResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListRamUsersResponseBodyDataList> getList() {
            return this.list;
        }

        public ListRamUsersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRamUsersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRamUsersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
