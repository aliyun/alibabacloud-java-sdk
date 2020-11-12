// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListItemActivitiesResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LmItemActivityModelList")
    @Validation(required = true)
    public ListItemActivitiesResponseLmItemActivityModelList lmItemActivityModelList;

    public static ListItemActivitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListItemActivitiesResponse self = new ListItemActivitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListItemActivitiesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListItemActivitiesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListItemActivitiesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListItemActivitiesResponse setLmItemActivityModelList(ListItemActivitiesResponseLmItemActivityModelList lmItemActivityModelList) {
        this.lmItemActivityModelList = lmItemActivityModelList;
        return this;
    }
    public ListItemActivitiesResponseLmItemActivityModelList getLmItemActivityModelList() {
        return this.lmItemActivityModelList;
    }

    public static class ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("SubBizCode")
        @Validation(required = true)
        public String subBizCode;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("DisplayDate")
        @Validation(required = true)
        public String displayDate;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> extInfo;

        public static ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel build(java.util.Map<String, ?> map) throws Exception {
            ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel self = new ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel();
            return TeaModel.build(map, self);
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

    }

    public static class ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModel extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("LmActivityPopModel")
        @Validation(required = true)
        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel lmActivityPopModel;

        public static ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModel build(java.util.Map<String, ?> map) throws Exception {
            ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModel self = new ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModel();
            return TeaModel.build(map, self);
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModel setLmActivityPopModel(ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel lmActivityPopModel) {
            this.lmActivityPopModel = lmActivityPopModel;
            return this;
        }
        public ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModelLmActivityPopModel getLmActivityPopModel() {
            return this.lmActivityPopModel;
        }

    }

    public static class ListItemActivitiesResponseLmItemActivityModelList extends TeaModel {
        @NameInMap("LmItemActivityModel")
        @Validation(required = true)
        public java.util.List<ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModel> lmItemActivityModel;

        public static ListItemActivitiesResponseLmItemActivityModelList build(java.util.Map<String, ?> map) throws Exception {
            ListItemActivitiesResponseLmItemActivityModelList self = new ListItemActivitiesResponseLmItemActivityModelList();
            return TeaModel.build(map, self);
        }

        public ListItemActivitiesResponseLmItemActivityModelList setLmItemActivityModel(java.util.List<ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModel> lmItemActivityModel) {
            this.lmItemActivityModel = lmItemActivityModel;
            return this;
        }
        public java.util.List<ListItemActivitiesResponseLmItemActivityModelListLmItemActivityModel> getLmItemActivityModel() {
            return this.lmItemActivityModel;
        }

    }

}
