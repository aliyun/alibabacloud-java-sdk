// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedProductResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The products returned if the call is successful. For more information, see the "**Info**" section of this topic.</p>
     */
    @NameInMap("Data")
    public ListDistributedProductResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
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
        /**
         * <p>The time when the distribution task was created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The **ProductKey** of the product.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The ID of the source instance to which the product belongs.</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The name of the source instance to which the product belongs.</p>
         */
        @NameInMap("SourceInstanceName")
        public String sourceInstanceName;

        /**
         * <p>The source region to which the product belongs.</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to distribute the product. You can distribute products across regions and instances only within the same Alibaba cloud account. The value of this parameter is the same as the value of the **TargetUid** parameter.</p>
         */
        @NameInMap("SourceUid")
        public String sourceUid;

        /**
         * <p>The name of the Alibaba Cloud account to which the product is distributed.</p>
         */
        @NameInMap("TargetAliyunId")
        public String targetAliyunId;

        /**
         * <p>The ID of the destination instance to which the product is distributed.</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <p>The name of the destination instance to which the product is distributed.</p>
         */
        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        /**
         * <p>The destination region to which the product is distributed.</p>
         */
        @NameInMap("TargetRegion")
        public String targetRegion;

        /**
         * <p>The ID of the Alibaba Cloud account to which the product is distributed.</p>
         * <br>
         * <p>You can distribute devices across regions and instances only within the same Alibaba cloud account. The value of this parameter is the same as the value of the **TargetUid** parameter.</p>
         */
        @NameInMap("TargetUid")
        public String targetUid;

        public static ListDistributedProductResponseBodyDataInfoItems build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedProductResponseBodyDataInfoItems self = new ListDistributedProductResponseBodyDataInfoItems();
            return TeaModel.build(map, self);
        }

        public ListDistributedProductResponseBodyDataInfoItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
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
        /**
         * <p>The information about the product.</p>
         */
        @NameInMap("Info")
        public ListDistributedProductResponseBodyDataInfo info;

        /**
         * <p>The total number of returned products.</p>
         */
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
