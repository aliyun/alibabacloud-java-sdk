// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedProductResponse extends TeaModel {
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
    public ListDistributedProductResponseData data;

    public static ListDistributedProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedProductResponse self = new ListDistributedProductResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributedProductResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributedProductResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDistributedProductResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributedProductResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDistributedProductResponse setData(ListDistributedProductResponseData data) {
        this.data = data;
        return this;
    }
    public ListDistributedProductResponseData getData() {
        return this.data;
    }

    public static class ListDistributedProductResponseDataInfoItems extends TeaModel {
        @NameInMap("SourceUid")
        @Validation(required = true)
        public String sourceUid;

        @NameInMap("TargetUid")
        @Validation(required = true)
        public String targetUid;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("SourceInstanceId")
        @Validation(required = true)
        public String sourceInstanceId;

        @NameInMap("TargetInstanceId")
        @Validation(required = true)
        public String targetInstanceId;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Integer gmtCreate;

        @NameInMap("TargetAliyunId")
        @Validation(required = true)
        public String targetAliyunId;

        @NameInMap("SourceRegion")
        @Validation(required = true)
        public String sourceRegion;

        @NameInMap("TargetRegion")
        @Validation(required = true)
        public String targetRegion;

        @NameInMap("SourceInstanceName")
        @Validation(required = true)
        public String sourceInstanceName;

        @NameInMap("TargetInstanceName")
        @Validation(required = true)
        public String targetInstanceName;

        public static ListDistributedProductResponseDataInfoItems build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedProductResponseDataInfoItems self = new ListDistributedProductResponseDataInfoItems();
            return TeaModel.build(map, self);
        }

        public ListDistributedProductResponseDataInfoItems setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public ListDistributedProductResponseDataInfoItems setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
        }

        public ListDistributedProductResponseDataInfoItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDistributedProductResponseDataInfoItems setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListDistributedProductResponseDataInfoItems setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public ListDistributedProductResponseDataInfoItems setGmtCreate(Integer gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Integer getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDistributedProductResponseDataInfoItems setTargetAliyunId(String targetAliyunId) {
            this.targetAliyunId = targetAliyunId;
            return this;
        }
        public String getTargetAliyunId() {
            return this.targetAliyunId;
        }

        public ListDistributedProductResponseDataInfoItems setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public ListDistributedProductResponseDataInfoItems setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            return this;
        }
        public String getTargetRegion() {
            return this.targetRegion;
        }

        public ListDistributedProductResponseDataInfoItems setSourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        public ListDistributedProductResponseDataInfoItems setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

    }

    public static class ListDistributedProductResponseDataInfo extends TeaModel {
        @NameInMap("items")
        @Validation(required = true)
        public java.util.List<ListDistributedProductResponseDataInfoItems> items;

        public static ListDistributedProductResponseDataInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedProductResponseDataInfo self = new ListDistributedProductResponseDataInfo();
            return TeaModel.build(map, self);
        }

        public ListDistributedProductResponseDataInfo setItems(java.util.List<ListDistributedProductResponseDataInfoItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDistributedProductResponseDataInfoItems> getItems() {
            return this.items;
        }

    }

    public static class ListDistributedProductResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Info")
        @Validation(required = true)
        public ListDistributedProductResponseDataInfo info;

        public static ListDistributedProductResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedProductResponseData self = new ListDistributedProductResponseData();
            return TeaModel.build(map, self);
        }

        public ListDistributedProductResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListDistributedProductResponseData setInfo(ListDistributedProductResponseDataInfo info) {
            this.info = info;
            return this;
        }
        public ListDistributedProductResponseDataInfo getInfo() {
            return this.info;
        }

    }

}
