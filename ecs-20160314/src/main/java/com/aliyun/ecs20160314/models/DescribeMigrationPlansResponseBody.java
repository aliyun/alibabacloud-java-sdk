// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeMigrationPlansResponseBody extends TeaModel {
    @NameInMap("MigrationPlanSet")
    public MigrationPlanSet migrationPlanSet;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeMigrationPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationPlansResponseBody self = new DescribeMigrationPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationPlansResponseBody setMigrationPlanSet(MigrationPlanSet migrationPlanSet) {
        this.migrationPlanSet = migrationPlanSet;
        return this;
    }
    public MigrationPlanSet getMigrationPlanSet() {
        return this.migrationPlanSet;
    }

    public DescribeMigrationPlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrationPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMigrationPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationPlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SecurityGroupNos extends TeaModel {
        @NameInMap("SecurityGroupNo")
        public java.util.List<String> securityGroupNo;

        public static SecurityGroupNos build(java.util.Map<String, ?> map) throws Exception {
            SecurityGroupNos self = new SecurityGroupNos();
            return TeaModel.build(map, self);
        }

        public SecurityGroupNos setSecurityGroupNo(java.util.List<String> securityGroupNo) {
            this.securityGroupNo = securityGroupNo;
            return this;
        }
        public java.util.List<String> getSecurityGroupNo() {
            return this.securityGroupNo;
        }

    }

    public static class MigrationPlan extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EnableAutoCreateVSwitch")
        public Boolean enableAutoCreateVSwitch;

        @NameInMap("EnableNetworkConnectivity")
        public Boolean enableNetworkConnectivity;

        @NameInMap("FinishInstanceCount")
        public Integer finishInstanceCount;

        @NameInMap("MigrationPlanId")
        public String migrationPlanId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RemainPrivateIp")
        public Boolean remainPrivateIp;

        @NameInMap("RemainPublicMacAsPriority")
        public Boolean remainPublicMacAsPriority;

        @NameInMap("SecurityGroupNos")
        public SecurityGroupNos securityGroupNos;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetVSwitchId")
        public String targetVSwitchId;

        @NameInMap("TargetVpcId")
        public String targetVpcId;

        @NameInMap("TargetZoneId")
        public String targetZoneId;

        @NameInMap("TotalInstanceCount")
        public Integer totalInstanceCount;

        @NameInMap("Type")
        public String type;

        public static MigrationPlan build(java.util.Map<String, ?> map) throws Exception {
            MigrationPlan self = new MigrationPlan();
            return TeaModel.build(map, self);
        }

        public MigrationPlan setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public MigrationPlan setEnableAutoCreateVSwitch(Boolean enableAutoCreateVSwitch) {
            this.enableAutoCreateVSwitch = enableAutoCreateVSwitch;
            return this;
        }
        public Boolean getEnableAutoCreateVSwitch() {
            return this.enableAutoCreateVSwitch;
        }

        public MigrationPlan setEnableNetworkConnectivity(Boolean enableNetworkConnectivity) {
            this.enableNetworkConnectivity = enableNetworkConnectivity;
            return this;
        }
        public Boolean getEnableNetworkConnectivity() {
            return this.enableNetworkConnectivity;
        }

        public MigrationPlan setFinishInstanceCount(Integer finishInstanceCount) {
            this.finishInstanceCount = finishInstanceCount;
            return this;
        }
        public Integer getFinishInstanceCount() {
            return this.finishInstanceCount;
        }

        public MigrationPlan setMigrationPlanId(String migrationPlanId) {
            this.migrationPlanId = migrationPlanId;
            return this;
        }
        public String getMigrationPlanId() {
            return this.migrationPlanId;
        }

        public MigrationPlan setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MigrationPlan setRemainPrivateIp(Boolean remainPrivateIp) {
            this.remainPrivateIp = remainPrivateIp;
            return this;
        }
        public Boolean getRemainPrivateIp() {
            return this.remainPrivateIp;
        }

        public MigrationPlan setRemainPublicMacAsPriority(Boolean remainPublicMacAsPriority) {
            this.remainPublicMacAsPriority = remainPublicMacAsPriority;
            return this;
        }
        public Boolean getRemainPublicMacAsPriority() {
            return this.remainPublicMacAsPriority;
        }

        public MigrationPlan setSecurityGroupNos(SecurityGroupNos securityGroupNos) {
            this.securityGroupNos = securityGroupNos;
            return this;
        }
        public SecurityGroupNos getSecurityGroupNos() {
            return this.securityGroupNos;
        }

        public MigrationPlan setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public MigrationPlan setTargetVSwitchId(String targetVSwitchId) {
            this.targetVSwitchId = targetVSwitchId;
            return this;
        }
        public String getTargetVSwitchId() {
            return this.targetVSwitchId;
        }

        public MigrationPlan setTargetVpcId(String targetVpcId) {
            this.targetVpcId = targetVpcId;
            return this;
        }
        public String getTargetVpcId() {
            return this.targetVpcId;
        }

        public MigrationPlan setTargetZoneId(String targetZoneId) {
            this.targetZoneId = targetZoneId;
            return this;
        }
        public String getTargetZoneId() {
            return this.targetZoneId;
        }

        public MigrationPlan setTotalInstanceCount(Integer totalInstanceCount) {
            this.totalInstanceCount = totalInstanceCount;
            return this;
        }
        public Integer getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

        public MigrationPlan setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MigrationPlanSet extends TeaModel {
        @NameInMap("MigrationPlan")
        public java.util.List<MigrationPlan> migrationPlan;

        public static MigrationPlanSet build(java.util.Map<String, ?> map) throws Exception {
            MigrationPlanSet self = new MigrationPlanSet();
            return TeaModel.build(map, self);
        }

        public MigrationPlanSet setMigrationPlan(java.util.List<MigrationPlan> migrationPlan) {
            this.migrationPlan = migrationPlan;
            return this;
        }
        public java.util.List<MigrationPlan> getMigrationPlan() {
            return this.migrationPlan;
        }

    }

}
