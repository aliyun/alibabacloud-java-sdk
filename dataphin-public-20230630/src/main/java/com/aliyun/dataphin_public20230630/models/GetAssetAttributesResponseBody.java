// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetAttributesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetAssetAttributesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

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

    public static GetAssetAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetAttributesResponseBody self = new GetAssetAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetAttributesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAssetAttributesResponseBody setData(GetAssetAttributesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAssetAttributesResponseBodyData getData() {
        return this.data;
    }

    public GetAssetAttributesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAssetAttributesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAssetAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAssetAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList extends TeaModel {
        /**
         * <p>The property code.</p>
         * 
         * <strong>example:</strong>
         * <p>data_level</p>
         */
        @NameInMap("AttributeCode")
        public String attributeCode;

        /**
         * <p>The display name of the property.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Level</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>Indicates whether the property is required.</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The list of property values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList build(java.util.Map<String, ?> map) throws Exception {
            GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList self = new GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList();
            return TeaModel.build(map, self);
        }

        public GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList setAttributeCode(String attributeCode) {
            this.attributeCode = attributeCode;
            return this;
        }
        public String getAttributeCode() {
            return this.attributeCode;
        }

        public GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetAssetAttributesResponseBodyDataAssetAttributeList extends TeaModel {
        /**
         * <p>The asset name.</p>
         * 
         * <strong>example:</strong>
         * <p>table_orders</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The asset type.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The list of property values.</p>
         */
        @NameInMap("AttributeList")
        public java.util.List<GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList> attributeList;

        /**
         * <p>The unique identifier of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.project_a.table_orders</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>The last modified time, in the format of yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01 10:30:00</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        public static GetAssetAttributesResponseBodyDataAssetAttributeList build(java.util.Map<String, ?> map) throws Exception {
            GetAssetAttributesResponseBodyDataAssetAttributeList self = new GetAssetAttributesResponseBodyDataAssetAttributeList();
            return TeaModel.build(map, self);
        }

        public GetAssetAttributesResponseBodyDataAssetAttributeList setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public GetAssetAttributesResponseBodyDataAssetAttributeList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public GetAssetAttributesResponseBodyDataAssetAttributeList setAttributeList(java.util.List<GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList> attributeList) {
            this.attributeList = attributeList;
            return this;
        }
        public java.util.List<GetAssetAttributesResponseBodyDataAssetAttributeListAttributeList> getAttributeList() {
            return this.attributeList;
        }

        public GetAssetAttributesResponseBodyDataAssetAttributeList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetAssetAttributesResponseBodyDataAssetAttributeList setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

    }

    public static class GetAssetAttributesResponseBodyData extends TeaModel {
        /**
         * <p>The list of asset properties.</p>
         */
        @NameInMap("AssetAttributeList")
        public java.util.List<GetAssetAttributesResponseBodyDataAssetAttributeList> assetAttributeList;

        public static GetAssetAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAssetAttributesResponseBodyData self = new GetAssetAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAssetAttributesResponseBodyData setAssetAttributeList(java.util.List<GetAssetAttributesResponseBodyDataAssetAttributeList> assetAttributeList) {
            this.assetAttributeList = assetAttributeList;
            return this;
        }
        public java.util.List<GetAssetAttributesResponseBodyDataAssetAttributeList> getAssetAttributeList() {
            return this.assetAttributeList;
        }

    }

}
