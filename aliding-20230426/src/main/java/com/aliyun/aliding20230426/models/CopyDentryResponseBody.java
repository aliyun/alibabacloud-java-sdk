// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CopyDentryResponseBody extends TeaModel {
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
    public java.util.Map<String, ?> creator;

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
    public CopyDentryResponseBodyLinkSourceInfo linkSourceInfo;

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
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("space")
    public CopyDentryResponseBodySpace space;

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

    /**
     * <strong>example:</strong>
     * <p>{\&quot;UserId\&quot;: \&quot;353851\&quot;, \&quot;Name\&quot;: u\&quot;\u848b\u7fbd\u4e2d\&quot;}</p>
     */
    @NameInMap("updater")
    public java.util.Map<String, ?> updater;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx.yy">https://xxx.yy</a></p>
     */
    @NameInMap("url")
    public String url;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    @NameInMap("visitorInfo")
    public java.util.Map<String, ?> visitorInfo;

    public static CopyDentryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyDentryResponseBody self = new CopyDentryResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyDentryResponseBody setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CopyDentryResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public CopyDentryResponseBody setCreator(java.util.Map<String, ?> creator) {
        this.creator = creator;
        return this;
    }
    public java.util.Map<String, ?> getCreator() {
        return this.creator;
    }

    public CopyDentryResponseBody setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public CopyDentryResponseBody setDentryType(String dentryType) {
        this.dentryType = dentryType;
        return this;
    }
    public String getDentryType() {
        return this.dentryType;
    }

    public CopyDentryResponseBody setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public CopyDentryResponseBody setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public CopyDentryResponseBody setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public CopyDentryResponseBody setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
        return this;
    }
    public Boolean getHasChildren() {
        return this.hasChildren;
    }

    public CopyDentryResponseBody setLinkSourceInfo(CopyDentryResponseBodyLinkSourceInfo linkSourceInfo) {
        this.linkSourceInfo = linkSourceInfo;
        return this;
    }
    public CopyDentryResponseBodyLinkSourceInfo getLinkSourceInfo() {
        return this.linkSourceInfo;
    }

    public CopyDentryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopyDentryResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CopyDentryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyDentryResponseBody setSpace(CopyDentryResponseBodySpace space) {
        this.space = space;
        return this;
    }
    public CopyDentryResponseBodySpace getSpace() {
        return this.space;
    }

    public CopyDentryResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public CopyDentryResponseBody setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

    public CopyDentryResponseBody setUpdater(java.util.Map<String, ?> updater) {
        this.updater = updater;
        return this;
    }
    public java.util.Map<String, ?> getUpdater() {
        return this.updater;
    }

    public CopyDentryResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CopyDentryResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public CopyDentryResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public CopyDentryResponseBody setVisitorInfo(java.util.Map<String, ?> visitorInfo) {
        this.visitorInfo = visitorInfo;
        return this;
    }
    public java.util.Map<String, ?> getVisitorInfo() {
        return this.visitorInfo;
    }

    public static class CopyDentryResponseBodyLinkSourceInfoIconUrl extends TeaModel {
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

        public static CopyDentryResponseBodyLinkSourceInfoIconUrl build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodyLinkSourceInfoIconUrl self = new CopyDentryResponseBodyLinkSourceInfoIconUrl();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodyLinkSourceInfoIconUrl setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public CopyDentryResponseBodyLinkSourceInfoIconUrl setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class CopyDentryResponseBodyLinkSourceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("Extension")
        public String extension;

        @NameInMap("IconUrl")
        public CopyDentryResponseBodyLinkSourceInfoIconUrl iconUrl;

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

        public static CopyDentryResponseBodyLinkSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodyLinkSourceInfo self = new CopyDentryResponseBodyLinkSourceInfo();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodyLinkSourceInfo setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CopyDentryResponseBodyLinkSourceInfo setIconUrl(CopyDentryResponseBodyLinkSourceInfoIconUrl iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public CopyDentryResponseBodyLinkSourceInfoIconUrl getIconUrl() {
            return this.iconUrl;
        }

        public CopyDentryResponseBodyLinkSourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CopyDentryResponseBodyLinkSourceInfo setLinkType(Long linkType) {
            this.linkType = linkType;
            return this;
        }
        public Long getLinkType() {
            return this.linkType;
        }

        public CopyDentryResponseBodyLinkSourceInfo setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

    }

    public static class CopyDentryResponseBodySpaceHdIconVO extends TeaModel {
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

        public static CopyDentryResponseBodySpaceHdIconVO build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceHdIconVO self = new CopyDentryResponseBodySpaceHdIconVO();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceHdIconVO setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public CopyDentryResponseBodySpaceHdIconVO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CopyDentryResponseBodySpaceIconVO extends TeaModel {
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

        public static CopyDentryResponseBodySpaceIconVO build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceIconVO self = new CopyDentryResponseBodySpaceIconVO();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceIconVO setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public CopyDentryResponseBodySpaceIconVO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CopyDentryResponseBodySpaceOwner extends TeaModel {
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

        public static CopyDentryResponseBodySpaceOwner build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceOwner self = new CopyDentryResponseBodySpaceOwner();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceOwner setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CopyDentryResponseBodySpaceOwner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CopyDentryResponseBodySpaceRecentListCreator extends TeaModel {
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

        public static CopyDentryResponseBodySpaceRecentListCreator build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceRecentListCreator self = new CopyDentryResponseBodySpaceRecentListCreator();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceRecentListCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CopyDentryResponseBodySpaceRecentListCreator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CopyDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl extends TeaModel {
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

        public static CopyDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl self = new CopyDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public CopyDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class CopyDentryResponseBodySpaceRecentListLinkSourceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("Extension")
        public String extension;

        @NameInMap("IconUrl")
        public CopyDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl iconUrl;

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

        public static CopyDentryResponseBodySpaceRecentListLinkSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceRecentListLinkSourceInfo self = new CopyDentryResponseBodySpaceRecentListLinkSourceInfo();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceRecentListLinkSourceInfo setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CopyDentryResponseBodySpaceRecentListLinkSourceInfo setIconUrl(CopyDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public CopyDentryResponseBodySpaceRecentListLinkSourceInfoIconUrl getIconUrl() {
            return this.iconUrl;
        }

        public CopyDentryResponseBodySpaceRecentListLinkSourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CopyDentryResponseBodySpaceRecentListLinkSourceInfo setLinkType(Long linkType) {
            this.linkType = linkType;
            return this;
        }
        public Long getLinkType() {
            return this.linkType;
        }

        public CopyDentryResponseBodySpaceRecentListLinkSourceInfo setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

    }

    public static class CopyDentryResponseBodySpaceRecentListStatisticalInfo extends TeaModel {
        @NameInMap("WordCount")
        public Long wordCount;

        public static CopyDentryResponseBodySpaceRecentListStatisticalInfo build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceRecentListStatisticalInfo self = new CopyDentryResponseBodySpaceRecentListStatisticalInfo();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceRecentListStatisticalInfo setWordCount(Long wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Long getWordCount() {
            return this.wordCount;
        }

    }

    public static class CopyDentryResponseBodySpaceRecentListUpdater extends TeaModel {
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

        public static CopyDentryResponseBodySpaceRecentListUpdater build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceRecentListUpdater self = new CopyDentryResponseBodySpaceRecentListUpdater();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceRecentListUpdater setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CopyDentryResponseBodySpaceRecentListUpdater setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CopyDentryResponseBodySpaceRecentListVisitorInfo extends TeaModel {
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

        public static CopyDentryResponseBodySpaceRecentListVisitorInfo build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceRecentListVisitorInfo self = new CopyDentryResponseBodySpaceRecentListVisitorInfo();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceRecentListVisitorInfo setDentryActions(java.util.List<String> dentryActions) {
            this.dentryActions = dentryActions;
            return this;
        }
        public java.util.List<String> getDentryActions() {
            return this.dentryActions;
        }

        public CopyDentryResponseBodySpaceRecentListVisitorInfo setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public CopyDentryResponseBodySpaceRecentListVisitorInfo setSpaceActions(java.util.List<String> spaceActions) {
            this.spaceActions = spaceActions;
            return this;
        }
        public java.util.List<String> getSpaceActions() {
            return this.spaceActions;
        }

    }

    public static class CopyDentryResponseBodySpaceRecentList extends TeaModel {
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
        public CopyDentryResponseBodySpaceRecentListCreator creator;

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
        public CopyDentryResponseBodySpaceRecentListLinkSourceInfo linkSourceInfo;

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
        public CopyDentryResponseBodySpaceRecentListStatisticalInfo statisticalInfo;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        @NameInMap("Updater")
        public CopyDentryResponseBodySpaceRecentListUpdater updater;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx.yy">https://xxx.yy</a></p>
         */
        @NameInMap("Url")
        public String url;

        @NameInMap("VisitorInfo")
        public CopyDentryResponseBodySpaceRecentListVisitorInfo visitorInfo;

        public static CopyDentryResponseBodySpaceRecentList build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceRecentList self = new CopyDentryResponseBodySpaceRecentList();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceRecentList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CopyDentryResponseBodySpaceRecentList setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public CopyDentryResponseBodySpaceRecentList setCreator(CopyDentryResponseBodySpaceRecentListCreator creator) {
            this.creator = creator;
            return this;
        }
        public CopyDentryResponseBodySpaceRecentListCreator getCreator() {
            return this.creator;
        }

        public CopyDentryResponseBodySpaceRecentList setDentryId(String dentryId) {
            this.dentryId = dentryId;
            return this;
        }
        public String getDentryId() {
            return this.dentryId;
        }

        public CopyDentryResponseBodySpaceRecentList setDentryType(String dentryType) {
            this.dentryType = dentryType;
            return this;
        }
        public String getDentryType() {
            return this.dentryType;
        }

        public CopyDentryResponseBodySpaceRecentList setDentryUuid(String dentryUuid) {
            this.dentryUuid = dentryUuid;
            return this;
        }
        public String getDentryUuid() {
            return this.dentryUuid;
        }

        public CopyDentryResponseBodySpaceRecentList setDocKey(String docKey) {
            this.docKey = docKey;
            return this;
        }
        public String getDocKey() {
            return this.docKey;
        }

        public CopyDentryResponseBodySpaceRecentList setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CopyDentryResponseBodySpaceRecentList setHasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        public CopyDentryResponseBodySpaceRecentList setLinkSourceInfo(CopyDentryResponseBodySpaceRecentListLinkSourceInfo linkSourceInfo) {
            this.linkSourceInfo = linkSourceInfo;
            return this;
        }
        public CopyDentryResponseBodySpaceRecentListLinkSourceInfo getLinkSourceInfo() {
            return this.linkSourceInfo;
        }

        public CopyDentryResponseBodySpaceRecentList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CopyDentryResponseBodySpaceRecentList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CopyDentryResponseBodySpaceRecentList setSpace(Object space) {
            this.space = space;
            return this;
        }
        public Object getSpace() {
            return this.space;
        }

        public CopyDentryResponseBodySpaceRecentList setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public CopyDentryResponseBodySpaceRecentList setStatisticalInfo(CopyDentryResponseBodySpaceRecentListStatisticalInfo statisticalInfo) {
            this.statisticalInfo = statisticalInfo;
            return this;
        }
        public CopyDentryResponseBodySpaceRecentListStatisticalInfo getStatisticalInfo() {
            return this.statisticalInfo;
        }

        public CopyDentryResponseBodySpaceRecentList setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public CopyDentryResponseBodySpaceRecentList setUpdater(CopyDentryResponseBodySpaceRecentListUpdater updater) {
            this.updater = updater;
            return this;
        }
        public CopyDentryResponseBodySpaceRecentListUpdater getUpdater() {
            return this.updater;
        }

        public CopyDentryResponseBodySpaceRecentList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CopyDentryResponseBodySpaceRecentList setVisitorInfo(CopyDentryResponseBodySpaceRecentListVisitorInfo visitorInfo) {
            this.visitorInfo = visitorInfo;
            return this;
        }
        public CopyDentryResponseBodySpaceRecentListVisitorInfo getVisitorInfo() {
            return this.visitorInfo;
        }

    }

    public static class CopyDentryResponseBodySpaceVisitorInfo extends TeaModel {
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

        public static CopyDentryResponseBodySpaceVisitorInfo build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpaceVisitorInfo self = new CopyDentryResponseBodySpaceVisitorInfo();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpaceVisitorInfo setDentryActions(java.util.List<String> dentryActions) {
            this.dentryActions = dentryActions;
            return this;
        }
        public java.util.List<String> getDentryActions() {
            return this.dentryActions;
        }

        public CopyDentryResponseBodySpaceVisitorInfo setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public CopyDentryResponseBodySpaceVisitorInfo setSpaceActions(java.util.List<String> spaceActions) {
            this.spaceActions = spaceActions;
            return this;
        }
        public java.util.List<String> getSpaceActions() {
            return this.spaceActions;
        }

    }

    public static class CopyDentryResponseBodySpace extends TeaModel {
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
        public CopyDentryResponseBodySpaceHdIconVO hdIconVO;

        @NameInMap("IconVO")
        public CopyDentryResponseBodySpaceIconVO iconVO;

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
        public CopyDentryResponseBodySpaceOwner owner;

        @NameInMap("RecentList")
        public java.util.List<CopyDentryResponseBodySpaceRecentList> recentList;

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
        public CopyDentryResponseBodySpaceVisitorInfo visitorInfo;

        public static CopyDentryResponseBodySpace build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryResponseBodySpace self = new CopyDentryResponseBodySpace();
            return TeaModel.build(map, self);
        }

        public CopyDentryResponseBodySpace setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public String getCover() {
            return this.cover;
        }

        public CopyDentryResponseBodySpace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CopyDentryResponseBodySpace setHdIconVO(CopyDentryResponseBodySpaceHdIconVO hdIconVO) {
            this.hdIconVO = hdIconVO;
            return this;
        }
        public CopyDentryResponseBodySpaceHdIconVO getHdIconVO() {
            return this.hdIconVO;
        }

        public CopyDentryResponseBodySpace setIconVO(CopyDentryResponseBodySpaceIconVO iconVO) {
            this.iconVO = iconVO;
            return this;
        }
        public CopyDentryResponseBodySpaceIconVO getIconVO() {
            return this.iconVO;
        }

        public CopyDentryResponseBodySpace setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CopyDentryResponseBodySpace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CopyDentryResponseBodySpace setOwner(CopyDentryResponseBodySpaceOwner owner) {
            this.owner = owner;
            return this;
        }
        public CopyDentryResponseBodySpaceOwner getOwner() {
            return this.owner;
        }

        public CopyDentryResponseBodySpace setRecentList(java.util.List<CopyDentryResponseBodySpaceRecentList> recentList) {
            this.recentList = recentList;
            return this;
        }
        public java.util.List<CopyDentryResponseBodySpaceRecentList> getRecentList() {
            return this.recentList;
        }

        public CopyDentryResponseBodySpace setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public CopyDentryResponseBodySpace setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CopyDentryResponseBodySpace setVisitorInfo(CopyDentryResponseBodySpaceVisitorInfo visitorInfo) {
            this.visitorInfo = visitorInfo;
            return this;
        }
        public CopyDentryResponseBodySpaceVisitorInfo getVisitorInfo() {
            return this.visitorInfo;
        }

    }

}
