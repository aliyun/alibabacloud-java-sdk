// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListStandardGroupsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security rule sets returned.</p>
     */
    @NameInMap("StandardGroupList")
    public java.util.List<ListStandardGroupsResponseBodyStandardGroupList> standardGroupList;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListStandardGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStandardGroupsResponseBody self = new ListStandardGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStandardGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListStandardGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListStandardGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStandardGroupsResponseBody setStandardGroupList(java.util.List<ListStandardGroupsResponseBodyStandardGroupList> standardGroupList) {
        this.standardGroupList = standardGroupList;
        return this;
    }
    public java.util.List<ListStandardGroupsResponseBodyStandardGroupList> getStandardGroupList() {
        return this.standardGroupList;
    }

    public ListStandardGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListStandardGroupsResponseBodyStandardGroupList extends TeaModel {
        /**
         * <p>The type of the database engine. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The description of the security rule set.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The control mode. Valid values:</p>
         * <br>
         * <p>*   **NONE_CONTROL**: Flexible Management</p>
         * <p>*   **STABLE**: Stable Change</p>
         * <p>*   **COMMON**: Security Collaboration</p>
         */
        @NameInMap("GroupMode")
        public String groupMode;

        /**
         * <p>The name of the security rule set.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The ID of the user who queries the security sets.</p>
         */
        @NameInMap("LastMenderId")
        public Long lastMenderId;

        public static ListStandardGroupsResponseBodyStandardGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListStandardGroupsResponseBodyStandardGroupList self = new ListStandardGroupsResponseBodyStandardGroupList();
            return TeaModel.build(map, self);
        }

        public ListStandardGroupsResponseBodyStandardGroupList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListStandardGroupsResponseBodyStandardGroupList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStandardGroupsResponseBodyStandardGroupList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListStandardGroupsResponseBodyStandardGroupList setGroupMode(String groupMode) {
            this.groupMode = groupMode;
            return this;
        }
        public String getGroupMode() {
            return this.groupMode;
        }

        public ListStandardGroupsResponseBodyStandardGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListStandardGroupsResponseBodyStandardGroupList setLastMenderId(Long lastMenderId) {
            this.lastMenderId = lastMenderId;
            return this;
        }
        public Long getLastMenderId() {
            return this.lastMenderId;
        }

    }

}
