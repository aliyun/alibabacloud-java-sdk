// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserApplicationsResponseBody extends TeaModel {
    /**
     * <p>The list of applications that the user is authorized to access.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListUserApplicationsResponseBodyApplications> applications;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of applications that the user is authorized to access.</p>
     * 
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
         * <p>The start port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public String begin;

        /**
         * <p>The end port.</p>
         * 
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
         * <p>The action for private application access:</p>
         * <ul>
         * <li><p><strong>Block</strong>: blocks access.</p>
         * </li>
         * <li><p><strong>Allow</strong>: allows access.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Block</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The application address group. This parameter is returned when ConfigMode is set to Precise. This parameter is empty when ConfigMode is an empty string.</p>
         */
        @NameInMap("AddressGroups")
        public java.util.List<AddressGroup> addressGroups;

        /**
         * <p>The list of private access application addresses.</p>
         */
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-b927baf3e592****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The configuration mode. Valid values:</p>
         * <ul>
         * <li><p>Empty string: default mode.</p>
         * </li>
         * <li><p>Precise: precise mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Precise</p>
         */
        @NameInMap("ConfigMode")
        public String configMode;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_application_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port ranges of the private access application. Multiple port ranges cannot be repeated or overlap.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<ListUserApplicationsResponseBodyApplicationsPortRanges> portRanges;

        /**
         * <p>The protocol of the private access application. Valid values:</p>
         * <ul>
         * <li><p><strong>All</strong>: all protocols.</p>
         * </li>
         * <li><p><strong>TCP</strong>: TCP.</p>
         * </li>
         * <li><p><strong>UDP</strong>: UDP.</p>
         * </li>
         * <li><p><strong>HTTP</strong>: HTTP.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: HTTPS.</p>
         * </li>
         * </ul>
         * 
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

        public ListUserApplicationsResponseBodyApplications setAddressGroups(java.util.List<AddressGroup> addressGroups) {
            this.addressGroups = addressGroups;
            return this;
        }
        public java.util.List<AddressGroup> getAddressGroups() {
            return this.addressGroups;
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

        public ListUserApplicationsResponseBodyApplications setConfigMode(String configMode) {
            this.configMode = configMode;
            return this;
        }
        public String getConfigMode() {
            return this.configMode;
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
