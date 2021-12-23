// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DataList")
    public java.util.List<DescribeResourceUsageResponseBodyDataList> dataList;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Paginator")
    public DescribeResourceUsageResponseBodyPaginator paginator;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageResponseBody self = new DescribeResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResourceUsageResponseBody setDataList(java.util.List<DescribeResourceUsageResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeResourceUsageResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeResourceUsageResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeResourceUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourceUsageResponseBody setPaginator(DescribeResourceUsageResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public DescribeResourceUsageResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public DescribeResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceUsageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResourceUsageResponseBodyDataListCloudDB extends TeaModel {
        @NameInMap("DataSize")
        public Long dataSize;

        @NameInMap("Read")
        public Long read;

        @NameInMap("Write")
        public Long write;

        public static DescribeResourceUsageResponseBodyDataListCloudDB build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageResponseBodyDataListCloudDB self = new DescribeResourceUsageResponseBodyDataListCloudDB();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageResponseBodyDataListCloudDB setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public DescribeResourceUsageResponseBodyDataListCloudDB setRead(Long read) {
            this.read = read;
            return this;
        }
        public Long getRead() {
            return this.read;
        }

        public DescribeResourceUsageResponseBodyDataListCloudDB setWrite(Long write) {
            this.write = write;
            return this;
        }
        public Long getWrite() {
            return this.write;
        }

    }

    public static class DescribeResourceUsageResponseBodyDataListCloudFunction extends TeaModel {
        @NameInMap("Compute")
        public Long compute;

        @NameInMap("Count")
        public Long count;

        @NameInMap("Traffic")
        public Long traffic;

        public static DescribeResourceUsageResponseBodyDataListCloudFunction build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageResponseBodyDataListCloudFunction self = new DescribeResourceUsageResponseBodyDataListCloudFunction();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageResponseBodyDataListCloudFunction setCompute(Long compute) {
            this.compute = compute;
            return this;
        }
        public Long getCompute() {
            return this.compute;
        }

        public DescribeResourceUsageResponseBodyDataListCloudFunction setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeResourceUsageResponseBodyDataListCloudFunction setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

    public static class DescribeResourceUsageResponseBodyDataListCloudStorage extends TeaModel {
        @NameInMap("DataSize")
        public Long dataSize;

        @NameInMap("Download")
        public Long download;

        @NameInMap("Traffic")
        public Long traffic;

        @NameInMap("Upload")
        public Long upload;

        public static DescribeResourceUsageResponseBodyDataListCloudStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageResponseBodyDataListCloudStorage self = new DescribeResourceUsageResponseBodyDataListCloudStorage();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageResponseBodyDataListCloudStorage setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public DescribeResourceUsageResponseBodyDataListCloudStorage setDownload(Long download) {
            this.download = download;
            return this;
        }
        public Long getDownload() {
            return this.download;
        }

        public DescribeResourceUsageResponseBodyDataListCloudStorage setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

        public DescribeResourceUsageResponseBodyDataListCloudStorage setUpload(Long upload) {
            this.upload = upload;
            return this;
        }
        public Long getUpload() {
            return this.upload;
        }

    }

    public static class DescribeResourceUsageResponseBodyDataListStaticWeb extends TeaModel {
        @NameInMap("DataSize")
        public Long dataSize;

        @NameInMap("Traffic")
        public Long traffic;

        public static DescribeResourceUsageResponseBodyDataListStaticWeb build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageResponseBodyDataListStaticWeb self = new DescribeResourceUsageResponseBodyDataListStaticWeb();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageResponseBodyDataListStaticWeb setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public DescribeResourceUsageResponseBodyDataListStaticWeb setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

    public static class DescribeResourceUsageResponseBodyDataList extends TeaModel {
        @NameInMap("CloudDB")
        public DescribeResourceUsageResponseBodyDataListCloudDB cloudDB;

        @NameInMap("CloudFunction")
        public DescribeResourceUsageResponseBodyDataListCloudFunction cloudFunction;

        @NameInMap("CloudStorage")
        public DescribeResourceUsageResponseBodyDataListCloudStorage cloudStorage;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StaticWeb")
        public DescribeResourceUsageResponseBodyDataListStaticWeb staticWeb;

        public static DescribeResourceUsageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageResponseBodyDataList self = new DescribeResourceUsageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageResponseBodyDataList setCloudDB(DescribeResourceUsageResponseBodyDataListCloudDB cloudDB) {
            this.cloudDB = cloudDB;
            return this;
        }
        public DescribeResourceUsageResponseBodyDataListCloudDB getCloudDB() {
            return this.cloudDB;
        }

        public DescribeResourceUsageResponseBodyDataList setCloudFunction(DescribeResourceUsageResponseBodyDataListCloudFunction cloudFunction) {
            this.cloudFunction = cloudFunction;
            return this;
        }
        public DescribeResourceUsageResponseBodyDataListCloudFunction getCloudFunction() {
            return this.cloudFunction;
        }

        public DescribeResourceUsageResponseBodyDataList setCloudStorage(DescribeResourceUsageResponseBodyDataListCloudStorage cloudStorage) {
            this.cloudStorage = cloudStorage;
            return this;
        }
        public DescribeResourceUsageResponseBodyDataListCloudStorage getCloudStorage() {
            return this.cloudStorage;
        }

        public DescribeResourceUsageResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeResourceUsageResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeResourceUsageResponseBodyDataList setStaticWeb(DescribeResourceUsageResponseBodyDataListStaticWeb staticWeb) {
            this.staticWeb = staticWeb;
            return this;
        }
        public DescribeResourceUsageResponseBodyDataListStaticWeb getStaticWeb() {
            return this.staticWeb;
        }

    }

    public static class DescribeResourceUsageResponseBodyPaginator extends TeaModel {
        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static DescribeResourceUsageResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceUsageResponseBodyPaginator self = new DescribeResourceUsageResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public DescribeResourceUsageResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public DescribeResourceUsageResponseBodyPaginator setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeResourceUsageResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeResourceUsageResponseBodyPaginator setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
