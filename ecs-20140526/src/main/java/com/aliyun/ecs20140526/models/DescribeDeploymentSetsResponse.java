// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("DeploymentSets")
    @Validation(required = true)
    public DescribeDeploymentSetsResponseDeploymentSets deploymentSets;

    public static DescribeDeploymentSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetsResponse self = new DescribeDeploymentSetsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds extends TeaModel {
        // InstanceId
        @NameInMap("InstanceId")
        @Validation(required = true)
        public java.util.List<String> instanceId;

        public static DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds self = new DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet extends TeaModel {
        @NameInMap("DeploymentSetId")
        @Validation(required = true)
        public String deploymentSetId;

        @NameInMap("DeploymentSetDescription")
        @Validation(required = true)
        public String deploymentSetDescription;

        @NameInMap("DeploymentSetName")
        @Validation(required = true)
        public String deploymentSetName;

        @NameInMap("Strategy")
        @Validation(required = true)
        public String strategy;

        @NameInMap("DeploymentStrategy")
        @Validation(required = true)
        public String deploymentStrategy;

        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("Granularity")
        @Validation(required = true)
        public String granularity;

        @NameInMap("GroupCount")
        @Validation(required = true)
        public Integer groupCount;

        @NameInMap("InstanceAmount")
        @Validation(required = true)
        public Integer instanceAmount;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("InstanceIds")
        @Validation(required = true)
        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds instanceIds;

        public static DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet self = new DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDeploymentSetsResponseDeploymentSets extends TeaModel {
        @NameInMap("DeploymentSet")
        @Validation(required = true)
        public java.util.List<DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet> deploymentSet;

        public static DescribeDeploymentSetsResponseDeploymentSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseDeploymentSets self = new DescribeDeploymentSetsResponseDeploymentSets();
            return TeaModel.build(map, self);
        }

    }

}
