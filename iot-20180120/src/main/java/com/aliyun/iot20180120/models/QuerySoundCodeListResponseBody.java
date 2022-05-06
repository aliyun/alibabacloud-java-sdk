// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySoundCodeListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySoundCodeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeListResponseBody self = new QuerySoundCodeListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySoundCodeListResponseBody setData(QuerySoundCodeListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySoundCodeListResponseBodyData getData() {
        return this.data;
    }

    public QuerySoundCodeListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySoundCodeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySoundCodeListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySoundCodeListResponseBodyDataListItems extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpenType")
        public String openType;

        @NameInMap("SoundCode")
        public String soundCode;

        @NameInMap("SoundCodeContent")
        public String soundCodeContent;

        public static QuerySoundCodeListResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeListResponseBodyDataListItems self = new QuerySoundCodeListResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeListResponseBodyDataListItems setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QuerySoundCodeListResponseBodyDataListItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySoundCodeListResponseBodyDataListItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySoundCodeListResponseBodyDataListItems setOpenType(String openType) {
            this.openType = openType;
            return this;
        }
        public String getOpenType() {
            return this.openType;
        }

        public QuerySoundCodeListResponseBodyDataListItems setSoundCode(String soundCode) {
            this.soundCode = soundCode;
            return this;
        }
        public String getSoundCode() {
            return this.soundCode;
        }

        public QuerySoundCodeListResponseBodyDataListItems setSoundCodeContent(String soundCodeContent) {
            this.soundCodeContent = soundCodeContent;
            return this;
        }
        public String getSoundCodeContent() {
            return this.soundCodeContent;
        }

    }

    public static class QuerySoundCodeListResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySoundCodeListResponseBodyDataListItems> items;

        public static QuerySoundCodeListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeListResponseBodyDataList self = new QuerySoundCodeListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeListResponseBodyDataList setItems(java.util.List<QuerySoundCodeListResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySoundCodeListResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySoundCodeListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySoundCodeListResponseBodyDataList list;

        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QuerySoundCodeListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeListResponseBodyData self = new QuerySoundCodeListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeListResponseBodyData setList(QuerySoundCodeListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySoundCodeListResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySoundCodeListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySoundCodeListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySoundCodeListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
