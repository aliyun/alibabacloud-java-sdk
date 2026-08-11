// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListOpenedAccessLogInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4DB64811-70A1-41C9-A0CE-CD8B260ED551</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The log analysis configurations of Anti-DDoS Origin instances.</p>
     */
    @NameInMap("SlsConfigStatus")
    public java.util.List<ListOpenedAccessLogInstancesResponseBodySlsConfigStatus> slsConfigStatus;

    /**
     * <p>The number of results returned, which is the number of Anti-DDoS Origin instances that have log analysis enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>Indicates whether log analysis is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The instance ID of Anti-DDoS Origin.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-m7r1zce2****</p>
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
