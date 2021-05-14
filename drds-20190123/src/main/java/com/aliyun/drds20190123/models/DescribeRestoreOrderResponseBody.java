// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRestoreOrderResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RestoreOrderDO")
    public DescribeRestoreOrderResponseBodyRestoreOrderDO restoreOrderDO;

    public static DescribeRestoreOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreOrderResponseBody self = new DescribeRestoreOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRestoreOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreOrderResponseBody setRestoreOrderDO(DescribeRestoreOrderResponseBodyRestoreOrderDO restoreOrderDO) {
        this.restoreOrderDO = restoreOrderDO;
        return this;
    }
    public DescribeRestoreOrderResponseBodyRestoreOrderDO getRestoreOrderDO() {
        return this.restoreOrderDO;
    }

    public static class DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Network")
        public String network;

        @NameInMap("VSwtichId")
        public String VSwtichId;

        @NameInMap("InstSpec")
        public String instSpec;

        @NameInMap("AzoneId")
        public String azoneId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList self = new DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList setVSwtichId(String VSwtichId) {
            this.VSwtichId = VSwtichId;
            return this;
        }
        public String getVSwtichId() {
            return this.VSwtichId;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList setInstSpec(String instSpec) {
            this.instSpec = instSpec;
            return this;
        }
        public String getInstSpec() {
            return this.instSpec;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList setAzoneId(String azoneId) {
            this.azoneId = azoneId;
            return this;
        }
        public String getAzoneId() {
            return this.azoneId;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOList extends TeaModel {
        @NameInMap("DrdsOrderDOList")
        public java.util.List<DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList> drdsOrderDOList;

        public static DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOList self = new DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOList setDrdsOrderDOList(java.util.List<DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList> drdsOrderDOList) {
            this.drdsOrderDOList = drdsOrderDOList;
            return this;
        }
        public java.util.List<DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOListDrdsOrderDOList> getDrdsOrderDOList() {
            return this.drdsOrderDOList;
        }

    }

    public static class DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList extends TeaModel {
        @NameInMap("Network")
        public String network;

        @NameInMap("Version")
        public String version;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("DbInstanceStorage")
        public String dbInstanceStorage;

        @NameInMap("Num")
        public Long num;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("AzoneId")
        public String azoneId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList self = new DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList setDbInstanceStorage(String dbInstanceStorage) {
            this.dbInstanceStorage = dbInstanceStorage;
            return this;
        }
        public String getDbInstanceStorage() {
            return this.dbInstanceStorage;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList setAzoneId(String azoneId) {
            this.azoneId = azoneId;
            return this;
        }
        public String getAzoneId() {
            return this.azoneId;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOList extends TeaModel {
        @NameInMap("RdsOrderDOList")
        public java.util.List<DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList> rdsOrderDOList;

        public static DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOList self = new DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOList setRdsOrderDOList(java.util.List<DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList> rdsOrderDOList) {
            this.rdsOrderDOList = rdsOrderDOList;
            return this;
        }
        public java.util.List<DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOListRdsOrderDOList> getRdsOrderDOList() {
            return this.rdsOrderDOList;
        }

    }

    public static class DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList extends TeaModel {
        @NameInMap("Network")
        public String network;

        @NameInMap("Version")
        public String version;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("DbInstanceStorage")
        public String dbInstanceStorage;

        @NameInMap("Num")
        public Long num;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("AzoneId")
        public String azoneId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList self = new DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList setDbInstanceStorage(String dbInstanceStorage) {
            this.dbInstanceStorage = dbInstanceStorage;
            return this;
        }
        public String getDbInstanceStorage() {
            return this.dbInstanceStorage;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList setAzoneId(String azoneId) {
            this.azoneId = azoneId;
            return this;
        }
        public String getAzoneId() {
            return this.azoneId;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOList extends TeaModel {
        @NameInMap("PolarOrderDOList")
        public java.util.List<DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList> polarOrderDOList;

        public static DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOList self = new DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOList setPolarOrderDOList(java.util.List<DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList> polarOrderDOList) {
            this.polarOrderDOList = polarOrderDOList;
            return this;
        }
        public java.util.List<DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOListPolarOrderDOList> getPolarOrderDOList() {
            return this.polarOrderDOList;
        }

    }

    public static class DescribeRestoreOrderResponseBodyRestoreOrderDO extends TeaModel {
        @NameInMap("DrdsOrderDOList")
        public DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOList drdsOrderDOList;

        @NameInMap("RdsOrderDOList")
        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOList rdsOrderDOList;

        @NameInMap("PolarOrderDOList")
        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOList polarOrderDOList;

        public static DescribeRestoreOrderResponseBodyRestoreOrderDO build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseBodyRestoreOrderDO self = new DescribeRestoreOrderResponseBodyRestoreOrderDO();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDO setDrdsOrderDOList(DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOList drdsOrderDOList) {
            this.drdsOrderDOList = drdsOrderDOList;
            return this;
        }
        public DescribeRestoreOrderResponseBodyRestoreOrderDODrdsOrderDOList getDrdsOrderDOList() {
            return this.drdsOrderDOList;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDO setRdsOrderDOList(DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOList rdsOrderDOList) {
            this.rdsOrderDOList = rdsOrderDOList;
            return this;
        }
        public DescribeRestoreOrderResponseBodyRestoreOrderDORdsOrderDOList getRdsOrderDOList() {
            return this.rdsOrderDOList;
        }

        public DescribeRestoreOrderResponseBodyRestoreOrderDO setPolarOrderDOList(DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOList polarOrderDOList) {
            this.polarOrderDOList = polarOrderDOList;
            return this;
        }
        public DescribeRestoreOrderResponseBodyRestoreOrderDOPolarOrderDOList getPolarOrderDOList() {
            return this.polarOrderDOList;
        }

    }

}
