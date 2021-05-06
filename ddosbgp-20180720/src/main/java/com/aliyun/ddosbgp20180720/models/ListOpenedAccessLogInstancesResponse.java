// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListOpenedAccessLogInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("SlsConfigStatus")
    @Validation(required = true)
    public java.util.List<ListOpenedAccessLogInstancesResponseSlsConfigStatus> slsConfigStatus;

    public static ListOpenedAccessLogInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpenedAccessLogInstancesResponse self = new ListOpenedAccessLogInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListOpenedAccessLogInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOpenedAccessLogInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOpenedAccessLogInstancesResponse setSlsConfigStatus(java.util.List<ListOpenedAccessLogInstancesResponseSlsConfigStatus> slsConfigStatus) {
        this.slsConfigStatus = slsConfigStatus;
        return this;
    }
    public java.util.List<ListOpenedAccessLogInstancesResponseSlsConfigStatus> getSlsConfigStatus() {
        return this.slsConfigStatus;
    }

    public static class ListOpenedAccessLogInstancesResponseSlsConfigStatus extends TeaModel {
        @NameInMap("Enable")
        @Validation(required = true)
        public Boolean enable;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static ListOpenedAccessLogInstancesResponseSlsConfigStatus build(java.util.Map<String, ?> map) throws Exception {
            ListOpenedAccessLogInstancesResponseSlsConfigStatus self = new ListOpenedAccessLogInstancesResponseSlsConfigStatus();
            return TeaModel.build(map, self);
        }

        public ListOpenedAccessLogInstancesResponseSlsConfigStatus setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListOpenedAccessLogInstancesResponseSlsConfigStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
