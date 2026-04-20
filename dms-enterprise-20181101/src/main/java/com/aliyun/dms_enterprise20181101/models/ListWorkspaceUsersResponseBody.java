// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkspaceUsersResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListWorkspaceUsersResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>NesLoKLEdIZrKhDT7I2gS****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListWorkspaceUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceUsersResponseBody self = new ListWorkspaceUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceUsersResponseBody setData(java.util.List<ListWorkspaceUsersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWorkspaceUsersResponseBodyData> getData() {
        return this.data;
    }

    public ListWorkspaceUsersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspaceUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspaceUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspaceUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWorkspaceUsersResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkspaceUsersResponseBodyData extends TeaModel {
        /**
         * <p>dms user id</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DmsUserId")
        public Long dmsUserId;

        /**
         * <strong>example:</strong>
         * <p>li</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        /**
         * <strong>example:</strong>
         * <p>dynamic_320514_20250429102514</p>
         */
        @NameInMap("NickName")
        public String nickName;

        public static ListWorkspaceUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceUsersResponseBodyData self = new ListWorkspaceUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceUsersResponseBodyData setDmsUserId(Long dmsUserId) {
            this.dmsUserId = dmsUserId;
            return this;
        }
        public Long getDmsUserId() {
            return this.dmsUserId;
        }

        public ListWorkspaceUsersResponseBodyData setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListWorkspaceUsersResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

}
