// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryOperationIndexResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryOperationIndexResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOperationIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationIndexResponseBody self = new QueryOperationIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOperationIndexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOperationIndexResponseBody setData(QueryOperationIndexResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOperationIndexResponseBodyData getData() {
        return this.data;
    }

    public QueryOperationIndexResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryOperationIndexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOperationIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOperationIndexResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOperationIndexResponseBodyDataDeviceIndex extends TeaModel {
        @NameInMap("CpuAverage")
        public Integer cpuAverage;

        @NameInMap("FaultDeviceNum")
        public Integer faultDeviceNum;

        @NameInMap("HighFreqFaultDeviceNum")
        public Integer highFreqFaultDeviceNum;

        @NameInMap("NetworkTraffic")
        public Integer networkTraffic;

        @NameInMap("NormalDeviceNum")
        public Integer normalDeviceNum;

        @NameInMap("OnlineNum")
        public Integer onlineNum;

        @NameInMap("StorageAverage")
        public Integer storageAverage;

        @NameInMap("TotalWorkingDeviceNum")
        public Integer totalWorkingDeviceNum;

        public static QueryOperationIndexResponseBodyDataDeviceIndex build(java.util.Map<String, ?> map) throws Exception {
            QueryOperationIndexResponseBodyDataDeviceIndex self = new QueryOperationIndexResponseBodyDataDeviceIndex();
            return TeaModel.build(map, self);
        }

        public QueryOperationIndexResponseBodyDataDeviceIndex setCpuAverage(Integer cpuAverage) {
            this.cpuAverage = cpuAverage;
            return this;
        }
        public Integer getCpuAverage() {
            return this.cpuAverage;
        }

        public QueryOperationIndexResponseBodyDataDeviceIndex setFaultDeviceNum(Integer faultDeviceNum) {
            this.faultDeviceNum = faultDeviceNum;
            return this;
        }
        public Integer getFaultDeviceNum() {
            return this.faultDeviceNum;
        }

        public QueryOperationIndexResponseBodyDataDeviceIndex setHighFreqFaultDeviceNum(Integer highFreqFaultDeviceNum) {
            this.highFreqFaultDeviceNum = highFreqFaultDeviceNum;
            return this;
        }
        public Integer getHighFreqFaultDeviceNum() {
            return this.highFreqFaultDeviceNum;
        }

        public QueryOperationIndexResponseBodyDataDeviceIndex setNetworkTraffic(Integer networkTraffic) {
            this.networkTraffic = networkTraffic;
            return this;
        }
        public Integer getNetworkTraffic() {
            return this.networkTraffic;
        }

        public QueryOperationIndexResponseBodyDataDeviceIndex setNormalDeviceNum(Integer normalDeviceNum) {
            this.normalDeviceNum = normalDeviceNum;
            return this;
        }
        public Integer getNormalDeviceNum() {
            return this.normalDeviceNum;
        }

        public QueryOperationIndexResponseBodyDataDeviceIndex setOnlineNum(Integer onlineNum) {
            this.onlineNum = onlineNum;
            return this;
        }
        public Integer getOnlineNum() {
            return this.onlineNum;
        }

        public QueryOperationIndexResponseBodyDataDeviceIndex setStorageAverage(Integer storageAverage) {
            this.storageAverage = storageAverage;
            return this;
        }
        public Integer getStorageAverage() {
            return this.storageAverage;
        }

        public QueryOperationIndexResponseBodyDataDeviceIndex setTotalWorkingDeviceNum(Integer totalWorkingDeviceNum) {
            this.totalWorkingDeviceNum = totalWorkingDeviceNum;
            return this;
        }
        public Integer getTotalWorkingDeviceNum() {
            return this.totalWorkingDeviceNum;
        }

    }

    public static class QueryOperationIndexResponseBodyDataShopIndex extends TeaModel {
        @NameInMap("FaultShopNum")
        public Integer faultShopNum;

        @NameInMap("HighFreqFaultShopNum")
        public Integer highFreqFaultShopNum;

        @NameInMap("InstalledShopNum")
        public Integer installedShopNum;

        @NameInMap("NetWorkShopNum")
        public Integer netWorkShopNum;

        @NameInMap("NormalShopNum")
        public Integer normalShopNum;

        @NameInMap("NotWorkShopNum")
        public Integer notWorkShopNum;

        @NameInMap("ShopTotal")
        public Integer shopTotal;

        @NameInMap("UpholdShopNum")
        public Integer upholdShopNum;

        public static QueryOperationIndexResponseBodyDataShopIndex build(java.util.Map<String, ?> map) throws Exception {
            QueryOperationIndexResponseBodyDataShopIndex self = new QueryOperationIndexResponseBodyDataShopIndex();
            return TeaModel.build(map, self);
        }

        public QueryOperationIndexResponseBodyDataShopIndex setFaultShopNum(Integer faultShopNum) {
            this.faultShopNum = faultShopNum;
            return this;
        }
        public Integer getFaultShopNum() {
            return this.faultShopNum;
        }

        public QueryOperationIndexResponseBodyDataShopIndex setHighFreqFaultShopNum(Integer highFreqFaultShopNum) {
            this.highFreqFaultShopNum = highFreqFaultShopNum;
            return this;
        }
        public Integer getHighFreqFaultShopNum() {
            return this.highFreqFaultShopNum;
        }

        public QueryOperationIndexResponseBodyDataShopIndex setInstalledShopNum(Integer installedShopNum) {
            this.installedShopNum = installedShopNum;
            return this;
        }
        public Integer getInstalledShopNum() {
            return this.installedShopNum;
        }

        public QueryOperationIndexResponseBodyDataShopIndex setNetWorkShopNum(Integer netWorkShopNum) {
            this.netWorkShopNum = netWorkShopNum;
            return this;
        }
        public Integer getNetWorkShopNum() {
            return this.netWorkShopNum;
        }

        public QueryOperationIndexResponseBodyDataShopIndex setNormalShopNum(Integer normalShopNum) {
            this.normalShopNum = normalShopNum;
            return this;
        }
        public Integer getNormalShopNum() {
            return this.normalShopNum;
        }

        public QueryOperationIndexResponseBodyDataShopIndex setNotWorkShopNum(Integer notWorkShopNum) {
            this.notWorkShopNum = notWorkShopNum;
            return this;
        }
        public Integer getNotWorkShopNum() {
            return this.notWorkShopNum;
        }

        public QueryOperationIndexResponseBodyDataShopIndex setShopTotal(Integer shopTotal) {
            this.shopTotal = shopTotal;
            return this;
        }
        public Integer getShopTotal() {
            return this.shopTotal;
        }

        public QueryOperationIndexResponseBodyDataShopIndex setUpholdShopNum(Integer upholdShopNum) {
            this.upholdShopNum = upholdShopNum;
            return this;
        }
        public Integer getUpholdShopNum() {
            return this.upholdShopNum;
        }

    }

    public static class QueryOperationIndexResponseBodyDataTicketIndex extends TeaModel {
        @NameInMap("AutoRecoverRate")
        public Double autoRecoverRate;

        @NameInMap("AutoRecoverTicketNum")
        public Integer autoRecoverTicketNum;

        @NameInMap("OpenTicketNum")
        public Integer openTicketNum;

        @NameInMap("RecoverRate")
        public Double recoverRate;

        @NameInMap("TotalTicketNum")
        public Integer totalTicketNum;

        public static QueryOperationIndexResponseBodyDataTicketIndex build(java.util.Map<String, ?> map) throws Exception {
            QueryOperationIndexResponseBodyDataTicketIndex self = new QueryOperationIndexResponseBodyDataTicketIndex();
            return TeaModel.build(map, self);
        }

        public QueryOperationIndexResponseBodyDataTicketIndex setAutoRecoverRate(Double autoRecoverRate) {
            this.autoRecoverRate = autoRecoverRate;
            return this;
        }
        public Double getAutoRecoverRate() {
            return this.autoRecoverRate;
        }

        public QueryOperationIndexResponseBodyDataTicketIndex setAutoRecoverTicketNum(Integer autoRecoverTicketNum) {
            this.autoRecoverTicketNum = autoRecoverTicketNum;
            return this;
        }
        public Integer getAutoRecoverTicketNum() {
            return this.autoRecoverTicketNum;
        }

        public QueryOperationIndexResponseBodyDataTicketIndex setOpenTicketNum(Integer openTicketNum) {
            this.openTicketNum = openTicketNum;
            return this;
        }
        public Integer getOpenTicketNum() {
            return this.openTicketNum;
        }

        public QueryOperationIndexResponseBodyDataTicketIndex setRecoverRate(Double recoverRate) {
            this.recoverRate = recoverRate;
            return this;
        }
        public Double getRecoverRate() {
            return this.recoverRate;
        }

        public QueryOperationIndexResponseBodyDataTicketIndex setTotalTicketNum(Integer totalTicketNum) {
            this.totalTicketNum = totalTicketNum;
            return this;
        }
        public Integer getTotalTicketNum() {
            return this.totalTicketNum;
        }

    }

    public static class QueryOperationIndexResponseBodyData extends TeaModel {
        @NameInMap("DeviceIndex")
        public QueryOperationIndexResponseBodyDataDeviceIndex deviceIndex;

        @NameInMap("ShopIndex")
        public QueryOperationIndexResponseBodyDataShopIndex shopIndex;

        @NameInMap("TicketIndex")
        public QueryOperationIndexResponseBodyDataTicketIndex ticketIndex;

        public static QueryOperationIndexResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOperationIndexResponseBodyData self = new QueryOperationIndexResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOperationIndexResponseBodyData setDeviceIndex(QueryOperationIndexResponseBodyDataDeviceIndex deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public QueryOperationIndexResponseBodyDataDeviceIndex getDeviceIndex() {
            return this.deviceIndex;
        }

        public QueryOperationIndexResponseBodyData setShopIndex(QueryOperationIndexResponseBodyDataShopIndex shopIndex) {
            this.shopIndex = shopIndex;
            return this;
        }
        public QueryOperationIndexResponseBodyDataShopIndex getShopIndex() {
            return this.shopIndex;
        }

        public QueryOperationIndexResponseBodyData setTicketIndex(QueryOperationIndexResponseBodyDataTicketIndex ticketIndex) {
            this.ticketIndex = ticketIndex;
            return this;
        }
        public QueryOperationIndexResponseBodyDataTicketIndex getTicketIndex() {
            return this.ticketIndex;
        }

    }

}
