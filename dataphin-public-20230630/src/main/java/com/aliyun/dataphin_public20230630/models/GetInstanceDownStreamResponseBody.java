// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceDownStreamResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code of the backend response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The downstream and dependency relationships.</p>
     */
    @NameInMap("InstanceRelationList")
    public java.util.List<GetInstanceDownStreamResponseBodyInstanceRelationList> instanceRelationList;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceDownStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDownStreamResponseBody self = new GetInstanceDownStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceDownStreamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceDownStreamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceDownStreamResponseBody setInstanceRelationList(java.util.List<GetInstanceDownStreamResponseBodyInstanceRelationList> instanceRelationList) {
        this.instanceRelationList = instanceRelationList;
        return this;
    }
    public java.util.List<GetInstanceDownStreamResponseBodyInstanceRelationList> getInstanceRelationList() {
        return this.instanceRelationList;
    }

    public GetInstanceDownStreamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceDownStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceDownStreamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList extends TeaModel {
        /**
         * <p>The field instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t_23211</p>
         */
        @NameInMap("FieldInstanceId")
        public String fieldInstanceId;

        /**
         * <p>The run status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("RunStatus")
        public String runStatus;

        /**
         * <p>The selection status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>OPTIONAL</p>
         */
        @NameInMap("SelectStatus")
        public String selectStatus;

        public static GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList self = new GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList();
            return TeaModel.build(map, self);
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList setFieldInstanceId(String fieldInstanceId) {
            this.fieldInstanceId = fieldInstanceId;
            return this;
        }
        public String getFieldInstanceId() {
            return this.fieldInstanceId;
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList setRunStatus(String runStatus) {
            this.runStatus = runStatus;
            return this;
        }
        public String getRunStatus() {
            return this.runStatus;
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList setSelectStatus(String selectStatus) {
            this.selectStatus = selectStatus;
            return this;
        }
        public String getSelectStatus() {
            return this.selectStatus;
        }

    }

    public static class GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t_232411</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo self = new GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceDownStreamResponseBodyInstanceRelationList extends TeaModel {
        /**
         * <p>The level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownStreamDepth")
        public Integer downStreamDepth;

        /**
         * <p>The extended information of the node instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;a&quot;:&quot;x&quot;}</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>The list of field instances.</p>
         */
        @NameInMap("FieldInstanceList")
        public java.util.List<GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList> fieldInstanceList;

        /**
         * <p>The instance information.</p>
         */
        @NameInMap("InstanceInfo")
        public GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo instanceInfo;

        /**
         * <p>The run status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("RunStatus")
        public String runStatus;

        /**
         * <p>The selection status of the instance. This is mainly used for logical fields. Valid values:</p>
         * <ul>
         * <li>OPTIONAL: optional.</li>
         * <li>SELECTED: required.</li>
         * <li>DISABLE: unavailable.</li>
         * <li>GROUP_SELECTED: all selected or all unselected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPTIONAL</p>
         */
        @NameInMap("SelectStatus")
        public String selectStatus;

        /**
         * <p>The reason why the instance is selected. Valid values:</p>
         * <ul>
         * <li>PK_CHANGE</li>
         * <li>LOGIC_CHANGE</li>
         * <li>RELATION</li>
         * <li>BIZ_RELATIO</li>
         * <li>MV_RELATION</li>
         * <li>MODEL_REFRESH</li>
         * <li>FIELD_DELETED</li>
         * <li>FIELD_ADDED_NO_INSTANCE</li>
         * <li>PERMISSION_DENY</li>
         * <li>OUTSIDE_INCOMING</li>
         * <li>INSTANCE_STATUS</li>
         * <li>AFFECT_BY_UPSTREAM</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FIELD_DELETED</p>
         */
        @NameInMap("SelectStatusCause")
        public String selectStatusCause;

        public static GetInstanceDownStreamResponseBodyInstanceRelationList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDownStreamResponseBodyInstanceRelationList self = new GetInstanceDownStreamResponseBodyInstanceRelationList();
            return TeaModel.build(map, self);
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationList setDownStreamDepth(Integer downStreamDepth) {
            this.downStreamDepth = downStreamDepth;
            return this;
        }
        public Integer getDownStreamDepth() {
            return this.downStreamDepth;
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationList setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationList setFieldInstanceList(java.util.List<GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList> fieldInstanceList) {
            this.fieldInstanceList = fieldInstanceList;
            return this;
        }
        public java.util.List<GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList> getFieldInstanceList() {
            return this.fieldInstanceList;
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationList setInstanceInfo(GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo getInstanceInfo() {
            return this.instanceInfo;
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationList setRunStatus(String runStatus) {
            this.runStatus = runStatus;
            return this;
        }
        public String getRunStatus() {
            return this.runStatus;
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationList setSelectStatus(String selectStatus) {
            this.selectStatus = selectStatus;
            return this;
        }
        public String getSelectStatus() {
            return this.selectStatus;
        }

        public GetInstanceDownStreamResponseBodyInstanceRelationList setSelectStatusCause(String selectStatusCause) {
            this.selectStatusCause = selectStatusCause;
            return this;
        }
        public String getSelectStatusCause() {
            return this.selectStatusCause;
        }

    }

}
