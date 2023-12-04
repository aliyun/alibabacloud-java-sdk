// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListOpenedAccessLogInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configuration of log analysis for the Anti-DDoS Origin instance.</p>
     */
    @NameInMap("SlsConfigStatus")
    public java.util.List<ListOpenedAccessLogInstancesResponseBodySlsConfigStatus> slsConfigStatus;

    /**
     * <p>The number of the Anti-DDoS Origin instances for which log analysis was enabled.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOpenedAccessLogInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOpenedAccessLogInstancesResponseBody self = new ListOpenedAccessLogInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOpenedAccessLogInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOpenedAccessLogInstancesResponseBody setSlsConfigStatus(java.util.List<ListOpenedAccessLogInstancesResponseBodySlsConfigStatus> slsConfigStatus) {
        this.slsConfigStatus = slsConfigStatus;
        return this;
    }
    public java.util.List<ListOpenedAccessLogInstancesResponseBodySlsConfigStatus> getSlsConfigStatus() {
        return this.slsConfigStatus;
    }

    public ListOpenedAccessLogInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOpenedAccessLogInstancesResponseBodySlsConfigStatus extends TeaModel {
        /**
         * <p>Indicates whether log analysis was enabled for the Anti-DDoS Origin instance. Valid values:</p>
         * <br>
         * <p>*   **true**: Log analysis was enabled.</p>
         * <p>*   **false**: Log analysis was disabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The ID of the Anti-DDoS Origin instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListOpenedAccessLogInstancesResponseBodySlsConfigStatus build(java.util.Map<String, ?> map) throws Exception {
            ListOpenedAccessLogInstancesResponseBodySlsConfigStatus self = new ListOpenedAccessLogInstancesResponseBodySlsConfigStatus();
            return TeaModel.build(map, self);
        }

        public ListOpenedAccessLogInstancesResponseBodySlsConfigStatus setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListOpenedAccessLogInstancesResponseBodySlsConfigStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
