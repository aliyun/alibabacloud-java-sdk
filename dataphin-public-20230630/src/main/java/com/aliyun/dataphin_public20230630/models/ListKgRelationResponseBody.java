// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListKgRelationResponseBody extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListKgRelationResponseBodyPageResult pageResult;

    /**
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListKgRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKgRelationResponseBody self = new ListKgRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKgRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKgRelationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListKgRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKgRelationResponseBody setPageResult(ListKgRelationResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListKgRelationResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListKgRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKgRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKgRelationResponseBodyPageResultRelationListPropertyList extends TeaModel {
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

        public static ListKgRelationResponseBodyPageResultRelationListPropertyList build(java.util.Map<String, ?> map) throws Exception {
            ListKgRelationResponseBodyPageResultRelationListPropertyList self = new ListKgRelationResponseBodyPageResultRelationListPropertyList();
            return TeaModel.build(map, self);
        }

        public ListKgRelationResponseBodyPageResultRelationListPropertyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListKgRelationResponseBodyPageResultRelationListPropertyList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListKgRelationResponseBodyPageResultRelationListPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListKgRelationResponseBodyPageResultRelationList extends TeaModel {
        @NameInMap("PropertyList")
        public java.util.List<ListKgRelationResponseBodyPageResultRelationListPropertyList> propertyList;

        /**
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("RelationId")
        public String relationId;

        /**
         * <strong>example:</strong>
         * <p>BELONG_TO</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("SourceEntityId")
        public String sourceEntityId;

        /**
         * <strong>example:</strong>
         * <p>abd-xxx</p>
         */
        @NameInMap("TargetEntityId")
        public String targetEntityId;

        public static ListKgRelationResponseBodyPageResultRelationList build(java.util.Map<String, ?> map) throws Exception {
            ListKgRelationResponseBodyPageResultRelationList self = new ListKgRelationResponseBodyPageResultRelationList();
            return TeaModel.build(map, self);
        }

        public ListKgRelationResponseBodyPageResultRelationList setPropertyList(java.util.List<ListKgRelationResponseBodyPageResultRelationListPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<ListKgRelationResponseBodyPageResultRelationListPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public ListKgRelationResponseBodyPageResultRelationList setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

        public ListKgRelationResponseBodyPageResultRelationList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public ListKgRelationResponseBodyPageResultRelationList setSourceEntityId(String sourceEntityId) {
            this.sourceEntityId = sourceEntityId;
            return this;
        }
        public String getSourceEntityId() {
            return this.sourceEntityId;
        }

        public ListKgRelationResponseBodyPageResultRelationList setTargetEntityId(String targetEntityId) {
            this.targetEntityId = targetEntityId;
            return this;
        }
        public String getTargetEntityId() {
            return this.targetEntityId;
        }

    }

    public static class ListKgRelationResponseBodyPageResult extends TeaModel {
        @NameInMap("RelationList")
        public java.util.List<ListKgRelationResponseBodyPageResultRelationList> relationList;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListKgRelationResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListKgRelationResponseBodyPageResult self = new ListKgRelationResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListKgRelationResponseBodyPageResult setRelationList(java.util.List<ListKgRelationResponseBodyPageResultRelationList> relationList) {
            this.relationList = relationList;
            return this;
        }
        public java.util.List<ListKgRelationResponseBodyPageResultRelationList> getRelationList() {
            return this.relationList;
        }

        public ListKgRelationResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
