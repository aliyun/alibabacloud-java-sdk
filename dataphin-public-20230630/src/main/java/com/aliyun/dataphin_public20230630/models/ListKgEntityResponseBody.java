// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListKgEntityResponseBody extends TeaModel {
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
     * <p>The paged query result.</p>
     */
    @NameInMap("PageResult")
    public ListKgEntityResponseBodyPageResult pageResult;

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

    public static ListKgEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKgEntityResponseBody self = new ListKgEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKgEntityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKgEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListKgEntityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKgEntityResponseBody setPageResult(ListKgEntityResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListKgEntityResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListKgEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKgEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKgEntityResponseBodyPageResultEntityListPropertyList extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>company_name</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property data type. Valid values:</p>
         * <ul>
         * <li>STRING: string.</li>
         * <li>INTEGER: integer.</li>
         * <li>FLOAT: floating-point number.</li>
         * <li>BOOLEAN: Boolean.</li>
         * <li>DATE: date.</li>
         * <li>LIST: list.</li>
         * </ul>
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

        public static ListKgEntityResponseBodyPageResultEntityListPropertyList build(java.util.Map<String, ?> map) throws Exception {
            ListKgEntityResponseBodyPageResultEntityListPropertyList self = new ListKgEntityResponseBodyPageResultEntityListPropertyList();
            return TeaModel.build(map, self);
        }

        public ListKgEntityResponseBodyPageResultEntityListPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListKgEntityResponseBodyPageResultEntityListPropertyList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListKgEntityResponseBodyPageResultEntityListPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListKgEntityResponseBodyPageResultEntityList extends TeaModel {
        /**
         * <p>The entity record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity type code.</p>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The entity record property list.</p>
         */
        @NameInMap("PropertyList")
        public java.util.List<ListKgEntityResponseBodyPageResultEntityListPropertyList> propertyList;

        public static ListKgEntityResponseBodyPageResultEntityList build(java.util.Map<String, ?> map) throws Exception {
            ListKgEntityResponseBodyPageResultEntityList self = new ListKgEntityResponseBodyPageResultEntityList();
            return TeaModel.build(map, self);
        }

        public ListKgEntityResponseBodyPageResultEntityList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListKgEntityResponseBodyPageResultEntityList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListKgEntityResponseBodyPageResultEntityList setPropertyList(java.util.List<ListKgEntityResponseBodyPageResultEntityListPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<ListKgEntityResponseBodyPageResultEntityListPropertyList> getPropertyList() {
            return this.propertyList;
        }

    }

    public static class ListKgEntityResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paged entity record list.</p>
         */
        @NameInMap("EntityList")
        public java.util.List<ListKgEntityResponseBodyPageResultEntityList> entityList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListKgEntityResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListKgEntityResponseBodyPageResult self = new ListKgEntityResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListKgEntityResponseBodyPageResult setEntityList(java.util.List<ListKgEntityResponseBodyPageResultEntityList> entityList) {
            this.entityList = entityList;
            return this;
        }
        public java.util.List<ListKgEntityResponseBodyPageResultEntityList> getEntityList() {
            return this.entityList;
        }

        public ListKgEntityResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
