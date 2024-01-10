// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListPowerStationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListPowerStationResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPowerStationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPowerStationResponseBody self = new ListPowerStationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPowerStationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPowerStationResponseBody setData(ListPowerStationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPowerStationResponseBodyData getData() {
        return this.data;
    }

    public ListPowerStationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPowerStationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPowerStationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPowerStationResponseBodyDataDataList extends TeaModel {
        @NameInMap("AlgoInstanceUid")
        public String algoInstanceUid;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("PowerStationUid")
        public String powerStationUid;

        @NameInMap("RatedPower")
        public Integer ratedPower;

        public static ListPowerStationResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            ListPowerStationResponseBodyDataDataList self = new ListPowerStationResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public ListPowerStationResponseBodyDataDataList setAlgoInstanceUid(String algoInstanceUid) {
            this.algoInstanceUid = algoInstanceUid;
            return this;
        }
        public String getAlgoInstanceUid() {
            return this.algoInstanceUid;
        }

        public ListPowerStationResponseBodyDataDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPowerStationResponseBodyDataDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPowerStationResponseBodyDataDataList setPowerStationUid(String powerStationUid) {
            this.powerStationUid = powerStationUid;
            return this;
        }
        public String getPowerStationUid() {
            return this.powerStationUid;
        }

        public ListPowerStationResponseBodyDataDataList setRatedPower(Integer ratedPower) {
            this.ratedPower = ratedPower;
            return this;
        }
        public Integer getRatedPower() {
            return this.ratedPower;
        }

    }

    public static class ListPowerStationResponseBodyData extends TeaModel {
        @NameInMap("DataList")
        public java.util.List<ListPowerStationResponseBodyDataDataList> dataList;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListPowerStationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPowerStationResponseBodyData self = new ListPowerStationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPowerStationResponseBodyData setDataList(java.util.List<ListPowerStationResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ListPowerStationResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

        public ListPowerStationResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListPowerStationResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPowerStationResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
