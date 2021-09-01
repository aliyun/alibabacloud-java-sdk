// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListCorpResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListCorpResponseBodyData data;

    public static ListCorpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCorpResponseBody self = new ListCorpResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCorpResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCorpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCorpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCorpResponseBody setData(ListCorpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCorpResponseBodyData getData() {
        return this.data;
    }

    public static class ListCorpResponseBodyDataRecords extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("GmtModifiedDate")
        public String gmtModifiedDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("CorpName")
        public String corpName;

        @NameInMap("GmtCreateDate")
        public String gmtCreateDate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IconPath")
        public String iconPath;

        public static ListCorpResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListCorpResponseBodyDataRecords self = new ListCorpResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListCorpResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListCorpResponseBodyDataRecords setGmtModifiedDate(String gmtModifiedDate) {
            this.gmtModifiedDate = gmtModifiedDate;
            return this;
        }
        public String getGmtModifiedDate() {
            return this.gmtModifiedDate;
        }

        public ListCorpResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCorpResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListCorpResponseBodyDataRecords setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ListCorpResponseBodyDataRecords setGmtCreateDate(String gmtCreateDate) {
            this.gmtCreateDate = gmtCreateDate;
            return this;
        }
        public String getGmtCreateDate() {
            return this.gmtCreateDate;
        }

        public ListCorpResponseBodyDataRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCorpResponseBodyDataRecords setIconPath(String iconPath) {
            this.iconPath = iconPath;
            return this;
        }
        public String getIconPath() {
            return this.iconPath;
        }

    }

    public static class ListCorpResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public String pageNum;

        @NameInMap("TotalPage")
        public String totalPage;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Records")
        public java.util.List<ListCorpResponseBodyDataRecords> records;

        public static ListCorpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpResponseBodyData self = new ListCorpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCorpResponseBodyData setPageNum(String pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public String getPageNum() {
            return this.pageNum;
        }

        public ListCorpResponseBodyData setTotalPage(String totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public String getTotalPage() {
            return this.totalPage;
        }

        public ListCorpResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListCorpResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListCorpResponseBodyData setRecords(java.util.List<ListCorpResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListCorpResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
