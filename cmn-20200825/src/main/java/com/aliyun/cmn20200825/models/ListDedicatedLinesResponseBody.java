// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDedicatedLinesResponseBody extends TeaModel {
    @NameInMap("DedicatedLines")
    public java.util.List<ListDedicatedLinesResponseBodyDedicatedLines> dedicatedLines;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDedicatedLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDedicatedLinesResponseBody self = new ListDedicatedLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDedicatedLinesResponseBody setDedicatedLines(java.util.List<ListDedicatedLinesResponseBodyDedicatedLines> dedicatedLines) {
        this.dedicatedLines = dedicatedLines;
        return this;
    }
    public java.util.List<ListDedicatedLinesResponseBodyDedicatedLines> getDedicatedLines() {
        return this.dedicatedLines;
    }

    public ListDedicatedLinesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDedicatedLinesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListDedicatedLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDedicatedLinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDedicatedLinesResponseBodyDedicatedLinesContact extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public String name;

        @NameInMap("Phone")
        public String phone;

        public static ListDedicatedLinesResponseBodyDedicatedLinesContact build(java.util.Map<String, ?> map) throws Exception {
            ListDedicatedLinesResponseBodyDedicatedLinesContact self = new ListDedicatedLinesResponseBodyDedicatedLinesContact();
            return TeaModel.build(map, self);
        }

        public ListDedicatedLinesResponseBodyDedicatedLinesContact setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDedicatedLinesResponseBodyDedicatedLinesContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListDedicatedLinesResponseBodyDedicatedLinesContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDedicatedLinesResponseBodyDedicatedLinesContact setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class ListDedicatedLinesResponseBodyDedicatedLines extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("Contact")
        public java.util.List<ListDedicatedLinesResponseBodyDedicatedLinesContact> contact;

        @NameInMap("DedicatedLineGateway")
        public String dedicatedLineGateway;

        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        @NameInMap("DedicatedLineIp")
        public String dedicatedLineIp;

        @NameInMap("DedicatedLineRole")
        public String dedicatedLineRole;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DevicePort")
        public String devicePort;

        @NameInMap("ExpirationDate")
        public String expirationDate;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("IspFormId")
        public String ispFormId;

        @NameInMap("IspFormName")
        public String ispFormName;

        @NameInMap("IspId")
        public String ispId;

        @NameInMap("Keyword")
        public String keyword;

        @NameInMap("OnlineDate")
        public String onlineDate;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("PhysicalSpaceId")
        public String physicalSpaceId;

        @NameInMap("SpaceName")
        public String spaceName;

        public static ListDedicatedLinesResponseBodyDedicatedLines build(java.util.Map<String, ?> map) throws Exception {
            ListDedicatedLinesResponseBodyDedicatedLines self = new ListDedicatedLinesResponseBodyDedicatedLines();
            return TeaModel.build(map, self);
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setContact(java.util.List<ListDedicatedLinesResponseBodyDedicatedLinesContact> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<ListDedicatedLinesResponseBodyDedicatedLinesContact> getContact() {
            return this.contact;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineGateway(String dedicatedLineGateway) {
            this.dedicatedLineGateway = dedicatedLineGateway;
            return this;
        }
        public String getDedicatedLineGateway() {
            return this.dedicatedLineGateway;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineIp(String dedicatedLineIp) {
            this.dedicatedLineIp = dedicatedLineIp;
            return this;
        }
        public String getDedicatedLineIp() {
            return this.dedicatedLineIp;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDedicatedLineRole(String dedicatedLineRole) {
            this.dedicatedLineRole = dedicatedLineRole;
            return this;
        }
        public String getDedicatedLineRole() {
            return this.dedicatedLineRole;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setDevicePort(String devicePort) {
            this.devicePort = devicePort;
            return this;
        }
        public String getDevicePort() {
            return this.devicePort;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setIspFormId(String ispFormId) {
            this.ispFormId = ispFormId;
            return this;
        }
        public String getIspFormId() {
            return this.ispFormId;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setIspFormName(String ispFormName) {
            this.ispFormName = ispFormName;
            return this;
        }
        public String getIspFormName() {
            return this.ispFormName;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setIspId(String ispId) {
            this.ispId = ispId;
            return this;
        }
        public String getIspId() {
            return this.ispId;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setOnlineDate(String onlineDate) {
            this.onlineDate = onlineDate;
            return this;
        }
        public String getOnlineDate() {
            return this.onlineDate;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setPhysicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        public ListDedicatedLinesResponseBodyDedicatedLines setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

    }

}
