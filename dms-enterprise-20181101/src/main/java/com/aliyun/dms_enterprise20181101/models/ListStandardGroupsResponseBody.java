// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListStandardGroupsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34E01EDD-6A16-4CF0-9541-C644D1BE01AA</p>
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
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The type of the database engine. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The description of the security rule set.</p>
         * 
         * <strong>example:</strong>
         * <p>test_rule</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the security rule set.</p>
         * 
         * <strong>example:</strong>
         * <p>41****</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The control mode. Valid values:</p>
         * <ul>
         * <li><strong>NONE_CONTROL</strong>: Flexible Management</li>
         * <li><strong>STABLE</strong>: Stable Change</li>
         * <li><strong>COMMON</strong>: Security Collaboration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMON</p>
         */
        @NameInMap("GroupMode")
        public String groupMode;

        /**
         * <p>The name of the security rule set.</p>
         * 
         * <strong>example:</strong>
         * <p>test_group</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The ID of the user who queries the security sets.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
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
