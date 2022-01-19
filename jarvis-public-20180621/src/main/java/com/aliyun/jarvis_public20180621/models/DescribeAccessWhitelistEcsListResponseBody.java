// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeAccessWhitelistEcsListResponseBody extends TeaModel {
    @NameInMap("EcsList")
    public java.util.List<DescribeAccessWhitelistEcsListResponseBodyEcsList> ecsList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("module")
    public String module;

    public static DescribeAccessWhitelistEcsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessWhitelistEcsListResponseBody self = new DescribeAccessWhitelistEcsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessWhitelistEcsListResponseBody setEcsList(java.util.List<DescribeAccessWhitelistEcsListResponseBodyEcsList> ecsList) {
        this.ecsList = ecsList;
        return this;
    }
    public java.util.List<DescribeAccessWhitelistEcsListResponseBodyEcsList> getEcsList() {
        return this.ecsList;
    }

    public DescribeAccessWhitelistEcsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessWhitelistEcsListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessWhitelistEcsListResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public static class DescribeAccessWhitelistEcsListResponseBodyEcsList extends TeaModel {
        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        public static DescribeAccessWhitelistEcsListResponseBodyEcsList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessWhitelistEcsListResponseBodyEcsList self = new DescribeAccessWhitelistEcsListResponseBodyEcsList();
            return TeaModel.build(map, self);
        }

        public DescribeAccessWhitelistEcsListResponseBodyEcsList setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeAccessWhitelistEcsListResponseBodyEcsList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAccessWhitelistEcsListResponseBodyEcsList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
