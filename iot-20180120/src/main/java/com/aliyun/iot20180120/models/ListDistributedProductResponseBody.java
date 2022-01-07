// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedProductResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDistributedProductResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDistributedProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedProductResponseBody self = new ListDistributedProductResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistributedProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributedProductResponseBody setData(ListDistributedProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDistributedProductResponseBodyData getData() {
        return this.data;
    }

    public ListDistributedProductResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDistributedProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributedProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDistributedProductResponseBodyDataInfoItems extends TeaModel {
        @NameInMap("GmtCreate")
        public Integer gmtCreate;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        @NameInMap("SourceInstanceName")
        public String sourceInstanceName;

        @NameInMap("SourceRegion")
        public String sourceRegion;

        @NameInMap("SourceUid")
        public String sourceUid;

        @NameInMap("TargetAliyunId")
        public String targetAliyunId;

        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        @NameInMap("TargetRegion")
        public String targetRegion;

        @NameInMap("TargetUid")
        public String targetUid;

        public static ListDistributedProductResponseBodyDataInfoItems build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedProductResponseBodyDataInfoItems self = new ListDistributedProductResponseBodyDataInfoItems();
            return TeaModel.build(map, self);
        }

        public ListDistributedProductResponseBodyDataInfoItems setGmtCreate(Integer gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Integer getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDistributedProductResponseBodyDataInfoItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDistributedProductResponseBodyDataInfoItems setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListDistributedProductResponseBodyDataInfoItems setSourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        public ListDistributedProductResponseBodyDataInfoItems setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public ListDistributedProductResponseBodyDataInfoItems setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public ListDistributedProductResponseBodyDataInfoItems setTargetAliyunId(String targetAliyunId) {
            this.targetAliyunId = targetAliyunId;
            return this;
        }
        public String getTargetAliyunId() {
            return this.targetAliyunId;
        }

        public ListDistributedProductResponseBodyDataInfoItems setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public ListDistributedProductResponseBodyDataInfoItems setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public ListDistributedProductResponseBodyDataInfoItems setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            return this;
        }
        public String getTargetRegion() {
            return this.targetRegion;
        }

        public ListDistributedProductResponseBodyDataInfoItems setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
        }

    }

    public static class ListDistributedProductResponseBodyDataInfo extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListDistributedProductResponseBodyDataInfoItems> items;

        public static ListDistributedProductResponseBodyDataInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedProductResponseBodyDataInfo self = new ListDistributedProductResponseBodyDataInfo();
            return TeaModel.build(map, self);
        }

        public ListDistributedProductResponseBodyDataInfo setItems(java.util.List<ListDistributedProductResponseBodyDataInfoItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDistributedProductResponseBodyDataInfoItems> getItems() {
            return this.items;
        }

    }

    public static class ListDistributedProductResponseBodyData extends TeaModel {
        @NameInMap("Info")
        public ListDistributedProductResponseBodyDataInfo info;

        @NameInMap("Total")
        public Integer total;

        public static ListDistributedProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedProductResponseBodyData self = new ListDistributedProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDistributedProductResponseBodyData setInfo(ListDistributedProductResponseBodyDataInfo info) {
            this.info = info;
            return this;
        }
        public ListDistributedProductResponseBodyDataInfo getInfo() {
            return this.info;
        }

        public ListDistributedProductResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
