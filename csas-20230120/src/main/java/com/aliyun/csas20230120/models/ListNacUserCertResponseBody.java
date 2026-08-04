// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListNacUserCertResponseBody extends TeaModel {
    /**
     * <p>API status or POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: Success.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirection.</p>
     * </li>
     * <li><p><strong>4xx</strong>: Request error.</p>
     * </li>
     * <li><p><strong>5xx</strong>: Server error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>List of onboarding user certificate statuses.</p>
     */
    @NameInMap("DataList")
    public java.util.List<ListNacUserCertResponseBodyDataList> dataList;

    /**
     * <p>Additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of entries that match the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListNacUserCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNacUserCertResponseBody self = new ListNacUserCertResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNacUserCertResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListNacUserCertResponseBody setDataList(java.util.List<ListNacUserCertResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListNacUserCertResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListNacUserCertResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNacUserCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNacUserCertResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListNacUserCertResponseBodyDataList extends TeaModel {
        /**
         * <p>Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>Department that the user belongs to.</p>
         * 
         * <strong>example:</strong>
         * <p>外包</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>Endpoint device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <p>Operating system type of the endpoint device. Valid values:</p>
         * <ul>
         * <li><p><strong>windows</strong>: Windows.</p>
         * </li>
         * <li><p><strong>macos</strong>: macOS.</p>
         * </li>
         * <li><p><strong>linux</strong>: Linux.</p>
         * </li>
         * <li><p><strong>android</strong>: Android.</p>
         * </li>
         * <li><p><strong>ios</strong>: iOS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>Expired At.</p>
         * 
         * <strong>example:</strong>
         * <p>2029-06-30 09:31:54</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>Endpoint device name. The value must be 1 to 128 characters in length. It can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (<em>), forward slashes (/), at signs (@), and spaces. If you enter only an underscore (</em>), the system returns all endpoint devices whose names contain 4-byte UTF-8 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>MS-XU****</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Endpoint device MAC address.</p>
         * 
         * <strong>example:</strong>
         * <p>08:f8:<strong>:</strong>:**:5e</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>Onboarding user certificate status. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhang**</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListNacUserCertResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListNacUserCertResponseBodyDataList self = new ListNacUserCertResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListNacUserCertResponseBodyDataList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public ListNacUserCertResponseBodyDataList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListNacUserCertResponseBodyDataList setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public ListNacUserCertResponseBodyDataList setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListNacUserCertResponseBodyDataList setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListNacUserCertResponseBodyDataList setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListNacUserCertResponseBodyDataList setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListNacUserCertResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNacUserCertResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListNacUserCertResponseBodyDataList setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
