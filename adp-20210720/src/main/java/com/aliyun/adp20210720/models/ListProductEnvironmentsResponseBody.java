// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductEnvironmentsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    @NameInMap("data")
    public java.util.List<ListProductEnvironmentsResponseBodyData> data;

    public static ListProductEnvironmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductEnvironmentsResponseBody self = new ListProductEnvironmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductEnvironmentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductEnvironmentsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListProductEnvironmentsResponseBody setData(java.util.List<ListProductEnvironmentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProductEnvironmentsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListProductEnvironmentsResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        @NameInMap("productUID")
        public String productUID;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("provider")
        public String provider;

        @NameInMap("envUID")
        public String envUID;

        @NameInMap("envType")
        public String envType;

        @NameInMap("envName")
        public String envName;

        @NameInMap("oldProductVersion")
        public String oldProductVersion;

        @NameInMap("oldProductVersionUID")
        public String oldProductVersionUID;

        @NameInMap("vendorType")
        public String vendorType;

        @NameInMap("instanceStatus")
        public String instanceStatus;

        public static ListProductEnvironmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductEnvironmentsResponseBodyData self = new ListProductEnvironmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductEnvironmentsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListProductEnvironmentsResponseBodyData setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public ListProductEnvironmentsResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductEnvironmentsResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListProductEnvironmentsResponseBodyData setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListProductEnvironmentsResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListProductEnvironmentsResponseBodyData setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

        public ListProductEnvironmentsResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListProductEnvironmentsResponseBodyData setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public ListProductEnvironmentsResponseBodyData setOldProductVersion(String oldProductVersion) {
            this.oldProductVersion = oldProductVersion;
            return this;
        }
        public String getOldProductVersion() {
            return this.oldProductVersion;
        }

        public ListProductEnvironmentsResponseBodyData setOldProductVersionUID(String oldProductVersionUID) {
            this.oldProductVersionUID = oldProductVersionUID;
            return this;
        }
        public String getOldProductVersionUID() {
            return this.oldProductVersionUID;
        }

        public ListProductEnvironmentsResponseBodyData setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

        public ListProductEnvironmentsResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

    }

}
