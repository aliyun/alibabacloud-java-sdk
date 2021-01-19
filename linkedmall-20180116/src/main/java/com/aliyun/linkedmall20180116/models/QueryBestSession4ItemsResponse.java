// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBestSession4ItemsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LmItemActivitySessionModelList")
    @Validation(required = true)
    public QueryBestSession4ItemsResponseLmItemActivitySessionModelList lmItemActivitySessionModelList;

    public static QueryBestSession4ItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBestSession4ItemsResponse self = new QueryBestSession4ItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBestSession4ItemsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBestSession4ItemsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBestSession4ItemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBestSession4ItemsResponse setLmItemActivitySessionModelList(QueryBestSession4ItemsResponseLmItemActivitySessionModelList lmItemActivitySessionModelList) {
        this.lmItemActivitySessionModelList = lmItemActivitySessionModelList;
        return this;
    }
    public QueryBestSession4ItemsResponseLmItemActivitySessionModelList getLmItemActivitySessionModelList() {
        return this.lmItemActivitySessionModelList;
    }

    public static class QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel extends TeaModel {
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

        public static QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel self = new QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

    }

    public static class QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModel extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("LmActivitySessionModel")
        @Validation(required = true)
        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel lmActivitySessionModel;

        public static QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModel self = new QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModel setLmActivitySessionModel(QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel lmActivitySessionModel) {
            this.lmActivitySessionModel = lmActivitySessionModel;
            return this;
        }
        public QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel getLmActivitySessionModel() {
            return this.lmActivitySessionModel;
        }

    }

    public static class QueryBestSession4ItemsResponseLmItemActivitySessionModelList extends TeaModel {
        @NameInMap("LmItemActivitySessionModel")
        @Validation(required = true)
        public java.util.List<QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModel> lmItemActivitySessionModel;

        public static QueryBestSession4ItemsResponseLmItemActivitySessionModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryBestSession4ItemsResponseLmItemActivitySessionModelList self = new QueryBestSession4ItemsResponseLmItemActivitySessionModelList();
            return TeaModel.build(map, self);
        }

        public QueryBestSession4ItemsResponseLmItemActivitySessionModelList setLmItemActivitySessionModel(java.util.List<QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModel> lmItemActivitySessionModel) {
            this.lmItemActivitySessionModel = lmItemActivitySessionModel;
            return this;
        }
        public java.util.List<QueryBestSession4ItemsResponseLmItemActivitySessionModelListLmItemActivitySessionModel> getLmItemActivitySessionModel() {
            return this.lmItemActivitySessionModel;
        }

    }

}
