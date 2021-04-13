// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class ListAllServiceProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceProviderList")
    public java.util.List<ListAllServiceProviderResponseBodyServiceProviderList> serviceProviderList;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllServiceProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllServiceProviderResponseBody self = new ListAllServiceProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllServiceProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllServiceProviderResponseBody setServiceProviderList(java.util.List<ListAllServiceProviderResponseBodyServiceProviderList> serviceProviderList) {
        this.serviceProviderList = serviceProviderList;
        return this;
    }
    public java.util.List<ListAllServiceProviderResponseBodyServiceProviderList> getServiceProviderList() {
        return this.serviceProviderList;
    }

    public ListAllServiceProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllServiceProviderResponseBodyServiceProviderList extends TeaModel {
        @NameInMap("cnName")
        public String cnName;

        @NameInMap("providerUid")
        public String providerUid;

        @NameInMap("enName")
        public String enName;

        @NameInMap("providerType")
        public String providerType;

        @NameInMap("remark")
        public String remark;

        @NameInMap("providerCode")
        public String providerCode;

        public static ListAllServiceProviderResponseBodyServiceProviderList build(java.util.Map<String, ?> map) throws Exception {
            ListAllServiceProviderResponseBodyServiceProviderList self = new ListAllServiceProviderResponseBodyServiceProviderList();
            return TeaModel.build(map, self);
        }

        public ListAllServiceProviderResponseBodyServiceProviderList setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public ListAllServiceProviderResponseBodyServiceProviderList setProviderUid(String providerUid) {
            this.providerUid = providerUid;
            return this;
        }
        public String getProviderUid() {
            return this.providerUid;
        }

        public ListAllServiceProviderResponseBodyServiceProviderList setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public ListAllServiceProviderResponseBodyServiceProviderList setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

        public ListAllServiceProviderResponseBodyServiceProviderList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListAllServiceProviderResponseBodyServiceProviderList setProviderCode(String providerCode) {
            this.providerCode = providerCode;
            return this;
        }
        public String getProviderCode() {
            return this.providerCode;
        }

    }

}
