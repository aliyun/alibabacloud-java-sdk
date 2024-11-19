// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySuperDeviceGroupResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The parent group information returned if the call succeeds. For more information, see the following <strong>GroupInfo</strong> parameter.</p>
     */
    @NameInMap("Data")
    public QuerySuperDeviceGroupResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7411716B-A488-4EEB-9AA0-6DB05AD2491F</p>
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

    public static QuerySuperDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySuperDeviceGroupResponseBody self = new QuerySuperDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySuperDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySuperDeviceGroupResponseBody setData(QuerySuperDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySuperDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public QuerySuperDeviceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySuperDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySuperDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySuperDeviceGroupResponseBodyDataGroupInfo extends TeaModel {
        /**
         * <p>The description of the parent group.</p>
         * 
         * <strong>example:</strong>
         * <p>A test</p>
         */
        @NameInMap("GroupDesc")
        public String groupDesc;

        /**
         * <p>The ID of the parent group.</p>
         * 
         * <strong>example:</strong>
         * <p>tDQvBJqbUyHskDse</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the parent group.</p>
         * 
         * <strong>example:</strong>
         * <p>IOTTEST</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static QuerySuperDeviceGroupResponseBodyDataGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            QuerySuperDeviceGroupResponseBodyDataGroupInfo self = new QuerySuperDeviceGroupResponseBodyDataGroupInfo();
            return TeaModel.build(map, self);
        }

        public QuerySuperDeviceGroupResponseBodyDataGroupInfo setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public QuerySuperDeviceGroupResponseBodyDataGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QuerySuperDeviceGroupResponseBodyDataGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class QuerySuperDeviceGroupResponseBodyData extends TeaModel {
        @NameInMap("GroupInfo")
        public java.util.List<QuerySuperDeviceGroupResponseBodyDataGroupInfo> groupInfo;

        public static QuerySuperDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySuperDeviceGroupResponseBodyData self = new QuerySuperDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySuperDeviceGroupResponseBodyData setGroupInfo(java.util.List<QuerySuperDeviceGroupResponseBodyDataGroupInfo> groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public java.util.List<QuerySuperDeviceGroupResponseBodyDataGroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

    }

}
