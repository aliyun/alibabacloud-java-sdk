// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailResponseBody extends TeaModel {
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    @NameInMap("state")
    @Validation(required = true)
    public String state;

    @NameInMap("cluster_type")
    @Validation(required = true)
    public String clusterType;

    @NameInMap("current_version")
    @Validation(required = true)
    public String currentVersion;

    @NameInMap("meta_data")
    @Validation(required = true)
    public String metaData;

    @NameInMap("resource_group_id")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("instance_type")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("vswitch_id")
    @Validation(required = true)
    public String vswitchId;

    @NameInMap("vswitch_cidr")
    @Validation(required = true)
    public String vswitchCidr;

    @NameInMap("security_group_id")
    @Validation(required = true)
    public String securityGroupId;

    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("network_mode")
    @Validation(required = true)
    public String networkMode;

    @NameInMap("docker_version")
    @Validation(required = true)
    public String dockerVersion;

    @NameInMap("deletion_protection")
    @Validation(required = true)
    public Boolean deletionProtection;

    @NameInMap("external_loadbalancer_id")
    @Validation(required = true)
    public String externalLoadbalancerId;

    @NameInMap("created")
    @Validation(required = true)
    public String created;

    @NameInMap("updated")
    @Validation(required = true)
    public String updated;

    @NameInMap("size")
    @Validation(required = true)
    public Integer size;

    @NameInMap("tags")
    @Validation(required = true)
    public java.util.List<DescribeClusterDetailResponseBodyTags> tags;

    public static DescribeClusterDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailResponseBody self = new DescribeClusterDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public static class DescribeClusterDetailResponseBodyTags extends TeaModel {
        @NameInMap("key")
        @Validation(required = true)
        public String key;

        @NameInMap("value")
        @Validation(required = true)
        public String value;

        public static DescribeClusterDetailResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterDetailResponseBodyTags self = new DescribeClusterDetailResponseBodyTags();
            return TeaModel.build(map, self);
        }

    }

}
