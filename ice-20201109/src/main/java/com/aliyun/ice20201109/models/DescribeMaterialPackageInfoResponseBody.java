// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMaterialPackageInfoResponseBody extends TeaModel {
    @NameInMap("MaterialPackageInfoList")
    public java.util.List<DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList> materialPackageInfoList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMaterialPackageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaterialPackageInfoResponseBody self = new DescribeMaterialPackageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMaterialPackageInfoResponseBody setMaterialPackageInfoList(java.util.List<DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList> materialPackageInfoList) {
        this.materialPackageInfoList = materialPackageInfoList;
        return this;
    }
    public java.util.List<DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList> getMaterialPackageInfoList() {
        return this.materialPackageInfoList;
    }

    public DescribeMaterialPackageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList extends TeaModel {
        @NameInMap("CurrCapacity")
        public String currCapacity;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InitCapacity")
        public String initCapacity;

        @NameInMap("RemainingAuthTime")
        public String remainingAuthTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList self = new DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList();
            return TeaModel.build(map, self);
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList setCurrCapacity(String currCapacity) {
            this.currCapacity = currCapacity;
            return this;
        }
        public String getCurrCapacity() {
            return this.currCapacity;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList setInitCapacity(String initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public String getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList setRemainingAuthTime(String remainingAuthTime) {
            this.remainingAuthTime = remainingAuthTime;
            return this;
        }
        public String getRemainingAuthTime() {
            return this.remainingAuthTime;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList extends TeaModel {
        @NameInMap("AuthTime")
        public String authTime;

        @NameInMap("Authorized")
        public Boolean authorized;

        @NameInMap("DisplayPrice")
        public String displayPrice;

        @NameInMap("InitCapacity")
        public String initCapacity;

        @NameInMap("MaterialCount")
        public Integer materialCount;

        @NameInMap("MaterialPackageId")
        public String materialPackageId;

        @NameInMap("MaterialPackagePurchaseList")
        public java.util.List<DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList> materialPackagePurchaseList;

        public static DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList self = new DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList setAuthTime(String authTime) {
            this.authTime = authTime;
            return this;
        }
        public String getAuthTime() {
            return this.authTime;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList setAuthorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }
        public Boolean getAuthorized() {
            return this.authorized;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList setDisplayPrice(String displayPrice) {
            this.displayPrice = displayPrice;
            return this;
        }
        public String getDisplayPrice() {
            return this.displayPrice;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList setInitCapacity(String initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public String getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList setMaterialCount(Integer materialCount) {
            this.materialCount = materialCount;
            return this;
        }
        public Integer getMaterialCount() {
            return this.materialCount;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList setMaterialPackageId(String materialPackageId) {
            this.materialPackageId = materialPackageId;
            return this;
        }
        public String getMaterialPackageId() {
            return this.materialPackageId;
        }

        public DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoList setMaterialPackagePurchaseList(java.util.List<DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList> materialPackagePurchaseList) {
            this.materialPackagePurchaseList = materialPackagePurchaseList;
            return this;
        }
        public java.util.List<DescribeMaterialPackageInfoResponseBodyMaterialPackageInfoListMaterialPackagePurchaseList> getMaterialPackagePurchaseList() {
            return this.materialPackagePurchaseList;
        }

    }

}
