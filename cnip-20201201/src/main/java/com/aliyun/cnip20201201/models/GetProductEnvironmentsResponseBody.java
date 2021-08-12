// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductEnvironmentsResponseBody extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("data")
    public java.util.List<GetProductEnvironmentsResponseBodyData> data;

    public static GetProductEnvironmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductEnvironmentsResponseBody self = new GetProductEnvironmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductEnvironmentsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetProductEnvironmentsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetProductEnvironmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetProductEnvironmentsResponseBody setData(java.util.List<GetProductEnvironmentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetProductEnvironmentsResponseBodyData> getData() {
        return this.data;
    }

    public static class GetProductEnvironmentsResponseBodyData extends TeaModel {
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

        public static GetProductEnvironmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductEnvironmentsResponseBodyData self = new GetProductEnvironmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductEnvironmentsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetProductEnvironmentsResponseBodyData setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public GetProductEnvironmentsResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetProductEnvironmentsResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetProductEnvironmentsResponseBodyData setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public GetProductEnvironmentsResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetProductEnvironmentsResponseBodyData setEnvUID(String envUID) {
            this.envUID = envUID;
            return this;
        }
        public String getEnvUID() {
            return this.envUID;
        }

        public GetProductEnvironmentsResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetProductEnvironmentsResponseBodyData setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public GetProductEnvironmentsResponseBodyData setOldProductVersion(String oldProductVersion) {
            this.oldProductVersion = oldProductVersion;
            return this;
        }
        public String getOldProductVersion() {
            return this.oldProductVersion;
        }

        public GetProductEnvironmentsResponseBodyData setOldProductVersionUID(String oldProductVersionUID) {
            this.oldProductVersionUID = oldProductVersionUID;
            return this;
        }
        public String getOldProductVersionUID() {
            return this.oldProductVersionUID;
        }

    }

}
