// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceDownStreamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InstanceRelationList")
    public java.util.List<GetInstanceDownStreamResponseBodyInstanceRelationList> instanceRelationList;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>t_23211</p>
         */
        @NameInMap("FieldInstanceId")
        public String fieldInstanceId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("RunStatus")
        public String runStatus;

        /**
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
         * <strong>example:</strong>
         * <p>t_232411</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownStreamDepth")
        public Integer downStreamDepth;

        /**
         * <strong>example:</strong>
         * <p>{&quot;a&quot;:&quot;x&quot;}</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        @NameInMap("FieldInstanceList")
        public java.util.List<GetInstanceDownStreamResponseBodyInstanceRelationListFieldInstanceList> fieldInstanceList;

        @NameInMap("InstanceInfo")
        public GetInstanceDownStreamResponseBodyInstanceRelationListInstanceInfo instanceInfo;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("RunStatus")
        public String runStatus;

        /**
         * <strong>example:</strong>
         * <p>OPTIONAL</p>
         */
        @NameInMap("SelectStatus")
        public String selectStatus;

        /**
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
