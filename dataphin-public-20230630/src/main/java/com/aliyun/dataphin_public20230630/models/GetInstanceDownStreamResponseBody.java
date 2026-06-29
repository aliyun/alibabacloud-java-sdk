// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceDownStreamResponseBody extends TeaModel {
    /**
     * <p>Error code. OK indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Downstream instances and dependency relationships.</p>
     */
    @NameInMap("InstanceRelationList")
    public java.util.List<GetInstanceDownStreamResponseBodyInstanceRelationList> instanceRelationList;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
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
         * <p>Field instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t_23211</p>
         */
        @NameInMap("FieldInstanceId")
        public String fieldInstanceId;

        /**
         * <p>Run status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("RunStatus")
        public String runStatus;

        /**
         * <p>Selection status of the instance.</p>
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
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t_232411</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Node type.</p>
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
         * <p>Depth level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownStreamDepth")
        public Integer downStreamDepth;

        /**
         * <p>Extended information of the node instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;a&quot;:&quot;x&quot;}</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>Field instance list.</p>
         */
        @NameInMap("FieldInstanceList")
        public java.util.List<GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList> fieldInstanceList;

        /**
         * <p>Instance information.</p>
         */
        @NameInMap("InstanceInfo")
        public GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo instanceInfo;

        /**
         * <p>Run status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("RunStatus")
        public String runStatus;

        /**
         * <p>Selection status of the instance, primarily used for logical fields.</p>
         * <ul>
         * <li>OPTIONAL: Optional.</li>
         * <li>SELECTED: Required.</li>
         * <li>DISABLE: Not selectable.</li>
         * <li>GROUP_SELECTED: Select all or deselect all.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPTIONAL</p>
         */
        @NameInMap("SelectStatus")
        public String selectStatus;

        /**
         * <p>Reason why the instance is selected.</p>
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
