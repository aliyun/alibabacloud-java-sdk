// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBelongAssetMappingResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of mapping relationships.</p>
     */
    @NameInMap("MappingRelationList")
    public java.util.List<GetBelongAssetMappingResponseBodyMappingRelationList> mappingRelationList;

    /**
     * <p>The details of the backend response exception.</p>
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

    public static GetBelongAssetMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBelongAssetMappingResponseBody self = new GetBelongAssetMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBelongAssetMappingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBelongAssetMappingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBelongAssetMappingResponseBody setMappingRelationList(java.util.List<GetBelongAssetMappingResponseBodyMappingRelationList> mappingRelationList) {
        this.mappingRelationList = mappingRelationList;
        return this;
    }
    public java.util.List<GetBelongAssetMappingResponseBodyMappingRelationList> getMappingRelationList() {
        return this.mappingRelationList;
    }

    public GetBelongAssetMappingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBelongAssetMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBelongAssetMappingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBelongAssetMappingResponseBodyMappingRelationList extends TeaModel {
        /**
         * <p>The type of the asset. Valid values: COLUMN (field) and INDEX (metric).</p>
         * 
         * <strong>example:</strong>
         * <p>COLUMN</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The GUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1122</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The code of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>cc</p>
         */
        @NameInMap("StandardCode")
        public String standardCode;

        /**
         * <p>The ID of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <p>The name of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StandardName")
        public String standardName;

        /**
         * <p>The directory where the standard set is located.</p>
         * 
         * <strong>example:</strong>
         * <p>/dir1</p>
         */
        @NameInMap("StandardSetDirectory")
        public String standardSetDirectory;

        /**
         * <p>The ID of the standard set.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StandardSetId")
        public Long standardSetId;

        /**
         * <p>The name of the standard set.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StandardSetName")
        public String standardSetName;

        /**
         * <p>The stage of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        @NameInMap("StandardStage")
        public String standardStage;

        public static GetBelongAssetMappingResponseBodyMappingRelationList build(java.util.Map<String, ?> map) throws Exception {
            GetBelongAssetMappingResponseBodyMappingRelationList self = new GetBelongAssetMappingResponseBodyMappingRelationList();
            return TeaModel.build(map, self);
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setStandardCode(String standardCode) {
            this.standardCode = standardCode;
            return this;
        }
        public String getStandardCode() {
            return this.standardCode;
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setStandardName(String standardName) {
            this.standardName = standardName;
            return this;
        }
        public String getStandardName() {
            return this.standardName;
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setStandardSetDirectory(String standardSetDirectory) {
            this.standardSetDirectory = standardSetDirectory;
            return this;
        }
        public String getStandardSetDirectory() {
            return this.standardSetDirectory;
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setStandardSetId(Long standardSetId) {
            this.standardSetId = standardSetId;
            return this;
        }
        public Long getStandardSetId() {
            return this.standardSetId;
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setStandardSetName(String standardSetName) {
            this.standardSetName = standardSetName;
            return this;
        }
        public String getStandardSetName() {
            return this.standardSetName;
        }

        public GetBelongAssetMappingResponseBodyMappingRelationList setStandardStage(String standardStage) {
            this.standardStage = standardStage;
            return this;
        }
        public String getStandardStage() {
            return this.standardStage;
        }

    }

}
