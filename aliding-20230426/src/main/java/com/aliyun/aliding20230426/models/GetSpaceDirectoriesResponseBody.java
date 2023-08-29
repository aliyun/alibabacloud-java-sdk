// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSpaceDirectoriesResponseBody extends TeaModel {
    @NameInMap("children")
    public java.util.List<GetSpaceDirectoriesResponseBodyChildren> children;

    @NameInMap("hasMore")
    public Boolean hasMore;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSpaceDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceDirectoriesResponseBody self = new GetSpaceDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpaceDirectoriesResponseBody setChildren(java.util.List<GetSpaceDirectoriesResponseBodyChildren> children) {
        this.children = children;
        return this;
    }
    public java.util.List<GetSpaceDirectoriesResponseBodyChildren> getChildren() {
        return this.children;
    }

    public GetSpaceDirectoriesResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public GetSpaceDirectoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetSpaceDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSpaceDirectoriesResponseBodyChildrenCreator extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("UserId")
        public String userId;

        public static GetSpaceDirectoriesResponseBodyChildrenCreator build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenCreator self = new GetSpaceDirectoriesResponseBodyChildrenCreator();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSpaceDirectoriesResponseBodyChildrenCreator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfoIconUrl extends TeaModel {
        @NameInMap("Line")
        public String line;

        @NameInMap("Small")
        public String small;

        public static GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfoIconUrl build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfoIconUrl self = new GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfoIconUrl();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfoIconUrl setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfoIconUrl setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo extends TeaModel {
        @NameInMap("Extension")
        public String extension;

        @NameInMap("IconUrl")
        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfoIconUrl iconUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("LinkType")
        public Long linkType;

        @NameInMap("SpaceId")
        public String spaceId;

        public static GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo self = new GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo setIconUrl(GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfoIconUrl iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfoIconUrl getIconUrl() {
            return this.iconUrl;
        }

        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo setLinkType(Long linkType) {
            this.linkType = linkType;
            return this;
        }
        public Long getLinkType() {
            return this.linkType;
        }

        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildrenSpaceHdIconVO extends TeaModel {
        @NameInMap("Icon")
        public String icon;

        @NameInMap("Type")
        public String type;

        public static GetSpaceDirectoriesResponseBodyChildrenSpaceHdIconVO build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenSpaceHdIconVO self = new GetSpaceDirectoriesResponseBodyChildrenSpaceHdIconVO();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpaceHdIconVO setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpaceHdIconVO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildrenSpaceIconVO extends TeaModel {
        @NameInMap("Icon")
        public String icon;

        @NameInMap("Type")
        public String type;

        public static GetSpaceDirectoriesResponseBodyChildrenSpaceIconVO build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenSpaceIconVO self = new GetSpaceDirectoriesResponseBodyChildrenSpaceIconVO();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpaceIconVO setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpaceIconVO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildrenSpaceOwner extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("UserId")
        public String userId;

        public static GetSpaceDirectoriesResponseBodyChildrenSpaceOwner build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenSpaceOwner self = new GetSpaceDirectoriesResponseBodyChildrenSpaceOwner();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpaceOwner setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpaceOwner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildrenSpaceVisitorInfo extends TeaModel {
        @NameInMap("DentryActions")
        public java.util.List<String> dentryActions;

        @NameInMap("RoleCode")
        public String roleCode;

        @NameInMap("SpaceActions")
        public java.util.List<String> spaceActions;

        public static GetSpaceDirectoriesResponseBodyChildrenSpaceVisitorInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenSpaceVisitorInfo self = new GetSpaceDirectoriesResponseBodyChildrenSpaceVisitorInfo();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpaceVisitorInfo setDentryActions(java.util.List<String> dentryActions) {
            this.dentryActions = dentryActions;
            return this;
        }
        public java.util.List<String> getDentryActions() {
            return this.dentryActions;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpaceVisitorInfo setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpaceVisitorInfo setSpaceActions(java.util.List<String> spaceActions) {
            this.spaceActions = spaceActions;
            return this;
        }
        public java.util.List<String> getSpaceActions() {
            return this.spaceActions;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildrenSpace extends TeaModel {
        @NameInMap("Cover")
        public String cover;

        @NameInMap("Description")
        public String description;

        @NameInMap("HdIconVO")
        public GetSpaceDirectoriesResponseBodyChildrenSpaceHdIconVO hdIconVO;

        @NameInMap("IconVO")
        public GetSpaceDirectoriesResponseBodyChildrenSpaceIconVO iconVO;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public GetSpaceDirectoriesResponseBodyChildrenSpaceOwner owner;

        @NameInMap("RecentList")
        public java.util.List<?> recentList;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Url")
        public String url;

        @NameInMap("VisitorInfo")
        public GetSpaceDirectoriesResponseBodyChildrenSpaceVisitorInfo visitorInfo;

        public static GetSpaceDirectoriesResponseBodyChildrenSpace build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenSpace self = new GetSpaceDirectoriesResponseBodyChildrenSpace();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setCover(String cover) {
            this.cover = cover;
            return this;
        }
        public String getCover() {
            return this.cover;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setHdIconVO(GetSpaceDirectoriesResponseBodyChildrenSpaceHdIconVO hdIconVO) {
            this.hdIconVO = hdIconVO;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenSpaceHdIconVO getHdIconVO() {
            return this.hdIconVO;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setIconVO(GetSpaceDirectoriesResponseBodyChildrenSpaceIconVO iconVO) {
            this.iconVO = iconVO;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenSpaceIconVO getIconVO() {
            return this.iconVO;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setOwner(GetSpaceDirectoriesResponseBodyChildrenSpaceOwner owner) {
            this.owner = owner;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenSpaceOwner getOwner() {
            return this.owner;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setRecentList(java.util.List<?> recentList) {
            this.recentList = recentList;
            return this;
        }
        public java.util.List<?> getRecentList() {
            return this.recentList;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetSpaceDirectoriesResponseBodyChildrenSpace setVisitorInfo(GetSpaceDirectoriesResponseBodyChildrenSpaceVisitorInfo visitorInfo) {
            this.visitorInfo = visitorInfo;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenSpaceVisitorInfo getVisitorInfo() {
            return this.visitorInfo;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildrenStatisticalInfo extends TeaModel {
        /**
         * <p>WordCount</p>
         */
        @NameInMap("WordCount")
        public Long wordCount;

        public static GetSpaceDirectoriesResponseBodyChildrenStatisticalInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenStatisticalInfo self = new GetSpaceDirectoriesResponseBodyChildrenStatisticalInfo();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenStatisticalInfo setWordCount(Long wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Long getWordCount() {
            return this.wordCount;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildrenUpdater extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("UserId")
        public String userId;

        public static GetSpaceDirectoriesResponseBodyChildrenUpdater build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenUpdater self = new GetSpaceDirectoriesResponseBodyChildrenUpdater();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenUpdater setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSpaceDirectoriesResponseBodyChildrenUpdater setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildrenVisitorInfo extends TeaModel {
        @NameInMap("DentryActions")
        public java.util.List<String> dentryActions;

        @NameInMap("RoleCode")
        public String roleCode;

        @NameInMap("SpaceActions")
        public java.util.List<String> spaceActions;

        public static GetSpaceDirectoriesResponseBodyChildrenVisitorInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildrenVisitorInfo self = new GetSpaceDirectoriesResponseBodyChildrenVisitorInfo();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildrenVisitorInfo setDentryActions(java.util.List<String> dentryActions) {
            this.dentryActions = dentryActions;
            return this;
        }
        public java.util.List<String> getDentryActions() {
            return this.dentryActions;
        }

        public GetSpaceDirectoriesResponseBodyChildrenVisitorInfo setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public GetSpaceDirectoriesResponseBodyChildrenVisitorInfo setSpaceActions(java.util.List<String> spaceActions) {
            this.spaceActions = spaceActions;
            return this;
        }
        public java.util.List<String> getSpaceActions() {
            return this.spaceActions;
        }

    }

    public static class GetSpaceDirectoriesResponseBodyChildren extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Creator")
        public GetSpaceDirectoriesResponseBodyChildrenCreator creator;

        @NameInMap("DentryId")
        public String dentryId;

        @NameInMap("DentryType")
        public String dentryType;

        @NameInMap("DentryUuid")
        public String dentryUuid;

        @NameInMap("DocKey")
        public String docKey;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("HasChildren")
        public Boolean hasChildren;

        @NameInMap("LinkSourceInfo")
        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo linkSourceInfo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        @NameInMap("Space")
        public GetSpaceDirectoriesResponseBodyChildrenSpace space;

        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("StatisticalInfo")
        public GetSpaceDirectoriesResponseBodyChildrenStatisticalInfo statisticalInfo;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        @NameInMap("Updater")
        public GetSpaceDirectoriesResponseBodyChildrenUpdater updater;

        @NameInMap("Url")
        public String url;

        @NameInMap("VisitorInfo")
        public GetSpaceDirectoriesResponseBodyChildrenVisitorInfo visitorInfo;

        public static GetSpaceDirectoriesResponseBodyChildren build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesResponseBodyChildren self = new GetSpaceDirectoriesResponseBodyChildren();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesResponseBodyChildren setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetSpaceDirectoriesResponseBodyChildren setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetSpaceDirectoriesResponseBodyChildren setCreator(GetSpaceDirectoriesResponseBodyChildrenCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenCreator getCreator() {
            return this.creator;
        }

        public GetSpaceDirectoriesResponseBodyChildren setDentryId(String dentryId) {
            this.dentryId = dentryId;
            return this;
        }
        public String getDentryId() {
            return this.dentryId;
        }

        public GetSpaceDirectoriesResponseBodyChildren setDentryType(String dentryType) {
            this.dentryType = dentryType;
            return this;
        }
        public String getDentryType() {
            return this.dentryType;
        }

        public GetSpaceDirectoriesResponseBodyChildren setDentryUuid(String dentryUuid) {
            this.dentryUuid = dentryUuid;
            return this;
        }
        public String getDentryUuid() {
            return this.dentryUuid;
        }

        public GetSpaceDirectoriesResponseBodyChildren setDocKey(String docKey) {
            this.docKey = docKey;
            return this;
        }
        public String getDocKey() {
            return this.docKey;
        }

        public GetSpaceDirectoriesResponseBodyChildren setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetSpaceDirectoriesResponseBodyChildren setHasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        public GetSpaceDirectoriesResponseBodyChildren setLinkSourceInfo(GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo linkSourceInfo) {
            this.linkSourceInfo = linkSourceInfo;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenLinkSourceInfo getLinkSourceInfo() {
            return this.linkSourceInfo;
        }

        public GetSpaceDirectoriesResponseBodyChildren setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSpaceDirectoriesResponseBodyChildren setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetSpaceDirectoriesResponseBodyChildren setSpace(GetSpaceDirectoriesResponseBodyChildrenSpace space) {
            this.space = space;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenSpace getSpace() {
            return this.space;
        }

        public GetSpaceDirectoriesResponseBodyChildren setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public GetSpaceDirectoriesResponseBodyChildren setStatisticalInfo(GetSpaceDirectoriesResponseBodyChildrenStatisticalInfo statisticalInfo) {
            this.statisticalInfo = statisticalInfo;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenStatisticalInfo getStatisticalInfo() {
            return this.statisticalInfo;
        }

        public GetSpaceDirectoriesResponseBodyChildren setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public GetSpaceDirectoriesResponseBodyChildren setUpdater(GetSpaceDirectoriesResponseBodyChildrenUpdater updater) {
            this.updater = updater;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenUpdater getUpdater() {
            return this.updater;
        }

        public GetSpaceDirectoriesResponseBodyChildren setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetSpaceDirectoriesResponseBodyChildren setVisitorInfo(GetSpaceDirectoriesResponseBodyChildrenVisitorInfo visitorInfo) {
            this.visitorInfo = visitorInfo;
            return this;
        }
        public GetSpaceDirectoriesResponseBodyChildrenVisitorInfo getVisitorInfo() {
            return this.visitorInfo;
        }

    }

}
