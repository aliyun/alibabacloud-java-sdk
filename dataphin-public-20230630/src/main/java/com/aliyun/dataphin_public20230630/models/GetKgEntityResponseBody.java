// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgEntityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("EntityInfo")
    public GetKgEntityResponseBodyEntityInfo entityInfo;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetKgEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKgEntityResponseBody self = new GetKgEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKgEntityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKgEntityResponseBody setEntityInfo(GetKgEntityResponseBodyEntityInfo entityInfo) {
        this.entityInfo = entityInfo;
        return this;
    }
    public GetKgEntityResponseBodyEntityInfo getEntityInfo() {
        return this.entityInfo;
    }

    public GetKgEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetKgEntityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKgEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKgEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKgEntityResponseBodyEntityInfoPropertyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>company_name</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetKgEntityResponseBodyEntityInfoPropertyList build(java.util.Map<String, ?> map) throws Exception {
            GetKgEntityResponseBodyEntityInfoPropertyList self = new GetKgEntityResponseBodyEntityInfoPropertyList();
            return TeaModel.build(map, self);
        }

        public GetKgEntityResponseBodyEntityInfoPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetKgEntityResponseBodyEntityInfoPropertyList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetKgEntityResponseBodyEntityInfoPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetKgEntityResponseBodyEntityInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("PropertyList")
        public java.util.List<GetKgEntityResponseBodyEntityInfoPropertyList> propertyList;

        public static GetKgEntityResponseBodyEntityInfo build(java.util.Map<String, ?> map) throws Exception {
            GetKgEntityResponseBodyEntityInfo self = new GetKgEntityResponseBodyEntityInfo();
            return TeaModel.build(map, self);
        }

        public GetKgEntityResponseBodyEntityInfo setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetKgEntityResponseBodyEntityInfo setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public GetKgEntityResponseBodyEntityInfo setPropertyList(java.util.List<GetKgEntityResponseBodyEntityInfoPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<GetKgEntityResponseBodyEntityInfoPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

}
