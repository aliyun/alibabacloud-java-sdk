// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListItemActivitiesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LmItemActivityModelList")
    public ListItemActivitiesResponseBodyLmItemActivityModelList lmItemActivityModelList;

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

    public ListItemActivitiesResponseBody setLmItemActivityModelList(ListItemActivitiesResponseBodyLmItemActivityModelList lmItemActivityModelList) {
        this.lmItemActivityModelList = lmItemActivityModelList;
        return this;
    }
    public ListItemActivitiesResponseBodyLmItemActivityModelList getLmItemActivityModelList() {
        return this.lmItemActivityModelList;
    }

    public static class ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel extends TeaModel {
        @NameInMap("SubBizCode")
        public String subBizCode;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("DisplayDate")
        public String displayDate;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Title")
        public String title;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("Id")
        public Long id;

        public static ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel build(java.util.Map<String, ?> map) throws Exception {
            ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel self = new ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel();
            return TeaModel.build(map, self);
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
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

    }

    public static class ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel extends TeaModel {
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmActivityPopModel")
        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModelLmActivityPopModel lmActivityPopModel;

        public static ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel build(java.util.Map<String, ?> map) throws Exception {
            ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel self = new ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel();
            return TeaModel.build(map, self);
        }

        public ListItemActivitiesResponseBodyLmItemActivityModelListLmItemActivityModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
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
