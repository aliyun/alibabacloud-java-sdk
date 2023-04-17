// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetOrgAndFactoryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<GetOrgAndFactoryResponseBodyData> data;

    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetOrgAndFactoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrgAndFactoryResponseBody self = new GetOrgAndFactoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrgAndFactoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOrgAndFactoryResponseBody setData(java.util.List<GetOrgAndFactoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOrgAndFactoryResponseBodyData> getData() {
        return this.data;
    }

    public GetOrgAndFactoryResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetOrgAndFactoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrgAndFactoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrgAndFactoryResponseBodyDataFactoryList extends TeaModel {
        @NameInMap("factoryId")
        public String factoryId;

        @NameInMap("factoryName")
        public String factoryName;

        public static GetOrgAndFactoryResponseBodyDataFactoryList build(java.util.Map<String, ?> map) throws Exception {
            GetOrgAndFactoryResponseBodyDataFactoryList self = new GetOrgAndFactoryResponseBodyDataFactoryList();
            return TeaModel.build(map, self);
        }

        public GetOrgAndFactoryResponseBodyDataFactoryList setFactoryId(String factoryId) {
            this.factoryId = factoryId;
            return this;
        }
        public String getFactoryId() {
            return this.factoryId;
        }

        public GetOrgAndFactoryResponseBodyDataFactoryList setFactoryName(String factoryName) {
            this.factoryName = factoryName;
            return this;
        }
        public String getFactoryName() {
            return this.factoryName;
        }

    }

    public static class GetOrgAndFactoryResponseBodyData extends TeaModel {
        @NameInMap("aliyunPk")
        public String aliyunPk;

        @NameInMap("factoryList")
        public java.util.List<GetOrgAndFactoryResponseBodyDataFactoryList> factoryList;

        @NameInMap("organizationName")
        public String organizationName;

        public static GetOrgAndFactoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrgAndFactoryResponseBodyData self = new GetOrgAndFactoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrgAndFactoryResponseBodyData setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public GetOrgAndFactoryResponseBodyData setFactoryList(java.util.List<GetOrgAndFactoryResponseBodyDataFactoryList> factoryList) {
            this.factoryList = factoryList;
            return this;
        }
        public java.util.List<GetOrgAndFactoryResponseBodyDataFactoryList> getFactoryList() {
            return this.factoryList;
        }

        public GetOrgAndFactoryResponseBodyData setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

    }

}
