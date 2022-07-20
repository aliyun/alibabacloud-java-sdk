// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetCapacityResponseBody extends TeaModel {
    // 回满足匹配的
    @NameInMap("Capacities")
    public java.util.List<GetCapacityResponseBodyCapacities> capacities;

    // 第几页
    @NameInMap("PageNum")
    public Integer pageNum;

    // 每页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // pop的requestId
    @NameInMap("RequestId")
    public String requestId;

    // 满足匹配条件的总量
    @NameInMap("Total")
    public Integer total;

    public static GetCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCapacityResponseBody self = new GetCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCapacityResponseBody setCapacities(java.util.List<GetCapacityResponseBodyCapacities> capacities) {
        this.capacities = capacities;
        return this;
    }
    public java.util.List<GetCapacityResponseBodyCapacities> getCapacities() {
        return this.capacities;
    }

    public GetCapacityResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetCapacityResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCapacityResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetCapacityResponseBodyCapacities extends TeaModel {
        // 创建容器时指定的 appId
        @NameInMap("AppId")
        public String appId;

        // 创建容器时指定的版本
        @NameInMap("AppVersion")
        public String appVersion;

        // 该容器所属大区 id
        @NameInMap("DistrictId")
        public String districtId;

        // 可支撑 session 数量
        @NameInMap("SessionCapacity")
        public Integer sessionCapacity;

        public static GetCapacityResponseBodyCapacities build(java.util.Map<String, ?> map) throws Exception {
            GetCapacityResponseBodyCapacities self = new GetCapacityResponseBodyCapacities();
            return TeaModel.build(map, self);
        }

        public GetCapacityResponseBodyCapacities setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCapacityResponseBodyCapacities setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetCapacityResponseBodyCapacities setDistrictId(String districtId) {
            this.districtId = districtId;
            return this;
        }
        public String getDistrictId() {
            return this.districtId;
        }

        public GetCapacityResponseBodyCapacities setSessionCapacity(Integer sessionCapacity) {
            this.sessionCapacity = sessionCapacity;
            return this;
        }
        public Integer getSessionCapacity() {
            return this.sessionCapacity;
        }

    }

}
