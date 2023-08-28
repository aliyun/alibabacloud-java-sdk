// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryAvatarResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAvatarResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAvatarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarResponseBody self = new QueryAvatarResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAvatarResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAvatarResponseBody setData(QueryAvatarResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAvatarResponseBodyData getData() {
        return this.data;
    }

    public QueryAvatarResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAvatarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAvatarResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAvatarResponseBodyDataSupportedResolutionsOffline extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static QueryAvatarResponseBodyDataSupportedResolutionsOffline build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarResponseBodyDataSupportedResolutionsOffline self = new QueryAvatarResponseBodyDataSupportedResolutionsOffline();
            return TeaModel.build(map, self);
        }

        public QueryAvatarResponseBodyDataSupportedResolutionsOffline setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryAvatarResponseBodyDataSupportedResolutionsOffline setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public QueryAvatarResponseBodyDataSupportedResolutionsOffline setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class QueryAvatarResponseBodyDataSupportedResolutionsOnline extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        public static QueryAvatarResponseBodyDataSupportedResolutionsOnline build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarResponseBodyDataSupportedResolutionsOnline self = new QueryAvatarResponseBodyDataSupportedResolutionsOnline();
            return TeaModel.build(map, self);
        }

        public QueryAvatarResponseBodyDataSupportedResolutionsOnline setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryAvatarResponseBodyDataSupportedResolutionsOnline setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public QueryAvatarResponseBodyDataSupportedResolutionsOnline setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class QueryAvatarResponseBodyDataSupportedResolutions extends TeaModel {
        @NameInMap("Offline")
        public java.util.List<QueryAvatarResponseBodyDataSupportedResolutionsOffline> offline;

        @NameInMap("Online")
        public java.util.List<QueryAvatarResponseBodyDataSupportedResolutionsOnline> online;

        public static QueryAvatarResponseBodyDataSupportedResolutions build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarResponseBodyDataSupportedResolutions self = new QueryAvatarResponseBodyDataSupportedResolutions();
            return TeaModel.build(map, self);
        }

        public QueryAvatarResponseBodyDataSupportedResolutions setOffline(java.util.List<QueryAvatarResponseBodyDataSupportedResolutionsOffline> offline) {
            this.offline = offline;
            return this;
        }
        public java.util.List<QueryAvatarResponseBodyDataSupportedResolutionsOffline> getOffline() {
            return this.offline;
        }

        public QueryAvatarResponseBodyDataSupportedResolutions setOnline(java.util.List<QueryAvatarResponseBodyDataSupportedResolutionsOnline> online) {
            this.online = online;
            return this;
        }
        public java.util.List<QueryAvatarResponseBodyDataSupportedResolutionsOnline> getOnline() {
            return this.online;
        }

    }

    public static class QueryAvatarResponseBodyData extends TeaModel {
        @NameInMap("AllLocateImages")
        public java.util.Map<String, ?> allLocateImages;

        @NameInMap("AvatarType")
        public String avatarType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Image")
        public String image;

        @NameInMap("MakeFailReason")
        public String makeFailReason;

        @NameInMap("MakeStage")
        public String makeStage;

        @NameInMap("MakeStatus")
        public String makeStatus;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Portrait")
        public String portrait;

        @NameInMap("SupportedResolutions")
        public QueryAvatarResponseBodyDataSupportedResolutions supportedResolutions;

        public static QueryAvatarResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarResponseBodyData self = new QueryAvatarResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAvatarResponseBodyData setAllLocateImages(java.util.Map<String, ?> allLocateImages) {
            this.allLocateImages = allLocateImages;
            return this;
        }
        public java.util.Map<String, ?> getAllLocateImages() {
            return this.allLocateImages;
        }

        public QueryAvatarResponseBodyData setAvatarType(String avatarType) {
            this.avatarType = avatarType;
            return this;
        }
        public String getAvatarType() {
            return this.avatarType;
        }

        public QueryAvatarResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAvatarResponseBodyData setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public QueryAvatarResponseBodyData setMakeFailReason(String makeFailReason) {
            this.makeFailReason = makeFailReason;
            return this;
        }
        public String getMakeFailReason() {
            return this.makeFailReason;
        }

        public QueryAvatarResponseBodyData setMakeStage(String makeStage) {
            this.makeStage = makeStage;
            return this;
        }
        public String getMakeStage() {
            return this.makeStage;
        }

        public QueryAvatarResponseBodyData setMakeStatus(String makeStatus) {
            this.makeStatus = makeStatus;
            return this;
        }
        public String getMakeStatus() {
            return this.makeStatus;
        }

        public QueryAvatarResponseBodyData setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public QueryAvatarResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAvatarResponseBodyData setPortrait(String portrait) {
            this.portrait = portrait;
            return this;
        }
        public String getPortrait() {
            return this.portrait;
        }

        public QueryAvatarResponseBodyData setSupportedResolutions(QueryAvatarResponseBodyDataSupportedResolutions supportedResolutions) {
            this.supportedResolutions = supportedResolutions;
            return this;
        }
        public QueryAvatarResponseBodyDataSupportedResolutions getSupportedResolutions() {
            return this.supportedResolutions;
        }

    }

}
