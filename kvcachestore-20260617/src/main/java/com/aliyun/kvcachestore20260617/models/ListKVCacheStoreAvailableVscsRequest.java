// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoreAvailableVscsRequest extends TeaModel {
    /**
     * <p>The cross-account authorization role chain, used for cross-account VSC queries in ecs or eflo scenarios.</p>
     */
    @NameInMap("Arns")
    public java.util.List<ListKVCacheStoreAvailableVscsRequestArns> arns;

    /**
     * <p>The ID of the compute instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-55kl5wq6j6kvtl4xu5tgunddu</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the compute instance. Valid values:</p>
     * <ul>
     * <li>ecs</li>
     * <li>eflo</li>
     * <li>innerECS</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The ID of the KVCacheStore instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kvcs-cn-5y44vuqiz001</p>
     */
    @NameInMap("KvcsId")
    public String kvcsId;

    /**
     * <p>The region ID, such as cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListKVCacheStoreAvailableVscsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoreAvailableVscsRequest self = new ListKVCacheStoreAvailableVscsRequest();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoreAvailableVscsRequest setArns(java.util.List<ListKVCacheStoreAvailableVscsRequestArns> arns) {
        this.arns = arns;
        return this;
    }
    public java.util.List<ListKVCacheStoreAvailableVscsRequestArns> getArns() {
        return this.arns;
    }

    public ListKVCacheStoreAvailableVscsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListKVCacheStoreAvailableVscsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListKVCacheStoreAvailableVscsRequest setKvcsId(String kvcsId) {
        this.kvcsId = kvcsId;
        return this;
    }
    public String getKvcsId() {
        return this.kvcsId;
    }

    public ListKVCacheStoreAvailableVscsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ListKVCacheStoreAvailableVscsRequestArns extends TeaModel {
        /**
         * <p>The UID of the target account for role assumption.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1193522024229156</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1028257687084022:role/zeus-locationservicerole</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The type of the role. Valid values:</p>
         * <ul>
         * <li>service</li>
         * <li>user</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static ListKVCacheStoreAvailableVscsRequestArns build(java.util.Map<String, ?> map) throws Exception {
            ListKVCacheStoreAvailableVscsRequestArns self = new ListKVCacheStoreAvailableVscsRequestArns();
            return TeaModel.build(map, self);
        }

        public ListKVCacheStoreAvailableVscsRequestArns setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public ListKVCacheStoreAvailableVscsRequestArns setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListKVCacheStoreAvailableVscsRequestArns setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
