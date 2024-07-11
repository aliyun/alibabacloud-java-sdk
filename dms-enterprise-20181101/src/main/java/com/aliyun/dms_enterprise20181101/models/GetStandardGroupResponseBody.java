// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStandardGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>BF7E9543-F431-566A-991A-B5C493EA36C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StandardGroup")
    public GetStandardGroupResponseBodyStandardGroup standardGroup;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetStandardGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStandardGroupResponseBody self = new GetStandardGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStandardGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStandardGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetStandardGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStandardGroupResponseBody setStandardGroup(GetStandardGroupResponseBodyStandardGroup standardGroup) {
        this.standardGroup = standardGroup;
        return this;
    }
    public GetStandardGroupResponseBodyStandardGroup getStandardGroup() {
        return this.standardGroup;
    }

    public GetStandardGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStandardGroupResponseBodyStandardGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>41****</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <strong>example:</strong>
         * <p>COMMON</p>
         */
        @NameInMap("GroupMode")
        public String groupMode;

        /**
         * <strong>example:</strong>
         * <p>poc_test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("LastMenderId")
        public Long lastMenderId;

        public static GetStandardGroupResponseBodyStandardGroup build(java.util.Map<String, ?> map) throws Exception {
            GetStandardGroupResponseBodyStandardGroup self = new GetStandardGroupResponseBodyStandardGroup();
            return TeaModel.build(map, self);
        }

        public GetStandardGroupResponseBodyStandardGroup setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetStandardGroupResponseBodyStandardGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStandardGroupResponseBodyStandardGroup setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetStandardGroupResponseBodyStandardGroup setGroupMode(String groupMode) {
            this.groupMode = groupMode;
            return this;
        }
        public String getGroupMode() {
            return this.groupMode;
        }

        public GetStandardGroupResponseBodyStandardGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetStandardGroupResponseBodyStandardGroup setLastMenderId(Long lastMenderId) {
            this.lastMenderId = lastMenderId;
            return this;
        }
        public Long getLastMenderId() {
            return this.lastMenderId;
        }

    }

}
