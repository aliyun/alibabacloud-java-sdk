// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedSessions4ItemsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LmItemActivitySessionModelListList")
    @Validation(required = true)
    public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListList lmItemActivitySessionModelListList;

    public static QueryUnfinishedSessions4ItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedSessions4ItemsResponse self = new QueryUnfinishedSessions4ItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedSessions4ItemsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUnfinishedSessions4ItemsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUnfinishedSessions4ItemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUnfinishedSessions4ItemsResponse setLmItemActivitySessionModelListList(QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListList lmItemActivitySessionModelListList) {
        this.lmItemActivitySessionModelListList = lmItemActivitySessionModelListList;
        return this;
    }
    public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListList getLmItemActivitySessionModelListList() {
        return this.lmItemActivitySessionModelListList;
    }

    public static class QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel extends TeaModel {
        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DisplayDate")
        @Validation(required = true)
        public String displayDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> extInfo;

        @NameInMap("LmActivityId")
        @Validation(required = true)
        public Long lmActivityId;

        @NameInMap("LmSessionId")
        @Validation(required = true)
        public Long lmSessionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("SubBizCode")
        @Validation(required = true)
        public String subBizCode;

        public static QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel self = new QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

    }

    public static class QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels extends TeaModel {
        @NameInMap("LmActivitySessionModel")
        @Validation(required = true)
        public java.util.List<QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel> lmActivitySessionModel;

        public static QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels self = new QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels setLmActivitySessionModel(java.util.List<QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel> lmActivitySessionModel) {
            this.lmActivitySessionModel = lmActivitySessionModel;
            return this;
        }
        public java.util.List<QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel> getLmActivitySessionModel() {
            return this.lmActivitySessionModel;
        }

    }

    public static class QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelList extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("LmActivitySessionModels")
        @Validation(required = true)
        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels lmActivitySessionModels;

        public static QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelList self = new QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelList();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelList setLmActivitySessionModels(QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels lmActivitySessionModels) {
            this.lmActivitySessionModels = lmActivitySessionModels;
            return this;
        }
        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels getLmActivitySessionModels() {
            return this.lmActivitySessionModels;
        }

    }

    public static class QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListList extends TeaModel {
        @NameInMap("LmItemActivitySessionModelList")
        @Validation(required = true)
        public java.util.List<QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelList> lmItemActivitySessionModelList;

        public static QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListList build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListList self = new QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListList();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListList setLmItemActivitySessionModelList(java.util.List<QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelList> lmItemActivitySessionModelList) {
            this.lmItemActivitySessionModelList = lmItemActivitySessionModelList;
            return this;
        }
        public java.util.List<QueryUnfinishedSessions4ItemsResponseLmItemActivitySessionModelListListLmItemActivitySessionModelList> getLmItemActivitySessionModelList() {
            return this.lmItemActivitySessionModelList;
        }

    }

}
