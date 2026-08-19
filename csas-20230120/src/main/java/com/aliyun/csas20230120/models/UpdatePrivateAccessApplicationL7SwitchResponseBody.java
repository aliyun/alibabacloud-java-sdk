// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessApplicationL7SwitchResponseBody extends TeaModel {
    /**
     * <p>The Layer 7 access switch configuration of the internal-facing application after this update.</p>
     */
    @NameInMap("L7Switch")
    public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch l7Switch;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePrivateAccessApplicationL7SwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessApplicationL7SwitchResponseBody self = new UpdatePrivateAccessApplicationL7SwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessApplicationL7SwitchResponseBody setL7Switch(UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch l7Switch) {
        this.l7Switch = l7Switch;
        return this;
    }
    public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch getL7Switch() {
        return this.l7Switch;
    }

    public UpdatePrivateAccessApplicationL7SwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePrivateAccessApplicationL7SwitchResponseBodyL7SwitchPortRanges extends TeaModel {
        /**
         * <p>The start port. The value must be less than or equal to the end port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>The end port. The value must be greater than or equal to the start port.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("End")
        public Integer end;

        public static UpdatePrivateAccessApplicationL7SwitchResponseBodyL7SwitchPortRanges build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateAccessApplicationL7SwitchResponseBodyL7SwitchPortRanges self = new UpdatePrivateAccessApplicationL7SwitchResponseBodyL7SwitchPortRanges();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7SwitchPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7SwitchPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch extends TeaModel {
        /**
         * <p>The ID of the internal-facing application.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The device tag mark switch. Valid values:</p>
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
         * <p>The collection of port ranges that are effective for Layer 7 access. This is the intersection of the ports specified in this request and the port ranges already configured for the internal-facing application. An empty collection is returned when Status is set to <strong>Disabled</strong>.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<UpdatePrivateAccessApplicationL7SwitchResponseBodyL7SwitchPortRanges> portRanges;

        /**
         * <p>The source IP mark switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("SrcIpMarkStatus")
        public String srcIpMarkStatus;

        /**
         * <p>The master switch for Layer 7 access of the internal-facing application. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The request timeout period, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TimeoutSec")
        public Integer timeoutSec;

        /**
         * <p>The user mark switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("UserMarkStatus")
        public String userMarkStatus;

        /**
         * <p>The host bypass prevention switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("ZeroTrustStatus")
        public String zeroTrustStatus;

        public static UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch self = new UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch setDevTagMarkStatus(String devTagMarkStatus) {
            this.devTagMarkStatus = devTagMarkStatus;
            return this;
        }
        public String getDevTagMarkStatus() {
            return this.devTagMarkStatus;
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch setDownloadAuditStatus(String downloadAuditStatus) {
            this.downloadAuditStatus = downloadAuditStatus;
            return this;
        }
        public String getDownloadAuditStatus() {
            return this.downloadAuditStatus;
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch setPortRanges(java.util.List<UpdatePrivateAccessApplicationL7SwitchResponseBodyL7SwitchPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<UpdatePrivateAccessApplicationL7SwitchResponseBodyL7SwitchPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch setSrcIpMarkStatus(String srcIpMarkStatus) {
            this.srcIpMarkStatus = srcIpMarkStatus;
            return this;
        }
        public String getSrcIpMarkStatus() {
            return this.srcIpMarkStatus;
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch setTimeoutSec(Integer timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }
        public Integer getTimeoutSec() {
            return this.timeoutSec;
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch setUserMarkStatus(String userMarkStatus) {
            this.userMarkStatus = userMarkStatus;
            return this;
        }
        public String getUserMarkStatus() {
            return this.userMarkStatus;
        }

        public UpdatePrivateAccessApplicationL7SwitchResponseBodyL7Switch setZeroTrustStatus(String zeroTrustStatus) {
            this.zeroTrustStatus = zeroTrustStatus;
            return this;
        }
        public String getZeroTrustStatus() {
            return this.zeroTrustStatus;
        }

    }

}
