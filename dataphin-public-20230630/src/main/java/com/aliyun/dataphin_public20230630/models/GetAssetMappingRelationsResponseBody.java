// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetMappingRelationsResponseBody extends TeaModel {
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

    @NameInMap("MappingRelationList")
    public java.util.List<GetAssetMappingRelationsResponseBodyMappingRelationList> mappingRelationList;

    /**
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

    @NameInMap("Success")
    public Boolean success;

    public static GetAssetMappingRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetMappingRelationsResponseBody self = new GetAssetMappingRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetMappingRelationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAssetMappingRelationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAssetMappingRelationsResponseBody setMappingRelationList(java.util.List<GetAssetMappingRelationsResponseBodyMappingRelationList> mappingRelationList) {
        this.mappingRelationList = mappingRelationList;
        return this;
    }
    public java.util.List<GetAssetMappingRelationsResponseBodyMappingRelationList> getMappingRelationList() {
        return this.mappingRelationList;
    }

    public GetAssetMappingRelationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAssetMappingRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAssetMappingRelationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAssetMappingRelationsResponseBodyMappingRelationList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>COLUMN</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <strong>example:</strong>
         * <p>1122</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cc</p>
         */
        @NameInMap("StandardCode")
        public String standardCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StandardName")
        public String standardName;

        /**
         * <strong>example:</strong>
         * <p>/dir1</p>
         */
        @NameInMap("StandardSetDirectory")
        public String standardSetDirectory;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StandardSetId")
        public Long standardSetId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StandardSetName")
        public String standardSetName;

        /**
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        @NameInMap("StandardStage")
        public String standardStage;

        public static GetAssetMappingRelationsResponseBodyMappingRelationList build(java.util.Map<String, ?> map) throws Exception {
            GetAssetMappingRelationsResponseBodyMappingRelationList self = new GetAssetMappingRelationsResponseBodyMappingRelationList();
            return TeaModel.build(map, self);
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setStandardCode(String standardCode) {
            this.standardCode = standardCode;
            return this;
        }
        public String getStandardCode() {
            return this.standardCode;
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setStandardName(String standardName) {
            this.standardName = standardName;
            return this;
        }
        public String getStandardName() {
            return this.standardName;
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setStandardSetDirectory(String standardSetDirectory) {
            this.standardSetDirectory = standardSetDirectory;
            return this;
        }
        public String getStandardSetDirectory() {
            return this.standardSetDirectory;
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setStandardSetId(Long standardSetId) {
            this.standardSetId = standardSetId;
            return this;
        }
        public Long getStandardSetId() {
            return this.standardSetId;
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setStandardSetName(String standardSetName) {
            this.standardSetName = standardSetName;
            return this;
        }
        public String getStandardSetName() {
            return this.standardSetName;
        }

        public GetAssetMappingRelationsResponseBodyMappingRelationList setStandardStage(String standardStage) {
            this.standardStage = standardStage;
            return this;
        }
        public String getStandardStage() {
            return this.standardStage;
        }

    }

}
