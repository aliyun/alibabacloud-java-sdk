// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetDeliveryPackageResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetDeliveryPackageResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetDeliveryPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryPackageResponseBody self = new GetDeliveryPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeliveryPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeliveryPackageResponseBody setData(GetDeliveryPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeliveryPackageResponseBodyData getData() {
        return this.data;
    }

    public GetDeliveryPackageResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetDeliveryPackageResponseBodyData extends TeaModel {
        @NameInMap("deliverableUID")
        public String deliverableUID;

        @NameInMap("originDeliverableUID")
        public String originDeliverableUID;

        @NameInMap("packageContentType")
        public String packageContentType;

        @NameInMap("packageSize")
        public String packageSize;

        @NameInMap("packageStatus")
        public String packageStatus;

        @NameInMap("packageType")
        public String packageType;

        @NameInMap("packageUID")
        public String packageUID;

        @NameInMap("packageURL")
        public String packageURL;

        @NameInMap("platform")
        public String platform;

        public static GetDeliveryPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryPackageResponseBodyData self = new GetDeliveryPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeliveryPackageResponseBodyData setDeliverableUID(String deliverableUID) {
            this.deliverableUID = deliverableUID;
            return this;
        }
        public String getDeliverableUID() {
            return this.deliverableUID;
        }

        public GetDeliveryPackageResponseBodyData setOriginDeliverableUID(String originDeliverableUID) {
            this.originDeliverableUID = originDeliverableUID;
            return this;
        }
        public String getOriginDeliverableUID() {
            return this.originDeliverableUID;
        }

        public GetDeliveryPackageResponseBodyData setPackageContentType(String packageContentType) {
            this.packageContentType = packageContentType;
            return this;
        }
        public String getPackageContentType() {
            return this.packageContentType;
        }

        public GetDeliveryPackageResponseBodyData setPackageSize(String packageSize) {
            this.packageSize = packageSize;
            return this;
        }
        public String getPackageSize() {
            return this.packageSize;
        }

        public GetDeliveryPackageResponseBodyData setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
            return this;
        }
        public String getPackageStatus() {
            return this.packageStatus;
        }

        public GetDeliveryPackageResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetDeliveryPackageResponseBodyData setPackageUID(String packageUID) {
            this.packageUID = packageUID;
            return this;
        }
        public String getPackageUID() {
            return this.packageUID;
        }

        public GetDeliveryPackageResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public GetDeliveryPackageResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

    }

}
