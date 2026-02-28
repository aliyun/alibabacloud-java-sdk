// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddDeviceToSharePromotionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddDeviceToSharePromotionResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddDeviceToSharePromotionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceToSharePromotionResponseBody self = new AddDeviceToSharePromotionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDeviceToSharePromotionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddDeviceToSharePromotionResponseBody setData(AddDeviceToSharePromotionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDeviceToSharePromotionResponseBodyData getData() {
        return this.data;
    }

    public AddDeviceToSharePromotionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddDeviceToSharePromotionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDeviceToSharePromotionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("FailCode")
        public Integer failCode;

        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("ProductKey")
        public String productKey;

        public static AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem build(java.util.Map<String, ?> map) throws Exception {
            AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem self = new AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem();
            return TeaModel.build(map, self);
        }

        public AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem setFailCode(Integer failCode) {
            this.failCode = failCode;
            return this;
        }
        public Integer getFailCode() {
            return this.failCode;
        }

        public AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoList extends TeaModel {
        @NameInMap("item")
        public java.util.List<AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem> item;

        public static AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoList build(java.util.Map<String, ?> map) throws Exception {
            AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoList self = new AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoList();
            return TeaModel.build(map, self);
        }

        public AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoList setItem(java.util.List<AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoListItem> getItem() {
            return this.item;
        }

    }

    public static class AddDeviceToSharePromotionResponseBodyData extends TeaModel {
        @NameInMap("FailDeviceSimpleInfoList")
        public AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoList failDeviceSimpleInfoList;

        public static AddDeviceToSharePromotionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDeviceToSharePromotionResponseBodyData self = new AddDeviceToSharePromotionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDeviceToSharePromotionResponseBodyData setFailDeviceSimpleInfoList(AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoList failDeviceSimpleInfoList) {
            this.failDeviceSimpleInfoList = failDeviceSimpleInfoList;
            return this;
        }
        public AddDeviceToSharePromotionResponseBodyDataFailDeviceSimpleInfoList getFailDeviceSimpleInfoList() {
            return this.failDeviceSimpleInfoList;
        }

    }

}
