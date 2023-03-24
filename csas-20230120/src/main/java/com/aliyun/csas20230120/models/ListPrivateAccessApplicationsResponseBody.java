// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListPrivateAccessApplicationsResponseBodyApplications> applications;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListPrivateAccessApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationsResponseBody self = new ListPrivateAccessApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationsResponseBody setApplications(java.util.List<ListPrivateAccessApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListPrivateAccessApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListPrivateAccessApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivateAccessApplicationsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges extends TeaModel {
        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("End")
        public Integer end;

        public static ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges self = new ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class ListPrivateAccessApplicationsResponseBodyApplications extends TeaModel {
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        @NameInMap("PortRanges")
        public java.util.List<ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges> portRanges;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Status")
        public String status;

        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        public static ListPrivateAccessApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessApplicationsResponseBodyApplications self = new ListPrivateAccessApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setPortRanges(java.util.List<ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

    }

}
