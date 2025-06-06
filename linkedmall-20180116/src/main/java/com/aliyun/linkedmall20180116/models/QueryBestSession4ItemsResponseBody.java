// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBestSession4ItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LmItemActivitySessionModelList")
    public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelList lmItemActivitySessionModelList;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DA2554FD-F21F-536F-A7B7-B96C3E5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryBestSession4ItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBestSession4ItemsResponseBody self = new QueryBestSession4ItemsResponseBody();
        return TeaModel.build(map, self);
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

    public static class QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LMALL20190325****</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2022-03-09 18:59:59</p>
         */
        @NameInMap("DisplayDate")
        public String displayDate;

        /**
         * <strong>example:</strong>
         * <p>2022-03-09 18:59:59</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        /**
         * <strong>example:</strong>
         * <p>679</p>
         */
        @NameInMap("LmActivityId")
        public Long lmActivityId;

        /**
         * <strong>example:</strong>
         * <p>679</p>
         */
        @NameInMap("LmSessionId")
        public Long lmSessionId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2021-12-25 09:07:00</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p>cf5eddd467ca4d4a8105378a3ea****</p>
         */
        @NameInMap("SubBizCode")
        public String subBizCode;

        public static QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel self = new QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

    }

    public static class QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>66440412****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmActivitySessionModel")
        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModelLmActivitySessionModel lmActivitySessionModel;

        /**
         * <strong>example:</strong>
         * <p>10000102-65875550****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        public static QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel self = new QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryBestSession4ItemsResponseBodyLmItemActivitySessionModelListLmItemActivitySessionModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
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
