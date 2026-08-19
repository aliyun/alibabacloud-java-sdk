// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessApplicationL7SwitchRequest extends TeaModel {
    /**
     * <p>The ID of the internal-facing application. Required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The device tag mark switch. Required. Valid values:</p>
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
     * <p>The sensitive application download audit switch. Optional. Valid values:</p>
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
     * <p>The collection of port ranges for the internal-facing application. Multiple port ranges cannot be duplicated or overlap. You can specify up to 50 port ranges. This parameter takes effect and is validated only when Status is set to <strong>Enabled</strong>. If this parameter is not specified or an empty collection is passed in, the default ports 80, 443, 8080, and 465 are used. The effective ports are the intersection of the ports specified in this request and the port ranges already configured for the internal-facing application.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<UpdatePrivateAccessApplicationL7SwitchRequestPortRanges> portRanges;

    /**
     * <p>The source IP mark switch. Required. Valid values:</p>
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
     * <p>The master switch for Layer 7 access of the internal-facing application. Required. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
     * </ul>
     * <p>When the value is <strong>Disabled</strong>, PortRanges is neither validated nor saved.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The request timeout period, in seconds. Valid values: 1 to 3600. Default value: 60. If this parameter is not specified or an invalid value is specified, the value 60 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TimeoutSec")
    public Integer timeoutSec;

    /**
     * <p>The user mark switch. Required. Valid values:</p>
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
     * <p>The host bypass prevention switch. Required. Valid values:</p>
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

    public static UpdatePrivateAccessApplicationL7SwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessApplicationL7SwitchRequest self = new UpdatePrivateAccessApplicationL7SwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessApplicationL7SwitchRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePrivateAccessApplicationL7SwitchRequest setDevTagMarkStatus(String devTagMarkStatus) {
        this.devTagMarkStatus = devTagMarkStatus;
        return this;
    }
    public String getDevTagMarkStatus() {
        return this.devTagMarkStatus;
    }

    public UpdatePrivateAccessApplicationL7SwitchRequest setDownloadAuditStatus(String downloadAuditStatus) {
        this.downloadAuditStatus = downloadAuditStatus;
        return this;
    }
    public String getDownloadAuditStatus() {
        return this.downloadAuditStatus;
    }

    public UpdatePrivateAccessApplicationL7SwitchRequest setPortRanges(java.util.List<UpdatePrivateAccessApplicationL7SwitchRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<UpdatePrivateAccessApplicationL7SwitchRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public UpdatePrivateAccessApplicationL7SwitchRequest setSrcIpMarkStatus(String srcIpMarkStatus) {
        this.srcIpMarkStatus = srcIpMarkStatus;
        return this;
    }
    public String getSrcIpMarkStatus() {
        return this.srcIpMarkStatus;
    }

    public UpdatePrivateAccessApplicationL7SwitchRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdatePrivateAccessApplicationL7SwitchRequest setTimeoutSec(Integer timeoutSec) {
        this.timeoutSec = timeoutSec;
        return this;
    }
    public Integer getTimeoutSec() {
        return this.timeoutSec;
    }

    public UpdatePrivateAccessApplicationL7SwitchRequest setUserMarkStatus(String userMarkStatus) {
        this.userMarkStatus = userMarkStatus;
        return this;
    }
    public String getUserMarkStatus() {
        return this.userMarkStatus;
    }

    public UpdatePrivateAccessApplicationL7SwitchRequest setZeroTrustStatus(String zeroTrustStatus) {
        this.zeroTrustStatus = zeroTrustStatus;
        return this;
    }
    public String getZeroTrustStatus() {
        return this.zeroTrustStatus;
    }

    public static class UpdatePrivateAccessApplicationL7SwitchRequestPortRanges extends TeaModel {
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

        public static UpdatePrivateAccessApplicationL7SwitchRequestPortRanges build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateAccessApplicationL7SwitchRequestPortRanges self = new UpdatePrivateAccessApplicationL7SwitchRequestPortRanges();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateAccessApplicationL7SwitchRequestPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public UpdatePrivateAccessApplicationL7SwitchRequestPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

}
