// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAllowedIpListResponseBody extends TeaModel {
    /**
     * <p>The allowlist.</p>
     */
    @NameInMap("AllowedList")
    public GetAllowedIpListResponseBodyAllowedList allowedList;

    /**
     * <p>The return code. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A421CCD7-5BC5-4B32-8DD8-64668A8FCB56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAllowedIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllowedIpListResponseBody self = new GetAllowedIpListResponseBody();
        return TeaModel.build(map, self);
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

    public GetAllowedIpListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAllowedIpListResponseBodyAllowedListInternetList extends TeaModel {
        /**
         * <p>The Internet IP address allowlist group.</p>
         */
        @NameInMap("AllowedIpGroup")
        public java.util.Map<String, String> allowedIpGroup;

        /**
         * <p>The Internet IP address allowlists.</p>
         */
        @NameInMap("AllowedIpList")
        public java.util.List<String> allowedIpList;

        /**
         * <p>The Internet IP address blocklists.</p>
         */
        @NameInMap("BlackIPList")
        public java.util.List<String> blackIPList;

        /**
         * <p>The Internet IP address blocklist group.</p>
         */
        @NameInMap("BlackIPMap")
        public java.util.Map<String, String> blackIPMap;

        /**
         * <p>The port range. Valid values:</p>
         * <p><strong>9093/9093</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>9093/9093</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zea4atm7fvj**********</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>Indicates whether it is a shared security group.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UserDefinedSharedSecurityGroup")
        public Boolean userDefinedSharedSecurityGroup;

        public static GetAllowedIpListResponseBodyAllowedListInternetList build(java.util.Map<String, ?> map) throws Exception {
            GetAllowedIpListResponseBodyAllowedListInternetList self = new GetAllowedIpListResponseBodyAllowedListInternetList();
            return TeaModel.build(map, self);
        }

        public GetAllowedIpListResponseBodyAllowedListInternetList setAllowedIpGroup(java.util.Map<String, String> allowedIpGroup) {
            this.allowedIpGroup = allowedIpGroup;
            return this;
        }
        public java.util.Map<String, String> getAllowedIpGroup() {
            return this.allowedIpGroup;
        }

        public GetAllowedIpListResponseBodyAllowedListInternetList setAllowedIpList(java.util.List<String> allowedIpList) {
            this.allowedIpList = allowedIpList;
            return this;
        }
        public java.util.List<String> getAllowedIpList() {
            return this.allowedIpList;
        }

        public GetAllowedIpListResponseBodyAllowedListInternetList setBlackIPList(java.util.List<String> blackIPList) {
            this.blackIPList = blackIPList;
            return this;
        }
        public java.util.List<String> getBlackIPList() {
            return this.blackIPList;
        }

        public GetAllowedIpListResponseBodyAllowedListInternetList setBlackIPMap(java.util.Map<String, String> blackIPMap) {
            this.blackIPMap = blackIPMap;
            return this;
        }
        public java.util.Map<String, String> getBlackIPMap() {
            return this.blackIPMap;
        }

        public GetAllowedIpListResponseBodyAllowedListInternetList setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public GetAllowedIpListResponseBodyAllowedListInternetList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetAllowedIpListResponseBodyAllowedListInternetList setUserDefinedSharedSecurityGroup(Boolean userDefinedSharedSecurityGroup) {
            this.userDefinedSharedSecurityGroup = userDefinedSharedSecurityGroup;
            return this;
        }
        public Boolean getUserDefinedSharedSecurityGroup() {
            return this.userDefinedSharedSecurityGroup;
        }

    }

    public static class GetAllowedIpListResponseBodyAllowedListVpcList extends TeaModel {
        /**
         * <p>The IP address allowlist group.</p>
         */
        @NameInMap("AllowedIpGroup")
        public java.util.Map<String, String> allowedIpGroup;

        /**
         * <p>The IP address allowlists.</p>
         */
        @NameInMap("AllowedIpList")
        public java.util.List<String> allowedIpList;

        /**
         * <p>The IP address blocklists.</p>
         */
        @NameInMap("BlackIPList")
        public java.util.List<String> blackIPList;

        /**
         * <p>The IP address blocklist group.</p>
         */
        @NameInMap("BlackIPMap")
        public java.util.Map<String, String> blackIPMap;

        /**
         * <p>The port range. Valid values:</p>
         * <p><strong>9092/9092</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>9092/9092</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zea4atm7fvj**********</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>Indicates whether it is a shared security group.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UserDefinedSharedSecurityGroup")
        public Boolean userDefinedSharedSecurityGroup;

        public static GetAllowedIpListResponseBodyAllowedListVpcList build(java.util.Map<String, ?> map) throws Exception {
            GetAllowedIpListResponseBodyAllowedListVpcList self = new GetAllowedIpListResponseBodyAllowedListVpcList();
            return TeaModel.build(map, self);
        }

        public GetAllowedIpListResponseBodyAllowedListVpcList setAllowedIpGroup(java.util.Map<String, String> allowedIpGroup) {
            this.allowedIpGroup = allowedIpGroup;
            return this;
        }
        public java.util.Map<String, String> getAllowedIpGroup() {
            return this.allowedIpGroup;
        }

        public GetAllowedIpListResponseBodyAllowedListVpcList setAllowedIpList(java.util.List<String> allowedIpList) {
            this.allowedIpList = allowedIpList;
            return this;
        }
        public java.util.List<String> getAllowedIpList() {
            return this.allowedIpList;
        }

        public GetAllowedIpListResponseBodyAllowedListVpcList setBlackIPList(java.util.List<String> blackIPList) {
            this.blackIPList = blackIPList;
            return this;
        }
        public java.util.List<String> getBlackIPList() {
            return this.blackIPList;
        }

        public GetAllowedIpListResponseBodyAllowedListVpcList setBlackIPMap(java.util.Map<String, String> blackIPMap) {
            this.blackIPMap = blackIPMap;
            return this;
        }
        public java.util.Map<String, String> getBlackIPMap() {
            return this.blackIPMap;
        }

        public GetAllowedIpListResponseBodyAllowedListVpcList setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public GetAllowedIpListResponseBodyAllowedListVpcList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetAllowedIpListResponseBodyAllowedListVpcList setUserDefinedSharedSecurityGroup(Boolean userDefinedSharedSecurityGroup) {
            this.userDefinedSharedSecurityGroup = userDefinedSharedSecurityGroup;
            return this;
        }
        public Boolean getUserDefinedSharedSecurityGroup() {
            return this.userDefinedSharedSecurityGroup;
        }

    }

    public static class GetAllowedIpListResponseBodyAllowedList extends TeaModel {
        /**
         * <p>The deployment type. Valid values:</p>
         * <ul>
         * <li><p><strong>4</strong>: Internet/VPC</p>
         * </li>
         * <li><p><strong>5</strong>: VPC</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This field is not relevant for regular users and is intended for integration partners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DeployType")
        public Integer deployType;

        /**
         * <p>The Internet allowlists.</p>
         */
        @NameInMap("InternetList")
        public java.util.List<GetAllowedIpListResponseBodyAllowedListInternetList> internetList;

        /**
         * <p>The VPC allowlists.</p>
         */
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
