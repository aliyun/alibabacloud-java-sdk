// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryGenerateDevicesRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryGenerateDevicesRecordResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryGenerateDevicesRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGenerateDevicesRecordResponseBody self = new QueryGenerateDevicesRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGenerateDevicesRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGenerateDevicesRecordResponseBody setData(QueryGenerateDevicesRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryGenerateDevicesRecordResponseBodyData getData() {
        return this.data;
    }

    public QueryGenerateDevicesRecordResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryGenerateDevicesRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGenerateDevicesRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryGenerateDevicesRecordResponseBodyDataListData extends TeaModel {
        @NameInMap("ApplyDeviceCount")
        public Long applyDeviceCount;

        @NameInMap("BatchId")
        public String batchId;

        @NameInMap("BatchStatus")
        public String batchStatus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("OperateUid")
        public Long operateUid;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("SpecCode")
        public String specCode;

        @NameInMap("SuccessCount")
        public Long successCount;

        public static QueryGenerateDevicesRecordResponseBodyDataListData build(java.util.Map<String, ?> map) throws Exception {
            QueryGenerateDevicesRecordResponseBodyDataListData self = new QueryGenerateDevicesRecordResponseBodyDataListData();
            return TeaModel.build(map, self);
        }

        public QueryGenerateDevicesRecordResponseBodyDataListData setApplyDeviceCount(Long applyDeviceCount) {
            this.applyDeviceCount = applyDeviceCount;
            return this;
        }
        public Long getApplyDeviceCount() {
            return this.applyDeviceCount;
        }

        public QueryGenerateDevicesRecordResponseBodyDataListData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public QueryGenerateDevicesRecordResponseBodyDataListData setBatchStatus(String batchStatus) {
            this.batchStatus = batchStatus;
            return this;
        }
        public String getBatchStatus() {
            return this.batchStatus;
        }

        public QueryGenerateDevicesRecordResponseBodyDataListData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryGenerateDevicesRecordResponseBodyDataListData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryGenerateDevicesRecordResponseBodyDataListData setOperateUid(Long operateUid) {
            this.operateUid = operateUid;
            return this;
        }
        public Long getOperateUid() {
            return this.operateUid;
        }

        public QueryGenerateDevicesRecordResponseBodyDataListData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryGenerateDevicesRecordResponseBodyDataListData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryGenerateDevicesRecordResponseBodyDataListData setSpecCode(String specCode) {
            this.specCode = specCode;
            return this;
        }
        public String getSpecCode() {
            return this.specCode;
        }

        public QueryGenerateDevicesRecordResponseBodyDataListData setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class QueryGenerateDevicesRecordResponseBodyData extends TeaModel {
        @NameInMap("ListData")
        public java.util.List<QueryGenerateDevicesRecordResponseBodyDataListData> listData;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryGenerateDevicesRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryGenerateDevicesRecordResponseBodyData self = new QueryGenerateDevicesRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryGenerateDevicesRecordResponseBodyData setListData(java.util.List<QueryGenerateDevicesRecordResponseBodyDataListData> listData) {
            this.listData = listData;
            return this;
        }
        public java.util.List<QueryGenerateDevicesRecordResponseBodyDataListData> getListData() {
            return this.listData;
        }

        public QueryGenerateDevicesRecordResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryGenerateDevicesRecordResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryGenerateDevicesRecordResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
