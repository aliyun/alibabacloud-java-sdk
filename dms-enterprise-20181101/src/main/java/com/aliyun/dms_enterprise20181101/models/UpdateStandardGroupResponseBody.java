// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateStandardGroupResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4E1D2B4D-3E53-4ABC-999D-1D2520B3471A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the security rule set.</p>
     */
    @NameInMap("StandardGroup")
    public UpdateStandardGroupResponseBodyStandardGroup standardGroup;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateStandardGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardGroupResponseBody self = new UpdateStandardGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStandardGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateStandardGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateStandardGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateStandardGroupResponseBody setStandardGroup(UpdateStandardGroupResponseBodyStandardGroup standardGroup) {
        this.standardGroup = standardGroup;
        return this;
    }
    public UpdateStandardGroupResponseBodyStandardGroup getStandardGroup() {
        return this.standardGroup;
    }

    public UpdateStandardGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateStandardGroupResponseBodyStandardGroup extends TeaModel {
        /**
         * <p>The type of the database for which the security rules are used.</p>
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
         * <p>Production Environment test rules</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The security rule set ID.</p>
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
         * <p>poc_test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The ID of the user who last modified the security rules.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("LastMenderId")
        public Long lastMenderId;

        public static UpdateStandardGroupResponseBodyStandardGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardGroupResponseBodyStandardGroup self = new UpdateStandardGroupResponseBodyStandardGroup();
            return TeaModel.build(map, self);
        }

        public UpdateStandardGroupResponseBodyStandardGroup setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public UpdateStandardGroupResponseBodyStandardGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStandardGroupResponseBodyStandardGroup setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public UpdateStandardGroupResponseBodyStandardGroup setGroupMode(String groupMode) {
            this.groupMode = groupMode;
            return this;
        }
        public String getGroupMode() {
            return this.groupMode;
        }

        public UpdateStandardGroupResponseBodyStandardGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateStandardGroupResponseBodyStandardGroup setLastMenderId(Long lastMenderId) {
            this.lastMenderId = lastMenderId;
            return this;
        }
        public Long getLastMenderId() {
            return this.lastMenderId;
        }

    }

}
