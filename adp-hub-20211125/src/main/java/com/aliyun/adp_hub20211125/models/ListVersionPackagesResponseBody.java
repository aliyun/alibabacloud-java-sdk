// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class ListVersionPackagesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListVersionPackagesResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    public static ListVersionPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVersionPackagesResponseBody self = new ListVersionPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVersionPackagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVersionPackagesResponseBody setData(java.util.List<ListVersionPackagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVersionPackagesResponseBodyData> getData() {
        return this.data;
    }

    public ListVersionPackagesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListVersionPackagesResponseBodyData extends TeaModel {
        @NameInMap("packageStatus")
        public String packageStatus;

        @NameInMap("packageType")
        public String packageType;

        @NameInMap("packageUID")
        public String packageUID;

        @NameInMap("platform")
        public String platform;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("url")
        public String url;

        public static ListVersionPackagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVersionPackagesResponseBodyData self = new ListVersionPackagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVersionPackagesResponseBodyData setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
            return this;
        }
        public String getPackageStatus() {
            return this.packageStatus;
        }

        public ListVersionPackagesResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public ListVersionPackagesResponseBodyData setPackageUID(String packageUID) {
            this.packageUID = packageUID;
            return this;
        }
        public String getPackageUID() {
            return this.packageUID;
        }

        public ListVersionPackagesResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListVersionPackagesResponseBodyData setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListVersionPackagesResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
