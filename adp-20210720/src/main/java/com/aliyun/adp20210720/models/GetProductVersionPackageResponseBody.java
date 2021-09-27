// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProductVersionPackageResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static GetProductVersionPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageResponseBody self = new GetProductVersionPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPackageResponseBody setData(GetProductVersionPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductVersionPackageResponseBodyData getData() {
        return this.data;
    }

    public GetProductVersionPackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductVersionPackageResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetProductVersionPackageResponseBodyData extends TeaModel {
        @NameInMap("packageUID")
        public String packageUID;

        @NameInMap("packageStatus")
        public String packageStatus;

        @NameInMap("packageURL")
        public String packageURL;

        @NameInMap("packageSize")
        public String packageSize;

        @NameInMap("packageType")
        public String packageType;

        @NameInMap("packageContentType")
        public String packageContentType;

        @NameInMap("platform")
        public Platform platform;

        public static GetProductVersionPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionPackageResponseBodyData self = new GetProductVersionPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductVersionPackageResponseBodyData setPackageUID(String packageUID) {
            this.packageUID = packageUID;
            return this;
        }
        public String getPackageUID() {
            return this.packageUID;
        }

        public GetProductVersionPackageResponseBodyData setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
            return this;
        }
        public String getPackageStatus() {
            return this.packageStatus;
        }

        public GetProductVersionPackageResponseBodyData setPackageURL(String packageURL) {
            this.packageURL = packageURL;
            return this;
        }
        public String getPackageURL() {
            return this.packageURL;
        }

        public GetProductVersionPackageResponseBodyData setPackageSize(String packageSize) {
            this.packageSize = packageSize;
            return this;
        }
        public String getPackageSize() {
            return this.packageSize;
        }

        public GetProductVersionPackageResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetProductVersionPackageResponseBodyData setPackageContentType(String packageContentType) {
            this.packageContentType = packageContentType;
            return this;
        }
        public String getPackageContentType() {
            return this.packageContentType;
        }

        public GetProductVersionPackageResponseBodyData setPlatform(Platform platform) {
            this.platform = platform;
            return this;
        }
        public Platform getPlatform() {
            return this.platform;
        }

    }

}
