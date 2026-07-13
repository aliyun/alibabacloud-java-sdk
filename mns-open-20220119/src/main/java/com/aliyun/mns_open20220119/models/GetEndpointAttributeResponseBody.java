// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetEndpointAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetEndpointAttributeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static GetEndpointAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointAttributeResponseBody self = new GetEndpointAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEndpointAttributeResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetEndpointAttributeResponseBody setData(GetEndpointAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEndpointAttributeResponseBodyData getData() {
        return this.data;
    }

    public GetEndpointAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEndpointAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEndpointAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEndpointAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEndpointAttributeResponseBodyDataCidrList extends TeaModel {
        @NameInMap("AclStrategy")
        public String aclStrategy;

        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("CreateTime")
        public Long createTime;

        public static GetEndpointAttributeResponseBodyDataCidrList build(java.util.Map<String, ?> map) throws Exception {
            GetEndpointAttributeResponseBodyDataCidrList self = new GetEndpointAttributeResponseBodyDataCidrList();
            return TeaModel.build(map, self);
        }

        public GetEndpointAttributeResponseBodyDataCidrList setAclStrategy(String aclStrategy) {
            this.aclStrategy = aclStrategy;
            return this;
        }
        public String getAclStrategy() {
            return this.aclStrategy;
        }

        public GetEndpointAttributeResponseBodyDataCidrList setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetEndpointAttributeResponseBodyDataCidrList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

    public static class GetEndpointAttributeResponseBodyData extends TeaModel {
        @NameInMap("CidrList")
        public java.util.List<GetEndpointAttributeResponseBodyDataCidrList> cidrList;

        @NameInMap("EndpointEnabled")
        public Boolean endpointEnabled;

        public static GetEndpointAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEndpointAttributeResponseBodyData self = new GetEndpointAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEndpointAttributeResponseBodyData setCidrList(java.util.List<GetEndpointAttributeResponseBodyDataCidrList> cidrList) {
            this.cidrList = cidrList;
            return this;
        }
        public java.util.List<GetEndpointAttributeResponseBodyDataCidrList> getCidrList() {
            return this.cidrList;
        }

        public GetEndpointAttributeResponseBodyData setEndpointEnabled(Boolean endpointEnabled) {
            this.endpointEnabled = endpointEnabled;
            return this;
        }
        public Boolean getEndpointEnabled() {
            return this.endpointEnabled;
        }

    }

}
