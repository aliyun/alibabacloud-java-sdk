// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeEslDeviceResponseBody extends TeaModel {
    @NameInMap("EslDetails")
    public java.util.List<DescribeEslDeviceResponseBodyEslDetails> eslDetails;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeEslDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEslDeviceResponseBody self = new DescribeEslDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEslDeviceResponseBody setEslDetails(java.util.List<DescribeEslDeviceResponseBodyEslDetails> eslDetails) {
        this.eslDetails = eslDetails;
        return this;
    }
    public java.util.List<DescribeEslDeviceResponseBodyEslDetails> getEslDetails() {
        return this.eslDetails;
    }

    public DescribeEslDeviceResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEslDeviceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeEslDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEslDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEslDeviceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEslDeviceResponseBodyEslDetails extends TeaModel {
        @NameInMap("EslBarCode")
        public String eslBarCode;

        @NameInMap("ItemBarCode")
        public Long itemBarCode;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemShortTitle")
        public String itemShortTitle;

        @NameInMap("LastUpdateTime")
        public String lastUpdateTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StoreId")
        public String storeId;

        public static DescribeEslDeviceResponseBodyEslDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeEslDeviceResponseBodyEslDetails self = new DescribeEslDeviceResponseBodyEslDetails();
            return TeaModel.build(map, self);
        }

        public DescribeEslDeviceResponseBodyEslDetails setEslBarCode(String eslBarCode) {
            this.eslBarCode = eslBarCode;
            return this;
        }
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        public DescribeEslDeviceResponseBodyEslDetails setItemBarCode(Long itemBarCode) {
            this.itemBarCode = itemBarCode;
            return this;
        }
        public Long getItemBarCode() {
            return this.itemBarCode;
        }

        public DescribeEslDeviceResponseBodyEslDetails setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public DescribeEslDeviceResponseBodyEslDetails setItemShortTitle(String itemShortTitle) {
            this.itemShortTitle = itemShortTitle;
            return this;
        }
        public String getItemShortTitle() {
            return this.itemShortTitle;
        }

        public DescribeEslDeviceResponseBodyEslDetails setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public DescribeEslDeviceResponseBodyEslDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEslDeviceResponseBodyEslDetails setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

    }

}
