// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstancesResponseBody extends TeaModel {
    @NameInMap("AppInstanceModels")
    public java.util.List<ListAppInstancesResponseBodyAppInstanceModels> appInstanceModels;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAppInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstancesResponseBody self = new ListAppInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInstancesResponseBody setAppInstanceModels(java.util.List<ListAppInstancesResponseBodyAppInstanceModels> appInstanceModels) {
        this.appInstanceModels = appInstanceModels;
        return this;
    }
    public java.util.List<ListAppInstancesResponseBodyAppInstanceModels> getAppInstanceModels() {
        return this.appInstanceModels;
    }

    public ListAppInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppInstancesResponseBodyAppInstanceModelsBindInfo extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("UsageDuration")
        public Long usageDuration;

        public static ListAppInstancesResponseBodyAppInstanceModelsBindInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstancesResponseBodyAppInstanceModelsBindInfo self = new ListAppInstancesResponseBodyAppInstanceModelsBindInfo();
            return TeaModel.build(map, self);
        }

        public ListAppInstancesResponseBodyAppInstanceModelsBindInfo setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public ListAppInstancesResponseBodyAppInstanceModelsBindInfo setUsageDuration(Long usageDuration) {
            this.usageDuration = usageDuration;
            return this;
        }
        public Long getUsageDuration() {
            return this.usageDuration;
        }

    }

    public static class ListAppInstancesResponseBodyAppInstanceModels extends TeaModel {
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("BindInfo")
        public ListAppInstancesResponseBodyAppInstanceModelsBindInfo bindInfo;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MainEthPublicIp")
        public String mainEthPublicIp;

        @NameInMap("SessionStatus")
        public String sessionStatus;

        @NameInMap("Status")
        public String status;

        public static ListAppInstancesResponseBodyAppInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstancesResponseBodyAppInstanceModels self = new ListAppInstancesResponseBodyAppInstanceModels();
            return TeaModel.build(map, self);
        }

        public ListAppInstancesResponseBodyAppInstanceModels setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setBindInfo(ListAppInstancesResponseBodyAppInstanceModelsBindInfo bindInfo) {
            this.bindInfo = bindInfo;
            return this;
        }
        public ListAppInstancesResponseBodyAppInstanceModelsBindInfo getBindInfo() {
            return this.bindInfo;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setMainEthPublicIp(String mainEthPublicIp) {
            this.mainEthPublicIp = mainEthPublicIp;
            return this;
        }
        public String getMainEthPublicIp() {
            return this.mainEthPublicIp;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
