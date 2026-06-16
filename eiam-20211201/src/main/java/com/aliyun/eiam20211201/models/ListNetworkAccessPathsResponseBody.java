// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessPathsResponseBody extends TeaModel {
    /**
     * <p>The list of network endpoint access paths.</p>
     */
    @NameInMap("NetworkAccessPaths")
    public java.util.List<ListNetworkAccessPathsResponseBodyNetworkAccessPaths> networkAccessPaths;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNetworkAccessPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessPathsResponseBody self = new ListNetworkAccessPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessPathsResponseBody setNetworkAccessPaths(java.util.List<ListNetworkAccessPathsResponseBodyNetworkAccessPaths> networkAccessPaths) {
        this.networkAccessPaths = networkAccessPaths;
        return this;
    }
    public java.util.List<ListNetworkAccessPathsResponseBodyNetworkAccessPaths> getNetworkAccessPaths() {
        return this.networkAccessPaths;
    }

    public ListNetworkAccessPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNetworkAccessPathsResponseBodyNetworkAccessPaths extends TeaModel {
        /**
         * <p>The time when the dedicated network endpoint access path was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the dedicated network endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>nae_examplexxx</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>The ID of the dedicated network endpoint access path.</p>
         * 
         * <strong>example:</strong>
         * <p>nap_examplexxx</p>
         */
        @NameInMap("NetworkAccessPathId")
        public String networkAccessPathId;

        /**
         * <p>The ID of the ENI that is used by the dedicated network endpoint access path.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-examplexxx</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The private IP address of the ENI that is used by the dedicated network endpoint access path.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The status of the dedicated network endpoint access path. Valid values:</p>
         * <ul>
         * <li><p>pending: The path is being initialized.</p>
         * </li>
         * <li><p>creating: The path is being created.</p>
         * </li>
         * <li><p>running: The path is running.</p>
         * </li>
         * <li><p>deleting: The path is being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the dedicated network endpoint access path was last updated. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the vSwitch to which the ENI of the dedicated network endpoint access path belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-examplexxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static ListNetworkAccessPathsResponseBodyNetworkAccessPaths build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkAccessPathsResponseBodyNetworkAccessPaths self = new ListNetworkAccessPathsResponseBodyNetworkAccessPaths();
            return TeaModel.build(map, self);
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setNetworkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setNetworkAccessPathId(String networkAccessPathId) {
            this.networkAccessPathId = networkAccessPathId;
            return this;
        }
        public String getNetworkAccessPathId() {
            return this.networkAccessPathId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
