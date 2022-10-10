// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListDistributorMallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DistributorMallList")
    public java.util.List<ListDistributorMallResponseBodyDistributorMallList> distributorMallList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDistributorMallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistributorMallResponseBody self = new ListDistributorMallResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistributorMallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributorMallResponseBody setDistributorMallList(java.util.List<ListDistributorMallResponseBodyDistributorMallList> distributorMallList) {
        this.distributorMallList = distributorMallList;
        return this;
    }
    public java.util.List<ListDistributorMallResponseBodyDistributorMallList> getDistributorMallList() {
        return this.distributorMallList;
    }

    public ListDistributorMallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDistributorMallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributorMallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDistributorMallResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDistributorMallResponseBodyDistributorMallListChannelSupplierList extends TeaModel {
        @NameInMap("ChannelSupplierId")
        public String channelSupplierId;

        @NameInMap("ChannelSupplierName")
        public String channelSupplierName;

        @NameInMap("DistributionMallCode")
        public String distributionMallCode;

        public static ListDistributorMallResponseBodyDistributorMallListChannelSupplierList build(java.util.Map<String, ?> map) throws Exception {
            ListDistributorMallResponseBodyDistributorMallListChannelSupplierList self = new ListDistributorMallResponseBodyDistributorMallListChannelSupplierList();
            return TeaModel.build(map, self);
        }

        public ListDistributorMallResponseBodyDistributorMallListChannelSupplierList setChannelSupplierId(String channelSupplierId) {
            this.channelSupplierId = channelSupplierId;
            return this;
        }
        public String getChannelSupplierId() {
            return this.channelSupplierId;
        }

        public ListDistributorMallResponseBodyDistributorMallListChannelSupplierList setChannelSupplierName(String channelSupplierName) {
            this.channelSupplierName = channelSupplierName;
            return this;
        }
        public String getChannelSupplierName() {
            return this.channelSupplierName;
        }

        public ListDistributorMallResponseBodyDistributorMallListChannelSupplierList setDistributionMallCode(String distributionMallCode) {
            this.distributionMallCode = distributionMallCode;
            return this;
        }
        public String getDistributionMallCode() {
            return this.distributionMallCode;
        }

    }

    public static class ListDistributorMallResponseBodyDistributorMallList extends TeaModel {
        @NameInMap("ChannelSupplierList")
        public java.util.List<ListDistributorMallResponseBodyDistributorMallListChannelSupplierList> channelSupplierList;

        @NameInMap("DistributionMallId")
        public String distributionMallId;

        @NameInMap("DistributionMallName")
        public String distributionMallName;

        @NameInMap("DistributionMallType")
        public String distributionMallType;

        @NameInMap("DistributorId")
        public String distributorId;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public String status;

        public static ListDistributorMallResponseBodyDistributorMallList build(java.util.Map<String, ?> map) throws Exception {
            ListDistributorMallResponseBodyDistributorMallList self = new ListDistributorMallResponseBodyDistributorMallList();
            return TeaModel.build(map, self);
        }

        public ListDistributorMallResponseBodyDistributorMallList setChannelSupplierList(java.util.List<ListDistributorMallResponseBodyDistributorMallListChannelSupplierList> channelSupplierList) {
            this.channelSupplierList = channelSupplierList;
            return this;
        }
        public java.util.List<ListDistributorMallResponseBodyDistributorMallListChannelSupplierList> getChannelSupplierList() {
            return this.channelSupplierList;
        }

        public ListDistributorMallResponseBodyDistributorMallList setDistributionMallId(String distributionMallId) {
            this.distributionMallId = distributionMallId;
            return this;
        }
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        public ListDistributorMallResponseBodyDistributorMallList setDistributionMallName(String distributionMallName) {
            this.distributionMallName = distributionMallName;
            return this;
        }
        public String getDistributionMallName() {
            return this.distributionMallName;
        }

        public ListDistributorMallResponseBodyDistributorMallList setDistributionMallType(String distributionMallType) {
            this.distributionMallType = distributionMallType;
            return this;
        }
        public String getDistributionMallType() {
            return this.distributionMallType;
        }

        public ListDistributorMallResponseBodyDistributorMallList setDistributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }
        public String getDistributorId() {
            return this.distributorId;
        }

        public ListDistributorMallResponseBodyDistributorMallList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListDistributorMallResponseBodyDistributorMallList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListDistributorMallResponseBodyDistributorMallList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListDistributorMallResponseBodyDistributorMallList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
