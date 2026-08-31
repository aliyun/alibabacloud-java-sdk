// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAssetTopicsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The paginated result of asset topics.</p>
     */
    @NameInMap("Data")
    public ListAssetTopicsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAssetTopicsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssetTopicsResponseBody self = new ListAssetTopicsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssetTopicsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAssetTopicsResponseBody setData(ListAssetTopicsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAssetTopicsResponseBodyData getData() {
        return this.data;
    }

    public ListAssetTopicsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAssetTopicsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAssetTopicsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAssetTopicsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAssetTopicsResponseBodyDataTopicListOwners extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListAssetTopicsResponseBodyDataTopicListOwners build(java.util.Map<String, ?> map) throws Exception {
            ListAssetTopicsResponseBodyDataTopicListOwners self = new ListAssetTopicsResponseBodyDataTopicListOwners();
            return TeaModel.build(map, self);
        }

        public ListAssetTopicsResponseBodyDataTopicListOwners setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAssetTopicsResponseBodyDataTopicListOwners setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListAssetTopicsResponseBodyDataTopicListVisibleUserGroups extends TeaModel {
        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The user group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Governance Group</p>
         */
        @NameInMap("UserGroupName")
        public String userGroupName;

        public static ListAssetTopicsResponseBodyDataTopicListVisibleUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListAssetTopicsResponseBodyDataTopicListVisibleUserGroups self = new ListAssetTopicsResponseBodyDataTopicListVisibleUserGroups();
            return TeaModel.build(map, self);
        }

        public ListAssetTopicsResponseBodyDataTopicListVisibleUserGroups setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public ListAssetTopicsResponseBodyDataTopicListVisibleUserGroups setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

    public static class ListAssetTopicsResponseBodyDataTopicListVisibleUsers extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30001012</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListAssetTopicsResponseBodyDataTopicListVisibleUsers build(java.util.Map<String, ?> map) throws Exception {
            ListAssetTopicsResponseBodyDataTopicListVisibleUsers self = new ListAssetTopicsResponseBodyDataTopicListVisibleUsers();
            return TeaModel.build(map, self);
        }

        public ListAssetTopicsResponseBodyDataTopicListVisibleUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAssetTopicsResponseBodyDataTopicListVisibleUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListAssetTopicsResponseBodyDataTopicList extends TeaModel {
        /**
         * <p>The asset type.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The last modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The topic administrators.</p>
         */
        @NameInMap("Owners")
        public java.util.List<ListAssetTopicsResponseBodyDataTopicListOwners> owners;

        /**
         * <p>The topic description.</p>
         * 
         * <strong>example:</strong>
         * <p>Aggregates assets related to core metrics</p>
         */
        @NameInMap("TopicDescription")
        public String topicDescription;

        /**
         * <p>The topic ID.</p>
         * 
         * <strong>example:</strong>
         * <p>28440278777</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>Core Metrics Topic</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <p>The visibility scope. Valid values: PUBLIC, SPECIFIED.</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED</p>
         */
        @NameInMap("VisibilityType")
        public String visibilityType;

        /**
         * <p>The explicitly visible user groups. Returns null for PUBLIC topics.</p>
         */
        @NameInMap("VisibleUserGroups")
        public java.util.List<ListAssetTopicsResponseBodyDataTopicListVisibleUserGroups> visibleUserGroups;

        /**
         * <p>The explicitly visible users. Returns null for PUBLIC topics.</p>
         */
        @NameInMap("VisibleUsers")
        public java.util.List<ListAssetTopicsResponseBodyDataTopicListVisibleUsers> visibleUsers;

        public static ListAssetTopicsResponseBodyDataTopicList build(java.util.Map<String, ?> map) throws Exception {
            ListAssetTopicsResponseBodyDataTopicList self = new ListAssetTopicsResponseBodyDataTopicList();
            return TeaModel.build(map, self);
        }

        public ListAssetTopicsResponseBodyDataTopicList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public ListAssetTopicsResponseBodyDataTopicList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAssetTopicsResponseBodyDataTopicList setOwners(java.util.List<ListAssetTopicsResponseBodyDataTopicListOwners> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<ListAssetTopicsResponseBodyDataTopicListOwners> getOwners() {
            return this.owners;
        }

        public ListAssetTopicsResponseBodyDataTopicList setTopicDescription(String topicDescription) {
            this.topicDescription = topicDescription;
            return this;
        }
        public String getTopicDescription() {
            return this.topicDescription;
        }

        public ListAssetTopicsResponseBodyDataTopicList setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public ListAssetTopicsResponseBodyDataTopicList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListAssetTopicsResponseBodyDataTopicList setVisibilityType(String visibilityType) {
            this.visibilityType = visibilityType;
            return this;
        }
        public String getVisibilityType() {
            return this.visibilityType;
        }

        public ListAssetTopicsResponseBodyDataTopicList setVisibleUserGroups(java.util.List<ListAssetTopicsResponseBodyDataTopicListVisibleUserGroups> visibleUserGroups) {
            this.visibleUserGroups = visibleUserGroups;
            return this;
        }
        public java.util.List<ListAssetTopicsResponseBodyDataTopicListVisibleUserGroups> getVisibleUserGroups() {
            return this.visibleUserGroups;
        }

        public ListAssetTopicsResponseBodyDataTopicList setVisibleUsers(java.util.List<ListAssetTopicsResponseBodyDataTopicListVisibleUsers> visibleUsers) {
            this.visibleUsers = visibleUsers;
            return this;
        }
        public java.util.List<ListAssetTopicsResponseBodyDataTopicListVisibleUsers> getVisibleUsers() {
            return this.visibleUsers;
        }

    }

    public static class ListAssetTopicsResponseBodyData extends TeaModel {
        /**
         * <p>The list of topics.</p>
         */
        @NameInMap("TopicList")
        public java.util.List<ListAssetTopicsResponseBodyDataTopicList> topicList;

        /**
         * <p>The total number of records that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>-599403204152</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListAssetTopicsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAssetTopicsResponseBodyData self = new ListAssetTopicsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAssetTopicsResponseBodyData setTopicList(java.util.List<ListAssetTopicsResponseBodyDataTopicList> topicList) {
            this.topicList = topicList;
            return this;
        }
        public java.util.List<ListAssetTopicsResponseBodyDataTopicList> getTopicList() {
            return this.topicList;
        }

        public ListAssetTopicsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
