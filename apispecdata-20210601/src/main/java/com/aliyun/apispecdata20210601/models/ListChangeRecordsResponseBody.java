// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListChangeRecordsResponseBody extends TeaModel {
    // 变成数据
    @NameInMap("ChangeDetails")
    public java.util.List<ListChangeRecordsResponseBodyChangeDetails> changeDetails;

    // 当前页数
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 分页大小
    @NameInMap("PageSize")
    public Long pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总数据
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListChangeRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRecordsResponseBody self = new ListChangeRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChangeRecordsResponseBody setChangeDetails(java.util.List<ListChangeRecordsResponseBodyChangeDetails> changeDetails) {
        this.changeDetails = changeDetails;
        return this;
    }
    public java.util.List<ListChangeRecordsResponseBodyChangeDetails> getChangeDetails() {
        return this.changeDetails;
    }

    public ListChangeRecordsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListChangeRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListChangeRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChangeRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListChangeRecordsResponseBodyChangeDetailsDiffsJsonPathes extends TeaModel {
        // 操作类型
        @NameInMap("Op")
        public String op;

        // 字段路径
        @NameInMap("Path")
        public String path;

        // 修改值
        @NameInMap("Value")
        public Object value;

        public static ListChangeRecordsResponseBodyChangeDetailsDiffsJsonPathes build(java.util.Map<String, ?> map) throws Exception {
            ListChangeRecordsResponseBodyChangeDetailsDiffsJsonPathes self = new ListChangeRecordsResponseBodyChangeDetailsDiffsJsonPathes();
            return TeaModel.build(map, self);
        }

        public ListChangeRecordsResponseBodyChangeDetailsDiffsJsonPathes setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ListChangeRecordsResponseBodyChangeDetailsDiffsJsonPathes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListChangeRecordsResponseBodyChangeDetailsDiffsJsonPathes setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class ListChangeRecordsResponseBodyChangeDetailsDiffs extends TeaModel {
        // 该修改所属的变更ID
        @NameInMap("BranchId")
        public Long branchId;

        // Patch结构
        @NameInMap("JsonPathes")
        public java.util.List<ListChangeRecordsResponseBodyChangeDetailsDiffsJsonPathes> jsonPathes;

        // 上一个分支id
        @NameInMap("OriginalBranchId")
        public Long originalBranchId;

        // 上一个元数据的ID
        @NameInMap("OriginalRevisionId")
        public Long originalRevisionId;

        // 元数据的ID
        @NameInMap("RevisionId")
        public Long revisionId;

        public static ListChangeRecordsResponseBodyChangeDetailsDiffs build(java.util.Map<String, ?> map) throws Exception {
            ListChangeRecordsResponseBodyChangeDetailsDiffs self = new ListChangeRecordsResponseBodyChangeDetailsDiffs();
            return TeaModel.build(map, self);
        }

        public ListChangeRecordsResponseBodyChangeDetailsDiffs setBranchId(Long branchId) {
            this.branchId = branchId;
            return this;
        }
        public Long getBranchId() {
            return this.branchId;
        }

        public ListChangeRecordsResponseBodyChangeDetailsDiffs setJsonPathes(java.util.List<ListChangeRecordsResponseBodyChangeDetailsDiffsJsonPathes> jsonPathes) {
            this.jsonPathes = jsonPathes;
            return this;
        }
        public java.util.List<ListChangeRecordsResponseBodyChangeDetailsDiffsJsonPathes> getJsonPathes() {
            return this.jsonPathes;
        }

        public ListChangeRecordsResponseBodyChangeDetailsDiffs setOriginalBranchId(Long originalBranchId) {
            this.originalBranchId = originalBranchId;
            return this;
        }
        public Long getOriginalBranchId() {
            return this.originalBranchId;
        }

        public ListChangeRecordsResponseBodyChangeDetailsDiffs setOriginalRevisionId(Long originalRevisionId) {
            this.originalRevisionId = originalRevisionId;
            return this;
        }
        public Long getOriginalRevisionId() {
            return this.originalRevisionId;
        }

        public ListChangeRecordsResponseBodyChangeDetailsDiffs setRevisionId(Long revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public Long getRevisionId() {
            return this.revisionId;
        }

    }

    public static class ListChangeRecordsResponseBodyChangeDetailsRecordsPublisher extends TeaModel {
        // 员工BUC ID
        @NameInMap("Id")
        public String id;

        // 员工姓名s
        @NameInMap("Name")
        public String name;

        // 员工花名
        @NameInMap("NickName")
        public String nickName;

        public static ListChangeRecordsResponseBodyChangeDetailsRecordsPublisher build(java.util.Map<String, ?> map) throws Exception {
            ListChangeRecordsResponseBodyChangeDetailsRecordsPublisher self = new ListChangeRecordsResponseBodyChangeDetailsRecordsPublisher();
            return TeaModel.build(map, self);
        }

        public ListChangeRecordsResponseBodyChangeDetailsRecordsPublisher setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListChangeRecordsResponseBodyChangeDetailsRecordsPublisher setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListChangeRecordsResponseBodyChangeDetailsRecordsPublisher setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class ListChangeRecordsResponseBodyChangeDetailsRecords extends TeaModel {
        // 元数据的变更ID
        @NameInMap("BranchId")
        public String branchId;

        // 发布时间
        @NameInMap("Date")
        public String date;

        // 变更描述
        @NameInMap("Description")
        public String description;

        // 发布的API定义元数据
        @NameInMap("Meta")
        public String meta;

        // 发布人
        @NameInMap("Publisher")
        public ListChangeRecordsResponseBodyChangeDetailsRecordsPublisher publisher;

        // 是否修改或创建
        @NameInMap("Type")
        public String type;

        public static ListChangeRecordsResponseBodyChangeDetailsRecords build(java.util.Map<String, ?> map) throws Exception {
            ListChangeRecordsResponseBodyChangeDetailsRecords self = new ListChangeRecordsResponseBodyChangeDetailsRecords();
            return TeaModel.build(map, self);
        }

        public ListChangeRecordsResponseBodyChangeDetailsRecords setBranchId(String branchId) {
            this.branchId = branchId;
            return this;
        }
        public String getBranchId() {
            return this.branchId;
        }

        public ListChangeRecordsResponseBodyChangeDetailsRecords setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListChangeRecordsResponseBodyChangeDetailsRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListChangeRecordsResponseBodyChangeDetailsRecords setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public ListChangeRecordsResponseBodyChangeDetailsRecords setPublisher(ListChangeRecordsResponseBodyChangeDetailsRecordsPublisher publisher) {
            this.publisher = publisher;
            return this;
        }
        public ListChangeRecordsResponseBodyChangeDetailsRecordsPublisher getPublisher() {
            return this.publisher;
        }

        public ListChangeRecordsResponseBodyChangeDetailsRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListChangeRecordsResponseBodyChangeDetails extends TeaModel {
        // 比较不同
        @NameInMap("Diffs")
        public java.util.List<ListChangeRecordsResponseBodyChangeDetailsDiffs> diffs;

        // api名称
        @NameInMap("Name")
        public String name;

        // 查询记录
        @NameInMap("Records")
        public java.util.List<ListChangeRecordsResponseBodyChangeDetailsRecords> records;

        public static ListChangeRecordsResponseBodyChangeDetails build(java.util.Map<String, ?> map) throws Exception {
            ListChangeRecordsResponseBodyChangeDetails self = new ListChangeRecordsResponseBodyChangeDetails();
            return TeaModel.build(map, self);
        }

        public ListChangeRecordsResponseBodyChangeDetails setDiffs(java.util.List<ListChangeRecordsResponseBodyChangeDetailsDiffs> diffs) {
            this.diffs = diffs;
            return this;
        }
        public java.util.List<ListChangeRecordsResponseBodyChangeDetailsDiffs> getDiffs() {
            return this.diffs;
        }

        public ListChangeRecordsResponseBodyChangeDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListChangeRecordsResponseBodyChangeDetails setRecords(java.util.List<ListChangeRecordsResponseBodyChangeDetailsRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListChangeRecordsResponseBodyChangeDetailsRecords> getRecords() {
            return this.records;
        }

    }

}
