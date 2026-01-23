// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardLookupTableResponseBody extends TeaModel {
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

    @NameInMap("LookupTableInfo")
    public GetStandardLookupTableResponseBodyLookupTableInfo lookupTableInfo;

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

    public static GetStandardLookupTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStandardLookupTableResponseBody self = new GetStandardLookupTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStandardLookupTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStandardLookupTableResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStandardLookupTableResponseBody setLookupTableInfo(GetStandardLookupTableResponseBodyLookupTableInfo lookupTableInfo) {
        this.lookupTableInfo = lookupTableInfo;
        return this;
    }
    public GetStandardLookupTableResponseBodyLookupTableInfo getLookupTableInfo() {
        return this.lookupTableInfo;
    }

    public GetStandardLookupTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStandardLookupTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStandardLookupTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStandardLookupTableResponseBodyLookupTableInfoDirectoryReference extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/dir1/dir2</p>
         */
        @NameInMap("Directory")
        public String directory;

        public static GetStandardLookupTableResponseBodyLookupTableInfoDirectoryReference build(java.util.Map<String, ?> map) throws Exception {
            GetStandardLookupTableResponseBodyLookupTableInfoDirectoryReference self = new GetStandardLookupTableResponseBodyLookupTableInfoDirectoryReference();
            return TeaModel.build(map, self);
        }

        public GetStandardLookupTableResponseBodyLookupTableInfoDirectoryReference setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

    }

    public static class GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>HZ</p>
         */
        @NameInMap("EnglishName")
        public String englishName;

        /**
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList self = new GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList();
            return TeaModel.build(map, self);
        }

        public GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetStandardLookupTableResponseBodyLookupTableInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CITY</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>30012021</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DirectoryReference")
        public GetStandardLookupTableResponseBodyLookupTableInfoDirectoryReference directoryReference;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>30012021</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LastModifierName")
        public String lastModifierName;

        @NameInMap("LookupTableValueList")
        public java.util.List<GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList> lookupTableValueList;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>城市码表</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>30012021</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        public static GetStandardLookupTableResponseBodyLookupTableInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStandardLookupTableResponseBodyLookupTableInfo self = new GetStandardLookupTableResponseBodyLookupTableInfo();
            return TeaModel.build(map, self);
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setDirectoryReference(GetStandardLookupTableResponseBodyLookupTableInfoDirectoryReference directoryReference) {
            this.directoryReference = directoryReference;
            return this;
        }
        public GetStandardLookupTableResponseBodyLookupTableInfoDirectoryReference getDirectoryReference() {
            return this.directoryReference;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setLookupTableValueList(java.util.List<GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList> lookupTableValueList) {
            this.lookupTableValueList = lookupTableValueList;
            return this;
        }
        public java.util.List<GetStandardLookupTableResponseBodyLookupTableInfoLookupTableValueList> getLookupTableValueList() {
            return this.lookupTableValueList;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetStandardLookupTableResponseBodyLookupTableInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

    }

}
