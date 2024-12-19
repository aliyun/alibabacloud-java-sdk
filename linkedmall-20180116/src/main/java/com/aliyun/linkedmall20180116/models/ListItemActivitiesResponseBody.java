// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListItemActivitiesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LmItemActivityModelList")
    public ListItemActivitiesResponseBodyLmItemActivityModelList lmItemActivityModelList;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1718921E-C8D4-55E1-B8D4-114AE537C1B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListItemActivitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListItemActivitiesResponseBody self = new ListItemActivitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListItemActivitiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListItemActivitiesResponseBody setLmItemActivityModelList(ListItemActivitiesResponseBodyLmItemActivityModelList lmItemActivityModelList) {
        this.lmItemActivityModelList = lmItemActivityModelList;
        return this;
    }
    public ListItemActivitiesResponseBodyLmItemActivityModelList getLmItemActivityModelList() {
        return this.lmItemActivityModelList;
    }

    public ListItemActivitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListItemActivitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>2022-03-31 14:25:00</p>
         */
        @NameInMap("DisplayDate")
        public String displayDate;

        /**
         * <strong>example:</strong>
         * <p>2022-04-04 00:00:00</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        /**
         * <strong>example:</strong>
         * <p>666</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2022-04-01 00:00:00</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p>4309074a******9d626669eaa7f7c</p>
         */
        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("Title")
        public String title;

        public static ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel build(java.util.Map<String, ?> map) throws Exception {
            ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel self = new ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel();
            return TeaModel.build(map, self);
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>599520******</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmActivityPopModel")
        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel lmActivityPopModel;

        /**
         * <strong>example:</strong>
         * <p>10000055-599520******</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        public static ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel build(java.util.Map<String, ?> map) throws Exception {
            ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel self = new ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel();
            return TeaModel.build(map, self);
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel setLmActivityPopModel(ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel lmActivityPopModel) {
            this.lmActivityPopModel = lmActivityPopModel;
            return this;
        }
        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel getLmActivityPopModel() {
            return this.lmActivityPopModel;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

    }

    public static class ListItemActivitiesResponseBodyLmItemActivityModelList extends TeaModel {
        @NameInMap("LmItemActivityModel")
        public java.util.List<ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel> lmItemActivityModel;

        public static ListItemActivitiesResponseBodyLmItemActivityModelList build(java.util.Map<String, ?> map) throws Exception {
            ListItemActivitiesResponseBodyLmItemActivityModelList self = new ListItemActivitiesResponseBodyLmItemActivityModelList();
            return TeaModel.build(map, self);
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelList setLmItemActivityModel(java.util.List<ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel> lmItemActivityModel) {
            this.lmItemActivityModel = lmItemActivityModel;
            return this;
        }
        public java.util.List<ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel> getLmItemActivityModel() {
            return this.lmItemActivityModel;
        }

    }

}
