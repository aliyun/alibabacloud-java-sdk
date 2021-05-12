// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionPlatformsResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProductVersionPlatformsResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetProductVersionPlatformsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPlatformsResponseBody self = new GetProductVersionPlatformsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPlatformsResponseBody setData(GetProductVersionPlatformsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductVersionPlatformsResponseBodyData getData() {
        return this.data;
    }

    public GetProductVersionPlatformsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetProductVersionPlatformsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetProductVersionPlatformsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProductVersionPlatformsResponseBodyDataList extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static GetProductVersionPlatformsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionPlatformsResponseBodyDataList self = new GetProductVersionPlatformsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetProductVersionPlatformsResponseBodyDataList setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public GetProductVersionPlatformsResponseBodyDataList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

    public static class GetProductVersionPlatformsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<GetProductVersionPlatformsResponseBodyDataList> list;

        public static GetProductVersionPlatformsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionPlatformsResponseBodyData self = new GetProductVersionPlatformsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductVersionPlatformsResponseBodyData setList(java.util.List<GetProductVersionPlatformsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetProductVersionPlatformsResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
