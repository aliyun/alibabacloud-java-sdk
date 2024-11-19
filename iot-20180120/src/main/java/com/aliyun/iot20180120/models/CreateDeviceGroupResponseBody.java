// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceGroupResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The group information returned if the call succeeds.</p>
     */
    @NameInMap("Data")
    public CreateDeviceGroupResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4D6D7F71-1C94-4160-8511-EFF4B8F0634D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceGroupResponseBody self = new CreateDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeviceGroupResponseBody setData(CreateDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateDeviceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDeviceGroupResponseBodyData extends TeaModel {
        /**
         * <p>The description of each group.</p>
         * 
         * <strong>example:</strong>
         * <p>Group test</p>
         */
        @NameInMap("GroupDesc")
        public String groupDesc;

        /**
         * <p>The ID of the group. The ID is the globally unique identifier (GUID) that the system generates for the group.</p>
         * 
         * <strong>example:</strong>
         * <p>HtMLECKbdJQL****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-17T11:19:31.000Z</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        public static CreateDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceGroupResponseBodyData self = new CreateDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeviceGroupResponseBodyData setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public CreateDeviceGroupResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateDeviceGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateDeviceGroupResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
