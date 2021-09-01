// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListCorpsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Data")
    public ListCorpsResponseBodyData data;

    public static ListCorpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCorpsResponseBody self = new ListCorpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCorpsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCorpsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCorpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCorpsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListCorpsResponseBody setData(ListCorpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCorpsResponseBodyData getData() {
        return this.data;
    }

    public static class ListCorpsResponseBodyDataRecords extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("CorpName")
        public String corpName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IconPath")
        public String iconPath;

        public static ListCorpsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListCorpsResponseBodyDataRecords self = new ListCorpsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListCorpsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListCorpsResponseBodyDataRecords setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListCorpsResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCorpsResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCorpsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListCorpsResponseBodyDataRecords setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ListCorpsResponseBodyDataRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCorpsResponseBodyDataRecords setIconPath(String iconPath) {
            this.iconPath = iconPath;
            return this;
        }
        public String getIconPath() {
            return this.iconPath;
        }

    }

    public static class ListCorpsResponseBodyData extends TeaModel {
        @NameInMap("TotalPage")
        public Long totalPage;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Records")
        public java.util.List<ListCorpsResponseBodyDataRecords> records;

        public static ListCorpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpsResponseBodyData self = new ListCorpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCorpsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public ListCorpsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListCorpsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListCorpsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListCorpsResponseBodyData setRecords(java.util.List<ListCorpsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListCorpsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
