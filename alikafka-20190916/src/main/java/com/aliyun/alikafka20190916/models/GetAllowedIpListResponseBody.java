// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAllowedIpListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AllowedList")
    public GetAllowedIpListResponseBodyAllowedList allowedList;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetAllowedIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllowedIpListResponseBody self = new GetAllowedIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllowedIpListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAllowedIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllowedIpListResponseBody setAllowedList(GetAllowedIpListResponseBodyAllowedList allowedList) {
        this.allowedList = allowedList;
        return this;
    }
    public GetAllowedIpListResponseBodyAllowedList getAllowedList() {
        return this.allowedList;
    }

    public GetAllowedIpListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAllowedIpListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAllowedIpListResponseBodyAllowedListInternetList extends TeaModel {
        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("AllowedIpList")
        public java.util.List<String> allowedIpList;

        public static GetAllowedIpListResponseBodyAllowedListInternetList build(java.util.Map<String, ?> map) throws Exception {
            GetAllowedIpListResponseBodyAllowedListInternetList self = new GetAllowedIpListResponseBodyAllowedListInternetList();
            return TeaModel.build(map, self);
        }

        public GetAllowedIpListResponseBodyAllowedListInternetList setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public GetAllowedIpListResponseBodyAllowedListInternetList setAllowedIpList(java.util.List<String> allowedIpList) {
            this.allowedIpList = allowedIpList;
            return this;
        }
        public java.util.List<String> getAllowedIpList() {
            return this.allowedIpList;
        }

    }

    public static class GetAllowedIpListResponseBodyAllowedListVpcList extends TeaModel {
        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("AllowedIpList")
        public java.util.List<String> allowedIpList;

        public static GetAllowedIpListResponseBodyAllowedListVpcList build(java.util.Map<String, ?> map) throws Exception {
            GetAllowedIpListResponseBodyAllowedListVpcList self = new GetAllowedIpListResponseBodyAllowedListVpcList();
            return TeaModel.build(map, self);
        }

        public GetAllowedIpListResponseBodyAllowedListVpcList setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public GetAllowedIpListResponseBodyAllowedListVpcList setAllowedIpList(java.util.List<String> allowedIpList) {
            this.allowedIpList = allowedIpList;
            return this;
        }
        public java.util.List<String> getAllowedIpList() {
            return this.allowedIpList;
        }

    }

    public static class GetAllowedIpListResponseBodyAllowedList extends TeaModel {
        @NameInMap("DeployType")
        public Integer deployType;

        @NameInMap("InternetList")
        public java.util.List<GetAllowedIpListResponseBodyAllowedListInternetList> internetList;

        @NameInMap("VpcList")
        public java.util.List<GetAllowedIpListResponseBodyAllowedListVpcList> vpcList;

        public static GetAllowedIpListResponseBodyAllowedList build(java.util.Map<String, ?> map) throws Exception {
            GetAllowedIpListResponseBodyAllowedList self = new GetAllowedIpListResponseBodyAllowedList();
            return TeaModel.build(map, self);
        }

        public GetAllowedIpListResponseBodyAllowedList setDeployType(Integer deployType) {
            this.deployType = deployType;
            return this;
        }
        public Integer getDeployType() {
            return this.deployType;
        }

        public GetAllowedIpListResponseBodyAllowedList setInternetList(java.util.List<GetAllowedIpListResponseBodyAllowedListInternetList> internetList) {
            this.internetList = internetList;
            return this;
        }
        public java.util.List<GetAllowedIpListResponseBodyAllowedListInternetList> getInternetList() {
            return this.internetList;
        }

        public GetAllowedIpListResponseBodyAllowedList setVpcList(java.util.List<GetAllowedIpListResponseBodyAllowedListVpcList> vpcList) {
            this.vpcList = vpcList;
            return this;
        }
        public java.util.List<GetAllowedIpListResponseBodyAllowedListVpcList> getVpcList() {
            return this.vpcList;
        }

    }

}
