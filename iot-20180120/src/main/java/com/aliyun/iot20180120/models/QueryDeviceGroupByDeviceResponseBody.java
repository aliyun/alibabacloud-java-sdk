// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupByDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The group information returned if the call succeeds. For more information, see the following GroupInfo parameter.</p>
     */
    @NameInMap("GroupInfos")
    public QueryDeviceGroupByDeviceResponseBodyGroupInfos groupInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7941C8CD-7764-4A94-8CD9-E2762D4A73AC</p>
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

    public static QueryDeviceGroupByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupByDeviceResponseBody self = new QueryDeviceGroupByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupByDeviceResponseBody setGroupInfos(QueryDeviceGroupByDeviceResponseBodyGroupInfos groupInfos) {
        this.groupInfos = groupInfos;
        return this;
    }
    public QueryDeviceGroupByDeviceResponseBodyGroupInfos getGroupInfos() {
        return this.groupInfos;
    }

    public QueryDeviceGroupByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo extends TeaModel {
        /**
         * <p>The description of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>father desc</p>
         */
        @NameInMap("GroupDesc")
        public String groupDesc;

        /**
         * <p>The ID of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>6a3FF2XE2BKa****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>father1543152336554</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>LINK_PLATFORM_DYNAMIC</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The time when the group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-25T13:25:37.000Z</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        public static QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo self = new QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

    public static class QueryDeviceGroupByDeviceResponseBodyGroupInfos extends TeaModel {
        @NameInMap("GroupInfo")
        public java.util.List<QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo> groupInfo;

        public static QueryDeviceGroupByDeviceResponseBodyGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByDeviceResponseBodyGroupInfos self = new QueryDeviceGroupByDeviceResponseBodyGroupInfos();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfos setGroupInfo(java.util.List<QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo> groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public java.util.List<QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

    }

}
