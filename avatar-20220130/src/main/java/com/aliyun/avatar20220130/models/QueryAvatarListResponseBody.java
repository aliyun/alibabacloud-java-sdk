// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryAvatarListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAvatarListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAvatarListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarListResponseBody self = new QueryAvatarListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAvatarListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAvatarListResponseBody setData(QueryAvatarListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAvatarListResponseBodyData getData() {
        return this.data;
    }

    public QueryAvatarListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAvatarListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAvatarListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAvatarListResponseBodyDataListSupportedResolutionsOffline extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static QueryAvatarListResponseBodyDataListSupportedResolutionsOffline build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarListResponseBodyDataListSupportedResolutionsOffline self = new QueryAvatarListResponseBodyDataListSupportedResolutionsOffline();
            return TeaModel.build(map, self);
        }

        public QueryAvatarListResponseBodyDataListSupportedResolutionsOffline setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryAvatarListResponseBodyDataListSupportedResolutionsOffline setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public QueryAvatarListResponseBodyDataListSupportedResolutionsOffline setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class QueryAvatarListResponseBodyDataListSupportedResolutionsOnline extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static QueryAvatarListResponseBodyDataListSupportedResolutionsOnline build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarListResponseBodyDataListSupportedResolutionsOnline self = new QueryAvatarListResponseBodyDataListSupportedResolutionsOnline();
            return TeaModel.build(map, self);
        }

        public QueryAvatarListResponseBodyDataListSupportedResolutionsOnline setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryAvatarListResponseBodyDataListSupportedResolutionsOnline setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public QueryAvatarListResponseBodyDataListSupportedResolutionsOnline setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class QueryAvatarListResponseBodyDataListSupportedResolutions extends TeaModel {
        @NameInMap("Offline")
        public java.util.List<QueryAvatarListResponseBodyDataListSupportedResolutionsOffline> offline;

        @NameInMap("Online")
        public java.util.List<QueryAvatarListResponseBodyDataListSupportedResolutionsOnline> online;

        public static QueryAvatarListResponseBodyDataListSupportedResolutions build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarListResponseBodyDataListSupportedResolutions self = new QueryAvatarListResponseBodyDataListSupportedResolutions();
            return TeaModel.build(map, self);
        }

        public QueryAvatarListResponseBodyDataListSupportedResolutions setOffline(java.util.List<QueryAvatarListResponseBodyDataListSupportedResolutionsOffline> offline) {
            this.offline = offline;
            return this;
        }
        public java.util.List<QueryAvatarListResponseBodyDataListSupportedResolutionsOffline> getOffline() {
            return this.offline;
        }

        public QueryAvatarListResponseBodyDataListSupportedResolutions setOnline(java.util.List<QueryAvatarListResponseBodyDataListSupportedResolutionsOnline> online) {
            this.online = online;
            return this;
        }
        public java.util.List<QueryAvatarListResponseBodyDataListSupportedResolutionsOnline> getOnline() {
            return this.online;
        }

    }

    public static class QueryAvatarListResponseBodyDataList extends TeaModel {
        @NameInMap("AvatarType")
        public String avatarType;

        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("Image")
        public String image;

        @NameInMap("MakeFailReason")
        public String makeFailReason;

        @NameInMap("MakeStatus")
        public String makeStatus;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Portrait")
        public String portrait;

        @NameInMap("SupportedResolutions")
        public QueryAvatarListResponseBodyDataListSupportedResolutions supportedResolutions;

        public static QueryAvatarListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarListResponseBodyDataList self = new QueryAvatarListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryAvatarListResponseBodyDataList setAvatarType(String avatarType) {
            this.avatarType = avatarType;
            return this;
        }
        public String getAvatarType() {
            return this.avatarType;
        }

        public QueryAvatarListResponseBodyDataList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryAvatarListResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAvatarListResponseBodyDataList setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public QueryAvatarListResponseBodyDataList setMakeFailReason(String makeFailReason) {
            this.makeFailReason = makeFailReason;
            return this;
        }
        public String getMakeFailReason() {
            return this.makeFailReason;
        }

        public QueryAvatarListResponseBodyDataList setMakeStatus(String makeStatus) {
            this.makeStatus = makeStatus;
            return this;
        }
        public String getMakeStatus() {
            return this.makeStatus;
        }

        public QueryAvatarListResponseBodyDataList setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public QueryAvatarListResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAvatarListResponseBodyDataList setPortrait(String portrait) {
            this.portrait = portrait;
            return this;
        }
        public String getPortrait() {
            return this.portrait;
        }

        public QueryAvatarListResponseBodyDataList setSupportedResolutions(QueryAvatarListResponseBodyDataListSupportedResolutions supportedResolutions) {
            this.supportedResolutions = supportedResolutions;
            return this;
        }
        public QueryAvatarListResponseBodyDataListSupportedResolutions getSupportedResolutions() {
            return this.supportedResolutions;
        }

    }

    public static class QueryAvatarListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryAvatarListResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryAvatarListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarListResponseBodyData self = new QueryAvatarListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAvatarListResponseBodyData setList(java.util.List<QueryAvatarListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAvatarListResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryAvatarListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryAvatarListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAvatarListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryAvatarListResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
