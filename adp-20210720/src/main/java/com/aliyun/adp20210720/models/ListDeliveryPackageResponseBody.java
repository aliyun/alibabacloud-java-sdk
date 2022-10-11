// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListDeliveryPackageResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListDeliveryPackageResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    public static ListDeliveryPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryPackageResponseBody self = new ListDeliveryPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeliveryPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeliveryPackageResponseBody setData(java.util.List<ListDeliveryPackageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeliveryPackageResponseBodyData> getData() {
        return this.data;
    }

    public ListDeliveryPackageResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListDeliveryPackageResponseBodyData extends TeaModel {
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

        public static ListDeliveryPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryPackageResponseBodyData self = new ListDeliveryPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeliveryPackageResponseBodyData setDeliverableUID(String deliverableUID) {
            this.deliverableUID = deliverableUID;
            return this;
        }
        public String getDeliverableUID() {
            return this.deliverableUID;
        }

        public ListDeliveryPackageResponseBodyData setOriginDeliverableUID(String originDeliverableUID) {
            this.originDeliverableUID = originDeliverableUID;
            return this;
        }
        public String getOriginDeliverableUID() {
            return this.originDeliverableUID;
        }

        public ListDeliveryPackageResponseBodyData setPackageContentType(String packageContentType) {
            this.packageContentType = packageContentType;
            return this;
        }
        public String getPackageContentType() {
            return this.packageContentType;
        }

        public ListDeliveryPackageResponseBodyData setPackageSize(String packageSize) {
            this.packageSize = packageSize;
            return this;
        }
        public String getPackageSize() {
            return this.packageSize;
        }

        public ListDeliveryPackageResponseBodyData setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
            return this;
        }
        public String getPackageStatus() {
            return this.packageStatus;
        }

        public ListDeliveryPackageResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public ListDeliveryPackageResponseBodyData setPackageUID(String packageUID) {
            this.packageUID = packageUID;
            return this;
        }
        public String getPackageUID() {
            return this.packageUID;
        }

        public ListDeliveryPackageResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public ListDeliveryPackageResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

    }

}
