// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSecurityGroupResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The data structure.
    @NameInMap("Data")
    public java.util.List<ListSecurityGroupResponseBodyData> data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static ListSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupResponseBody self = new ListSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSecurityGroupResponseBody setData(java.util.List<ListSecurityGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSecurityGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListSecurityGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSecurityGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSecurityGroupResponseBodyData extends TeaModel {
        // The ID of the security group.
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // The name of the security group.
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        // The type of the security group. Valid values:
        // 
        // - normal: basic security group 
        // - enterprise: advanced security group For more information, see [Overview](~~120621~~).
        @NameInMap("SecurityGroupType")
        public String securityGroupType;

        // VPC ID.
        @NameInMap("VpcId")
        public String vpcId;

        public static ListSecurityGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityGroupResponseBodyData self = new ListSecurityGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSecurityGroupResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListSecurityGroupResponseBodyData setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public ListSecurityGroupResponseBodyData setSecurityGroupType(String securityGroupType) {
            this.securityGroupType = securityGroupType;
            return this;
        }
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        public ListSecurityGroupResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
