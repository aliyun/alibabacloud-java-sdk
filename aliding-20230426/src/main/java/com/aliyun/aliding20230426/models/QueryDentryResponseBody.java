// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryDentryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>alidoc</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("createdTime")
    public Long createdTime;

    @NameInMap("creator")
    public QueryDentryResponseBodyCreator creator;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("dentryId")
    public String dentryId;

    /**
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("dentryType")
    public String dentryType;

    /**
     * <strong>example:</strong>
     * <p>cdefg</p>
     */
    @NameInMap("dentryUuid")
    public String dentryUuid;

    /**
     * <strong>example:</strong>
     * <p>aabbcc</p>
     */
    @NameInMap("docKey")
    public String docKey;

    /**
     * <strong>example:</strong>
     * <p>alidoc</p>
     */
    @NameInMap("extension")
    public String extension;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasChildren")
    public Boolean hasChildren;

    @NameInMap("linkSourceInfo")
    public QueryDentryResponseBodyLinkSourceInfo linkSourceInfo;

    /**
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>测试组织/测试知识库/abc</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("space")
    public QueryDentryResponseBodySpace space;

    /**
     * <strong>example:</strong>
     * <p>bcd</p>
     */
    @NameInMap("spaceId")
    public String spaceId;

    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("updatedTime")
    public Long updatedTime;

    @NameInMap("updater")
    public QueryDentryResponseBodyUpdater updater;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx.yy">https://xxx.yy</a></p>
     */
    @NameInMap("url")
    public String url;

    @NameInMap("visitorInfo")
    public QueryDentryResponseBodyVisitorInfo visitorInfo;

    public static QueryDentryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDentryResponseBody self = new QueryDentryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDentryResponseBody setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public QueryDentryResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public QueryDentryResponseBody setCreator(QueryDentryResponseBodyCreator creator) {
        this.creator = creator;
        return this;
    }
    public QueryDentryResponseBodyCreator getCreator() {
        return this.creator;
    }

    public QueryDentryResponseBody setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public QueryDentryResponseBody setDentryType(String dentryType) {
        this.dentryType = dentryType;
        return this;
    }
    public String getDentryType() {
        return this.dentryType;
    }

    public QueryDentryResponseBody setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public QueryDentryResponseBody setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public QueryDentryResponseBody setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public QueryDentryResponseBody setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
        return this;
    }
    public Boolean getHasChildren() {
        return this.hasChildren;
    }

    public QueryDentryResponseBody setLinkSourceInfo(QueryDentryResponseBodyLinkSourceInfo linkSourceInfo) {
        this.linkSourceInfo = linkSourceInfo;
        return this;
    }
    public QueryDentryResponseBodyLinkSourceInfo getLinkSourceInfo() {
        return this.linkSourceInfo;
    }

    public QueryDentryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDentryResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public QueryDentryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDentryResponseBody setSpace(QueryDentryResponseBodySpace space) {
        this.space = space;
        return this;
    }
    public QueryDentryResponseBodySpace getSpace() {
        return this.space;
    }

    public QueryDentryResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public QueryDentryResponseBody setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

    public QueryDentryResponseBody setUpdater(QueryDentryResponseBodyUpdater updater) {
        this.updater = updater;
        return this;
    }
    public QueryDentryResponseBodyUpdater getUpdater() {
        return this.updater;
    }

    public QueryDentryResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public QueryDentryResponseBody setVisitorInfo(QueryDentryResponseBodyVisitorInfo visitorInfo) {
        this.visitorInfo = visitorInfo;
        return this;
    }
    public QueryDentryResponseBodyVisitorInfo getVisitorInfo() {
        return this.visitorInfo;
    }

    public static class QueryDentryResponseBodyCreator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryDentryResponseBodyCreator build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodyCreator self = new QueryDentryResponseBodyCreator();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodyCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDentryResponseBodyCreator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryDentryResponseBodyLinkSourceInfoIconUrl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gh</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("Small")
        public String small;

        public static QueryDentryResponseBodyLinkSourceInfoIconUrl build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodyLinkSourceInfoIconUrl self = new QueryDentryResponseBodyLinkSourceInfoIconUrl();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodyLinkSourceInfoIconUrl setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public QueryDentryResponseBodyLinkSourceInfoIconUrl setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class QueryDentryResponseBodyLinkSourceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("Extension")
        public String extension;

        @NameInMap("IconUrl")
        public QueryDentryResponseBodyLinkSourceInfoIconUrl iconUrl;

        /**
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LinkType")
        public Long linkType;

        /**
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("SpaceId")
        public String spaceId;

        public static QueryDentryResponseBodyLinkSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodyLinkSourceInfo self = new QueryDentryResponseBodyLinkSourceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodyLinkSourceInfo setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public QueryDentryResponseBodyLinkSourceInfo setIconUrl(QueryDentryResponseBodyLinkSourceInfoIconUrl iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public QueryDentryResponseBodyLinkSourceInfoIconUrl getIconUrl() {
            return this.iconUrl;
        }

        public QueryDentryResponseBodyLinkSourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDentryResponseBodyLinkSourceInfo setLinkType(Long linkType) {
            this.linkType = linkType;
            return this;
        }
        public Long getLinkType() {
            return this.linkType;
        }

        public QueryDentryResponseBodyLinkSourceInfo setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

    }

    public static class QueryDentryResponseBodySpaceHdIconVO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>http://</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryDentryResponseBodySpaceHdIconVO build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceHdIconVO self = new QueryDentryResponseBodySpaceHdIconVO();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceHdIconVO setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryDentryResponseBodySpaceHdIconVO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryDentryResponseBodySpaceIconVO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>http://</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryDentryResponseBodySpaceIconVO build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceIconVO self = new QueryDentryResponseBodySpaceIconVO();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceIconVO setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryDentryResponseBodySpaceIconVO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryDentryResponseBodySpaceOwner extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>小钉</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryDentryResponseBodySpaceOwner build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceOwner self = new QueryDentryResponseBodySpaceOwner();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceOwner setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDentryResponseBodySpaceOwner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryDentryResponseBodySpaceRecentListCreator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryDentryResponseBodySpaceRecentListCreator build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceRecentListCreator self = new QueryDentryResponseBodySpaceRecentListCreator();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceRecentListCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDentryResponseBodySpaceRecentListCreator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gh</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("Small")
        public String small;

        public static QueryDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl self = new QueryDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public QueryDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class QueryDentryResponseBodySpaceRecentListLinkSourceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("Extension")
        public String extension;

        @NameInMap("IconUrl")
        public QueryDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl iconUrl;

        /**
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LinkType")
        public Long linkType;

        /**
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("SpaceId")
        public String spaceId;

        public static QueryDentryResponseBodySpaceRecentListLinkSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceRecentListLinkSourceInfo self = new QueryDentryResponseBodySpaceRecentListLinkSourceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceRecentListLinkSourceInfo setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public QueryDentryResponseBodySpaceRecentListLinkSourceInfo setIconUrl(QueryDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public QueryDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl getIconUrl() {
            return this.iconUrl;
        }

        public QueryDentryResponseBodySpaceRecentListLinkSourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDentryResponseBodySpaceRecentListLinkSourceInfo setLinkType(Long linkType) {
            this.linkType = linkType;
            return this;
        }
        public Long getLinkType() {
            return this.linkType;
        }

        public QueryDentryResponseBodySpaceRecentListLinkSourceInfo setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

    }

    public static class QueryDentryResponseBodySpaceRecentListStatisticalInfo extends TeaModel {
        @NameInMap("WordCount")
        public Long wordCount;

        public static QueryDentryResponseBodySpaceRecentListStatisticalInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceRecentListStatisticalInfo self = new QueryDentryResponseBodySpaceRecentListStatisticalInfo();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceRecentListStatisticalInfo setWordCount(Long wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Long getWordCount() {
            return this.wordCount;
        }

    }

    public static class QueryDentryResponseBodySpaceRecentListUpdater extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryDentryResponseBodySpaceRecentListUpdater build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceRecentListUpdater self = new QueryDentryResponseBodySpaceRecentListUpdater();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceRecentListUpdater setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDentryResponseBodySpaceRecentListUpdater setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryDentryResponseBodySpaceRecentListVisitorInfo extends TeaModel {
        @NameInMap("DentryActions")
        public java.util.List<String> dentryActions;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RoleCode")
        public String roleCode;

        @NameInMap("SpaceActions")
        public java.util.List<String> spaceActions;

        public static QueryDentryResponseBodySpaceRecentListVisitorInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceRecentListVisitorInfo self = new QueryDentryResponseBodySpaceRecentListVisitorInfo();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceRecentListVisitorInfo setDentryActions(java.util.List<String> dentryActions) {
            this.dentryActions = dentryActions;
            return this;
        }
        public java.util.List<String> getDentryActions() {
            return this.dentryActions;
        }

        public QueryDentryResponseBodySpaceRecentListVisitorInfo setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public QueryDentryResponseBodySpaceRecentListVisitorInfo setSpaceActions(java.util.List<String> spaceActions) {
            this.spaceActions = spaceActions;
            return this;
        }
        public java.util.List<String> getSpaceActions() {
            return this.spaceActions;
        }

    }

    public static class QueryDentryResponseBodySpaceRecentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alidoc</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Creator")
        public QueryDentryResponseBodySpaceRecentListCreator creator;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("DentryId")
        public String dentryId;

        /**
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("DentryType")
        public String dentryType;

        /**
         * <strong>example:</strong>
         * <p>cdefg</p>
         */
        @NameInMap("DentryUuid")
        public String dentryUuid;

        /**
         * <strong>example:</strong>
         * <p>aabbcc</p>
         */
        @NameInMap("DocKey")
        public String docKey;

        /**
         * <strong>example:</strong>
         * <p>alidoc</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasChildren")
        public Boolean hasChildren;

        @NameInMap("LinkSourceInfo")
        public QueryDentryResponseBodySpaceRecentListLinkSourceInfo linkSourceInfo;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>测试组织/测试知识库/abc</p>
         */
        @NameInMap("Path")
        public String path;

        @NameInMap("Space")
        public Object space;

        /**
         * <strong>example:</strong>
         * <p>bcd</p>
         */
        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("StatisticalInfo")
        public QueryDentryResponseBodySpaceRecentListStatisticalInfo statisticalInfo;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        @NameInMap("Updater")
        public QueryDentryResponseBodySpaceRecentListUpdater updater;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx.yy">https://xxx.yy</a></p>
         */
        @NameInMap("Url")
        public String url;

        @NameInMap("VisitorInfo")
        public QueryDentryResponseBodySpaceRecentListVisitorInfo visitorInfo;

        public static QueryDentryResponseBodySpaceRecentList build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceRecentList self = new QueryDentryResponseBodySpaceRecentList();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceRecentList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public QueryDentryResponseBodySpaceRecentList setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public QueryDentryResponseBodySpaceRecentList setCreator(QueryDentryResponseBodySpaceRecentListCreator creator) {
            this.creator = creator;
            return this;
        }
        public QueryDentryResponseBodySpaceRecentListCreator getCreator() {
            return this.creator;
        }

        public QueryDentryResponseBodySpaceRecentList setDentryId(String dentryId) {
            this.dentryId = dentryId;
            return this;
        }
        public String getDentryId() {
            return this.dentryId;
        }

        public QueryDentryResponseBodySpaceRecentList setDentryType(String dentryType) {
            this.dentryType = dentryType;
            return this;
        }
        public String getDentryType() {
            return this.dentryType;
        }

        public QueryDentryResponseBodySpaceRecentList setDentryUuid(String dentryUuid) {
            this.dentryUuid = dentryUuid;
            return this;
        }
        public String getDentryUuid() {
            return this.dentryUuid;
        }

        public QueryDentryResponseBodySpaceRecentList setDocKey(String docKey) {
            this.docKey = docKey;
            return this;
        }
        public String getDocKey() {
            return this.docKey;
        }

        public QueryDentryResponseBodySpaceRecentList setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public QueryDentryResponseBodySpaceRecentList setHasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        public QueryDentryResponseBodySpaceRecentList setLinkSourceInfo(QueryDentryResponseBodySpaceRecentListLinkSourceInfo linkSourceInfo) {
            this.linkSourceInfo = linkSourceInfo;
            return this;
        }
        public QueryDentryResponseBodySpaceRecentListLinkSourceInfo getLinkSourceInfo() {
            return this.linkSourceInfo;
        }

        public QueryDentryResponseBodySpaceRecentList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDentryResponseBodySpaceRecentList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryDentryResponseBodySpaceRecentList setSpace(Object space) {
            this.space = space;
            return this;
        }
        public Object getSpace() {
            return this.space;
        }

        public QueryDentryResponseBodySpaceRecentList setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public QueryDentryResponseBodySpaceRecentList setStatisticalInfo(QueryDentryResponseBodySpaceRecentListStatisticalInfo statisticalInfo) {
            this.statisticalInfo = statisticalInfo;
            return this;
        }
        public QueryDentryResponseBodySpaceRecentListStatisticalInfo getStatisticalInfo() {
            return this.statisticalInfo;
        }

        public QueryDentryResponseBodySpaceRecentList setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public QueryDentryResponseBodySpaceRecentList setUpdater(QueryDentryResponseBodySpaceRecentListUpdater updater) {
            this.updater = updater;
            return this;
        }
        public QueryDentryResponseBodySpaceRecentListUpdater getUpdater() {
            return this.updater;
        }

        public QueryDentryResponseBodySpaceRecentList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryDentryResponseBodySpaceRecentList setVisitorInfo(QueryDentryResponseBodySpaceRecentListVisitorInfo visitorInfo) {
            this.visitorInfo = visitorInfo;
            return this;
        }
        public QueryDentryResponseBodySpaceRecentListVisitorInfo getVisitorInfo() {
            return this.visitorInfo;
        }

    }

    public static class QueryDentryResponseBodySpaceVisitorInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GET_DENTRY</p>
         */
        @NameInMap("DentryActions")
        public java.util.List<String> dentryActions;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RoleCode")
        public String roleCode;

        /**
         * <strong>example:</strong>
         * <p>GET_SPACE</p>
         */
        @NameInMap("SpaceActions")
        public java.util.List<String> spaceActions;

        public static QueryDentryResponseBodySpaceVisitorInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpaceVisitorInfo self = new QueryDentryResponseBodySpaceVisitorInfo();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpaceVisitorInfo setDentryActions(java.util.List<String> dentryActions) {
            this.dentryActions = dentryActions;
            return this;
        }
        public java.util.List<String> getDentryActions() {
            return this.dentryActions;
        }

        public QueryDentryResponseBodySpaceVisitorInfo setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public QueryDentryResponseBodySpaceVisitorInfo setSpaceActions(java.util.List<String> spaceActions) {
            this.spaceActions = spaceActions;
            return this;
        }
        public java.util.List<String> getSpaceActions() {
            return this.spaceActions;
        }

    }

    public static class QueryDentryResponseBodySpace extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i1/O1xxxxx.png">https://img.alicdn.com/imgextra/i1/O1xxxxx.png</a></p>
         */
        @NameInMap("Cover")
        public String cover;

        /**
         * <strong>example:</strong>
         * <p>这是简介</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("HdIconVO")
        public QueryDentryResponseBodySpaceHdIconVO hdIconVO;

        @NameInMap("IconVO")
        public QueryDentryResponseBodySpaceIconVO iconVO;

        /**
         * <strong>example:</strong>
         * <p>n9XJxxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>测试知识库</p>
         */
        @NameInMap("Owner")
        public QueryDentryResponseBodySpaceOwner owner;

        @NameInMap("RecentList")
        public java.util.List<QueryDentryResponseBodySpaceRecentList> recentList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://alidocs.dingtalk.com/i/spaces/n9XJ*******Xy/overview">https://alidocs.dingtalk.com/i/spaces/n9XJ*******Xy/overview</a></p>
         */
        @NameInMap("Url")
        public String url;

        @NameInMap("VisitorInfo")
        public QueryDentryResponseBodySpaceVisitorInfo visitorInfo;

        public static QueryDentryResponseBodySpace build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodySpace self = new QueryDentryResponseBodySpace();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodySpace setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public String getCover() {
            return this.cover;
        }

        public QueryDentryResponseBodySpace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryDentryResponseBodySpace setHdIconVO(QueryDentryResponseBodySpaceHdIconVO hdIconVO) {
            this.hdIconVO = hdIconVO;
            return this;
        }
        public QueryDentryResponseBodySpaceHdIconVO getHdIconVO() {
            return this.hdIconVO;
        }

        public QueryDentryResponseBodySpace setIconVO(QueryDentryResponseBodySpaceIconVO iconVO) {
            this.iconVO = iconVO;
            return this;
        }
        public QueryDentryResponseBodySpaceIconVO getIconVO() {
            return this.iconVO;
        }

        public QueryDentryResponseBodySpace setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDentryResponseBodySpace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDentryResponseBodySpace setOwner(QueryDentryResponseBodySpaceOwner owner) {
            this.owner = owner;
            return this;
        }
        public QueryDentryResponseBodySpaceOwner getOwner() {
            return this.owner;
        }

        public QueryDentryResponseBodySpace setRecentList(java.util.List<QueryDentryResponseBodySpaceRecentList> recentList) {
            this.recentList = recentList;
            return this;
        }
        public java.util.List<QueryDentryResponseBodySpaceRecentList> getRecentList() {
            return this.recentList;
        }

        public QueryDentryResponseBodySpace setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryDentryResponseBodySpace setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryDentryResponseBodySpace setVisitorInfo(QueryDentryResponseBodySpaceVisitorInfo visitorInfo) {
            this.visitorInfo = visitorInfo;
            return this;
        }
        public QueryDentryResponseBodySpaceVisitorInfo getVisitorInfo() {
            return this.visitorInfo;
        }

    }

    public static class QueryDentryResponseBodyUpdater extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryDentryResponseBodyUpdater build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodyUpdater self = new QueryDentryResponseBodyUpdater();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodyUpdater setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDentryResponseBodyUpdater setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryDentryResponseBodyVisitorInfo extends TeaModel {
        @NameInMap("DentryActions")
        public java.util.List<String> dentryActions;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RoleCode")
        public String roleCode;

        @NameInMap("SpaceActions")
        public java.util.List<String> spaceActions;

        public static QueryDentryResponseBodyVisitorInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryResponseBodyVisitorInfo self = new QueryDentryResponseBodyVisitorInfo();
            return TeaModel.build(map, self);
        }

        public QueryDentryResponseBodyVisitorInfo setDentryActions(java.util.List<String> dentryActions) {
            this.dentryActions = dentryActions;
            return this;
        }
        public java.util.List<String> getDentryActions() {
            return this.dentryActions;
        }

        public QueryDentryResponseBodyVisitorInfo setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public QueryDentryResponseBodyVisitorInfo setSpaceActions(java.util.List<String> spaceActions) {
            this.spaceActions = spaceActions;
            return this;
        }
        public java.util.List<String> getSpaceActions() {
            return this.spaceActions;
        }

    }

}
