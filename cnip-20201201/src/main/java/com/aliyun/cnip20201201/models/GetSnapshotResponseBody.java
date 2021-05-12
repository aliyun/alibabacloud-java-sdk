// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetSnapshotResponseBody extends TeaModel {
    @NameInMap("data")
    public GetSnapshotResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotResponseBody self = new GetSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSnapshotResponseBody setData(GetSnapshotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSnapshotResponseBodyData getData() {
        return this.data;
    }

    public GetSnapshotResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetSnapshotResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSnapshotResponseBodyData extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("instanceCIDR")
        public String instanceCIDR;

        @NameInMap("name")
        public String name;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("productVersionDesc")
        public String productVersionDesc;

        @NameInMap("region")
        public String region;

        @NameInMap("snapshotRegion")
        public String snapshotRegion;

        @NameInMap("snapshotStatus")
        public String snapshotStatus;

        @NameInMap("sourceEnvironmentUID")
        public String sourceEnvironmentUID;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("uid")
        public String uid;

        @NameInMap("vpcid")
        public String vpcid;

        public static GetSnapshotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotResponseBodyData self = new GetSnapshotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSnapshotResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSnapshotResponseBodyData setInstanceCIDR(String instanceCIDR) {
            this.instanceCIDR = instanceCIDR;
            return this;
        }
        public String getInstanceCIDR() {
            return this.instanceCIDR;
        }

        public GetSnapshotResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSnapshotResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetSnapshotResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetSnapshotResponseBodyData setProductVersionDesc(String productVersionDesc) {
            this.productVersionDesc = productVersionDesc;
            return this;
        }
        public String getProductVersionDesc() {
            return this.productVersionDesc;
        }

        public GetSnapshotResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetSnapshotResponseBodyData setSnapshotRegion(String snapshotRegion) {
            this.snapshotRegion = snapshotRegion;
            return this;
        }
        public String getSnapshotRegion() {
            return this.snapshotRegion;
        }

        public GetSnapshotResponseBodyData setSnapshotStatus(String snapshotStatus) {
            this.snapshotStatus = snapshotStatus;
            return this;
        }
        public String getSnapshotStatus() {
            return this.snapshotStatus;
        }

        public GetSnapshotResponseBodyData setSourceEnvironmentUID(String sourceEnvironmentUID) {
            this.sourceEnvironmentUID = sourceEnvironmentUID;
            return this;
        }
        public String getSourceEnvironmentUID() {
            return this.sourceEnvironmentUID;
        }

        public GetSnapshotResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetSnapshotResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetSnapshotResponseBodyData setVpcid(String vpcid) {
            this.vpcid = vpcid;
            return this;
        }
        public String getVpcid() {
            return this.vpcid;
        }

    }

}
