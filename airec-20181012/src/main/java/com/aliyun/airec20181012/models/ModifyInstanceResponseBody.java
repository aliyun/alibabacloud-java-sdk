// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifyInstanceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public ModifyInstanceResponseBodyResult result;

    public static ModifyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceResponseBody self = new ModifyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyInstanceResponseBody setResult(ModifyInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyInstanceResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DataSetVersion")
        public String dataSetVersion;

        @NameInMap("Industry")
        public String industry;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Scene")
        public String scene;

        public static ModifyInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceResponseBodyResult self = new ModifyInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyInstanceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyInstanceResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ModifyInstanceResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ModifyInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyInstanceResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModifyInstanceResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ModifyInstanceResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifyInstanceResponseBodyResult setDataSetVersion(String dataSetVersion) {
            this.dataSetVersion = dataSetVersion;
            return this;
        }
        public String getDataSetVersion() {
            return this.dataSetVersion;
        }

        public ModifyInstanceResponseBodyResult setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public ModifyInstanceResponseBodyResult setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ModifyInstanceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyInstanceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyInstanceResponseBodyResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

}
