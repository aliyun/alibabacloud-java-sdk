// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDirectoryTreeResponseBody extends TeaModel {
    /**
     * <p>Error code. OK indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Directory tree information. Returns the directory tree with all edge information, traversed level by level from the root node.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetDirectoryTreeResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDirectoryTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryTreeResponseBody self = new GetDirectoryTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDirectoryTreeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDirectoryTreeResponseBody setData(java.util.List<GetDirectoryTreeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDirectoryTreeResponseBodyData> getData() {
        return this.data;
    }

    public GetDirectoryTreeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDirectoryTreeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDirectoryTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDirectoryTreeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDirectoryTreeResponseBodyDataChildren extends TeaModel {
        /**
         * <p>Directory type.</p>
         * 
         * <strong>example:</strong>
         * <p>codeManage</p>
         */
        @NameInMap("CategoryType")
        public String categoryType;

        /**
         * <p>Creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300000907</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Creator name.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>Data cell ID.</p>
         * 
         * <strong>example:</strong>
         * <p>41342</p>
         */
        @NameInMap("DataCellId")
        public Long dataCellId;

        /**
         * <p>Directory path. Valid only for file or resource nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("DirName")
        public String dirName;

        /**
         * <p>Creation time. Empty for non-entity object nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-01 18:08:17</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Modification time. Empty for non-entity object nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-01 18:08:17</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Last modifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300000907</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <p>Last modifier name.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("LastModifierName")
        public String lastModifierName;

        /**
         * <p>Display name of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>代码管理</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7081229106458752</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Directory string ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("StringId")
        public String stringId;

        /**
         * <p>Object type.</p>
         * 
         * <strong>example:</strong>
         * <p>codeManage</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDirectoryTreeResponseBodyDataChildren build(java.util.Map<String, ?> map) throws Exception {
            GetDirectoryTreeResponseBodyDataChildren self = new GetDirectoryTreeResponseBodyDataChildren();
            return TeaModel.build(map, self);
        }

        public GetDirectoryTreeResponseBodyDataChildren setCategoryType(String categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public String getCategoryType() {
            return this.categoryType;
        }

        public GetDirectoryTreeResponseBodyDataChildren setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetDirectoryTreeResponseBodyDataChildren setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetDirectoryTreeResponseBodyDataChildren setDataCellId(Long dataCellId) {
            this.dataCellId = dataCellId;
            return this;
        }
        public Long getDataCellId() {
            return this.dataCellId;
        }

        public GetDirectoryTreeResponseBodyDataChildren setDirName(String dirName) {
            this.dirName = dirName;
            return this;
        }
        public String getDirName() {
            return this.dirName;
        }

        public GetDirectoryTreeResponseBodyDataChildren setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDirectoryTreeResponseBodyDataChildren setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDirectoryTreeResponseBodyDataChildren setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDirectoryTreeResponseBodyDataChildren setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetDirectoryTreeResponseBodyDataChildren setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public GetDirectoryTreeResponseBodyDataChildren setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDirectoryTreeResponseBodyDataChildren setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDirectoryTreeResponseBodyDataChildren setStringId(String stringId) {
            this.stringId = stringId;
            return this;
        }
        public String getStringId() {
            return this.stringId;
        }

        public GetDirectoryTreeResponseBodyDataChildren setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDirectoryTreeResponseBodyDataParent extends TeaModel {
        /**
         * <p>Directory type.</p>
         * 
         * <strong>example:</strong>
         * <p>codeManage</p>
         */
        @NameInMap("CategoryType")
        public String categoryType;

        /**
         * <p>Creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300000907</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Creator name.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>Data cell ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3213</p>
         */
        @NameInMap("DataCellId")
        public Long dataCellId;

        /**
         * <p>Directory path. Valid only for file or resource nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("DirName")
        public String dirName;

        /**
         * <p>Creation time. Empty for non-entity object nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-01 18:08:17</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Modification time. Empty for non-entity object nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-01 18:08:17</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Last modifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300000907</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <p>Last modifier name.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("LastModifierName")
        public String lastModifierName;

        /**
         * <p>Display name of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>代码管理</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7081229106458752</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Directory string ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("StringId")
        public String stringId;

        /**
         * <p>Object type.</p>
         * 
         * <strong>example:</strong>
         * <p>codeManage</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDirectoryTreeResponseBodyDataParent build(java.util.Map<String, ?> map) throws Exception {
            GetDirectoryTreeResponseBodyDataParent self = new GetDirectoryTreeResponseBodyDataParent();
            return TeaModel.build(map, self);
        }

        public GetDirectoryTreeResponseBodyDataParent setCategoryType(String categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public String getCategoryType() {
            return this.categoryType;
        }

        public GetDirectoryTreeResponseBodyDataParent setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetDirectoryTreeResponseBodyDataParent setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetDirectoryTreeResponseBodyDataParent setDataCellId(Long dataCellId) {
            this.dataCellId = dataCellId;
            return this;
        }
        public Long getDataCellId() {
            return this.dataCellId;
        }

        public GetDirectoryTreeResponseBodyDataParent setDirName(String dirName) {
            this.dirName = dirName;
            return this;
        }
        public String getDirName() {
            return this.dirName;
        }

        public GetDirectoryTreeResponseBodyDataParent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDirectoryTreeResponseBodyDataParent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDirectoryTreeResponseBodyDataParent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDirectoryTreeResponseBodyDataParent setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetDirectoryTreeResponseBodyDataParent setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public GetDirectoryTreeResponseBodyDataParent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDirectoryTreeResponseBodyDataParent setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDirectoryTreeResponseBodyDataParent setStringId(String stringId) {
            this.stringId = stringId;
            return this;
        }
        public String getStringId() {
            return this.stringId;
        }

        public GetDirectoryTreeResponseBodyDataParent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDirectoryTreeResponseBodyData extends TeaModel {
        /**
         * <p>Child node.</p>
         */
        @NameInMap("Children")
        public GetDirectoryTreeResponseBodyDataChildren children;

        /**
         * <p>Parent node.</p>
         */
        @NameInMap("Parent")
        public GetDirectoryTreeResponseBodyDataParent parent;

        public static GetDirectoryTreeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDirectoryTreeResponseBodyData self = new GetDirectoryTreeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDirectoryTreeResponseBodyData setChildren(GetDirectoryTreeResponseBodyDataChildren children) {
            this.children = children;
            return this;
        }
        public GetDirectoryTreeResponseBodyDataChildren getChildren() {
            return this.children;
        }

        public GetDirectoryTreeResponseBodyData setParent(GetDirectoryTreeResponseBodyDataParent parent) {
            this.parent = parent;
            return this;
        }
        public GetDirectoryTreeResponseBodyDataParent getParent() {
            return this.parent;
        }

    }

}
