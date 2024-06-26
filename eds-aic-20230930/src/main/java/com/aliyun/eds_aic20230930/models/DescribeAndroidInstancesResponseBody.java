// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceModel")
    public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModel> instanceModel;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kmma/xxE9WtwL/ADvZ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAndroidInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAndroidInstancesResponseBody self = new DescribeAndroidInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAndroidInstancesResponseBody setInstanceModel(java.util.List<DescribeAndroidInstancesResponseBodyInstanceModel> instanceModel) {
        this.instanceModel = instanceModel;
        return this;
    }
    public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModel> getInstanceModel() {
        return this.instanceModel;
    }

    public DescribeAndroidInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAndroidInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAndroidInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ag-ayyhomlal7po****</p>
         */
        @NameInMap("AndroidInstanceGroupId")
        public String androidInstanceGroupId;

        /**
         * <strong>example:</strong>
         * <p>acp-8at8h6ejkadjh****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("AndroidInstanceName")
        public String androidInstanceName;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AndroidInstanceStatus")
        public String androidInstanceStatus;

        /**
         * <strong>example:</strong>
         * <p>aig-i7yv6tkn7kh8dv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <strong>example:</strong>
         * <p>ai-9ey6io0q58rcd****</p>
         */
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthorizedUserId")
        public String authorizedUserId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BindUserId")
        public String bindUserId;

        /**
         * <strong>example:</strong>
         * <p>FilePathNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>2023-05-06 10:42:10</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2023-05-06 10:42:10</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>kp-5hh431emkpucs****</p>
         */
        @NameInMap("KeyPairId")
        public String keyPairId;

        /**
         * <strong>example:</strong>
         * <p>192.168.22.48</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        /**
         * <strong>example:</strong>
         * <p>p-0btrd5zj8epo****</p>
         */
        @NameInMap("PersistentAppInstanceId")
        public String persistentAppInstanceId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeAndroidInstancesResponseBodyInstanceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModel self = new DescribeAndroidInstancesResponseBodyInstanceModel();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceGroupId(String androidInstanceGroupId) {
            this.androidInstanceGroupId = androidInstanceGroupId;
            return this;
        }
        public String getAndroidInstanceGroupId() {
            return this.androidInstanceGroupId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceName(String androidInstanceName) {
            this.androidInstanceName = androidInstanceName;
            return this;
        }
        public String getAndroidInstanceName() {
            return this.androidInstanceName;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceStatus(String androidInstanceStatus) {
            this.androidInstanceStatus = androidInstanceStatus;
            return this;
        }
        public String getAndroidInstanceStatus() {
            return this.androidInstanceStatus;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAuthorizedUserId(String authorizedUserId) {
            this.authorizedUserId = authorizedUserId;
            return this;
        }
        public String getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setBindUserId(String bindUserId) {
            this.bindUserId = bindUserId;
            return this;
        }
        public String getBindUserId() {
            return this.bindUserId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public String getKeyPairId() {
            return this.keyPairId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setNetworkInterfaceIp(String networkInterfaceIp) {
            this.networkInterfaceIp = networkInterfaceIp;
            return this;
        }
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPersistentAppInstanceId(String persistentAppInstanceId) {
            this.persistentAppInstanceId = persistentAppInstanceId;
            return this;
        }
        public String getPersistentAppInstanceId() {
            return this.persistentAppInstanceId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
