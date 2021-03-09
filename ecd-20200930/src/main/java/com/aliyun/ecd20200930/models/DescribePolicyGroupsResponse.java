// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePolicyGroupsResponse extends TeaModel {
    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DescribePolicyGroups")
    @Validation(required = true)
    public java.util.List<DescribePolicyGroupsResponseDescribePolicyGroups> describePolicyGroups;

    public static DescribePolicyGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGroupsResponse self = new DescribePolicyGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyGroupsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePolicyGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolicyGroupsResponse setDescribePolicyGroups(java.util.List<DescribePolicyGroupsResponseDescribePolicyGroups> describePolicyGroups) {
        this.describePolicyGroups = describePolicyGroups;
        return this;
    }
    public java.util.List<DescribePolicyGroupsResponseDescribePolicyGroups> getDescribePolicyGroups() {
        return this.describePolicyGroups;
    }

    public static class DescribePolicyGroupsResponseDescribePolicyGroups extends TeaModel {
        @NameInMap("PolicyGroupId")
        @Validation(required = true)
        public String policyGroupId;

        @NameInMap("PolicyGroupType")
        @Validation(required = true)
        public String policyGroupType;

        @NameInMap("Clipboard")
        @Validation(required = true)
        public String clipboard;

        @NameInMap("LocalDrive")
        @Validation(required = true)
        public String localDrive;

        @NameInMap("UsbRedirect")
        @Validation(required = true)
        public String usbRedirect;

        @NameInMap("Watermark")
        @Validation(required = true)
        public String watermark;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("WatermarkType")
        @Validation(required = true)
        public String watermarkType;

        @NameInMap("WatermarkCustomText")
        @Validation(required = true)
        public String watermarkCustomText;

        @NameInMap("WatermarkTransparency")
        @Validation(required = true)
        public String watermarkTransparency;

        @NameInMap("PolicyStatus")
        @Validation(required = true)
        public String policyStatus;

        @NameInMap("EdsCount")
        @Validation(required = true)
        public Integer edsCount;

        public static DescribePolicyGroupsResponseDescribePolicyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseDescribePolicyGroups self = new DescribePolicyGroupsResponseDescribePolicyGroups();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setPolicyGroupType(String policyGroupType) {
            this.policyGroupType = policyGroupType;
            return this;
        }
        public String getPolicyGroupType() {
            return this.policyGroupType;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setLocalDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }
        public String getLocalDrive() {
            return this.localDrive;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setUsbRedirect(String usbRedirect) {
            this.usbRedirect = usbRedirect;
            return this;
        }
        public String getUsbRedirect() {
            return this.usbRedirect;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setWatermark(String watermark) {
            this.watermark = watermark;
            return this;
        }
        public String getWatermark() {
            return this.watermark;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setWatermarkType(String watermarkType) {
            this.watermarkType = watermarkType;
            return this;
        }
        public String getWatermarkType() {
            return this.watermarkType;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setWatermarkCustomText(String watermarkCustomText) {
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }
        public String getWatermarkCustomText() {
            return this.watermarkCustomText;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setWatermarkTransparency(String watermarkTransparency) {
            this.watermarkTransparency = watermarkTransparency;
            return this;
        }
        public String getWatermarkTransparency() {
            return this.watermarkTransparency;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setEdsCount(Integer edsCount) {
            this.edsCount = edsCount;
            return this;
        }
        public Integer getEdsCount() {
            return this.edsCount;
        }

    }

}
