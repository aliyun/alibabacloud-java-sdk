// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBestSession4ItemsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("LmItemActivitySessionModelList")
    public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelList lmItemActivitySessionModelList;

    public static QueryBestSession4ItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBestSession4ItemsResponseBody self = new QueryBestSession4ItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBestSession4ItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBestSession4ItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBestSession4ItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBestSession4ItemsResponseBody setLmItemActivitySessionModelList(QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelList lmItemActivitySessionModelList) {
        this.lmItemActivitySessionModelList = lmItemActivitySessionModelList;
        return this;
    }
    public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelList getLmItemActivitySessionModelList() {
        return this.lmItemActivitySessionModelList;
    }

    public static class QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel extends TeaModel {
        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("DisplayDate")
        public String displayDate;

        @NameInMap("LmSessionId")
        public Long lmSessionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("LmActivityId")
        public Long lmActivityId;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        public static QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel self = new QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

    }

    public static class QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel extends TeaModel {
        @NameInMap("LmActivitySessionModel")
        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel lmActivitySessionModel;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("ItemId")
        public Long itemId;

        public static QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel self = new QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel setLmActivitySessionModel(QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel lmActivitySessionModel) {
            this.lmActivitySessionModel = lmActivitySessionModel;
            return this;
        }
        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel getLmActivitySessionModel() {
            return this.lmActivitySessionModel;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

    }

    public static class QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelList extends TeaModel {
        @NameInMap("LmItemActivitySessionModel")
        public java.util.List<QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel> lmItemActivitySessionModel;

        public static QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelList self = new QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelList();
            return TeaModel.build(map, self);
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelList setLmItemActivitySessionModel(java.util.List<QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel> lmItemActivitySessionModel) {
            this.lmItemActivitySessionModel = lmItemActivitySessionModel;
            return this;
        }
        public java.util.List<QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel> getLmItemActivitySessionModel() {
            return this.lmItemActivitySessionModel;
        }

    }

}
