// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateStandardGroupResponseBody extends TeaModel {
    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned if the request fails.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The created security rule set.
    @NameInMap("StandardGroup")
    public CreateStandardGroupResponseBodyStandardGroup standardGroup;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static CreateStandardGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardGroupResponseBody self = new CreateStandardGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStandardGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateStandardGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateStandardGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStandardGroupResponseBody setStandardGroup(CreateStandardGroupResponseBodyStandardGroup standardGroup) {
        this.standardGroup = standardGroup;
        return this;
    }
    public CreateStandardGroupResponseBodyStandardGroup getStandardGroup() {
        return this.standardGroup;
    }

    public CreateStandardGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateStandardGroupResponseBodyStandardGroup extends TeaModel {
        // The type of the database engine. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
        @NameInMap("DbType")
        public String dbType;

        // The description of the security rule set.
        @NameInMap("Description")
        public String description;

        // The control mode. Valid values:
        // 
        // *   **NONE_CONTROL**: Flexible Management
        // *   **STABLE**: Stable Change
        // *   **COMMON**: Security Collaboration
        @NameInMap("GroupMode")
        public String groupMode;

        // The name of the security rule set.
        @NameInMap("GroupName")
        public String groupName;

        // The ID of the user who creates the security rule set.
        @NameInMap("LastMenderId")
        public Long lastMenderId;

        public static CreateStandardGroupResponseBodyStandardGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardGroupResponseBodyStandardGroup self = new CreateStandardGroupResponseBodyStandardGroup();
            return TeaModel.build(map, self);
        }

        public CreateStandardGroupResponseBodyStandardGroup setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public CreateStandardGroupResponseBodyStandardGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStandardGroupResponseBodyStandardGroup setGroupMode(String groupMode) {
            this.groupMode = groupMode;
            return this;
        }
        public String getGroupMode() {
            return this.groupMode;
        }

        public CreateStandardGroupResponseBodyStandardGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateStandardGroupResponseBodyStandardGroup setLastMenderId(Long lastMenderId) {
            this.lastMenderId = lastMenderId;
            return this;
        }
        public Long getLastMenderId() {
            return this.lastMenderId;
        }

    }

}
