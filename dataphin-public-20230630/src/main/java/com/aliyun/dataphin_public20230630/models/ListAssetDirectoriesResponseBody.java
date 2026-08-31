// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAssetDirectoriesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The paginated result of asset topic folders.</p>
     */
    @NameInMap("Data")
    public ListAssetDirectoriesResponseBodyData data;

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

    public static ListAssetDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssetDirectoriesResponseBody self = new ListAssetDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssetDirectoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAssetDirectoriesResponseBody setData(ListAssetDirectoriesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAssetDirectoriesResponseBodyData getData() {
        return this.data;
    }

    public ListAssetDirectoriesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAssetDirectoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAssetDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAssetDirectoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAssetDirectoriesResponseBodyDataDirectoryListModifier extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListAssetDirectoriesResponseBodyDataDirectoryListModifier build(java.util.Map<String, ?> map) throws Exception {
            ListAssetDirectoriesResponseBodyDataDirectoryListModifier self = new ListAssetDirectoriesResponseBodyDataDirectoryListModifier();
            return TeaModel.build(map, self);
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryListModifier setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryListModifier setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListAssetDirectoriesResponseBodyDataDirectoryList extends TeaModel {
        /**
         * <p>The folder description.</p>
         * 
         * <strong>example:</strong>
         * <p>Core metrics asset folder</p>
         */
        @NameInMap("DirectoryDescription")
        public String directoryDescription;

        /**
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8223183275</p>
         */
        @NameInMap("DirectoryId")
        public Long directoryId;

        /**
         * <p>The folder name.</p>
         * 
         * <strong>example:</strong>
         * <p>Core Metrics</p>
         */
        @NameInMap("DirectoryName")
        public String directoryName;

        /**
         * <p>The display path.</p>
         * 
         * <strong>example:</strong>
         * <p>/Data Governance/Core Metrics</p>
         */
        @NameInMap("FullPath")
        public String fullPath;

        /**
         * <p>The ID path from the top level to the current folder.</p>
         */
        @NameInMap("FullPathIds")
        public java.util.List<Long> fullPathIds;

        /**
         * <p>The name path from the top level to the current folder.</p>
         */
        @NameInMap("FullPathNames")
        public java.util.List<String> fullPathNames;

        /**
         * <p>Indicates whether published direct child folders exist.</p>
         */
        @NameInMap("HasChildren")
        public Boolean hasChildren;

        /**
         * <p>The absolute level of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>7120213</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The last modifier.</p>
         */
        @NameInMap("Modifier")
        public ListAssetDirectoriesResponseBodyDataDirectoryListModifier modifier;

        /**
         * <p>The last modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The parent folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>-292276281678</p>
         */
        @NameInMap("ParentDirectoryId")
        public Long parentDirectoryId;

        public static ListAssetDirectoriesResponseBodyDataDirectoryList build(java.util.Map<String, ?> map) throws Exception {
            ListAssetDirectoriesResponseBodyDataDirectoryList self = new ListAssetDirectoriesResponseBodyDataDirectoryList();
            return TeaModel.build(map, self);
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setDirectoryDescription(String directoryDescription) {
            this.directoryDescription = directoryDescription;
            return this;
        }
        public String getDirectoryDescription() {
            return this.directoryDescription;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setDirectoryId(Long directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Long getDirectoryId() {
            return this.directoryId;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setFullPath(String fullPath) {
            this.fullPath = fullPath;
            return this;
        }
        public String getFullPath() {
            return this.fullPath;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setFullPathIds(java.util.List<Long> fullPathIds) {
            this.fullPathIds = fullPathIds;
            return this;
        }
        public java.util.List<Long> getFullPathIds() {
            return this.fullPathIds;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setFullPathNames(java.util.List<String> fullPathNames) {
            this.fullPathNames = fullPathNames;
            return this;
        }
        public java.util.List<String> getFullPathNames() {
            return this.fullPathNames;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setHasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setModifier(ListAssetDirectoriesResponseBodyDataDirectoryListModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public ListAssetDirectoriesResponseBodyDataDirectoryListModifier getModifier() {
            return this.modifier;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAssetDirectoriesResponseBodyDataDirectoryList setParentDirectoryId(Long parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }
        public Long getParentDirectoryId() {
            return this.parentDirectoryId;
        }

    }

    public static class ListAssetDirectoriesResponseBodyData extends TeaModel {
        /**
         * <p>The folder list.</p>
         */
        @NameInMap("DirectoryList")
        public java.util.List<ListAssetDirectoriesResponseBodyDataDirectoryList> directoryList;

        /**
         * <p>The topic ID.</p>
         * 
         * <strong>example:</strong>
         * <p>471794724245</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Governance</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <p>The total number of records that match the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>-165955346599</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListAssetDirectoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAssetDirectoriesResponseBodyData self = new ListAssetDirectoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAssetDirectoriesResponseBodyData setDirectoryList(java.util.List<ListAssetDirectoriesResponseBodyDataDirectoryList> directoryList) {
            this.directoryList = directoryList;
            return this;
        }
        public java.util.List<ListAssetDirectoriesResponseBodyDataDirectoryList> getDirectoryList() {
            return this.directoryList;
        }

        public ListAssetDirectoriesResponseBodyData setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public ListAssetDirectoriesResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListAssetDirectoriesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
