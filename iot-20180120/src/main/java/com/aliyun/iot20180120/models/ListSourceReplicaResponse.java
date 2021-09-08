// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListSourceReplicaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public ListSourceReplicaResponseData data;

    public static ListSourceReplicaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSourceReplicaResponse self = new ListSourceReplicaResponse();
        return TeaModel.build(map, self);
    }

    public ListSourceReplicaResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSourceReplicaResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSourceReplicaResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSourceReplicaResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSourceReplicaResponse setData(ListSourceReplicaResponseData data) {
        this.data = data;
        return this;
    }
    public ListSourceReplicaResponseData getData() {
        return this.data;
    }

    public static class ListSourceReplicaResponseDataDataList extends TeaModel {
        @NameInMap("ReplicaUid")
        @Validation(required = true)
        public String replicaUid;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("SourceUid")
        @Validation(required = true)
        public String sourceUid;

        @NameInMap("TableUid")
        @Validation(required = true)
        public String tableUid;

        @NameInMap("SourceType")
        @Validation(required = true)
        public String sourceType;

        @NameInMap("TimeCycle")
        @Validation(required = true)
        public Integer timeCycle;

        @NameInMap("TimeUnit")
        @Validation(required = true)
        public String timeUnit;

        @NameInMap("Region")
        @Validation(required = true)
        public Integer region;

        @NameInMap("BeginLatest")
        @Validation(required = true)
        public Long beginLatest;

        @NameInMap("EndLatest")
        @Validation(required = true)
        public Long endLatest;

        @NameInMap("ExtraProperty")
        @Validation(required = true)
        public String extraProperty;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("StorageSize")
        @Validation(required = true)
        public Long storageSize;

        @NameInMap("ProductCreateTime")
        @Validation(required = true)
        public Long productCreateTime;

        @NameInMap("NodeType")
        @Validation(required = true)
        public Integer nodeType;

        @NameInMap("NeedTips")
        @Validation(required = true)
        public Boolean needTips;

        @NameInMap("LongJobUid")
        @Validation(required = true)
        public String longJobUid;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        public static ListSourceReplicaResponseDataDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSourceReplicaResponseDataDataList self = new ListSourceReplicaResponseDataDataList();
            return TeaModel.build(map, self);
        }

        public ListSourceReplicaResponseDataDataList setReplicaUid(String replicaUid) {
            this.replicaUid = replicaUid;
            return this;
        }
        public String getReplicaUid() {
            return this.replicaUid;
        }

        public ListSourceReplicaResponseDataDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSourceReplicaResponseDataDataList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListSourceReplicaResponseDataDataList setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public ListSourceReplicaResponseDataDataList setTableUid(String tableUid) {
            this.tableUid = tableUid;
            return this;
        }
        public String getTableUid() {
            return this.tableUid;
        }

        public ListSourceReplicaResponseDataDataList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListSourceReplicaResponseDataDataList setTimeCycle(Integer timeCycle) {
            this.timeCycle = timeCycle;
            return this;
        }
        public Integer getTimeCycle() {
            return this.timeCycle;
        }

        public ListSourceReplicaResponseDataDataList setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public ListSourceReplicaResponseDataDataList setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public ListSourceReplicaResponseDataDataList setBeginLatest(Long beginLatest) {
            this.beginLatest = beginLatest;
            return this;
        }
        public Long getBeginLatest() {
            return this.beginLatest;
        }

        public ListSourceReplicaResponseDataDataList setEndLatest(Long endLatest) {
            this.endLatest = endLatest;
            return this;
        }
        public Long getEndLatest() {
            return this.endLatest;
        }

        public ListSourceReplicaResponseDataDataList setExtraProperty(String extraProperty) {
            this.extraProperty = extraProperty;
            return this;
        }
        public String getExtraProperty() {
            return this.extraProperty;
        }

        public ListSourceReplicaResponseDataDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListSourceReplicaResponseDataDataList setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public ListSourceReplicaResponseDataDataList setProductCreateTime(Long productCreateTime) {
            this.productCreateTime = productCreateTime;
            return this;
        }
        public Long getProductCreateTime() {
            return this.productCreateTime;
        }

        public ListSourceReplicaResponseDataDataList setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public ListSourceReplicaResponseDataDataList setNeedTips(Boolean needTips) {
            this.needTips = needTips;
            return this;
        }
        public Boolean getNeedTips() {
            return this.needTips;
        }

        public ListSourceReplicaResponseDataDataList setLongJobUid(String longJobUid) {
            this.longJobUid = longJobUid;
            return this;
        }
        public String getLongJobUid() {
            return this.longJobUid;
        }

        public ListSourceReplicaResponseDataDataList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListSourceReplicaResponseDataDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

    }

    public static class ListSourceReplicaResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Long totalPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageNo")
        @Validation(required = true)
        public Integer pageNo;

        @NameInMap("DataList")
        @Validation(required = true)
        public java.util.List<ListSourceReplicaResponseDataDataList> dataList;

        public static ListSourceReplicaResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListSourceReplicaResponseData self = new ListSourceReplicaResponseData();
            return TeaModel.build(map, self);
        }

        public ListSourceReplicaResponseData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListSourceReplicaResponseData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public ListSourceReplicaResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSourceReplicaResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListSourceReplicaResponseData setDataList(java.util.List<ListSourceReplicaResponseDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ListSourceReplicaResponseDataDataList> getDataList() {
            return this.dataList;
        }

    }

}
