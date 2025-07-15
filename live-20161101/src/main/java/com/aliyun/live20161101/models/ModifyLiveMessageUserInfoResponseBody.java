// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageUserInfoResponseBody extends TeaModel {
    /**
     * <p>The users whose information failed to be modified.</p>
     */
    @NameInMap("FailList")
    public java.util.List<ModifyLiveMessageUserInfoResponseBodyFailList> failList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3271ACD2-F143-1204-AFDB-9A87C131****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The users whose information was modified.</p>
     */
    @NameInMap("SuccessList")
    public java.util.List<ModifyLiveMessageUserInfoResponseBodySuccessList> successList;

    public static ModifyLiveMessageUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageUserInfoResponseBody self = new ModifyLiveMessageUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageUserInfoResponseBody setFailList(java.util.List<ModifyLiveMessageUserInfoResponseBodyFailList> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<ModifyLiveMessageUserInfoResponseBodyFailList> getFailList() {
        return this.failList;
    }

    public ModifyLiveMessageUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyLiveMessageUserInfoResponseBody setSuccessList(java.util.List<ModifyLiveMessageUserInfoResponseBodySuccessList> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<ModifyLiveMessageUserInfoResponseBodySuccessList> getSuccessList() {
        return this.successList;
    }

    public static class ModifyLiveMessageUserInfoResponseBodyFailList extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>440</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The ID of the group to which the user belongs. For failed modification, the information of the user is not updated when you query the users in the group. You can try again after you check the failure reason and fix the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest2</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The reason why the information of the user failed to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>group not exists or already deleted</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Indicates whether the group to which the user belongs is modified. In this case, the group is not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ModifyLiveMessageUserInfoResponseBodyFailList build(java.util.Map<String, ?> map) throws Exception {
            ModifyLiveMessageUserInfoResponseBodyFailList self = new ModifyLiveMessageUserInfoResponseBodyFailList();
            return TeaModel.build(map, self);
        }

        public ModifyLiveMessageUserInfoResponseBodyFailList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ModifyLiveMessageUserInfoResponseBodyFailList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ModifyLiveMessageUserInfoResponseBodyFailList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ModifyLiveMessageUserInfoResponseBodyFailList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ModifyLiveMessageUserInfoResponseBodySuccessList extends TeaModel {
        /**
         * <p>The ID of the group to which the user belongs. For successful modification, the information of the user is updated when you query the users in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest1</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Indicates whether the group to which the user belongs is modified. In this case, the group is modified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ModifyLiveMessageUserInfoResponseBodySuccessList build(java.util.Map<String, ?> map) throws Exception {
            ModifyLiveMessageUserInfoResponseBodySuccessList self = new ModifyLiveMessageUserInfoResponseBodySuccessList();
            return TeaModel.build(map, self);
        }

        public ModifyLiveMessageUserInfoResponseBodySuccessList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ModifyLiveMessageUserInfoResponseBodySuccessList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
