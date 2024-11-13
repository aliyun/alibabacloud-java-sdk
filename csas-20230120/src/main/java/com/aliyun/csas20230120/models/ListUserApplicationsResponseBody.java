// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListUserApplicationsResponseBodyApplications> applications;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListUserApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserApplicationsResponseBody self = new ListUserApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserApplicationsResponseBody setApplications(java.util.List<ListUserApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListUserApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListUserApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserApplicationsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListUserApplicationsResponseBodyApplicationsPortRanges extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public String begin;

        /**
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("End")
        public String end;

        public static ListUserApplicationsResponseBodyApplicationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            ListUserApplicationsResponseBodyApplicationsPortRanges self = new ListUserApplicationsResponseBodyApplicationsPortRanges();
            return TeaModel.build(map, self);
        }

        public ListUserApplicationsResponseBodyApplicationsPortRanges setBegin(String begin) {
            this.begin = begin;
            return this;
        }
        public String getBegin() {
            return this.begin;
        }

        public ListUserApplicationsResponseBodyApplicationsPortRanges setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

    }

    public static class ListUserApplicationsResponseBodyApplications extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Block</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        /**
         * <strong>example:</strong>
         * <p>pa-application-b927baf3e592****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <strong>example:</strong>
         * <p>private_access_application_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PortRanges")
        public java.util.List<ListUserApplicationsResponseBodyApplicationsPortRanges> portRanges;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static ListUserApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListUserApplicationsResponseBodyApplications self = new ListUserApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListUserApplicationsResponseBodyApplications setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListUserApplicationsResponseBodyApplications setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public ListUserApplicationsResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListUserApplicationsResponseBodyApplications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserApplicationsResponseBodyApplications setPortRanges(java.util.List<ListUserApplicationsResponseBodyApplicationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<ListUserApplicationsResponseBodyApplicationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public ListUserApplicationsResponseBodyApplications setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
