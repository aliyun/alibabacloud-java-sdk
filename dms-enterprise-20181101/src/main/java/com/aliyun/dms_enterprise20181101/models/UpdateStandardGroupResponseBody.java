// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateStandardGroupResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StandardGroup")
    public UpdateStandardGroupResponseBodyStandardGroup standardGroup;

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
        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupMode")
        public String groupMode;

        @NameInMap("GroupName")
        public String groupName;

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
