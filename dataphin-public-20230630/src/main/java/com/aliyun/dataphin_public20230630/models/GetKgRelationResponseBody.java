// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgRelationResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The relationship record details.</p>
     */
    @NameInMap("RelationInfo")
    public GetKgRelationResponseBodyRelationInfo relationInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetKgRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKgRelationResponseBody self = new GetKgRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKgRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKgRelationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetKgRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKgRelationResponseBody setRelationInfo(GetKgRelationResponseBodyRelationInfo relationInfo) {
        this.relationInfo = relationInfo;
        return this;
    }
    public GetKgRelationResponseBodyRelationInfo getRelationInfo() {
        return this.relationInfo;
    }

    public GetKgRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKgRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKgRelationResponseBodyRelationInfoPropertyList extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>company_name</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property data type. Valid values: STRING (string), INTEGER (integer), FLOAT (floating-point number), BOOLEAN (Boolean), DATE (date), LIST (list), and others.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetKgRelationResponseBodyRelationInfoPropertyList build(java.util.Map<String, ?> map) throws Exception {
            GetKgRelationResponseBodyRelationInfoPropertyList self = new GetKgRelationResponseBodyRelationInfoPropertyList();
            return TeaModel.build(map, self);
        }

        public GetKgRelationResponseBodyRelationInfoPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetKgRelationResponseBodyRelationInfoPropertyList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetKgRelationResponseBodyRelationInfoPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetKgRelationResponseBodyRelationInfo extends TeaModel {
        /**
         * <p>The list of relationship record properties.</p>
         */
        @NameInMap("PropertyList")
        public java.util.List<GetKgRelationResponseBodyRelationInfoPropertyList> propertyList;

        /**
         * <p>The relationship record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("RelationId")
        public String relationId;

        /**
         * <p>The relationship type code.</p>
         * 
         * <strong>example:</strong>
         * <p>BELONG_TO</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The source entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("SourceEntityId")
        public String sourceEntityId;

        /**
         * <p>The target entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abd-xxx</p>
         */
        @NameInMap("TargetEntityId")
        public String targetEntityId;

        public static GetKgRelationResponseBodyRelationInfo build(java.util.Map<String, ?> map) throws Exception {
            GetKgRelationResponseBodyRelationInfo self = new GetKgRelationResponseBodyRelationInfo();
            return TeaModel.build(map, self);
        }

        public GetKgRelationResponseBodyRelationInfo setPropertyList(java.util.List<GetKgRelationResponseBodyRelationInfoPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<GetKgRelationResponseBodyRelationInfoPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public GetKgRelationResponseBodyRelationInfo setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

        public GetKgRelationResponseBodyRelationInfo setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public GetKgRelationResponseBodyRelationInfo setSourceEntityId(String sourceEntityId) {
            this.sourceEntityId = sourceEntityId;
            return this;
        }
        public String getSourceEntityId() {
            return this.sourceEntityId;
        }

        public GetKgRelationResponseBodyRelationInfo setTargetEntityId(String targetEntityId) {
            this.targetEntityId = targetEntityId;
            return this;
        }
        public String getTargetEntityId() {
            return this.targetEntityId;
        }

    }

}
