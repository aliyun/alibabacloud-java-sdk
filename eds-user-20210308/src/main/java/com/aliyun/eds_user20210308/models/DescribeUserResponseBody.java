// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("User")
    public DescribeUserResponseBodyUser user;

    public static DescribeUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserResponseBody self = new DescribeUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserResponseBody setUser(DescribeUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public DescribeUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class DescribeUserResponseBodyUserExternalInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oijjnabsf****</p>
         */
        @NameInMap("ExternalId")
        public String externalId;

        /**
         * <strong>example:</strong>
         * <p>Alex</p>
         */
        @NameInMap("ExternalName")
        public String externalName;

        /**
         * <strong>example:</strong>
         * <p>15412***</p>
         */
        @NameInMap("JobNumber")
        public String jobNumber;

        /**
         * <strong>example:</strong>
         * <p>OIDC</p>
         */
        @NameInMap("SsoType")
        public String ssoType;

        public static DescribeUserResponseBodyUserExternalInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResponseBodyUserExternalInfo self = new DescribeUserResponseBodyUserExternalInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUserResponseBodyUserExternalInfo setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public DescribeUserResponseBodyUserExternalInfo setExternalName(String externalName) {
            this.externalName = externalName;
            return this;
        }
        public String getExternalName() {
            return this.externalName;
        }

        public DescribeUserResponseBodyUserExternalInfo setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }
        public String getJobNumber() {
            return this.jobNumber;
        }

        public DescribeUserResponseBodyUserExternalInfo setSsoType(String ssoType) {
            this.ssoType = ssoType;
            return this;
        }
        public String getSsoType() {
            return this.ssoType;
        }

    }

    public static class DescribeUserResponseBodyUserProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>role</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>teacher</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeUserResponseBodyUserProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResponseBodyUserProperties self = new DescribeUserResponseBodyUserProperties();
            return TeaModel.build(map, self);
        }

        public DescribeUserResponseBodyUserProperties setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeUserResponseBodyUserProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeUserResponseBodyUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:alex@test-email.com">alex@test-email.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>alex</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("ExternalInfo")
        public DescribeUserResponseBodyUserExternalInfo externalInfo;

        @NameInMap("Extras")
        public java.util.Map<String, String> extras;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 12:00:00</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("OrgIds")
        public java.util.List<String> orgIds;

        @NameInMap("OrgPaths")
        public java.util.List<String> orgPaths;

        /**
         * <strong>example:</strong>
         * <p>1888888****</p>
         */
        @NameInMap("Phone")
        public String phone;

        @NameInMap("Properties")
        public java.util.List<DescribeUserResponseBodyUserProperties> properties;

        /**
         * <strong>example:</strong>
         * <p>remark</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>aisdfumj****</p>
         */
        @NameInMap("WyId")
        public String wyId;

        public static DescribeUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResponseBodyUser self = new DescribeUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public DescribeUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeUserResponseBodyUser setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeUserResponseBodyUser setExternalInfo(DescribeUserResponseBodyUserExternalInfo externalInfo) {
            this.externalInfo = externalInfo;
            return this;
        }
        public DescribeUserResponseBodyUserExternalInfo getExternalInfo() {
            return this.externalInfo;
        }

        public DescribeUserResponseBodyUser setExtras(java.util.Map<String, String> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.Map<String, String> getExtras() {
            return this.extras;
        }

        public DescribeUserResponseBodyUser setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeUserResponseBodyUser setOrgIds(java.util.List<String> orgIds) {
            this.orgIds = orgIds;
            return this;
        }
        public java.util.List<String> getOrgIds() {
            return this.orgIds;
        }

        public DescribeUserResponseBodyUser setOrgPaths(java.util.List<String> orgPaths) {
            this.orgPaths = orgPaths;
            return this;
        }
        public java.util.List<String> getOrgPaths() {
            return this.orgPaths;
        }

        public DescribeUserResponseBodyUser setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeUserResponseBodyUser setProperties(java.util.List<DescribeUserResponseBodyUserProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<DescribeUserResponseBodyUserProperties> getProperties() {
            return this.properties;
        }

        public DescribeUserResponseBodyUser setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeUserResponseBodyUser setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeUserResponseBodyUser setWyId(String wyId) {
            this.wyId = wyId;
            return this;
        }
        public String getWyId() {
            return this.wyId;
        }

    }

}
