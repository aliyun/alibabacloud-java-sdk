// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateStandardGroupResponseBody extends TeaModel {
    /**
     * <p>The name of the security rule set.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The type of the database engine. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The operation that you want to perform. Set the value to **CreateStandardGroup**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the security rule set.</p>
     */
    @NameInMap("StandardGroup")
    public CreateStandardGroupResponseBodyStandardGroup standardGroup;

    /**
     * <p>The error message returned if the request fails.</p>
     */
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
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("GroupMode")
        public String groupMode;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

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
