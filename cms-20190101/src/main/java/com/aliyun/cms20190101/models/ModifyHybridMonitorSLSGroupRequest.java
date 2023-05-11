// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHybridMonitorSLSGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SLSGroupConfig")
    public java.util.List<ModifyHybridMonitorSLSGroupRequestSLSGroupConfig> SLSGroupConfig;

    /**
     * <p>The operation that you want to perform. Set the value to **ModifyHybridMonitorSLSGroup**.</p>
     */
    @NameInMap("SLSGroupDescription")
    public String SLSGroupDescription;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("SLSGroupName")
    public String SLSGroupName;

    public static ModifyHybridMonitorSLSGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridMonitorSLSGroupRequest self = new ModifyHybridMonitorSLSGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridMonitorSLSGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHybridMonitorSLSGroupRequest setSLSGroupConfig(java.util.List<ModifyHybridMonitorSLSGroupRequestSLSGroupConfig> SLSGroupConfig) {
        this.SLSGroupConfig = SLSGroupConfig;
        return this;
    }
    public java.util.List<ModifyHybridMonitorSLSGroupRequestSLSGroupConfig> getSLSGroupConfig() {
        return this.SLSGroupConfig;
    }

    public ModifyHybridMonitorSLSGroupRequest setSLSGroupDescription(String SLSGroupDescription) {
        this.SLSGroupDescription = SLSGroupDescription;
        return this;
    }
    public String getSLSGroupDescription() {
        return this.SLSGroupDescription;
    }

    public ModifyHybridMonitorSLSGroupRequest setSLSGroupName(String SLSGroupName) {
        this.SLSGroupName = SLSGroupName;
        return this;
    }
    public String getSLSGroupName() {
        return this.SLSGroupName;
    }

    public static class ModifyHybridMonitorSLSGroupRequestSLSGroupConfig extends TeaModel {
        /**
         * <p>The name of the Logstore group.</p>
         * <br>
         * <p>For information about how to obtain the name of a Logstore group, see [DescribeHybridMonitorSLSGroup](~~429526~~).</p>
         */
        @NameInMap("SLSLogstore")
        public String SLSLogstore;

        /**
         * <p>The IDs of the member accounts.</p>
         * <br>
         * <p>Valid values of N: 1 to 25.</p>
         * <br>
         * <p>If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.</p>
         * <br>
         * <p>>  If a member uses CloudMonitor for the first time, you must make sure that the service-linked role AliyunServiceRoleForCloudMonitor is attached to the member. For more information, see [Manage the service-linked role for CloudMonitor](~~170423~~).</p>
         */
        @NameInMap("SLSProject")
        public String SLSProject;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("SLSRegion")
        public String SLSRegion;

        /**
         * <p>The Logstores.</p>
         * <br>
         * <p>Valid values of N: 1 to 25.</p>
         */
        @NameInMap("SLSUserId")
        public String SLSUserId;

        public static ModifyHybridMonitorSLSGroupRequestSLSGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyHybridMonitorSLSGroupRequestSLSGroupConfig self = new ModifyHybridMonitorSLSGroupRequestSLSGroupConfig();
            return TeaModel.build(map, self);
        }

        public ModifyHybridMonitorSLSGroupRequestSLSGroupConfig setSLSLogstore(String SLSLogstore) {
            this.SLSLogstore = SLSLogstore;
            return this;
        }
        public String getSLSLogstore() {
            return this.SLSLogstore;
        }

        public ModifyHybridMonitorSLSGroupRequestSLSGroupConfig setSLSProject(String SLSProject) {
            this.SLSProject = SLSProject;
            return this;
        }
        public String getSLSProject() {
            return this.SLSProject;
        }

        public ModifyHybridMonitorSLSGroupRequestSLSGroupConfig setSLSRegion(String SLSRegion) {
            this.SLSRegion = SLSRegion;
            return this;
        }
        public String getSLSRegion() {
            return this.SLSRegion;
        }

        public ModifyHybridMonitorSLSGroupRequestSLSGroupConfig setSLSUserId(String SLSUserId) {
            this.SLSUserId = SLSUserId;
            return this;
        }
        public String getSLSUserId() {
            return this.SLSUserId;
        }

    }

}
