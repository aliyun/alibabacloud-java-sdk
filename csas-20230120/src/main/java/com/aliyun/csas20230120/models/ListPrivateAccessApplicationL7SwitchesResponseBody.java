// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationL7SwitchesResponseBody extends TeaModel {
    /**
     * <p>The Layer 7 application configurations.</p>
     */
    @NameInMap("L7Switches")
    public java.util.List<ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches> l7Switches;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ED459CAD-8D3F-51B8-AEA5-CAABC0325022</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrivateAccessApplicationL7SwitchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationL7SwitchesResponseBody self = new ListPrivateAccessApplicationL7SwitchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationL7SwitchesResponseBody setL7Switches(java.util.List<ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches> l7Switches) {
        this.l7Switches = l7Switches;
        return this;
    }
    public java.util.List<ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches> getL7Switches() {
        return this.l7Switches;
    }

    public ListPrivateAccessApplicationL7SwitchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesPortRanges extends TeaModel {
        /**
         * <p>The start port.</p>
         * 
         * <strong>example:</strong>
         * <p>2379</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>The end port. Must be greater than or equal to the start port.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("End")
        public Integer end;

        public static ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesPortRanges build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesPortRanges self = new ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesPortRanges();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesUrlAccessPaths extends TeaModel {
        /**
         * <p>The list of HTTP request methods allowed for the paths in this group. An empty value indicates that request methods are not restricted.</p>
         */
        @NameInMap("AllowMethods")
        public java.util.List<String> allowMethods;

        /**
         * <p>The list of URL paths allowed for access in this group. The list must contain at least 1 path and up to 20 paths. This parameter matches the path part in the request, excluding the protocol, domain name, and query parameters.</p>
         */
        @NameInMap("Urls")
        public java.util.List<String> urls;

        public static ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesUrlAccessPaths build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesUrlAccessPaths self = new ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesUrlAccessPaths();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesUrlAccessPaths setAllowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesUrlAccessPaths setUrls(java.util.List<String> urls) {
            this.urls = urls;
            return this;
        }
        public java.util.List<String> getUrls() {
            return this.urls;
        }

    }

    public static class ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches extends TeaModel {
        /**
         * <p>The ID of the internal access application.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-bbbc550d7c6e4db6</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The device tag marking switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("DevTagMarkStatus")
        public String devTagMarkStatus;

        /**
         * <p>The sensitive application download audit switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("DownloadAuditStatus")
        public String downloadAuditStatus;

        /**
         * <p>The end port.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesPortRanges> portRanges;

        /**
         * <p>The source IP marking switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.**</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("SrcIpMarkStatus")
        public String srcIpMarkStatus;

        /**
         * <p>The status of the internal access policy. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The request timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TimeoutSec")
        public Integer timeoutSec;

        /**
         * <p>The URL access whitelist rules for the application. These rules take effect only when Status is set to Enabled. An empty value indicates that URLs and request methods are not restricted. A request passes the URL check only when the request path and method meet any group of rules at the same time. Otherwise, the request is blocked. Passing the URL check does not allow requests that are already blocked by an access policy.</p>
         */
        @NameInMap("UrlAccessPaths")
        public java.util.List<ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesUrlAccessPaths> urlAccessPaths;

        /**
         * <p>The user marking switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("UserMarkStatus")
        public String userMarkStatus;

        /**
         * <p>The host anti-bypass switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("ZeroTrustStatus")
        public String zeroTrustStatus;

        public static ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches self = new ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches setDevTagMarkStatus(String devTagMarkStatus) {
            this.devTagMarkStatus = devTagMarkStatus;
            return this;
        }
        public String getDevTagMarkStatus() {
            return this.devTagMarkStatus;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches setDownloadAuditStatus(String downloadAuditStatus) {
            this.downloadAuditStatus = downloadAuditStatus;
            return this;
        }
        public String getDownloadAuditStatus() {
            return this.downloadAuditStatus;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches setPortRanges(java.util.List<ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches setSrcIpMarkStatus(String srcIpMarkStatus) {
            this.srcIpMarkStatus = srcIpMarkStatus;
            return this;
        }
        public String getSrcIpMarkStatus() {
            return this.srcIpMarkStatus;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches setTimeoutSec(Integer timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }
        public Integer getTimeoutSec() {
            return this.timeoutSec;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches setUrlAccessPaths(java.util.List<ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesUrlAccessPaths> urlAccessPaths) {
            this.urlAccessPaths = urlAccessPaths;
            return this;
        }
        public java.util.List<ListPrivateAccessApplicationL7SwitchesResponseBodyL7SwitchesUrlAccessPaths> getUrlAccessPaths() {
            return this.urlAccessPaths;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches setUserMarkStatus(String userMarkStatus) {
            this.userMarkStatus = userMarkStatus;
            return this;
        }
        public String getUserMarkStatus() {
            return this.userMarkStatus;
        }

        public ListPrivateAccessApplicationL7SwitchesResponseBodyL7Switches setZeroTrustStatus(String zeroTrustStatus) {
            this.zeroTrustStatus = zeroTrustStatus;
            return this;
        }
        public String getZeroTrustStatus() {
            return this.zeroTrustStatus;
        }

    }

}
