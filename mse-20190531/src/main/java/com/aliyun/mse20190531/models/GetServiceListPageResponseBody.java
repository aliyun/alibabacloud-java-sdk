// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceListPageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetServiceListPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetServiceListPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListPageResponseBody self = new GetServiceListPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceListPageResponseBody setData(GetServiceListPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceListPageResponseBodyData getData() {
        return this.data;
    }

    public GetServiceListPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceListPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceListPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceListPageResponseBodyDataResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("GmtModifyTime")
        public String gmtModifyTime;

        @NameInMap("Group")
        public String group;

        @NameInMap("InstanceNum")
        public Integer instanceNum;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Version")
        public String version;

        public static GetServiceListPageResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListPageResponseBodyDataResult self = new GetServiceListPageResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetServiceListPageResponseBodyDataResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetServiceListPageResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetServiceListPageResponseBodyDataResult setGmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        public GetServiceListPageResponseBodyDataResult setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetServiceListPageResponseBodyDataResult setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public GetServiceListPageResponseBodyDataResult setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceListPageResponseBodyDataResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetServiceListPageResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public String pageNumber;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("Result")
        public java.util.List<GetServiceListPageResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public String totalSize;

        public static GetServiceListPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListPageResponseBodyData self = new GetServiceListPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceListPageResponseBodyData setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public GetServiceListPageResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public GetServiceListPageResponseBodyData setResult(java.util.List<GetServiceListPageResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetServiceListPageResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetServiceListPageResponseBodyData setTotalSize(String totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public String getTotalSize() {
            return this.totalSize;
        }

    }

}
