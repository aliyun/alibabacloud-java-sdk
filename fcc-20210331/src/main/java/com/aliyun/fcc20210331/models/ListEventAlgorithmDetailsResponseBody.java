// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListEventAlgorithmDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListEventAlgorithmDetailsResponseBodyData data;

    public static ListEventAlgorithmDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventAlgorithmDetailsResponseBody self = new ListEventAlgorithmDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventAlgorithmDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventAlgorithmDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventAlgorithmDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventAlgorithmDetailsResponseBody setData(ListEventAlgorithmDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEventAlgorithmDetailsResponseBodyData getData() {
        return this.data;
    }

    public static class ListEventAlgorithmDetailsResponseBodyDataRecords extends TeaModel {
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

        public static ListEventAlgorithmDetailsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListEventAlgorithmDetailsResponseBodyDataRecords self = new ListEventAlgorithmDetailsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListEventAlgorithmDetailsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListEventAlgorithmDetailsResponseBodyDataRecords setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListEventAlgorithmDetailsResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEventAlgorithmDetailsResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEventAlgorithmDetailsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListEventAlgorithmDetailsResponseBodyDataRecords setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ListEventAlgorithmDetailsResponseBodyDataRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListEventAlgorithmDetailsResponseBodyDataRecords setIconPath(String iconPath) {
            this.iconPath = iconPath;
            return this;
        }
        public String getIconPath() {
            return this.iconPath;
        }

    }

    public static class ListEventAlgorithmDetailsResponseBodyData extends TeaModel {
        @NameInMap("TotalPage")
        public Long totalPage;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Records")
        public java.util.List<ListEventAlgorithmDetailsResponseBodyDataRecords> records;

        public static ListEventAlgorithmDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEventAlgorithmDetailsResponseBodyData self = new ListEventAlgorithmDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEventAlgorithmDetailsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public ListEventAlgorithmDetailsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListEventAlgorithmDetailsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListEventAlgorithmDetailsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListEventAlgorithmDetailsResponseBodyData setRecords(java.util.List<ListEventAlgorithmDetailsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListEventAlgorithmDetailsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
