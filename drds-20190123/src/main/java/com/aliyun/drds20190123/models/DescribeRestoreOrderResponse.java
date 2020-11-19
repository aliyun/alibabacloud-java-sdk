// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRestoreOrderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RestoreOrderDO")
    @Validation(required = true)
    public DescribeRestoreOrderResponseRestoreOrderDO restoreOrderDO;

    public static DescribeRestoreOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreOrderResponse self = new DescribeRestoreOrderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRestoreOrderResponse setRestoreOrderDO(DescribeRestoreOrderResponseRestoreOrderDO restoreOrderDO) {
        this.restoreOrderDO = restoreOrderDO;
        return this;
    }
    public DescribeRestoreOrderResponseRestoreOrderDO getRestoreOrderDO() {
        return this.restoreOrderDO;
    }

    public static class DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("AzoneId")
        @Validation(required = true)
        public String azoneId;

        @NameInMap("Network")
        @Validation(required = true)
        public String network;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwtichId")
        @Validation(required = true)
        public String VSwtichId;

        @NameInMap("InstSpec")
        @Validation(required = true)
        public String instSpec;

        public static DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList self = new DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList setAzoneId(String azoneId) {
            this.azoneId = azoneId;
            return this;
        }
        public String getAzoneId() {
            return this.azoneId;
        }

        public DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList setVSwtichId(String VSwtichId) {
            this.VSwtichId = VSwtichId;
            return this;
        }
        public String getVSwtichId() {
            return this.VSwtichId;
        }

        public DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList setInstSpec(String instSpec) {
            this.instSpec = instSpec;
            return this;
        }
        public String getInstSpec() {
            return this.instSpec;
        }

    }

    public static class DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOList extends TeaModel {
        @NameInMap("DrdsOrderDOList")
        @Validation(required = true)
        public java.util.List<DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList> drdsOrderDOList;

        public static DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOList self = new DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOList setDrdsOrderDOList(java.util.List<DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList> drdsOrderDOList) {
            this.drdsOrderDOList = drdsOrderDOList;
            return this;
        }
        public java.util.List<DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOListDrdsOrderDOList> getDrdsOrderDOList() {
            return this.drdsOrderDOList;
        }

    }

    public static class DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("AzoneId")
        @Validation(required = true)
        public String azoneId;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("InstanceClass")
        @Validation(required = true)
        public String instanceClass;

        @NameInMap("DbInstanceStorage")
        @Validation(required = true)
        public String dbInstanceStorage;

        @NameInMap("Network")
        @Validation(required = true)
        public String network;

        @NameInMap("Num")
        @Validation(required = true)
        public Long num;

        public static DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList self = new DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList setAzoneId(String azoneId) {
            this.azoneId = azoneId;
            return this;
        }
        public String getAzoneId() {
            return this.azoneId;
        }

        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList setDbInstanceStorage(String dbInstanceStorage) {
            this.dbInstanceStorage = dbInstanceStorage;
            return this;
        }
        public String getDbInstanceStorage() {
            return this.dbInstanceStorage;
        }

        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

    }

    public static class DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOList extends TeaModel {
        @NameInMap("RdsOrderDOList")
        @Validation(required = true)
        public java.util.List<DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList> rdsOrderDOList;

        public static DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOList self = new DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOList setRdsOrderDOList(java.util.List<DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList> rdsOrderDOList) {
            this.rdsOrderDOList = rdsOrderDOList;
            return this;
        }
        public java.util.List<DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOListRdsOrderDOList> getRdsOrderDOList() {
            return this.rdsOrderDOList;
        }

    }

    public static class DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("AzoneId")
        @Validation(required = true)
        public String azoneId;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("InstanceClass")
        @Validation(required = true)
        public String instanceClass;

        @NameInMap("DbInstanceStorage")
        @Validation(required = true)
        public String dbInstanceStorage;

        @NameInMap("Network")
        @Validation(required = true)
        public String network;

        @NameInMap("Num")
        @Validation(required = true)
        public Long num;

        public static DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList self = new DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList setAzoneId(String azoneId) {
            this.azoneId = azoneId;
            return this;
        }
        public String getAzoneId() {
            return this.azoneId;
        }

        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList setDbInstanceStorage(String dbInstanceStorage) {
            this.dbInstanceStorage = dbInstanceStorage;
            return this;
        }
        public String getDbInstanceStorage() {
            return this.dbInstanceStorage;
        }

        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

    }

    public static class DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOList extends TeaModel {
        @NameInMap("PolarOrderDOList")
        @Validation(required = true)
        public java.util.List<DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList> polarOrderDOList;

        public static DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOList self = new DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOList();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOList setPolarOrderDOList(java.util.List<DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList> polarOrderDOList) {
            this.polarOrderDOList = polarOrderDOList;
            return this;
        }
        public java.util.List<DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOListPolarOrderDOList> getPolarOrderDOList() {
            return this.polarOrderDOList;
        }

    }

    public static class DescribeRestoreOrderResponseRestoreOrderDO extends TeaModel {
        @NameInMap("DrdsOrderDOList")
        @Validation(required = true)
        public DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOList drdsOrderDOList;

        @NameInMap("RdsOrderDOList")
        @Validation(required = true)
        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOList rdsOrderDOList;

        @NameInMap("PolarOrderDOList")
        @Validation(required = true)
        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOList polarOrderDOList;

        public static DescribeRestoreOrderResponseRestoreOrderDO build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreOrderResponseRestoreOrderDO self = new DescribeRestoreOrderResponseRestoreOrderDO();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreOrderResponseRestoreOrderDO setDrdsOrderDOList(DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOList drdsOrderDOList) {
            this.drdsOrderDOList = drdsOrderDOList;
            return this;
        }
        public DescribeRestoreOrderResponseRestoreOrderDODrdsOrderDOList getDrdsOrderDOList() {
            return this.drdsOrderDOList;
        }

        public DescribeRestoreOrderResponseRestoreOrderDO setRdsOrderDOList(DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOList rdsOrderDOList) {
            this.rdsOrderDOList = rdsOrderDOList;
            return this;
        }
        public DescribeRestoreOrderResponseRestoreOrderDORdsOrderDOList getRdsOrderDOList() {
            return this.rdsOrderDOList;
        }

        public DescribeRestoreOrderResponseRestoreOrderDO setPolarOrderDOList(DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOList polarOrderDOList) {
            this.polarOrderDOList = polarOrderDOList;
            return this;
        }
        public DescribeRestoreOrderResponseRestoreOrderDOPolarOrderDOList getPolarOrderDOList() {
            return this.polarOrderDOList;
        }

    }

}
